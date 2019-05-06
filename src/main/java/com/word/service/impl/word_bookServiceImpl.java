package com.word.service.impl;

import com.word.common.ServerResponse;
import com.word.dao.WordsBookMapper;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;
import com.word.service.IWordsBookService;
import com.word.vo.BookWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iWordsBookService")
public class word_bookServiceImpl implements IWordsBookService {

    @Autowired
    private WordsBookMapper wordsBookMapper;
    /**
     * 单词书中添加单词
     */
    public ServerResponse addTobookWord(WordsBook wordsBook){

        Integer result = wordsBookMapper.insert(wordsBook);
        if(result == 0){
            return  ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccess(result);
    }

    /**
     * 单词书中删除单词
     */
    public ServerResponse delTobookWord(Integer wordId,Integer book_id){
        int result = wordsBookMapper.delTobookWord(book_id,wordId);
        if(result == 0){
            return  ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccess(result);
    }

    public ServerResponse showBookWord(Integer bookId,Integer pageNum,Integer pageSize){

        List<BookWord> bookWords = wordsBookMapper.selectBookWord(bookId,pageNum,pageSize);

        return ServerResponse.createBySuccess(bookWords);
    }

    public ServerResponse deleteByWbId(Integer wbId){
        Integer result = wordsBookMapper.deleteByWbId(wbId);
        return ServerResponse.createBySuccess(result);
    }
   /* public ServerResponse updateBookWord(WordBook wordBook){
        int result = wordsBookMapper.updateToWordBook(wordBook);
        if(result == 0){
            return  ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccess(result);
    }
*/


}
