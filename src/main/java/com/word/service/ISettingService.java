package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.User_SettingWord;

public interface ISettingService {


    ServerResponse get_setting_message(Integer user_id);

    ServerResponse updata_setting_message(User_SettingWord user_settingWord,Integer user_id);
}
