package com.word.controller.portal;

import com.word.common.Const;
import com.word.common.ServerResponse;
import com.word.pojo.User;
import com.word.pojo.User_SettingWord;
import com.word.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class SettingController {

    @Autowired
    private ISettingService iSettingService;

    @RequestMapping("/setting_getByBookId.do")
    public ServerResponse setting_getByBookId(HttpSession session){

        User user = (User)session.getAttribute(Const.CURRENT_USER);
        return   iSettingService.get_setting_message(user.getId());
        //return "考研单词书";

    }

    @RequestMapping(value = "/updata_setting_message.do")
    @ResponseBody
    public ServerResponse updata_setting_message(User_SettingWord user_settingWord,HttpSession session){
        User user = (User)session.getAttribute(Const.CURRENT_USER);
        return iSettingService.updata_setting_message(user_settingWord,user.getId());
    }
}
