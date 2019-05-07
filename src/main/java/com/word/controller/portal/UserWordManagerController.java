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
            return iUserWordService.addUserWord(wordId,user.getId());

        }


        @RequestMapping("/delete_UserWord.do")
        @ResponseBody
        public ServerResponse deleteUserWord(HttpSession session,Integer wordId){
            User user = (User) session.getAttribute(Const.CURRENT_USER);
            return iUserWordService.deleteUserWord(wordId,user.getId());

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
