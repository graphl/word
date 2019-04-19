package com.word.controller.backend;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.WordAndCategory;
import com.word.service.IUserAndCategoryService;
import com.word.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("manage/userAndCategory")
public class UserAndCategoryManagerController {

    @Autowired
    private IUserAndCategoryService iUserAndCategoryService;
    @Autowired
    private IUserService iUserService;

    @RequestMapping("add_word")
    @ResponseBody
    public ServerResponse addCategoryService(HttpSession session, WordAndCategory wordAndCategory){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iUserAndCategoryService.addCategoryService(wordAndCategory);

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }

    }
    @RequestMapping("delete_by_categoryword")
    @ResponseBody
    public ServerResponse deleteCategoryWord(HttpSession session,WordAndCategory wordAndCategory){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iUserAndCategoryService.deleteCategoryWord(wordAndCategory);

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }
    @RequestMapping("list_by_category_id")
    @ResponseBody
    public  ServerResponse listBycategoryId(HttpSession session, Integer categoryId, @RequestParam(value = "pageNum" ,defaultValue = "1") Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName
            return iUserAndCategoryService.listBycategoryId(categoryId,pageNum,pageSize);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }
}
