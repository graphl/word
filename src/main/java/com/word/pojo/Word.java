package com.word.pojo;

import java.util.Date;

public class Word {
    private Integer id;

    private String wordName;

    private String wordSound;

    private String wordSymbol;

    private String wordImage;

    private Date createTime;

    private Date updateTime;

    public Word(Integer id, String wordName, String wordSound, String wordSymbol, String wordImage, Date createTime, Date updateTime) {
        this.id = id;
        this.wordName = wordName;
        this.wordSound = wordSound;
        this.wordSymbol = wordSymbol;
        this.wordImage = wordImage;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Word() {
        super();
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
        this.wordName = wordName == null ? null : wordName.trim();
    }

    public String getWordSound() {
        return wordSound;
    }

    public void setWordSound(String wordSound) {
        this.wordSound = wordSound == null ? null : wordSound.trim();
    }

    public String getWordSymbol() {
        return wordSymbol;
    }

    public void setWordSymbol(String wordSymbol) {
        this.wordSymbol = wordSymbol == null ? null : wordSymbol.trim();
    }

    public String getWordImage() {
        return wordImage;
    }

    public void setWordImage(String wordImage) {
        this.wordImage = wordImage == null ? null : wordImage.trim();
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
}