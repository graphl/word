package com.word.controller.backend;

import com.word.common.ServerResponse;
import com.word.pojo.Phrase;
import com.word.pojo.Sentence;
import com.word.service.IPhraseAndSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/manage/ps")
public class PhraseandSentenceController {

    @Autowired
    private IPhraseAndSentenceService iPhraseAndSentenceService;

    @RequestMapping("/showAllPhrase")
    @ResponseBody
    public ServerResponse showAllPhrase(){
        return iPhraseAndSentenceService.getAllPhrase();
    }
    @RequestMapping("/showAllS")
    @ResponseBody
    public ServerResponse showAllS(){
        return iPhraseAndSentenceService.getAllSentence();
    }

    @RequestMapping("/deletePhraseById")
    @ResponseBody
    public ServerResponse deletePhraseById(Integer phrase_id){
        return iPhraseAndSentenceService.deletePhraseById(phrase_id);
    }

    @RequestMapping("/deleteSentenceById")
    @ResponseBody
    public ServerResponse deleteSentenceById(Integer sentence_id){
        return iPhraseAndSentenceService.deleteSentenceById(sentence_id);
    }

    @RequestMapping("/updatePhrase")
    @ResponseBody
    public ServerResponse updatePhrase(Phrase phrase){
        return iPhraseAndSentenceService.updatePhrase(phrase);

    }

    @RequestMapping("/updateSentence")
    @ResponseBody
    public ServerResponse updateSentence(Sentence sentence){
        return iPhraseAndSentenceService.updateSentence(sentence);
    }
}
