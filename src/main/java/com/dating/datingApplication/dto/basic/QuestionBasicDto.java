package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.Question;
import lombok.Data;

@Data
public class QuestionBasicDto {
    private Integer questionId;
    private String questionText;
    private Integer questionOrder;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Integer getQuestionOrder() {
        return questionOrder;
    }

    public void setQuestionOrder(Integer questionOrder) {
        this.questionOrder = questionOrder;
    }

    public static QuestionBasicDto fromEntity(Question question) {
        QuestionBasicDto dto = new QuestionBasicDto();
        dto.setQuestionId(question.getQuestionId());
        dto.setQuestionText(question.getQuestionText());
        dto.setQuestionOrder(question.getQuestionOrder());
        return dto;
    }
}