package com.word.dao;

import com.word.pojo.WordsBook;

import java.util.List;

public interface WordsBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WordsBook record);

    int insertSelective(WordsBook record);

    WordsBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WordsBook record);

    int updateByPrimaryKey(WordsBook record);


    /**
     * 前端
     */


}