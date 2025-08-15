package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAllQuestions();
    Question findByQuestionOrder(Integer questionOrder);
}
