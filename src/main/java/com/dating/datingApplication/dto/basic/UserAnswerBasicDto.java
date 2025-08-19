package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.UserAnswer;
import lombok.Data;

@Data
public class UserAnswerBasicDto {
    private Integer answerId;
    private Integer userId;
    private Integer questionId;
    private Integer opinionId;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(Integer opinionId) {
        this.opinionId = opinionId;
    }

    public static UserAnswerBasicDto fromEntity(UserAnswer userAnswer) {
        UserAnswerBasicDto dto = new UserAnswerBasicDto();
        dto.setAnswerId(userAnswer.getAnswerId());
        dto.setUserId(userAnswer.getAnswerUser().getUserId());
        dto.setQuestionId(userAnswer.getAnswerQuestion().getQuestionId());
        dto.setOpinionId(userAnswer.getAnswerOpinion().getOpinionId());
        return dto;
    }
}