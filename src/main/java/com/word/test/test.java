package com.word.test;

import com.word.dao.WordMapper;
import com.word.pojo.Sentence;
import com.word.service.IPhraseAndSentenceService;
import com.word.service.IWordService;
import com.word.util.MD5Util;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;


public class test {
    @Test
    public void test(){
        System.out.println(MD5Util.MD5EncodeUtf8("1234"));
    }

    @Autowired
    private IPhraseAndSentenceService iPhraseAndSentenceService;

    @Autowired
    private WordMapper wordMapper;

    @Autowired
    private IWordService iWordService;
    @Test
    public  void test1(){
       iWordService.getWordList(1,10);
    }
    @Test
    public void test2(){
        Sentence sentence = new Sentence();
        sentence.setSentence("abac");
        sentence.setWordId(10201);
        sentence.setSentenceChinese("xxxx");
        iPhraseAndSentenceService.addSentence(sentence);
}
@Test
    public void test3(){

    List<Integer> list = new ArrayList<>();
    if(list.indexOf(2)==-1){
        System.out.println(123);
    }
    else {
        System.out.println(234);
    }
}
}
