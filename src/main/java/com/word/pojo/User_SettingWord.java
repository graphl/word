package com.word.pojo;

import java.util.Date;

public class User_SettingWord {
    private Integer id;

    private Integer checkBookId;

    private Integer wordSize;

    private Integer userId;

    private Date createTime;

    private Date updataTime;

    public User_SettingWord(Integer id, Integer checkBookId, Integer wordSize, Integer userId, Date createTime, Date updataTime) {
        this.id = id;
        this.checkBookId = checkBookId;
        this.wordSize = wordSize;
        this.userId = userId;
        this.createTime = createTime;
        this.updataTime = updataTime;
    }

    public User_SettingWord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCheckBookId() {
        return checkBookId;
    }

    public void setCheckBookId(Integer checkBookId) {
        this.checkBookId = checkBookId;
    }

    public Integer getWordSize() {
        return wordSize;
    }

    public void setWordSize(Integer wordSize) {
        this.wordSize = wordSize;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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