package com.word.controller.backend;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.service.IUserService;
import com.word.service.IWordBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "book")

public class WordBookController {

    @Autowired
    private IUserService iUserService;
    @Autowired
    private IWordBookService iWordBookService;
    @RequestMapping(value = "add_book.do")
    @ResponseBody
    public ServerResponse addCategory(HttpSession session, String  bookName){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        //是否为管理员
        if(iUserService.checkAdminRole(user).isSuccess()){
            //时管理员
            //增加处理分类的逻辑
            return iWordBookService.addBook(bookName);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }

    @RequestMapping("set_Book_Name.do")
    @ResponseBody
    public ServerResponse setCategoryName(HttpSession session,Integer bookId,String bookName){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iWordBookService.updateBookName(bookId,bookName);

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }

    @RequestMapping("get_all_bookName")
    @ResponseBody
    public ServerResponse getAllCategoryName(HttpSession session){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iWordBookService.getAllBookName();

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }
    @RequestMapping("get_bookNameBybokkId")
    @ResponseBody
    public ServerResponse getCategoryNameByCategoryId(HttpSession session,Integer bookId){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //更新categoryName

            return iWordBookService.getWordBookByBookId(bookId);

        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }


}
