package com.word.service.impl;

import com.google.common.collect.Lists;
import com.word.common.ServerResponse;
import com.word.dao.WordBookMapper;
import com.word.pojo.WordBook;
import com.word.service.IWordsBookService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * word_book book_name
 *
 */
@Service("iWordBookService")
public class WordBookServiceImpl  implements IWordsBookService {

    private Logger logger = LoggerFactory.getLogger(WordBookServiceImpl.class);

    @Autowired
   private WordBookMapper wordBookMapper;


   /* @Override
    public ServerResponse addBook(String bookName) {
        if(StringUtils.isBlank(bookName)){
            return ServerResponse.createByErrorMessage("单词类别参数错误");
        }
        WordBook wordBook = new WordBook();
        wordBook.setBookName(bookName);
        int rowCount = wordBookMapper.insert(wordBook);
        if(rowCount>0){
            return  ServerResponse.createBySuccess("添加Book成功");
        }
        return ServerResponse.createByErrorMessage("添加book失败");
    }*/


    public ServerResponse updateBookName(Integer bookId, String bookName) {
        if(bookId==null||StringUtils.isBlank(bookName)){
            return  ServerResponse.createByErrorMessage("参数错误");
        }
       WordBook wordBook = new WordBook();
        wordBook.setId(bookId);
        wordBook.setBookName(bookName);
        int rowCount = wordBookMapper.updateByPrimaryKeySelective(wordBook);
        if(rowCount > 0){
            return ServerResponse.createBySuccess("更新书籍成功");
        }
        return ServerResponse.createByErrorMessage("更新分类失败");
    }
    public ServerResponse<List<String>> getAllBookName(){
        List<WordBook> wordBookList = wordBookMapper.selectAllBook();
        if(wordBookList == null){
            return ServerResponse.createByErrorMessage("没有分类");
        }
        List<String> wordBookStringList = Lists.newArrayList();
        for(WordBook wordBook : wordBookList){
            wordBookStringList.add(wordBook.getBookName());
        }
        return ServerResponse.createBySuccess(wordBookStringList);
    }
    public ServerResponse<WordBook> getWordBookByBookId(Integer wordId){
        if(wordId == null){
            return ServerResponse.createByErrorMessage("书籍查询参数错误");
        }
      WordBook wordBook = wordBookMapper.selectByBookId(wordId);
        if(wordBook == null){
            return ServerResponse.createByErrorMessage("无此书籍");
        }
        return ServerResponse.createBySuccess(wordBook);
    }
    // 前端


}
