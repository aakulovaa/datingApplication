package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.AnswerOpinion;
import lombok.Data;

@Data
public class AnswerOpinionBasicDto {
    private Integer opinionId;
    private String opinionText;
    private Integer opinionOrder;
    private Integer questionId; // Только ID вместо целого объекта

    public Integer getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(Integer opinionId) {
        this.opinionId = opinionId;
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

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public static AnswerOpinionBasicDto fromEntity(AnswerOpinion opinion) {
        AnswerOpinionBasicDto dto = new AnswerOpinionBasicDto();
        dto.setOpinionId(opinion.getOpinionId());
        dto.setOpinionText(opinion.getOpinionText());
        dto.setOpinionOrder(opinion.getOpinionOrder());
        dto.setQuestionId(opinion.getOpinionQuestion().getQuestionId());
        return dto;
    }
}