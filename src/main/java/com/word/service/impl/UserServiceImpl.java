package com.word.service.impl;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.common.TokenCache;
import com.word.dao.UserMapper;
import com.word.pojo.User;
import com.word.service.IUserService;
import com.word.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("iUserService")
public class UserServiceImpl  implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    public ServerResponse login(String username,String password,Integer role){
        int resultCount = userMapper.checkUsername(username,role);
        int resultPhone = userMapper.checkUserPhone(username,role);
        if(resultCount == 0 && resultPhone == 0){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(),"用户名不存在");
        }
        String MD5Password = MD5Util.MD5EncodeUtf8(password);

        User user;
        if(resultCount>0){
              user = userMapper.selectLogin(username,MD5Password,role);
        }
        else
        {
            user = userMapper.selectLoginByPhone(username,MD5Password,role);
        }
        // todo MD5加密
        //前端已经加过密了
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ERROR.getCode(),"密码错误");
        }
        user.setPassword(StringUtils.EMPTY);
        return  ServerResponse.createBySuccess("登陆成功",user);
    }

    /**
     * 注册
     * @param user
     * @return
     */
    public ServerResponse<String> register(User user){


        if(user == null || user.equals("")){
            return ServerResponse.createByErrorMessage("参数错误");
        }

        if(user.getRole()!=1&&user.getRole()!=0){
            return ServerResponse.createByErrorMessage("参数错误");
        }

        ServerResponse vaildResponse = this.checkVaild(user.getUsername(),user.getRole());
        if(!vaildResponse.isSuccess()){
            return vaildResponse;
        }


        int resultCount = userMapper.checkUsername(user.getUsername(),user.getRole());
        if(resultCount > 0){
            return ServerResponse.createByErrorMessage("用户名已存在");
        }

        int resultPhone = userMapper.checkUserPhone(user.getPhone(),user.getRole());

        if(resultPhone>0){
            return ServerResponse.createByErrorMessage("该手机号已经注册过了");
        }
        //MD5加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));
        resultCount = userMapper.insert(user);
        if(resultCount == 0){
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    /**
     *  检查用户名或者email是否存在
     * @param str
     * @param type
     * @return
     */
    public ServerResponse<String> checkVaild(String str,Integer type){

        if(str == null || (type!=1&& type!=0)){
            return ServerResponse.createByErrorMessage("参数错误");
        }
        int resultCount = userMapper.checkUsername(str,type);
        if(resultCount>0){
            return ServerResponse.createByErrorMessage("用户名已存在");
        }
        return ServerResponse.createBySuccess();
    }

    /**
     * 根据用户名查看对应的密保
     * @param username
     * @return
     */
    public ServerResponse selectQuestion(String username){
        ServerResponse validResponse = this.checkVaild(username,0);
        if(validResponse.isSuccess()){
            //用户不存在
            return ServerResponse.createByErrorMessage("用户不存在");
        }
        String question = userMapper.selectQuestionByUsername(username);
        if (StringUtils.isNotBlank(question)){
            return ServerResponse.createBySuccess(question);
        }
        return ServerResponse.createByErrorMessage("密保问题为空");
    }

    /**
     * 根据密码问题查看密保是否为空
     * @param username
     * @param question
     * @param answer
     * @return
     */
    public ServerResponse<String> checkAnswer(String username,String question,String answer){
        int resultCount = userMapper.checkAnswer(username,question,answer);
        if(resultCount > 0 ){
            //说明问题及问题答案是这个用户的,并且是正确的
            String forgetToken = UUID.randomUUID().toString();
            TokenCache.setKey(TokenCache.TOKEN_PRFIX+username,forgetToken);
            return ServerResponse.createBySuccess(forgetToken);
        }
        return ServerResponse.createByErrorMessage("问题的答案错误");
    }

    /**
     * 修改密码
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    public ServerResponse<String> forgetResetPassword(String username, String passwordNew,String forgetToken){
        if(StringUtils.isBlank(forgetToken)){
            return ServerResponse.createByErrorMessage("参数错误，toke需要传递");
        }
        ServerResponse validResponse = this.checkVaild(username,0);
        if(validResponse.isSuccess()){
            //用户不存在
            return ServerResponse.createByErrorMessage("用户不存在");
        }
        String token = TokenCache.getKey(TokenCache.TOKEN_PRFIX+username);
        if(StringUtils.isBlank(token)){
            return ServerResponse.createByErrorMessage("token无效或者过期");
        }
        if(StringUtils.equals(forgetToken,token)){
            String md5Password = MD5Util.MD5EncodeUtf8(passwordNew);
            int rowCount = userMapper.updatePasswordByUsername(username,md5Password);
            if(rowCount > 0){
                return ServerResponse.createBySuccessMessage("修改密码成功");
            }
        }else{
            return  ServerResponse.createByErrorMessage("token错误 请从新获取充值面膜的token");
        }
        return ServerResponse.createByErrorMessage("修改密码失败");
    }

    /**
     * 登陆状态重设密码
     * @param passwordOld
     * @param passwordNew
     * @param user
     * @return
     */
    public ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user){
        //防止横向越权，要校验一下这个用户的旧密码，一定要指定这个用户，因为我们会查询一个count(1),如果不指定id那么结果就是truel的count>0
        int resultCount = userMapper.checkPassword(MD5Util.MD5EncodeUtf8(passwordOld),user.getId());
        if(resultCount == 0){
            return ServerResponse.createByErrorMessage("旧密码错误");
        }
        user.setPassword(MD5Util.MD5EncodeUtf8(passwordNew));
        int updateCount = userMapper.updateByPrimaryKeySelective(user);
        if(updateCount > 0 ){
            return  ServerResponse.createBySuccessMessage("密码更新成功");
        }
        return ServerResponse.createByErrorMessage("密码更新失败");
    }

    /**
     * 更改用户信息
     * @param user
     * @return
     */
    public  ServerResponse<User> updateInformation(User user){
        //username 是不能被更新
        //eamil也要进行校验，校验新的email是不是已经存在并且存在email如果相同的话，不能是我们当前的这个用户的
        int resultCount  = userMapper.checkEmailByUserId(user.getEmail(),user.getId());
        if(resultCount>0){
            return  ServerResponse.createByErrorMessage("Email已存在，请更换email再进行尝试更新");
        }
        User updateUser = new User();
        updateUser.setId(user.getId());
        updateUser.setEmail(user.getEmail());
        updateUser.setPhone(user.getPhone());
        updateUser.setQuestion(user.getQuestion());
        updateUser.setAnswer(user.getAnswer());

        int updateCount = userMapper.updateByPrimaryKeySelective(updateUser);
        if(updateCount > 0 ){
            return ServerResponse.createBySuccess("更新个人信息成功",updateUser);
        }
        return  ServerResponse.createByErrorMessage("更新个人信息失败");
    }

    /**
     * 通过userId获得用户信息
     * @param userId
     * @return
     */
    public  ServerResponse<User> getInformation(Integer userId){
        User user = userMapper.selectByPrimaryKey(userId);
        if(user == null){
            return ServerResponse.createByErrorMessage("找不到当前用户");
        }
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess(user);
    }

    /**
     * 校验是否是管理员
     * @param user
     * @return
     */
    //backend
    public ServerResponse checkAdminRole(User user){
        if(user != null && user.getRole().intValue() == Const.Role.ROLE_ADMIN){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }



    public ServerResponse getAllUser(Integer pageNum,Integer pageSize){
        List<User> users = userMapper.getAllUser(pageNum,pageSize);
        int count = userMapper.getCountUser();
        return  ServerResponse.createBySuccess(users,count);
    }

    public ServerResponse getAdmins(Integer pageNum,Integer pageSize){
        List<User> users = userMapper.getAllAdmin(pageNum,pageSize);
        int count = userMapper.getCountAdmin();
        return ServerResponse.createBySuccess(users,count);
    }

    public ServerResponse deleteUserById(Integer user_id,Integer role){
        int result = userMapper.deleteUserById(user_id,role);
        if(result <= 0){
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccess(result);
    }

    public ServerResponse updateUser(User user){
        int result  = userMapper.updateByPrimaryKeySelective(user);
        if(result <= 0 )
        {
            return ServerResponse.createByErrorMessage("更新失败");
        }
        return ServerResponse.createBySuccess(result);
    }

}
