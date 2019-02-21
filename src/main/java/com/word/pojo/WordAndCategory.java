package com.word.pojo;

public class WordAndCategory {
    private Integer id;

    private Integer wordId;

    private Integer categoryId;

    public WordAndCategory(Integer id, Integer wordId, Integer categoryId) {
        this.id = id;
        this.wordId = wordId;
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public WordAndCategory setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getWordId() {
        return wordId;
    }

    public WordAndCategory setWordId(Integer wordId) {
        this.wordId = wordId;
        return this;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public WordAndCategory setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }
}