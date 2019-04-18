package com.word.dao;

import com.word.pojo.Phrase;

import java.util.List;

public interface PhraseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Phrase record);

    int insertSelective(Phrase record);

    Phrase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Phrase record);

    int updateByPrimaryKey(Phrase record);

    List<Phrase> getAllphrase();

    int deleteByPhraseId(Integer phrase_id);

}