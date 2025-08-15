package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.User;
import com.dating.datingApplication.models.UserAnswer;
import com.dating.datingApplication.repository.UserAnswerRepository;
import com.dating.datingApplication.services.UserAnswerService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class UserAnswerServiceImpl implements UserAnswerService {
    private UserAnswerRepository userAnswerRepository;

    @Override
    public List<UserAnswer> findAllUserAnswers() {
        return userAnswerRepository.findAll();
    }

    @Override
    public UserAnswer createUserAnswer(UserAnswer userAnswer) {
        return userAnswerRepository.save(userAnswer);
    }

    @Override
    public UserAnswer findByAnswerUser(User user) {
        return userAnswerRepository.findAnswerByAnswerUser(user);
    }

    @Override
    public UserAnswer findByAnswerId(Integer answerId) {
        return userAnswerRepository.findAnswerByAnswerId(answerId);
    }

    @Override
    public void deleteUserAnswer(UserAnswer userAnswer) {
        userAnswerRepository.delete(findByAnswerId(userAnswer.getAnswerId()));
    }
}
