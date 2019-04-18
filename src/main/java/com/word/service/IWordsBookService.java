package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;

import java.util.List;

public interface IWordsBookService {


    ServerResponse addTobookWord(WordsBook wordsBook);

    ServerResponse delTobookWord(Integer wordId,Integer book_id);

}
