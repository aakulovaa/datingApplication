package com.dating.datingApplication.services;

import com.dating.datingApplication.models.User;
import com.dating.datingApplication.models.UserAnswer;

import java.util.List;

public interface UserAnswerRepository {
    List<UserAnswer> findAllUserAnswers();
    UserAnswer createUserAnswer(UserAnswer userAnswer);
    UserAnswer findByAnswerUser(User user);
    UserAnswer findByAnswerId(Integer answerId);
    void deleteUserAnswer(UserAnswer userAnswer);
}
