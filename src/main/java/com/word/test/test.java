package com.word.test;

import com.word.pojo.Sentence;
import com.word.service.IPhraseAndSentenceService;
import com.word.util.MD5Util;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Test
    public void test(){
        System.out.println(MD5Util.MD5EncodeUtf8("1234"));
    }

    @Autowired
    private IPhraseAndSentenceService iPhraseAndSentenceService;

    @Test
    public void test2(){
        Sentence sentence = new Sentence();
        sentence.setSentence("abac");
        sentence.setWordId(10201);
        sentence.setSentenceChinese("xxxx");
        iPhraseAndSentenceService.addSentence(sentence);
}
}
