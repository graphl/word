package com.word.service.impl;

import com.word.common.ServerResponse;
import com.word.dao.*;
import com.word.pojo.Phrase;
import com.word.pojo.Sentence;
import com.word.pojo.UserWord;
import com.word.pojo.Word;
import com.word.service.IUserWordService;
import com.word.vo.UserWordVo;
import com.word.vo.WordDetailOneVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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
    private SentenceMapper sentenceMapper;


    @Override
   // 前端
    public ServerResponse addUserWord(Integer wordId,Integer userId){

        if(wordId == null||userId == null){
            return ServerResponse.createByErrorMessage("添加用户单词参数错误");
        }
        UserWord userWord = new UserWord();
        userWord.setUserId(userId);
        userWord.setWordId(wordId);

        int result = userWordMapper.checkWordIsInUserWord(wordId,userId);
        if(result>0){
            return ServerResponse.createByErrorMessage("已经存在");
        }
       int rowCount =  userWordMapper.insert(userWord);
       if(rowCount>0){
           return ServerResponse.createBySuccess("用户添加单词成功");
       }
       return ServerResponse.createByErrorMessage("用户添加单词失败");
    }

    @Override
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

    @Override
    public List<UserWordVo> showUserWord(Integer user_id){

        List<UserWordVo> userWordVoList = userWordMapper.showUserWord(user_id);

       return userWordVoList;
    }

    @Override
    public WordDetailOneVo searchWordDetail(String wordName,Integer userId){
        WordDetailOneVo wordDetailOneVo = new WordDetailOneVo();
        Word word = wordMapper.selectByWord_name(wordName);
     /*   System.out.println(word);*/
      /*  List<Phrase> phraseList = phrase_wordMapper.selectBywordId(word.getId());*/
        List<Sentence> sentenceList = sentenceMapper.selectByWordId(word.getId());
        int check = userWordMapper.checkWordIsInUserWord(word.getId(),userId);
        if(check > 0 ){
            check = 1;
        }
        wordDetailOneVo.setId(word.getId());
        wordDetailOneVo.setWord(word.getWord());
        wordDetailOneVo.setWord_name(word.getWordName());
        wordDetailOneVo.setWord_sound(word.getWordSound());
        wordDetailOneVo.setWord_symbol(word.getWordSymbol());
       /* wordDetailOneVo.setPhrase(phraseList);*/
        wordDetailOneVo.setSentence(sentenceList);
        wordDetailOneVo.setCheck(check);
        System.out.println(wordDetailOneVo);
        return wordDetailOneVo;
    }

    public ServerResponse deleteByWordIdlist(List<Integer> wordIdList,Integer userId){
        for (int i=0;i<wordIdList.size();i++){
            int result = userWordMapper.checkWordIsInUserWord(wordIdList.get(i),userId);
            if(result<=0){
                UserWord userWord = new UserWord();
                userWord.setWordId(wordIdList.get(i));
                userWord.setUserId(userId);
               int re=  userWordMapper.insertSelective(userWord);
               if(re<=0){
                   return  ServerResponse.createByErrorMessage("删除没成功");
               }
            }
        }
        return ServerResponse.createBySuccess();
    }
}
