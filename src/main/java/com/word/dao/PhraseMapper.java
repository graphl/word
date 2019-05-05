package com.word.dao;

import com.word.pojo.Phrase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PhraseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Phrase record);

    int insertSelective(Phrase record);

    Phrase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Phrase record);

    int updateByPrimaryKey(Phrase record);

    List<Phrase> getAllphrase(@Param("pageNumKey") int pageNum,
                              @Param("pageSizeKey") int pageSize);

    int getCountPhrase();

    int deleteByPhraseId(Integer phrase_id);

}