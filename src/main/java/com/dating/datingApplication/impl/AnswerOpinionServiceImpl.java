package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.AnswerOpinion;
import com.dating.datingApplication.repository.AnswerOpinionRepository;
import com.dating.datingApplication.services.AnswerOpinionService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class AnswerOpinionServiceImpl implements AnswerOpinionService {
    private AnswerOpinionRepository answerOpinionRepository;

    @Override
    public List<AnswerOpinion> findAllAnswerOpinion() {
        return answerOpinionRepository.findAll();
    }

    @Override
    public AnswerOpinion findByOpinionOrder(Integer opinionOrder) {
        return answerOpinionRepository.findAnswerOpinionByOpinionOrder(opinionOrder);
    }
}
