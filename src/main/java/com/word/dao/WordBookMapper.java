package com.word.dao;

import com.word.pojo.Word;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;

import java.util.List;

public interface WordBookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WordBook record);

    int insertSelective(WordBook record);

    WordBook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WordBook record);

    int updateByPrimaryKey(WordBook record);

    List<WordBook> selectAllBook();

    WordBook selectByBookId(Integer wordid);

    List<Word> selectByBookId_List(Integer bookId);

    List<WordBook> showAllBook();
}