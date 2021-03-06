package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {
    /**
     * 用户模块
     */
    @Autowired
    private IUserService iUserService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password,Integer role, HttpSession session){
        ServerResponse<User> response = iUserService.login(username,password,role);
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    @RequestMapping(value = "login_out.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> loginout( HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping(value = "register.do")
    @ResponseBody
    public ServerResponse<String> register(User user){
        return iUserService.register(user);
    }



    @RequestMapping(value = "check_valid.do" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> checkVaild(String str,Integer type){
        return iUserService.checkVaild(str,type);
    }



    @RequestMapping(value = "get_user_info.do" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        if(user != null){
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("用户无法登录，无法获取用户的信息");
    }

    @RequestMapping(value = "forget_get_user_question.do" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetGetQuestion(String username){
        return iUserService.selectQuestion(username);
    }

    @RequestMapping(value = "forget_check_answer.do" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetCheckAnswer(String username,String question,String answer){
        return iUserService.checkAnswer(username,question,answer);
    }

    @RequestMapping(value = "forget_reset_password.do" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> forgetResetPassword(String username, String passwordNew,String forgetToken){
        return iUserService.forgetResetPassword(username,passwordNew,forgetToken);
    }

    @RequestMapping(value = "reset_password.do" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String > resetPassword(HttpSession session,String passwordOld,String passwordNew){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorMessage("用户未登陆");
        }
        return iUserService.resetPassword(passwordOld,passwordNew,user);
    }

    @RequestMapping(value = "update_information.do" ,method = RequestMethod.POST)
    @ResponseBody
    public  ServerResponse<User> update_information(HttpSession session,User user){
        User currenUser = (User) session.getAttribute(Const.CURRENT_USER);
        if(currenUser == null){
            return ServerResponse.createByErrorMessage("用户未登陆");
        }
        user.setId(currenUser.getId());
        user.setUsername(currenUser.getUsername());
        ServerResponse<User> response = iUserService.updateInformation(user);
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }

    @RequestMapping(value = "get_information.do" ,method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> get_information(HttpSession session){
        User currentUser = (User) session.getAttribute(Const.CURRENT_USER);
        if(currentUser == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"未登陆需要强制登陆");
        }
        return iUserService.getInformation(currentUser.getId());
    }

    // 后端
    @RequestMapping(value = "getAllUser.do")
    @ResponseBody
    public ServerResponse<List<User>> getAllUser(@RequestParam(value = "page",defaultValue = "1")Integer pageNum,
                                                  @RequestParam(value = "limit",defaultValue = "10") Integer pageSize){

       return iUserService.getAllUser(pageNum,pageSize);
    }

    @RequestMapping(value = "getAdmins.do")
    @ResponseBody
    public ServerResponse<List<User>> getAdmins(@RequestParam(value = "page",defaultValue = "1")Integer pageNum,
                                                @RequestParam(value = "limit",defaultValue = "10") Integer pageSize){
        return iUserService.getAdmins(pageNum,pageSize);
    }

    @RequestMapping(value = "deleteUserById.do")
    @ResponseBody
    public ServerResponse deleteUserById(Integer user_id){

        return  iUserService.deleteUserById(user_id,0);
    }

    @RequestMapping(value = "deleteAdminUserById.do")
    @ResponseBody
    public  ServerResponse deleteAdminUserById(Integer user_id){
        return  iUserService.deleteUserById(user_id,1);
    }

    @RequestMapping(value = "updateUser.do")
    @ResponseBody
    public ServerResponse updateUser(User user){
        return iUserService.updateUser(user);
    }
}
