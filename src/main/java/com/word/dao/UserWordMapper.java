package com.word.dao;

import com.word.pojo.UserWord;
import com.word.pojo.Word;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserWordMapper {

    int insert(UserWord record);

    int insertSelective(UserWord record);

    int deleteUserWord(@Param("wordId") Integer wordId, @Param("userId") Integer userId);

    List<Word> showUserWord(int userid);

    int updateUserWord(Word word);
}