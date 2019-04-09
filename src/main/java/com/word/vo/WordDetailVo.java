package com.word.vo;

import java.util.Date;

public class WordDetailVo {

    private Integer id;

    private String word;

    private String wordName;

    private String wordSound;

    private String wordSymbol;

    private String wordImage;

    private String createTime;

    private String updateTime;

    public Integer getId() {
        return id;
    }

    public WordDetailVo setId(Integer id) {
        this.id = id;
        return this;
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

    public WordDetailVo setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordSound() {
        return wordSound;
    }

    public WordDetailVo setWordSound(String wordSound) {
        this.wordSound = wordSound;
        return this;
    }

    public String getWordSymbol() {
        return wordSymbol;
    }

    public WordDetailVo setWordSymbol(String wordSymbol) {
        this.wordSymbol = wordSymbol;
        return this;
    }

    public String getWordImage() {
        return wordImage;
    }

    public WordDetailVo setWordImage(String wordImage) {
        this.wordImage = wordImage;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public WordDetailVo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public WordDetailVo setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
