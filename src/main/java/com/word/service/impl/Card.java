package com.word.service.impl;




public class Card {
        int id;

        int interval;
        int Repetition;
        double efactor = 2.5;

        int overDueDate = 0;
        int grad = 0;

        String Q = "";
        String A = "";

        String word = "";
        public Card(int id,int interval, int repetition, double efactor, int overDueDate, int grad) {
        this.interval = interval;
        Repetition = repetition;
        this.efactor = efactor;
        this.overDueDate = overDueDate;
        this.grad = grad;
    }

    public Card(int id,String Q, String A, String word) {
            this.id = id;
            this.Q = Q;
            this.A = A;
            this.word = word;
        }

    @Override
    public String toString() {
        return "Card{" +
                "interval=" + interval +
                ", Repetition=" + Repetition +
                ", efactor=" + efactor +
                ", overDueDate=" + overDueDate +
                ", grad=" + grad +
                ", Q='" + Q + '\'' +
                ", A='" + A + '\'' +
                ", word='" + word + '\'' +
                '}';
    }

    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getRepetition() {
        return Repetition;
    }

    public void setRepetition(int repetition) {
        Repetition = repetition;
    }

    public double getEfactor() {
        return efactor;
    }

    public void setEfactor(double efactor) {
        this.efactor = efactor;
    }

    public int getOverDueDate() {
        return overDueDate;
    }

    public void setOverDueDate(int overDueDate) {
        this.overDueDate = overDueDate;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public String getQ() {
        return Q;
    }

    public void setQ(String q) {
        Q = q;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
