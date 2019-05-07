package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.Phrase;
import com.word.pojo.Sentence;

public interface IPhraseAndSentenceService {

    ServerResponse getAllPhrase(Integer pageNum,Integer pageSize);

    ServerResponse getAllSentence(Integer pageNum,Integer pageSize);

    ServerResponse deletePhraseById(Integer phrase_id);

    ServerResponse deleteSentenceById(Integer sentence_id);

    ServerResponse updateSentence(Sentence sentence);

    ServerResponse updatePhrase(Phrase phrase);

    ServerResponse addSentence(Sentence sentence);
}
