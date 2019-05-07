package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.*;
import com.word.service.IMemoService;
import com.word.service.IUserWordService;
import com.word.service.IWordsBookService;
import com.word.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/userword")
public class UserWordManagerController {

    public static Integer check = null;



        @Autowired
        private IMemoService iMemoService;

        @Autowired
        private IUserWordService iUserWordService;

        @Autowired
        private IWordsBookService iWordsBookService;

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
            System.out.println("ID:"+user.getId()+"   username"+user.getUsername());
            List<UserWordVo> userWordVoList =iUserWordService.showUserWord(user.getId());

            request.setAttribute("userWords",userWordVoList);
            request.getServletContext().getRequestDispatcher("/myWord.jsp").forward(request,response);
        }

        @RequestMapping("/get_MWord.do")
        @ResponseBody
        public ServerResponse getMWord(HttpSession session){
         /*   List<MWordVo> mWordVos = new ArrayList<>();
            MWordVo mWordVo = new MWordVo(1,"assignment","ə'saɪnmənt","https://dict.youdao.com/dictvoice?audio=abandon&type=2","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo);
            MWordVo mWordVo1 = new MWordVo(2,"A","A","https://media-audio1.baydn.com/us%2Fa%2Fas%2Fassignment_v4.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo1);
            MWordVo mWordVo2 = new MWordVo(3,"B","B","https://media-audio1.baydn.com/us%2Fa%2Fas%2Fassignment_v4.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo2);
            MWordVo mWordVo3 = new MWordVo(4,"C","C","https://media-audio1.baydn.com/us%2Fa%2Fas%2Fassignment_v4.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo3);
            MWordVo mWordVo4 = new MWordVo(5,"chronic","krɑːnɪk","https://media-audio1.baydn.com/us%2Fa%2Fab%2Fabc_pub_audio%2Fc1c93771003d8c472c61bde6ae240fb4.7132ed1951bb06c9e84f676fad6c325f.mp3.mp3","n. 分配,功课,任务,被指定的(课外)作业;(分派的)任务, 委派");
            mWordVos.add(mWordVo4);*/
            User user = (User) session.getAttribute(Const.CURRENT_USER);
            return ServerResponse.createBySuccess(iMemoService.MM(user.getId()));
        }
    @RequestMapping("/Know_Word.do")
    @ResponseBody
        public ServerResponse KnowWord(HttpSession session,Integer word_id){
            return ServerResponse.createBySuccess(iMemoService.onKnow(5));
        }

    @RequestMapping("/unKnow_Word.do")
    @ResponseBody
    public ServerResponse<MWordVo> unKnowWord(HttpSession session, Integer word_id) {
        iMemoService.unKonw(3);
        return ServerResponse.createBySuccess();

    }

    @RequestMapping("/next.do")
    @ResponseBody
    public ServerResponse nexrMW(){
            return ServerResponse.createBySuccess(iMemoService.NextMW());
    }

    @RequestMapping("/searchwordDetail.do")
    public void searchWord(HttpSession session, String word, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       WordDetailOneVo wordDetailOneVo = new WordDetailOneVo();
       wordDetailOneVo = iUserWordService.searchWordDetail(word);
     request.setAttribute("wordDetail",wordDetailOneVo);
       request.getServletContext().getRequestDispatcher("/search.jsp").forward(request,response);
    }


    @RequestMapping("/showBookWord.do")
    @ResponseBody
    public ServerResponse showBookWord(Integer bookId,
                                       @RequestParam(value = "page",defaultValue = "1")Integer pageNum,
                                       @RequestParam(value = "limit",defaultValue = "10") Integer pageSize)
    {
        System.out.println(bookId);
        return iWordsBookService.showBookWord(bookId,pageNum,pageSize);
    }


    @RequestMapping("/deleteByWbId.do")
    @ResponseBody
    public ServerResponse deleteByWbId(Integer wbId)
    {
        return iWordsBookService.deleteByWbId(wbId);
    }



}
