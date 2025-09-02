package com.dating.datingApplication.services;

import com.dating.datingApplication.dto.UserAnswerDTO;
import com.dating.datingApplication.models.UserAnswer;

import java.util.List;
import java.util.Optional;

public interface UserAnswerService {
    List<UserAnswer> findAllUserAnswers();

    UserAnswer findByAnswerUserId(Integer userId);
    Optional<UserAnswer> findByAnswerId(Integer answerId);

    UserAnswer createUserAnswer(UserAnswerDTO userAnswerDTO);

    void deleteUserAnswer(Integer answerId);
}
