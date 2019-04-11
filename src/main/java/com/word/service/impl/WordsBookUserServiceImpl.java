package com.word.service.impl;

import com.word.common.ServerResponse;
import com.word.dao.WordBookMapper;
import com.word.dao.WordsBookMapper;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;
import com.word.service.IWordsBookUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("iWordsBookUserService")
public class WordsBookUserServiceImpl implements IWordsBookUserService {




    @Autowired
    private WordBookMapper wordBookMapper;

    public ServerResponse showAllBook(){

        List<WordBook> wordsBookList = wordBookMapper.showAllBook();

        return ServerResponse.createBySuccess(wordsBookList);
    }


}
