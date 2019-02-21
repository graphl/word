package com.word.dao;

import com.word.pojo.WordAndCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WordAndCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WordAndCategory record);

    int insertSelective(WordAndCategory record);

    WordAndCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WordAndCategory record);

    int updateByPrimaryKey(WordAndCategory record);

    int checkCategoryAndWord(@Param("categoryId") Integer categoryId,@Param("wordId") Integer wordId);

    int deleteBywordIdAndCategoryId(@Param("categoryId") Integer categoryId,@Param("wordId") Integer wordId);

    List<WordAndCategory> selectByCategoryId(Integer categoryId);
}