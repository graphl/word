package com.word.service.impl;

import com.word.common.ServerResponse;
import com.word.dao.PhraseMapper;
import com.word.dao.SentenceMapper;
import com.word.pojo.Phrase;
import com.word.pojo.Sentence;
import com.word.service.IPhraseAndSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("iPhraseAndSentenceService")
public class PhraseAndSentenceServiceImpl implements IPhraseAndSentenceService {


    @Autowired
    private PhraseMapper phraseMapper;

    @Autowired
    private SentenceMapper sentenceMapper;
    /**
     * 获得全部phrase
     */

        public ServerResponse getAllPhrase(){
            List<Phrase> phrases = phraseMapper.getAllphrase();
           /* if(phrases.size() == 0){
                return ServerResponse.createByErrorMessage("没有数据");
            }*/
            return ServerResponse.createBySuccess(phrases);
        }

        public ServerResponse getAllSentence(){

            List<Sentence> sentences = sentenceMapper.getAllS();

           /* if (sentences.size() == 0){
                return ServerResponse.createByErrorMessage("没有数据");
            }*/
            return  ServerResponse.createBySuccess(sentences);
        }

    /**
     * 删除短语
     * @param phrase_id
     * @return
     */
         public ServerResponse deletePhraseById(Integer phrase_id){
            int result = phraseMapper.deleteByPhraseId(phrase_id);
            return ServerResponse.createBySuccess(result);
        }

    /**
     * 删除句子
     * @param sentence_id
     * @return
     */
    public ServerResponse deleteSentenceById(Integer sentence_id){
            int result = sentenceMapper.deleteBySentenceId(sentence_id);
            return ServerResponse.createBySuccess(result);
        }

     public ServerResponse updatePhrase(Phrase phrase){
        int result = phraseMapper.updateByPrimaryKeySelective(phrase);
        return ServerResponse.createBySuccess(result);
     }
     public ServerResponse updateSentence(Sentence sentence){
        int result  = sentenceMapper.updateByPrimaryKeySelective(sentence);
        return ServerResponse.createBySuccess(result);

     }
  /*  public ServerResponse addPhrase(Phrase phrase){
        int result = phraseMapper.addPhrase(phrase);
         if(result == 0 ){
             return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccess(result);
    }
    public ServerResponse updateSentence(Sentence sentence){
        int result  = sentenceMapper.addSentence(sentence);
        if(result == 0 ){
             return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccess(result);
    }*/

}
