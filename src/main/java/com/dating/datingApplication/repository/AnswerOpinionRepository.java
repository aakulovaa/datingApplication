package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.AnswerOpinion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerOpinionRepository extends JpaRepository<AnswerOpinion, Integer> {
    AnswerOpinion findAnswerOpinionByOpinionOrder(Integer opinionOrder);
}
