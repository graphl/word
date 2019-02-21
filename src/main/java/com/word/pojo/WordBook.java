package com.word.pojo;

public class WordBook {
    private Integer id;

    private String bookName;

    private Integer wordId;

    public WordBook(Integer id, String bookName, Integer wordId) {
        this.id = id;
        this.bookName = bookName;
        this.wordId = wordId;
    }

    public WordBook() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }
}