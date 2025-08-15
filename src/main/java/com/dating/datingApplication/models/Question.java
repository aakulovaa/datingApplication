package com.dating.datingApplication.models;

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
    private List<UserAnswer> questionAnswers = new ArrayList<>();

    @OneToMany(mappedBy = "opinionQuestion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnswerOpinion> questionOpinions = new ArrayList<>();
}
