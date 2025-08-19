package com.dating.datingApplication.dto.detail;

import com.dating.datingApplication.dto.basic.AnswerOpinionBasicDto;
import com.dating.datingApplication.dto.basic.QuestionBasicDto;
import com.dating.datingApplication.dto.basic.UserBasicDto;
import com.dating.datingApplication.models.UserAnswer;
import lombok.Data;

@Data
public class UserAnswerDetailDto {
    private Integer answerId;
    private UserBasicDto user;
    private QuestionBasicDto question;
    private AnswerOpinionBasicDto opinion;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public UserBasicDto getUser() {
        return user;
    }

    public void setUser(UserBasicDto user) {
        this.user = user;
    }

    public QuestionBasicDto getQuestion() {
        return question;
    }

    public void setQuestion(QuestionBasicDto question) {
        this.question = question;
    }

    public AnswerOpinionBasicDto getOpinion() {
        return opinion;
    }

    public void setOpinion(AnswerOpinionBasicDto opinion) {
        this.opinion = opinion;
    }

    public static UserAnswerDetailDto fromEntity(UserAnswer userAnswer) {
        UserAnswerDetailDto dto = new UserAnswerDetailDto();
        dto.setAnswerId(userAnswer.getAnswerId());
        dto.setUser(UserBasicDto.fromEntity(userAnswer.getAnswerUser()));
        dto.setQuestion(QuestionBasicDto.fromEntity(userAnswer.getAnswerQuestion()));
        dto.setOpinion(AnswerOpinionBasicDto.fromEntity(userAnswer.getAnswerOpinion()));
        return dto;
    }
}