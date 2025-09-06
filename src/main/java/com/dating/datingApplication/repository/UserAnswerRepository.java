package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Integer> {
    List<UserAnswer> findAnswerByAnswerUser_UserId(Integer userId);
}
