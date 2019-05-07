
package com.word.service.impl;

import com.word.dao.MemoMapper;
import com.word.dao.WordMapper;
import com.word.pojo.Memo;
import com.word.vo.MWordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("SuperMemo2")
public class SuperMemo2 {

    @Autowired
    private WordMapper wordMapper;

    @Autowired
    private MemoMapper memoMapper;

    @Autowired
    private Sm2 quiz;


    public  List<MWordVo> wordList = new ArrayList<>();

//    public  static Sm2 quiz;

   public void main(List<MWordVo> words,Integer userId){

       if(words!=null)
       this.wordList .addAll(words);
       for (int i=0;i<words.size();i++){
            String Q = "Question "+wordList.get(i).getId();
            String A = String.valueOf(wordList.get(i).getId());
            String word = wordList.get(i).getWord_name();
            quiz.addCard(Q,A,word,userId,words.get(i).getId());

       }

   }
   public void existenceMemo(List<MWordVo> words, List<Memo> memos){

       if (words!=null) this.wordList.addAll(words);
       for (int i=0;i<words.size();i++){
           if(i>=memos.size())break;
           Card card = new Card();
           card.setEfactor(memos.get(i).getEfactor());
           card.setGrad(memos.get(i).getGrad());
           card.setInterval(memos.get(i).getInterval());
           card.setRepetition(memos.get(i).getRepetition());
           card.setA(words.get(i).getWord_name());
           card.setWord(words.get(i).getWord_name());
           card.setId(memos.get(i).getId());
           System.out.println("card "+i+" ====== "+card);
           quiz.changCard(card);
       }

   }

    public MWordVo getQuestion(){
      Sm2 s =  quiz.getQuestions();
      int index = s.currentIndex;
       MWordVo word = wordList.get(index);
       MWordVo mWordVo = new MWordVo();
       mWordVo.setId(word.getId());
       mWordVo.setWord(word.getWord());
       mWordVo.setWord_name(word.getWord_name());
       mWordVo.setWord_sound(word.getWord_sound());
       mWordVo.setWord_symbol(word.getWord_symbol());
      return  mWordVo;
   }

   public boolean isFinishedForToDay(){
       return quiz.isFinishedForToDay();
   }

   public boolean doTomorrowsExercises(){
       return quiz.doTomorrowsExercises(1);
   }
   public void gradYouAnswer(Integer gard){

       quiz.gradYouAnswer(gard);
       quiz.cardsToString();

   }
}
