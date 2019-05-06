package com.word.dao;

import com.word.pojo.UserWord;
import com.word.pojo.Word;
import com.word.vo.MWordVo;
import com.word.vo.UserWordVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserWordMapper {

    int insert(UserWord record);

    int insertSelective(UserWord record);

    int deleteUserWord(@Param("wordId") Integer wordId, @Param("userId") Integer userId);

    List<UserWordVo> showUserWord(int userid);

    int updateUserWord(Word word);

    int checkWordIsInUserWord(Integer wordId);

    List<MWordVo> selectUserWord(Integer userId);
}