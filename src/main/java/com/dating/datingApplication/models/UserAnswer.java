package com.dating.datingApplication.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_answers")
public class UserAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User answerUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id", nullable = false)
    private Question answerQuestion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "opinion_id", nullable = false)
    private AnswerOpinion answerOpinion;

    public UserAnswer(){}

    public UserAnswer(Integer answerId, User answerUser, Question answerQuestion, AnswerOpinion answerOpinion) {
        this.answerId = answerId;
        this.answerUser = answerUser;
        this.answerQuestion = answerQuestion;
        this.answerOpinion = answerOpinion;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public User getAnswerUser() {
        return answerUser;
    }

    public void setAnswerUser(User answerUser) {
        this.answerUser = answerUser;
    }

    public Question getAnswerQuestion() {
        return answerQuestion;
    }

    public void setAnswerQuestion(Question answerQuestion) {
        this.answerQuestion = answerQuestion;
    }

    public AnswerOpinion getAnswerOpinion() {
        return answerOpinion;
    }

    public void setAnswerOpinion(AnswerOpinion answerOpinion) {
        this.answerOpinion = answerOpinion;
    }
}
