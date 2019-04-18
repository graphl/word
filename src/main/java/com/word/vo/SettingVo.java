package com.word.vo;

public class SettingVo {
    private Integer id;
    private Integer check_book_id;
    private String check_book_name;
    private Integer wordSize;

    public Integer getCheck_book_id() {
        return check_book_id;
    }

    public void setCheck_book_id(Integer check_book_id) {
        this.check_book_id = check_book_id;
    }

    public String getCheck_book_name() {
        return check_book_name;
    }

    public void setCheck_book_name(String check_book_name) {
        this.check_book_name = check_book_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getWordSize() {
        return wordSize;
    }

    public void setWordSize(Integer wordSize) {
        this.wordSize = wordSize;
    }
}
