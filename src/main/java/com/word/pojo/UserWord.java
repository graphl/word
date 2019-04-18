package com.word.pojo;

public class UserWord {
    private Integer id;

    private Integer userId;

    private Integer wordId;

    public UserWord(Integer id, Integer userId, Integer wordId) {
        this.id = id;
        this.userId = userId;
        this.wordId = wordId;
    }

    public UserWord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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