package com.word.dao;

import com.word.pojo.Phrase;
import com.word.pojo.Phrase_Word;

import java.util.List;

public interface Phrase_WordMapper {

    int insert(Phrase_Word record);

    int insertSelective(Phrase_Word record);

    List<Phrase> selectBywordId(Integer word_id);


}