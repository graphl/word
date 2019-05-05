package com.word.vo;

import com.word.pojo.Phrase;
import com.word.pojo.Sentence;

import java.util.List;

public class WordDetailOneVo {

    private int id;
    private String word;
    private String word_name;
    private String word_symbol;
    private Integer check;
    private String word_sound;
    private List<Phrase> phrase;
    private List<Sentence> sentence;

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getWord_name() {
        return word_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setWord_name(String word_name) {
        this.word_name = word_name;
    }

    public void setWord_symbol(String word_symbol) {
        this.word_symbol = word_symbol;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }

    public void setWord_sound(String word_sound) {
        this.word_sound = word_sound;
    }

    public void setPhrase(List<Phrase> phrase) {
        this.phrase = phrase;
    }

    public void setSentence(List<Sentence> sentence) {
        this.sentence = sentence;
    }

    public String getWord_symbol() {
        return word_symbol;
    }

    public Integer getCheck() {
        return check;
    }

    public String getWord_sound() {
        return word_sound;
    }

    public List<Phrase> getPhrase() {
        return phrase;
    }

    public List<Sentence> getSentence() {
        return sentence;
    }


    public WordDetailOneVo(int id, String word, String word_name, String word_symbol, Integer check, String word_sound, List<Phrase> phrase, List<Sentence> sentence) {
        this.id = id;
        this.word = word;
        this.word_name = word_name;
        this.word_symbol = word_symbol;
        this.check = check;
        this.word_sound = word_sound;
        this.phrase = phrase;
        this.sentence = sentence;
    }

    public WordDetailOneVo() {

    }

    public WordDetailOneVo(int id, String word, String word_name, List<Phrase> phrase, List<Sentence> sentence) {
        this.id = id;
        this.word = word;
        this.word_name = word_name;
        this.phrase = phrase;
        this.sentence = sentence;
    }


    @Override
    public String toString() {
        return "WordDetailOneVo{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", word_name='" + word_name + '\'' +
                ", word_symbol='" + word_symbol + '\'' +
                ", check=" + check +
                ", word_sound='" + word_sound + '\'' +
                ", phrase=" + phrase +
                ", sentence=" + sentence +
                '}';
    }
}
