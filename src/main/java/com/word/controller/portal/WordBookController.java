package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;
import com.word.service.IWordBookService;
import com.word.service.IWordsBookService;
import com.word.vo.SettingVo;
import com.word.vo.WordBookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class WordBookController {

    @Autowired
    private IWordsBookService iWordsBookService;

    @Autowired
    private IWordBookService iWordBookService;
    @RequestMapping("/showAllBook")
    public void showAllBooks(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        List<WordBookVo> wordBookVos = new ArrayList<>();
        for (int i=0;i<20;i++){
            WordBookVo wordBookVo = new WordBookVo(new Integer(i),"https://sbay-image.baydn.com/wordbook/media_store/cover/f025d96c73e5226096f3d8be0cf8c045.jpg","考研单词书","此本单词书基于考研英语（一）大纲词汇和单词量测试结果制作生成，能够更有针对性地帮助你备考。");
            wordBookVo.setSize(123);
            wordBookVo.setComplete(5.12);
            wordBookVos.add(wordBookVo);
        }
        request.setAttribute("wordBooks",wordBookVos);
    }


    @RequestMapping("/user_setting")
    private void userSetting(Integer bookId,Integer wordSize){

    }

    @RequestMapping("get_UserSetting")
    private void get_UserSetting(HttpSession session,HttpServletRequest request,HttpServletResponse response){
        User user =(User) session.getAttribute(Const.CURRENT_USER);
        SettingVo settingVo = new SettingVo();
        settingVo.setCheck_book_id(1);
        settingVo.setCheck_book_name("考研单词");
        settingVo.setWordSize(5);
        request.setAttribute("settingVo",settingVo);
    }

    @RequestMapping("updateWord.do")
    public ServerResponse updateWord(WordBook wordBook){
        return iWordBookService.updateWordBook(wordBook);
    }

}
