package com.word.controller.backend;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.Word;
import com.word.service.IUserService;
import com.word.service.IWordService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manage/word/")
public class wordManagerController {

    @Autowired
    private IWordService iWordService;
    @Autowired
    private IUserService iUserService;


    @RequestMapping("/upload.do")
    @ResponseBody
    public ServerResponse uploadfile(HttpServletRequest request, MultipartFile file,Word word){
        String rootPath = request.getSession().getServletContext().getRealPath("resource/uploads/");

        return  null;
    }
    @RequestMapping("add.do")
    @ResponseBody
    public ServerResponse addWord(Word word){
        return iWordService.addword(word);
    }


    @RequestMapping("/addWord")
    @ResponseBody
    public Map<String,Integer> addWord(MultipartFile file, Word word, HttpServletRequest request) {

        Map<String,Integer> map = new HashedMap();
        String path = "F:\\studystarting\\simple-start\\word\\src\\main\\resources\\upload\\"+word.getWordName()+".mp3";
        File localFile = new File(path);
        System.out.println(path);
        if(!localFile.exists()){
            localFile.mkdirs();
        }
        try {
            file.transferTo(localFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("创建失败");
            map.put("code",404);

            return map;
        }

        if (file != null){
            word.setWordSound(path);
        }
        map.put("code",0);
        return map;
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
                                        @RequestParam(value = "page" ,defaultValue = "1") Integer pageNum,
                                        @RequestParam(value = "limit",defaultValue = "10") Integer pageSize){
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

   @RequestMapping("word.do")
   @ResponseBody
   public ServerResponse getword(){
        return iWordService.WordList();
   }


    @RequestMapping("wordList.do")
    @ResponseBody
    public ServerResponse getAllWord(@RequestParam(value = "page",defaultValue = "1")Integer pageNum,
                                     @RequestParam(value = "limit",defaultValue = "10") Integer pageSize){
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
