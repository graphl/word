package com.word.controller.backend;

import com.google.common.collect.Maps;
import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.Word;
import com.word.service.IUserService;
import com.word.service.IWordService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping(value = "manage/word/")
public class wordManagerController {

    @Autowired
    private IWordService iWordService;
    @Autowired
    private IUserService iUserService;
    @RequestMapping("save.do")
    @ResponseBody
    public ServerResponse productSave(HttpSession session, Word word){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            return  iWordService.saveOrUpdateProduct(word);
//            return  iProductService.saveOrUpdateProduct(product);
        }else{
            return  ServerResponse.createByErrorMessage("无权限操作");
        }
    }

    @RequestMapping("detail.do")
    @ResponseBody
    public ServerResponse setDetail(HttpSession session, Integer wordId){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //填充业务
            return  iWordService.getWordDetail(wordId);
//            return iProductService.manageProductDetail(productId);
        }else{
            return  ServerResponse.createByErrorMessage("无权限操作");
        }
    }
    @RequestMapping("list.do")
    @ResponseBody
    public ServerResponse setDetail(HttpSession session, @RequestParam(value = "pageNum" ,defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //填充业务
            return  iWordService.getWordList(pageNum,pageSize);
//            return  iProductService.getProductList(pageNum,pageSize);
        }else{
            return  ServerResponse.createByErrorMessage("无权限操作");
        }
    }
    @RequestMapping("search.do")
    @ResponseBody
    public ServerResponse ProductSearch(HttpSession session,String wordName,Integer wordId, @RequestParam(value = "pageNum" ,defaultValue = "1") Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //填充业务
            return  iWordService.searchWord(wordName,wordId,pageNum,pageSize);
//            return iProductService.searchProduct(productName,productId,pageNum,pageSize);
        }else{
            return  ServerResponse.createByErrorMessage("无权限操作");
        }
    }


}
