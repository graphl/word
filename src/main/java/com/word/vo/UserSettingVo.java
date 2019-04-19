package com.word.vo;

import java.util.List;

public class UserSettingVo {

    private List<String> bookName;
    private List<Integer>  wordId;
    private Integer choosebook;


    public List<String> getBookName() {
        return bookName;
    }

    public void setBookName(List<String> bookName) {
        this.bookName = bookName;
    }

    public List<Integer> getWordId() {
        return wordId;
    }

    public void setWordId(List<Integer> wordId) {
        this.wordId = wordId;
    }

    public Integer getChoosebook() {
        return choosebook;
    }

    public void setChoosebook(Integer choosebook) {
        this.choosebook = choosebook;
    }
}
