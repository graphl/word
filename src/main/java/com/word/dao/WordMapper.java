package com.word.dao;

import com.word.pojo.Word;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Word record);

    int insertSelective(Word record);

    Word selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Word record);

    int updateByPrimaryKey(Word record);

    List<Word> selectList();

    List<Word> selectByNameAndWordId(@Param("wordName") String wordName,@Param("wordId") Integer wordId);
}