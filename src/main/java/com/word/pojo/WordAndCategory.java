package com.word.pojo;

public class WordAndCategory {
    private Integer id;

    private Integer book_id;

    private Integer categoryId;

    public WordAndCategory(Integer id, Integer book_id, Integer categoryId) {
        this.id = id;
        this.book_id = book_id;
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getbook_id() {
        return book_id;
    }

    public void setbook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}