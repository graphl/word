package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.*;
import com.word.service.IUserWordService;
import com.word.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/userword")
public class UserWordManagerController {

        @Autowired
        private IUserWordService iUserWordService;

        @RequestMapping("/add_UserWord.do")
        @ResponseBody
        public ServerResponse addUserWord(HttpSession session,Integer wordId){
            User user = (User) session.getAttribute(Const.CURRENT_USER);
            if(user == null){
                return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
            }
            if(user.getRole() != Const.Role.ROLE_ADMIN){
                return iUserWordService.addUserWord(wordId,user.getId());
            }
            return ServerResponse.createByErrorMessage("管理员没有单词表");
        }

        @RequestMapping("/delete_UserWord.do")
        @ResponseBody
        public ServerResponse deleteUserWord(HttpSession session,Integer wordId){
            User user = (User) session.getAttribute(Const.CURRENT_USER);
            if(user == null){
                return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登陆");
            }
            if(user.getRole() != Const.Role.ROLE_ADMIN){
                return iUserWordService.deleteUserWord(wordId,user.getId());
            }
            return ServerResponse.createByErrorMessage("管理员没有单词表");
        }

        @RequestMapping("/show_UserWord")
        public void showUserWord(HttpSession session,HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {
            User user = (User) session.getAttribute(Const.CURRENT_USER);
            List<UserWordVo> userWords = new ArrayList<>();
            for(int i=0;i<20;i++){
                UserWordVo userWord= new UserWordVo("chronic","krɑːnɪk","adj. 长期的,慢性的,惯常的");
                userWords.add(userWord);
            }
            request.setAttribute("userWords",userWords);
            request.getServletContext().getRequestDispatcher("/myWord.jsp").forward(request,response);
        }

        @RequestMapping("/get_MWord.do")
        @ResponseBody
        public ServerResponse getMWord(HttpSession session){
            List<MWordVo> mWordVos = new ArrayList<>();
            MWordVo mWordVo = new MWordVo(1,"assignment","ə'saɪnmənt","https://media-audio1.baydn.com/us%2Fa%2Fas%2Fassignment_v4.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo);
            MWordVo mWordVo1 = new MWordVo(2,"A","A","https://media-audio1.baydn.com/us%2Fa%2Fas%2Fassignment_v4.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo1);
            MWordVo mWordVo2 = new MWordVo(3,"B","B","https://media-audio1.baydn.com/us%2Fa%2Fas%2Fassignment_v4.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo2);
            MWordVo mWordVo3 = new MWordVo(4,"C","C","https://media-audio1.baydn.com/us%2Fa%2Fas%2Fassignment_v4.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo3);
            MWordVo mWordVo4 = new MWordVo(5,"chronic","krɑːnɪk","https://media-audio1.baydn.com/us%2Fa%2Fab%2Fabc_pub_audio%2Fc1c93771003d8c472c61bde6ae240fb4.7132ed1951bb06c9e84f676fad6c325f.mp3.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo4);
            return ServerResponse.createBySuccess(mWordVos);
        }
    @RequestMapping("/Know_Word.do")
    @ResponseBody
        public ServerResponse KnowWord(HttpSession session,Integer word_id){

            return null;
        }

    @RequestMapping("/unKnow_Word.do")
    @ResponseBody
    public void unKnowWord(HttpSession session, Integer word_id) {


    }

    @RequestMapping("/searchwordDetail.do")
    public void searchWord(HttpSession session, String word, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WordDetailOneVo wordDetailOneVo = new WordDetailOneVo();
        wordDetailOneVo.setId(1);
        wordDetailOneVo.setWord("n. 英语adj. 英格兰的； 英国的； 英语的； 英格兰人的");
        wordDetailOneVo.setWord_name("English");
        wordDetailOneVo.setWord_symbol("'ɪŋɡlɪʃ");
        wordDetailOneVo.setWord_sound("https://media-audio1.baydn.com/us%2Fe%2Fen%2Fenglish_v3.mp3");
        Phrase phrase = new Phrase("The English countryside looks at it's best in spring.","作者 wechat_mbysitjz");
        Phrase phrase1 = new Phrase("German French Italian American;","English 英语；");
        List<Phrase> phrases = new ArrayList<>();
        phrases.add(phrase);
        phrases.add(phrase1);
        Sentence sentence = new Sentence("She speaks good English.","她英语说得很好");
        Sentence sentence1 = new Sentence("I need to improve my English.","我需要提高我的英语水平。");
        List<Sentence> sentences = new ArrayList<>();
        sentences.add(sentence);
        sentences.add(sentence1);
        wordDetailOneVo.setPhrase(phrases);
        wordDetailOneVo.setSentence(sentences);
        wordDetailOneVo.setCheck(1);
        request.setAttribute("wordDetail",wordDetailOneVo);
       request.getServletContext().getRequestDispatcher("/search.jsp").forward(request,response);
    }

}
