package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.Phrase;
import com.word.pojo.Sentence;

public interface IPhraseAndSentenceService {


    ServerResponse getAllPhrase();

    ServerResponse getAllSentence();

    ServerResponse deletePhraseById(Integer phrase_id);

    ServerResponse deleteSentenceById(Integer sentence_id);

    ServerResponse updateSentence(Sentence sentence);

    ServerResponse updatePhrase(Phrase phrase);
}
