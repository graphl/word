package com.word.pojo;

public class WordsBook {
    private Integer id;

    private Integer bookId;

    private Integer wordId;

    public WordsBook(Integer id, Integer bookId, Integer wordId) {
        this.id = id;
        this.bookId = bookId;
        this. wordId= wordId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getWordId() {
        return wordId;
    }

    public void setWordId(Integer wordId) {
        this.wordId = wordId;
    }

    public WordsBook() {
    }
}