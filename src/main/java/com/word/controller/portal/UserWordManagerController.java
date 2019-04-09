package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ResponseCode;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.UserWord;
import com.word.service.IUserWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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

       /* @RequestMapping("/show_UserWord")
        @ResponseBody
        public ServerResponse showUserWord(HttpSession session){
            User user = (User) session.getAttribute(Const.CURRENT_USER);
            List<UserWord> userWords = iUserWordService.showUserWord(user.getId());
            return null;
        }*/
}
