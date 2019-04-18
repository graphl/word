package com.word.vo;

import com.word.pojo.Phrase;
import com.word.pojo.Sentence;
import com.word.pojo.Word;

import java.util.List;

public class WordDetail_SVo {

    private Word word;
    private List<Phrase> phrases;
    private List<Sentence> sentences;

    public WordDetail_SVo(Word word, List<Phrase> phrases, List<Sentence> sentences) {
        this.word = word;
        this.phrases = phrases;
        this.sentences = sentences;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public List<Phrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }
}
