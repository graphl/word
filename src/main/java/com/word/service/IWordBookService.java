package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.WordBook;

import java.util.List;

public interface IWordBookService {

    ServerResponse addBook(String bookName);

    ServerResponse updateBookName(Integer bookId, String bookName);

    ServerResponse<List<WordBook>> getAllBookName();

    ServerResponse<WordBook> getWordBookByBookId(Integer wordId);

    ServerResponse<List<WordBook>> showAllBook();

    ServerResponse updateWordBook(WordBook wordBook);

    ServerResponse deleteByBookId(Integer bookId);

    ServerResponse addwordTobook(List<Integer> WordIdList,Integer word_id);
}
