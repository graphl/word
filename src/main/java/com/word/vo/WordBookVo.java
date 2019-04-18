package com.word.vo;

public class WordBookVo {
    
    private Integer bookid;
    private String bookImage;
    private String  bookname;
    private String book_js;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public double getComplete() {
        return complete;
    }

    public void setComplete(double complete) {
        this.complete = complete;
    }

    private Integer size;
    private double complete;

    public WordBookVo(Integer bookid, String bookImage, String bookname, String book_js) {
        this.bookid = bookid;
        this.bookImage = bookImage;
        this.bookname = bookname;
        this.book_js = book_js;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBook_js() {
        return book_js;
    }

    public void setBook_js(String book_js) {
        this.book_js = book_js;
    }
}
