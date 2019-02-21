package com.word.dao;

import com.word.pojo.UserWord;
import org.apache.ibatis.annotations.Param;

public interface UserWordMapper {
    int insert(UserWord record);

    int insertSelective(UserWord record);

    int deleteUserWord(@Param("wordId") Integer wordId,@Param("userId") Integer userId);
}