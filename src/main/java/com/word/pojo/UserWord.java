package com.word.pojo;

public class UserWord {
    private Integer userId;

    private Integer wordId;

    public UserWord(Integer userId, Integer wordId) {
        this.userId = userId;
        this.wordId = wordId;
    }

    public UserWord() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }
}