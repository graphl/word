package com.word.pojo;

import java.util.Date;

public class Phrase {
    private Integer id;

    private String phrase;

    private String phraseChinese;

    private Date createTime;

    private Date updataTime;

    public Phrase(String phrase, String phraseChinese) {
        this.phrase = phrase;
        this.phraseChinese = phraseChinese;
    }

    public Phrase(Integer id, String phrase, String phraseChinese, Date createTime, Date updataTime) {
        this.id = id;
        this.phrase = phrase;
        this.phraseChinese = phraseChinese;
        this.createTime = createTime;
        this.updataTime = updataTime;
    }

    public Phrase() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase == null ? null : phrase.trim();
    }

    public String getPhraseChinese() {
        return phraseChinese;
    }

    public void setPhraseChinese(String phraseChinese) {
        this.phraseChinese = phraseChinese == null ? null : phraseChinese.trim();
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