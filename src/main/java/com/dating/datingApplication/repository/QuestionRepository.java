package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findQuestionByQuestionOrder(Integer questionOrder);
}
