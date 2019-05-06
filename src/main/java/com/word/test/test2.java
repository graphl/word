package com.word.test;


import com.word.dao.User_SettingWordMapper;
import com.word.dao.WordMapper;
import com.word.dao.WordsBookMapper;
import com.word.pojo.User_SettingWord;
import com.word.pojo.Word;
import com.word.pojo.WordBook;
import com.word.pojo.WordsBook;
import com.word.service.IMemoService;
import com.word.service.ISM2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-datasource.xml")
public class test2 {


    @Autowired
    private WordMapper wordMapper;

    @Autowired
    private User_SettingWordMapper user_settingWordMapper;

    @Autowired
    private WordsBookMapper wordsBookMapper;
    @Test
    public void test(){

        User_SettingWord user_settingWord = new User_SettingWord();
        user_settingWord.setCheckBookId(2);
        user_settingWord.setUserId(10);
        user_settingWord.setWordSize(20);
        int result = user_settingWordMapper.updateByUserId(user_settingWord);

    }

    @Test

    public void test2()
    {
        List<Word> wordList  = wordMapper.wordList();
        for(int i=1000;i<6000;i++){
            WordsBook wordsBook = new WordsBook();
            wordsBook.setBookId(1);
            wordsBook.setWordId(wordList.get(i).getId());
            wordsBookMapper.insertSelective(wordsBook);
        }
    }

    @Autowired
    private IMemoService iMemoService;

    @Autowired
    private ISM2 ism2;

    @Test
    public void test3(){
//            iMemoService.MM(20);

//        ism2.ss();

    }
}
