package com.dating.datingApplication.models;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question opinionQuestion;

    private String opinionText;
    private Integer opinionOrder;

    @OneToMany(mappedBy = "answerOpinion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserAnswer> opinionAnswers = new ArrayList<>();
}
