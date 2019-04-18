package com.word.vo;

public class UserWordVo {

    private Integer id;
    private String word_name;
    private String word;
    private String word_symbol;

    public UserWordVo() {

    }

    public UserWordVo(Integer id, String word_name, String word, String word_symbol) {
        this.id = id;
        this.word_name = word_name;
        this.word = word;
        this.word_symbol = word_symbol;
    }

    public UserWordVo(String word_name, String word, String word_symbol) {
        this.word_name = word_name;
        this.word = word;
        this.word_symbol = word_symbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord_name() {
        return word_name;
    }

    public void setWord_name(String word_name) {
        this.word_name = word_name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord_symbol() {
        return word_symbol;
    }

    public void setWord_symbol(String word_symbol) {
        this.word_symbol = word_symbol;
    }
}
