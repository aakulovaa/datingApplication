package com.dating.datingApplication.impl;

import com.dating.datingApplication.dto.AnswerOpinionDTO;
import com.dating.datingApplication.models.AnswerOpinion;
import com.dating.datingApplication.models.Question;
import com.dating.datingApplication.repository.AnswerOpinionRepository;
import com.dating.datingApplication.repository.QuestionRepository;
import com.dating.datingApplication.services.AnswerOpinionService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class AnswerOpinionServiceImpl implements AnswerOpinionService {
    private final AnswerOpinionRepository answerOpinionRepository;
    private final QuestionRepository questionRepository;

    @Autowired
    public AnswerOpinionServiceImpl(AnswerOpinionRepository answerOpinionRepository, QuestionRepository questionRepository) {
        this.answerOpinionRepository = answerOpinionRepository;
        this.questionRepository = questionRepository;
    }

    @Override
    public List<AnswerOpinion> findAllAnswerOpinion() {
        return answerOpinionRepository.findAll();
    }

    @Override
    public AnswerOpinion findByOpinionOrder(Integer opinionOrder) {
        return answerOpinionRepository.findAnswerOpinionByOpinionOrder(opinionOrder);
    }

    @Override
    public AnswerOpinion createAnswerOpinion(AnswerOpinionDTO answerOpinionDTO) {
        Question question = questionRepository.findById(answerOpinionDTO.getOpinionQuestionId())
                .orElseThrow(()->new EntityNotFoundException("Question not found"));

        AnswerOpinion answerOpinion = new AnswerOpinion();

        answerOpinion.setOpinionQuestion(question);
        answerOpinion.setOpinionText(answerOpinionDTO.getOpinionText());
        answerOpinion.setOpinionOrder(answerOpinionDTO.getOpinionOrder());

        return answerOpinionRepository.save(answerOpinion);
    }
}
