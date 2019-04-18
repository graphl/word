package com.word.dao;

import com.word.pojo.User_SettingWord;
import org.apache.ibatis.annotations.Param;

public interface User_SettingWordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User_SettingWord record);

    int insertSelective(User_SettingWord record);

    User_SettingWord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_SettingWord record);

    int updateByPrimaryKey(User_SettingWord record);

    User_SettingWord selectByUserId(Integer user_id);

    int updateByUserId(@Param("user_setting") User_SettingWord user_settingWord,
                       @Param("user_id") Integer user_id);


    User_SettingWord selectSetting(Integer userId);

}