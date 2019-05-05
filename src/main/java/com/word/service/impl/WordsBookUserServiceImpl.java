package com.word.service.impl;

import com.word.common.ServerResponse;
import com.word.dao.WordBookMapper;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;
import com.word.service.IWordsBookUserService;
import com.word.vo.WordBookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("iWordsBookUserService")
public class WordsBookUserServiceImpl implements IWordsBookUserService {




    @Autowired
    private WordBookMapper wordBookMapper;

    /**
     * 后台
     * @return
     */
    public List<WordBook> showAllBook(){

        List<WordBook> wordsBookList = wordBookMapper.showAllWordBook();

        return wordsBookList;
    }

    /**
     * 前端
     */


}
