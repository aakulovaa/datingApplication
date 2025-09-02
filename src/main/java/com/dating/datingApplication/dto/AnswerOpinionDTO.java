package com.dating.datingApplication.dto;

public class AnswerOpinionDTO {
    private Integer opinionId;
    private Integer opinionQuestionId;
    private String opinionText;
    private Integer opinionOrder;

    public Integer getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(Integer opinionId) {
        this.opinionId = opinionId;
    }

    public Integer getOpinionQuestionId() {
        return opinionQuestionId;
    }

    public void setOpinionQuestionId(Integer opinionQuestionId) {
        this.opinionQuestionId = opinionQuestionId;
    }

    public String getOpinionText() {
        return opinionText;
    }

    public void setOpinionText(String opinionText) {
        this.opinionText = opinionText;
    }

    public Integer getOpinionOrder() {
        return opinionOrder;
    }

    public void setOpinionOrder(Integer opinionOrder) {
        this.opinionOrder = opinionOrder;
    }
}
