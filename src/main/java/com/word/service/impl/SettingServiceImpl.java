package com.word.service.impl;

import com.word.common.ServerResponse;
import com.word.dao.User_SettingWordMapper;
import com.word.pojo.User_SettingWord;
import com.word.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iSettingService")
public class SettingServiceImpl implements ISettingService {


    @Autowired
    User_SettingWordMapper user_settingWordMapper;
    // 前端

    public ServerResponse get_setting_message(Integer user_id){
        User_SettingWord user_settingWord = user_settingWordMapper.selectByUserId(user_id);
        return  ServerResponse.createBySuccess(user_settingWord);
    }

    public ServerResponse updata_setting_message(User_SettingWord user_settingWord,Integer user_id){
        Integer result = user_settingWordMapper.updateByUserId(user_settingWord,user_id);
         return    ServerResponse.createBySuccess("改变完成");
    }
}
