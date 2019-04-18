package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.User_SettingWord;
import com.word.pojo.WordBook;
import com.word.service.ISettingService;
import com.word.service.IWordBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class SettingController {

    @Autowired
    private ISettingService iSettingService;

    @Autowired
    private IWordBookService iWordBookService;

    @RequestMapping("/setting_getByBookId.do")
    public ServerResponse setting_getByBookId(HttpSession session){

        User user = (User)session.getAttribute(Const.CURRENT_USER);
        return   iSettingService.get_setting_message(user.getId());

    }

    @RequestMapping(value = "/updata_setting_message.do")
    @ResponseBody
    public ServerResponse updata_setting_message(User_SettingWord user_settingWord,HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        return iSettingService.updata_setting_message(user_settingWord,user.getId());
    }


    @RequestMapping("/UserSetting")
    public void UserSetting(HttpSession session, HttpServletRequest request, HttpServletResponse response){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        List<WordBook> wordBooks = iWordBookService.getAllBookName_list();
        List<String> booknames = Arrays.asList();
        List<Integer> bookIds = Arrays.asList();
        for (int i=0;i<wordBooks.size();i++){
            booknames.add(wordBooks.get(i).getBookName());
            bookIds.add(wordBooks.get(i).getId());
        }
        User_SettingWord settingWords = iSettingService.selectSetting(user.getId());
        request.setAttribute("booknames",booknames);
        request.setAttribute("bookIds",bookIds);
        request.setAttribute("settingWords",session);

    }
}
