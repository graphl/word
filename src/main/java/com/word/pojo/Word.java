package com.word.pojo;

import java.util.Date;

public class Word {
    private Integer id;

    private String wordName;

    private String wordSound;

    private String wordSymbol;

    private Date createTime;

    private Date updateTime;

    private String word;

    public Word() {
    }

    public Word(Integer id, String wordName, String wordSound, String wordSymbol, Date createTime, Date updateTime, String word) {
        this.id = id;
        this.wordName = wordName;
        this.wordSound = wordSound;
        this.wordSymbol = wordSymbol;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.word = word;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getWordSound() {
        return wordSound;
    }

    public void setWordSound(String wordSound) {
        this.wordSound = wordSound;
    }

    public String getWordSymbol() {
        return wordSymbol;
    }

    public void setWordSymbol(String wordSymbol) {
        this.wordSymbol = wordSymbol;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", wordName='" + wordName + '\'' +
                ", wordSound='" + wordSound + '\'' +
                ", wordSymbol='" + wordSymbol + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", word='" + word + '\'' +
                '}';
    }
}