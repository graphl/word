package com.word.vo;

public class MWordVo {

    private Integer id;
    private String word_name;
    private String word_symbol;
    private String word_sound;
    private String word;

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

    public String getWord_symbol() {
        return word_symbol;
    }

    public void setWord_symbol(String word_symbol) {
        this.word_symbol = word_symbol;
    }

    public String getWord_sound() {
        return word_sound;
    }

    public void setWord_sound(String word_sound) {
        this.word_sound = word_sound;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public MWordVo(Integer id, String word_name, String word_symbol, String word_sound, String word) {
        this.id = id;
        this.word_name = word_name;
        this.word_symbol = word_symbol;
        this.word_sound = word_sound;
        this.word = word;
    }
}
