package com.word.controller.backend;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.service.ICategoryService;
import com.word.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "manage/category/")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IUserService iUserService;
    @RequestMapping(value = "add_category.do")
    @ResponseBody
    public ServerResponse addCategory(HttpSession session, String categoryName, @RequestParam(value = "parentId",defaultValue = "0") int parentId){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        //是否为管理员
        if(iUserService.checkAdminRole(user).isSuccess()){
            //时管理员
            //增加处理分类的逻辑
            return iCategoryService.addCategory(categoryName);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }

    @RequestMapping("set_Category_Name.do")
    @ResponseBody
    public ServerResponse setCategoryName(HttpSession session,Integer categoryId,String categoryName){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iCategoryService.updateCategoryName(categoryId,categoryName);

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }

    @RequestMapping("get_all_categoryName")
    @ResponseBody
    public ServerResponse getAllCategoryName(HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iCategoryService.getAllCagegoryName();

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }
    @RequestMapping("get_categoryNameBycategoryId")
    @ResponseBody
    public ServerResponse getCategoryNameByCategoryId(HttpSession session,String categoryId){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iCategoryService.getAllCagegoryName();

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }
}
