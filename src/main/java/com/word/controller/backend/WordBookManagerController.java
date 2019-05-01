package com.word.controller.backend;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.WordBook;
import com.word.service.IUserService;
import com.word.service.IWordBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/manage/book/")

public class WordBookManagerController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IWordBookService iWordBookService;

    @RequestMapping(value = "add_book.do")
    @ResponseBody
    public ServerResponse addCategory(HttpSession session,WordBook wordBook){
        User user = (User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            return iWordBookService.addBook(wordBook);

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
            return iWordBookService.updateBookName(bookId,bookName);
        }else{
            return ServerResponse.createByErrorMessage("无权限操作，需要管理员权限");
        }
    }

    @RequestMapping("get_all_bookName")
    @ResponseBody
    public ServerResponse getAllCategoryName(HttpSession session){

        User user = (User) session.getAttribute(Const.CURRENT_USER);
        return iWordBookService.getAllBookName();
    }

    @RequestMapping("get_bookNameBybookId")
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


    @RequestMapping("/addwordTobook")
    @ResponseBody
    public ServerResponse addwordTobook(String WordIdList,Integer wordId){
        List<Integer> ids = Arrays.asList(WordIdList.split(",")).stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
        return iWordBookService.addwordTobook(ids,wordId);
    }

    @RequestMapping("/showAllbook")
    @ResponseBody
    public ServerResponse showAllBook(@RequestParam(value = "page",defaultValue = "1")Integer pageNum,
                                      @RequestParam(value = "limit",defaultValue = "10") Integer pageSize){
        return iWordBookService.showAllBook(pageNum,pageSize);
    }


    @RequestMapping("/updateBook")
    public ServerResponse updateBook(WordBook wordBook){
            return iWordBookService.updateWordBook(wordBook);
    }

    @RequestMapping("deleteBook")
    public ServerResponse deleteBook(Integer bookId){
        return iWordBookService.deleteByBookId(bookId);
    }

}
