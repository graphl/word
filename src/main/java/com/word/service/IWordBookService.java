package com.word.service;

import com.word.common.ServerResponse;
import com.word.pojo.WordBook;

import java.util.List;

public interface IWordBookService {
    /**
     * 添加书

     * @return
     */
    ServerResponse addBook(String bookName);

    /**
     * 更新单词书名字
     * @return
     */
    ServerResponse updateBookName(Integer bookId, String bookName);

    /**
     * 获取所有书名字
     * @return
     */
    ServerResponse<List<String>> getAllBookName();

    ServerResponse<WordBook> getWordBookByBookId(Integer wordId);

}
