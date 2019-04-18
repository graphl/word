package com.word.pojo;

import java.util.Date;

public class Sentence_Word {
    private Integer id;

    private Integer sentenceId;

    private Integer wordId;

    private Date createTime;

    private Date updataTime;

    public Sentence_Word(Integer id, Integer sentenceId, Integer wordId, Date createTime, Date updataTime) {
        this.id = id;
        this.sentenceId = sentenceId;
        this.wordId = wordId;
        this.createTime = createTime;
        this.updataTime = updataTime;
    }

    public Sentence_Word() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSentenceId() {
        return sentenceId;
    }

    public void setSentenceId(Integer sentenceId) {
        this.sentenceId = sentenceId;
    }

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(Date updataTime) {
        this.updataTime = updataTime;
    }
}