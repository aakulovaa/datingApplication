package com.dating.datingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questionId;
    private String questionText;
    private Integer questionOrder;

    @OneToMany(mappedBy = "answerQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<UserAnswer> questionAnswers = new ArrayList<>();

    @OneToMany(mappedBy = "opinionQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<AnswerOpinion> questionOpinions = new ArrayList<>();

    public Question(){

    }

    public Question(Integer questionId, String questionText, Integer questionOrder, List<UserAnswer> questionAnswers, List<AnswerOpinion> questionOpinions) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.questionOrder = questionOrder;
        this.questionAnswers = questionAnswers;
        this.questionOpinions = questionOpinions;
    }

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

    public List<UserAnswer> getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(List<UserAnswer> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }

    public List<AnswerOpinion> getQuestionOpinions() {
        return questionOpinions;
    }

    public void setQuestionOpinions(List<AnswerOpinion> questionOpinions) {
        this.questionOpinions = questionOpinions;
    }
}
