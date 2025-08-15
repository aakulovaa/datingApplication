package com.dating.datingApplication.services;

import com.dating.datingApplication.models.User;
import com.dating.datingApplication.models.UserAnswer;

import java.util.List;

public interface UserAnswerService {
    List<UserAnswer> findAllUserAnswers();
    UserAnswer createUserAnswer(UserAnswer userAnswer);
    UserAnswer findByAnswerUserId(Integer userId);
    UserAnswer findByAnswerId(Integer answerId);
    void deleteUserAnswer(Integer answerId);
}
