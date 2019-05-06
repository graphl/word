/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.word.service.impl;

import com.word.dao.MemoMapper;
import com.word.pojo.Memo;
import com.word.service.ISM2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service("sm2")
public class Sm2 implements ISM2 {

    @Autowired
    private MemoMapper memoMapper;


    private static List<Card> cards = new ArrayList<>();

    private int scheduled = 0;      // numbers of cards in deck
    private int notMemorised = 0;   // start value will be the same as scheduled

    public int currentIndex = 0;   // current index in cards Arraylist
    public static  Card currentCard = null;

    public void addCard(String q, String a,String w,Integer userId,Integer wordId) {
        // Fill deck up with cards
        Memo memo = new Memo(0,0,2.5,0,0,wordId,userId);
       int id =  memoMapper.insertSelective(memo);
        cards.add(new Card(id,q,a,w));
        System.out.println("cards 11================"+cards);
        scheduled++;
        notMemorised++;
    }
    public void changCard(Card card){

//        System.out.println(card);
        cards.add(card);
        System.out.println("cards2 ============="+cards);
        scheduled++;
        notMemorised++;
    }


    public void calcIntervalEF(int grade /*,Card card*/) {

        double oldEF = currentCard.efactor;
        double newEF = 0;

        if (grade < 3) {
            currentCard.Repetition = 0;
            currentCard.interval = 0;
        } else {

            newEF = oldEF + (0.1 - (5 - grade) * (0.08 + (5 - grade) * 0.02));
            newEF = Math.round(newEF * 100.0)/100.0; // force java to round number down to 2 decimals

            if (newEF < 1.3) { // 1.3 is the minimum EF
                currentCard.efactor = 1.3;

            } else {
                currentCard.efactor = newEF;
            }

            currentCard.Repetition = currentCard.Repetition + 1;
            switch (currentCard.Repetition) {
                case 1:
                    currentCard.interval = 1;
                    break;
                case 2:
                    currentCard.interval = 6;
                    break;
                default:
                    currentCard.interval = (int) Math.round((currentCard.Repetition - 1) * currentCard.efactor);
                    break;
            }
        } // End of if-else()

        if (grade == 5) {
            currentCard.interval = 0;
        }


        currentCard.overDueDate += currentCard.interval;
        Memo memo = new Memo();
        memo.setEfactor(currentCard.efactor);
        memo.setGrad(currentCard.grad);
        memo.setId(currentCard.id);
        memo.setOverduedate(currentCard.overDueDate);
        memo.setRepetition(currentCard.Repetition);
        memo.setInterval(currentCard.interval);
        System.out.println(memo);
        memoMapper.updateByPrimaryKeySelective(memo);
        System.out.println(currentCard+"      currentCard");
    } // end of method :: calcIntervalEF

    public Sm2 getQuestions() {

        System.out.println(scheduled+"======================scheduled");
        System.out.println(cards);
        // Roted the deck
        if ((scheduled - 1) - currentIndex <= 0) {
            currentIndex = 0;
        } else {
            currentIndex++;
        }
        // pick a card
        for (int i = currentIndex; i < scheduled; i++) {

            // Get "Over Due Data" questions
            if (cards.get(i).overDueDate <= 0) {
                currentCard = cards.get(i);
                System.out.println(currentCard.Q);
                return this;
            }
            // Get cards with a wrong ansaw
            if (cards.get(i).overDueDate <= 0 && cards.get(i).grad < 4) { // 3 or 4
                currentCard = cards.get(i);
                System.out.println(currentCard.Q);
                return this;
            }
        }
        // set to null to indicate: no more cards to test
        currentCard = null;
        return this;
    }


    public Sm2 gradYouAnswer(int grad_test) {

        if (currentCard == null) {
            System.out.println("出bug了");
            return this;
        }

//        int grad = Integer.parseInt(getInput("grad you answer type: (0)(1)(2)(3)(4)(5)"));
        int grad = grad_test;
        System.out.println(grad+"=================================");
        if (0 <= grad && grad <= 5) {
            //calculate new Over Due Date
            currentCard.grad = grad;
            calcIntervalEF(grad);
            if (5 < grad) { // se line 136 have to match this line
                //currentCard.overDueDate = 1;
//                currentCard.grad = grad;
//                calcIntervalEF(grad);
                notMemorised--;
            }
        } else {
            gradYouAnswer(grad_test);
        }
/*


        Memo memo = new Memo();
        memo.setEfactor(currentCard.efactor);
*/



        return this;
    }


    public boolean isFinishedForToDay() {
        return notMemorised != 0;
    }

    public boolean doTomorrowsExercises(Integer userId) {
            for (Card c : cards) {
                c.overDueDate--;
                if(c.overDueDate <= 0)
                    c.overDueDate = 0;
                Memo memo = new Memo();
                memo.setId(c.getId());
                memo.setUserid(userId);
                memo.setOverduedate(c.getOverDueDate());

            }
            return true;
    }


    // util methods -->
    public void cardsToString() {
        for (Card c : cards) {
            c.toString();
        }
    }

    @Override
    public String toString() {
        return "Sm2{" +
                ", scheduled=" + scheduled +
                ", notMemorised=" + notMemorised +
                ", currentIndex=" + currentIndex +
                ", currentCard=" + currentCard +
                '}';
    }
} // End of class
