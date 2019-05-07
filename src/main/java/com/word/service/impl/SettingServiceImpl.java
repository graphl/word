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

        Integer check = user_settingWordMapper.checkUser(user_id);

        Integer result;
        user_settingWord.setUserId(user_id);
        System.out.println(check+".................................."+user_settingWord.getCheckBookId());
        if(check <= 0 && user_settingWord.getCheckBookId() == null){

          result =   user_settingWordMapper.insertSelective(user_settingWord);
        }
        else {
            result = user_settingWordMapper.updateByUserId(user_settingWord);
            System.out.println(result+"更新");
        }
         return    ServerResponse.createBySuccess(result);
    }

    public User_SettingWord selectSetting(Integer userId){
        return user_settingWordMapper.selectSetting(userId);
    }
}
