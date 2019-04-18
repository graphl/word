package com.word.controller.backend;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.Word;
import com.word.service.IUserService;
import com.word.service.IWordService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/manage/word/")
public class wordManagerController {

    @Autowired
    private IWordService iWordService;
    @Autowired
    private IUserService iUserService;


    @RequestMapping("add.do")
    @ResponseBody
    public ServerResponse addWord(Word word){
        return iWordService.addword(word);
    }

    @RequestMapping("update.do")
    @ResponseBody
    public ServerResponse productSave(HttpSession session, Word word){
            return  iWordService.saveOrUpdateProduct(word);

    }

    @RequestMapping("detail.do")
    @ResponseBody
    public ServerResponse setDetail(HttpSession session, Integer wordId){
            return  iWordService.getWordDetail(wordId);
    }


    @RequestMapping("/list.do")
    @ResponseBody
    public ServerResponse setDetail(HttpSession session, @RequestParam(value = "pageNum" ,defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){
            return  iWordService.getWordList(pageNum,pageSize);
    }


    @RequestMapping("search.do")
    @ResponseBody
    public ServerResponse Search(HttpSession session,String wordName,Integer wordId,
                                        @RequestParam(value = "pageNum" ,defaultValue = "1") Integer pageNum,
                                        @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        if(user == null){
            return  ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
        }
        if(iUserService.checkAdminRole(user).isSuccess()){
            //填充业务
            return  iWordService.searchWord(wordName,wordId,pageNum,pageSize);
        }else{
            return  ServerResponse.createByErrorMessage("无权限操作");
        }
    }


    @RequestMapping("wordList.do")
    @ResponseBody
    public ServerResponse getAllWord(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                     @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return iWordService.getWordList(pageNum,pageSize);
    }

    @RequestMapping(value = "deleteByWordId.do")
    @ResponseBody
    public ServerResponse deleteByWordId(Integer word_id){

        return iWordService.deleteByWordId(word_id);
    }

    @RequestMapping("deleteByWordIdList.do")
    @ResponseBody
    public ServerResponse deleteByWordIdList(List<String> listwordId){
        return null;
    }



}
