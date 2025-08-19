package com.dating.datingApplication.dto.detail;

import com.dating.datingApplication.dto.basic.AnswerOpinionBasicDto;
import com.dating.datingApplication.models.Question;
import lombok.Data;

import java.util.List;

@Data
public class QuestionDetailDto {
    private Integer questionId;
    private String questionText;
    private Integer questionOrder;
    private List<AnswerOpinionBasicDto> opinions;

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

    public List<AnswerOpinionBasicDto> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<AnswerOpinionBasicDto> opinions) {
        this.opinions = opinions;
    }

    public static QuestionDetailDto fromEntity(Question question) {
        QuestionDetailDto dto = new QuestionDetailDto();
        dto.setQuestionId(question.getQuestionId());
        dto.setQuestionText(question.getQuestionText());
        dto.setQuestionOrder(question.getQuestionOrder());
        return dto;
    }
}