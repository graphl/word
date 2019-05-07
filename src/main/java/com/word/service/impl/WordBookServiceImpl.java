package com.word.service.impl;

import com.google.common.collect.Lists;
import com.word.common.ServerResponse;
import com.word.dao.UserWordMapper;
import com.word.dao.WordBookMapper;
import com.word.dao.WordsBookMapper;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;
import com.word.service.IWordBookService;
import com.word.service.IWordsBookService;
import com.word.vo.BookWord;
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
public class WordBookServiceImpl  implements IWordBookService {

    private Logger logger = LoggerFactory.getLogger(WordBookServiceImpl.class);

    @Autowired
   private WordBookMapper wordBookMapper;

    @Autowired
    private UserWordMapper userWordMapper;
    @Autowired
    private WordsBookMapper wordsBookMapper;

    public ServerResponse addBook(WordBook wordBook) {

        int rowCount = wordBookMapper.insert(wordBook);
        if(rowCount>0){
            return  ServerResponse.createBySuccess("添加Book成功");
        }
        return ServerResponse.createByErrorMessage("添加book失败");
    }


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
    public ServerResponse<List<WordBook>> getAllBookName(){
        List<WordBook> wordBookList = wordBookMapper.selectAllBook();
        if(wordBookList == null){
            return ServerResponse.createByErrorMessage("没有分类");
        }
      /*  List<String> wordBookStringList = Lists.newArrayList();
        for(WordBook wordBook : wordBookList){
            wordBookStringList.add(wordBook.getBookName());
        }*/
        return ServerResponse.createBySuccess(wordBookList);
    }
    public List<WordBook> getAllBookName_list(){
        List<WordBook> wordBookList = wordBookMapper.selectAllBook();
      /*  List<String> wordBookStringList = Lists.newArrayList();
        for(WordBook wordBook : wordBookList){
            wordBookStringList.add(wordBook.getBookName());
        }*/
        return wordBookList;
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

    public ServerResponse updateWordBook(WordBook wordBook){

        int result = wordBookMapper.updateByPrimaryKey(wordBook);
        return ServerResponse.createBySuccess(result);
    }

    public ServerResponse deleteByBookId(Integer bookId){
        int result = wordBookMapper.deleteByBookId(bookId);
        return ServerResponse.createBySuccess(result);
    }
    // 前端

    public ServerResponse<List<WordBook>> showAllBook(int pageNum,int pageSize){
        List<WordBook> wordBooks = wordBookMapper.showAllBook(pageNum,pageSize);
        int count = wordBookMapper.getCountWordBook();
        return ServerResponse.createBySuccess(wordBooks,count);
    }

    public ServerResponse addwordTobook(List<Integer> WordIdList,Integer word_id){
        for (int i=0;i<WordIdList.size();i++){
            int check = userWordMapper.checkWordIsInUserWord(WordIdList.get(i),word_id);
            if(check >0){
                WordIdList.remove(i);
            }
        }
        int result  = wordBookMapper.insertWordToBook(WordIdList,word_id);
        if(result<=0){
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return  ServerResponse.createBySuccess(result);
    }




}
