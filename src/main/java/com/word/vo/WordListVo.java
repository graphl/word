package com.word.vo;

public class WordListVo {

    private Integer id;

    private String wordName;

    private String wordSound;

    private String wordSymbol;

    private String wordImage;

    public Integer getId() {
        return id;
    }

    public WordListVo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getWordName() {
        return wordName;
    }

    public WordListVo setWordName(String wordName) {
        this.wordName = wordName;
        return this;
    }

    public String getWordSound() {
        return wordSound;
    }

    public WordListVo setWordSound(String wordSound) {
        this.wordSound = wordSound;
        return this;
    }

    public String getWordSymbol() {
        return wordSymbol;
    }

    public WordListVo setWordSymbol(String wordSymbol) {
        this.wordSymbol = wordSymbol;
        return this;
    }

    public String getWordImage() {
        return wordImage;
    }

    public WordListVo setWordImage(String wordImage) {
        this.wordImage = wordImage;
        return this;
    }
}
