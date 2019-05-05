package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.WordBook;

import java.util.List;

public interface IWordBookService {

    ServerResponse addBook(WordBook wordBook);

    ServerResponse updateBookName(Integer bookId, String bookName);

    ServerResponse<List<WordBook>> getAllBookName();

    List<WordBook> getAllBookName_list();

    ServerResponse<WordBook> getWordBookByBookId(Integer wordId);

    ServerResponse<List<WordBook>> showAllBook(int pageNum,int pageSize);

    ServerResponse updateWordBook(WordBook wordBook);

    ServerResponse deleteByBookId(Integer bookId);

    ServerResponse addwordTobook(List<Integer> WordIdList,Integer word_id);
}
