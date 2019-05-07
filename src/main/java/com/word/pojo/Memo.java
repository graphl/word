package com.word.pojo;

public class Memo {
    private Integer id;

    private Integer intervall;

    private Integer repetition;

    private Double efactor;

    private Integer overduedate;

    private Integer grad;

    private Integer wordid;

    private Integer userid;

    public Memo(Integer id, Integer interval, Integer repetition, Double efactor, Integer overduedate, Integer grad, Integer wordid, Integer userid) {
        this.id = id;
        this.intervall = interval;
        this.repetition = repetition;
        this.efactor = efactor;
        this.overduedate = overduedate;
        this.grad = grad;
        this.wordid = wordid;
        this.userid = userid;
    }

    public Memo(Integer interval, Integer repetition, Double efactor, Integer overduedate, Integer grad, Integer wordid, Integer userid) {
        this.intervall = interval;
        this.repetition = repetition;
        this.efactor = efactor;
        this.overduedate = overduedate;
        this.grad = grad;
        this.wordid = wordid;
        this.userid = userid;
    }

    public Memo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInterval() {
        return intervall;
    }

    public void setInterval(Integer interval) {
        this.intervall = interval;
    }

    public Integer getRepetition() {
        return repetition;
    }

    public void setRepetition(Integer repetition) {
        this.repetition = repetition;
    }

    public Double getEfactor() {
        return efactor;
    }

    public void setEfactor(Double efactor) {
        this.efactor = efactor;
    }

    public Integer getOverduedate() {
        return overduedate;
    }

    public void setOverduedate(Integer overduedate) {
        this.overduedate = overduedate;
    }

    public Integer getGrad() {
        return grad;
    }

    public void setGrad(Integer grad) {
        this.grad = grad;
    }

    public Integer getWordid() {
        return wordid;
    }

    public void setWordid(Integer wordid) {
        this.wordid = wordid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Memo{" +
                "id=" + id +
                ", intervall=" + intervall +
                ", repetition=" + repetition +
                ", efactor=" + efactor +
                ", overduedate=" + overduedate +
                ", grad=" + grad +
                ", wordid=" + wordid +
                ", userid=" + userid +
                '}';
    }
}