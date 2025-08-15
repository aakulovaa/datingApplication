package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.User;
import com.dating.datingApplication.models.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Integer> {
    UserAnswer findAnswerByAnswerUser_UserId(Integer userId);
    UserAnswer findAnswerByAnswerId(Integer answerId);
}
