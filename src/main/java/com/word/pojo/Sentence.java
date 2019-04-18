package com.word.pojo;

import java.util.Date;

public class Sentence {
    private Integer id;

    private String sentence;

    private String sentenceChinese;

    private Date createTime;

    private Date updataTime;

    public Sentence(String sentence, String sentenceChinese) {
        this.sentence = sentence;
        this.sentenceChinese = sentenceChinese;
    }

    public Sentence(Integer id, String sentence, String sentenceChinese, Date createTime, Date updataTime) {
        this.id = id;
        this.sentence = sentence;
        this.sentenceChinese = sentenceChinese;
        this.createTime = createTime;
        this.updataTime = updataTime;
    }

    public Sentence() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence == null ? null : sentence.trim();
    }

    public String getSentenceChinese() {
        return sentenceChinese;
    }

    public void setSentenceChinese(String sentenceChinese) {
        this.sentenceChinese = sentenceChinese == null ? null : sentenceChinese.trim();
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