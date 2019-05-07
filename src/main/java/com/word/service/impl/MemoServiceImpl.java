package com.word.service.impl;

import com.word.dao.*;
import com.word.pojo.Memo;
import com.word.pojo.User_SettingWord;
import com.word.service.IMemoService;
import com.word.vo.MWordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("iMemoService")
public class MemoServiceImpl implements IMemoService {

    @Autowired
    private SuperMemo2 superMemo2;

    @Autowired
    private MemoMapper memoMapper;

    @Autowired
    private WordMapper wordMapper;

    @Autowired
    private User_SettingWordMapper settingWordMapper;

    @Autowired
    private WordsBookMapper wordsBookMapper;

    @Autowired
    private UserWordMapper userWordMapper;


    public MWordVo MM(Integer userId){

        superMemo2.wordList.clear();

        List<Memo> memosvalue = memoMapper.selectMemo(userId);

        List<MWordVo> memoList = getMemo(userId);

        User_SettingWord settingWord = getSettingDetail(userId);

        List<MWordVo> Mwords;

        if(settingWord.getCheckBookId() == null){
            Mwords = userWordMapper.selectUserWord(userId);
        }
        else{
             Mwords = wordsBookMapper.selectByBookId(settingWord.getCheckBookId());
        }


        if (settingWord.getWordSize() == null){
            settingWord.setWordSize(20);
        }
        List<Integer> checkM = memoMapper.selectWordId(userId);
        List<MWordVo> newMemo = new ArrayList<>();
        if (memoList.size() == 0){
            for (int i=0;i<Mwords.size();i++){
                if (newMemo.size()>=settingWord.getWordSize()) {break;}
                if(checkM.indexOf(Mwords.get(i).getId()) == -1){
                    newMemo.add(Mwords.get(i));
                }
            }
        }
       else if(memoList.size() < settingWord.getWordSize()){
            for(int i=0;i<Mwords.size();i++){
                if(memoList.size()+newMemo.size() >= settingWord.getWordSize()){break;}
                    if(checkM.indexOf(Mwords.get(i).getId()) == -1){
                           newMemo.add(Mwords.get(i));
                }
            }
        }
        else {
            for (int i= settingWord.getWordSize();i<memoList.size();i++){
                  memoList.remove(i);
                  memosvalue.remove(i);
            }
        }
        if(memoList.size() <= 0 && newMemo.size()<=0){
            return null;
        }
        if(newMemo.size()>0){
            superMemo2.main(newMemo,userId);
        }


        if(memoList.size()> 0){
            superMemo2.existenceMemo(memoList,memosvalue);
        }


        MWordVo mWordVo =  superMemo2.getQuestion();
        mWordVo.setMsize(superMemo2.wordList.size());
        System.out.println(mWordVo);
        if (!superMemo2.isFinishedForToDay()){
            superMemo2.doTomorrowsExercises();
        }
        return mWordVo;
    }



    public User_SettingWord getSettingDetail(Integer userId)
    {

        User_SettingWord settingWord = settingWordMapper.selectSetting(userId);
        return settingWord;
    }

    public List<MWordVo> getMemo(Integer userId){

        List<MWordVo> memos = memoMapper.selectMList(userId);
        return memos;
    }


    public MWordVo onKnow(Integer grad){
        System.out.println("进来了+grad================="+grad);
        superMemo2.gradYouAnswer(grad);
        MWordVo mWordVo =  superMemo2.getQuestion();
        if (!superMemo2.isFinishedForToDay()){
            superMemo2.doTomorrowsExercises();
        }
        return  mWordVo;
    }

    public void unKonw(Integer grad){

        superMemo2.gradYouAnswer(grad);
        if (!superMemo2.isFinishedForToDay()){
            superMemo2.doTomorrowsExercises();
        }

    }

    public MWordVo NextMW()
    {

        MWordVo mWordVo =  superMemo2.getQuestion();
        if (!superMemo2.isFinishedForToDay()){
            superMemo2.doTomorrowsExercises();
        }
        return  mWordVo;
    }



}
