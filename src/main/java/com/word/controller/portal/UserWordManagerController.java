package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.UserWord;
import com.word.service.IUserWordService;
import com.word.vo.MWordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/userword")
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
        @ResponseBody
        public ServerResponse showUserWord(HttpSession session){
            User user = (User) session.getAttribute(Const.CURRENT_USER);
            return iUserWordService.showUserWord(user.getId());
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
    public ServerResponse unKnowWord(HttpSession session,Integer word_id){

        return null;
    }

}
