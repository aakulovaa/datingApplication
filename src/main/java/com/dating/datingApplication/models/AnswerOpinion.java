package com.dating.datingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "answer_opinion")
public class AnswerOpinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer opinionId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id", nullable = false)
    private Question opinionQuestion;

    private String opinionText;
    private Integer opinionOrder;

    @OneToMany(mappedBy = "answerOpinion", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<UserAnswer> opinionAnswers = new ArrayList<>();

    public AnswerOpinion(){}

    public AnswerOpinion(Integer opinionId, Question opinionQuestion, String opinionText, Integer opinionOrder, List<UserAnswer> opinionAnswers) {
        this.opinionId = opinionId;
        this.opinionQuestion = opinionQuestion;
        this.opinionText = opinionText;
        this.opinionOrder = opinionOrder;
        this.opinionAnswers = opinionAnswers;
    }

    public Integer getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(Integer opinionId) {
        this.opinionId = opinionId;
    }

    public Question getOpinionQuestion() {
        return opinionQuestion;
    }

    public void setOpinionQuestion(Question opinionQuestion) {
        this.opinionQuestion = opinionQuestion;
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

    public List<UserAnswer> getOpinionAnswers() {
        return opinionAnswers;
    }

    public void setOpinionAnswers(List<UserAnswer> opinionAnswers) {
        this.opinionAnswers = opinionAnswers;
    }
}
