package com.word.pojo;

import java.util.Date;

public class Phrase_Word {
    private Integer id;

    private Integer phraseId;

    private Integer wordId;

    private Date createTime;

    private Date updataTime;

    public Phrase_Word(Integer id, Integer phraseId, Integer wordId, Date createTime, Date updataTime) {
        this.id = id;
        this.phraseId = phraseId;
        this.wordId = wordId;
        this.createTime = createTime;
        this.updataTime = updataTime;
    }

    public Phrase_Word() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhraseId() {
        return phraseId;
    }

    public void setPhraseId(Integer phraseId) {
        this.phraseId = phraseId;
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