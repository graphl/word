package com.word.pojo;

public class WordBook {
    private Integer id;

    private String bookName;

    private String book_js;

    public WordBook() {
    }

    public WordBook(Integer id, String bookName, String book_js) {
        this.id = id;
        this.bookName = bookName;
        this.book_js = book_js;
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
        this.bookName = bookName;
    }

    public String getBook_js() {
        return book_js;
    }

    public void setBook_js(String book_js) {
        this.book_js = book_js;
    }
}