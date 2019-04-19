package com.word.service.impl;

import com.word.common.ServerResponse;
import com.word.dao.Phrase_WordMapper;
import com.word.dao.Sentence_WordMapper;
import com.word.dao.UserWordMapper;
import com.word.dao.WordMapper;
import com.word.pojo.Phrase;
import com.word.pojo.Sentence;
import com.word.pojo.UserWord;
import com.word.pojo.Word;
import com.word.service.IUserWordService;
import com.word.vo.WordDetailOneVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("iUserWordService")
public class UserWordServiceImpl implements IUserWordService {

    @Autowired
    private WordMapper wordMapper;
    @Autowired
    private UserWordMapper userWordMapper;

    @Autowired
    private Phrase_WordMapper phrase_wordMapper;

    @Autowired
    private Sentence_WordMapper sentence_wordMapper;


   // 前端
    public ServerResponse addUserWord(Integer wordId,Integer userId){
        if(wordId == null||userId == null){
            return ServerResponse.createByErrorMessage("添加用户单词参数错误");
        }
        UserWord userWord = new UserWord();
        userWord.setUserId(userId);
        userWord.setWordId(wordId);
       int rowCount =  userWordMapper.insert(userWord);
       if(rowCount>0){
           return ServerResponse.createBySuccess("用户添加单词成功");
       }
       return ServerResponse.createByErrorMessage("用户添加单词失败");
    }
    public ServerResponse deleteUserWord(Integer wordId,Integer userId){
        if(wordId == null||userId == null){
            return ServerResponse.createByErrorMessage("单词参数错误");
        }
        Word word = wordMapper.selectByPrimaryKey(wordId);
        if(word != null){
            int rowCount = userWordMapper.deleteUserWord(wordId,userId);
            if(rowCount>0) {
                return ServerResponse.createBySuccess("删除单词成功");
            }else{
                return ServerResponse.createByErrorMessage("删除单词失败");
            }
        }
        return ServerResponse.createByErrorMessage("没有该单词");
    }

    public ServerResponse<List<Word>> showUserWord(Integer user_id){

        List<Word> wordList = userWordMapper.showUserWord(user_id);

       return ServerResponse.createBySuccess(wordList);
    }


    public WordDetailOneVo searchWordDetail(String wordName){
        WordDetailOneVo wordDetailOneVo = new WordDetailOneVo();
        Word word = wordMapper.selectByWord_name(wordName);
        List<Phrase> phraseList = phrase_wordMapper.selectBywordId(word.getId());
        List<Sentence> sentenceList = sentence_wordMapper.selectByWordId(word.getId());
        int check = userWordMapper.checkWordIsInUserWord(word.getId());
        if(check > 0 ){
            check = 1;
        }
        wordDetailOneVo.setId(word.getId());
        wordDetailOneVo.setWord(word.getWord());
        wordDetailOneVo.setWord_name(word.getWordName());
        wordDetailOneVo.setWord_sound(word.getWordSound());
        wordDetailOneVo.setPhrase(phraseList);
        wordDetailOneVo.setSentence(sentenceList);
        wordDetailOneVo.setCheck(check);
        return wordDetailOneVo;
    }

    


}
