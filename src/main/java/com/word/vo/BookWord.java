package com.word.vo;

public class BookWord {

    Integer id;
    String word;
    String wordName;

    Integer wbId;

    public Integer getWbId() {
        return wbId;
    }

    public void setWbId(Integer wbId) {
        this.wbId = wbId;
    }

    public BookWord() {

    }


    public BookWord(Integer id, String word, String wordName, Integer wbId) {
        this.id = id;
        this.word = word;
        this.wordName = wordName;
        this.wbId = wbId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }
}
