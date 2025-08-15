package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.Question;
import com.dating.datingApplication.repository.QuestionRepository;
import com.dating.datingApplication.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    @Override
    public List<Question> findAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question findByQuestionOrder(Integer questionOrder) {
        return questionRepository.findQuestionByQuestionOrder(questionOrder);
    }
}
