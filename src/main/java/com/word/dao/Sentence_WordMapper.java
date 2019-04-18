package com.word.dao;

import com.word.pojo.Sentence;
import com.word.pojo.Sentence_Word;

import java.util.List;

public interface Sentence_WordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sentence_Word record);

    int insertSelective(Sentence_Word record);

    Sentence_Word selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sentence_Word record);

    int updateByPrimaryKey(Sentence_Word record);

    List<Sentence> selectByWordId(Integer word_id);
}