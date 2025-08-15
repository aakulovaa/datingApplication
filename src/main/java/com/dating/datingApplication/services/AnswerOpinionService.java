package com.dating.datingApplication.services;

import com.dating.datingApplication.models.AnswerOpinion;

import java.util.List;

public interface AnswerOpinionService {
    List<AnswerOpinion> findAllAnswerOpinion();
    AnswerOpinion findByOpinionOrder(Integer opinionOrder);
}
