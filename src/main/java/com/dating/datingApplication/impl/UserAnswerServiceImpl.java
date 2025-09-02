package com.dating.datingApplication.impl;

import com.dating.datingApplication.dto.UserAnswerDTO;
import com.dating.datingApplication.models.AnswerOpinion;
import com.dating.datingApplication.models.Question;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.models.UserAnswer;
import com.dating.datingApplication.repository.AnswerOpinionRepository;
import com.dating.datingApplication.repository.QuestionRepository;
import com.dating.datingApplication.repository.UserAnswerRepository;
import com.dating.datingApplication.repository.UserRepository;
import com.dating.datingApplication.services.UserAnswerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class UserAnswerServiceImpl implements UserAnswerService {
    private final UserRepository userRepository;
    private final QuestionRepository questionRepository;
    private final AnswerOpinionRepository answerOpinionRepository;
    private final UserAnswerRepository userAnswerRepository;

    @Autowired
    public UserAnswerServiceImpl(UserRepository userRepository, QuestionRepository questionRepository, AnswerOpinionRepository answerOpinionRepository, UserAnswerRepository userAnswerRepository) {
        this.userRepository = userRepository;
        this.questionRepository = questionRepository;
        this.answerOpinionRepository = answerOpinionRepository;
        this.userAnswerRepository = userAnswerRepository;
    }


    @Override
    public List<UserAnswer> findAllUserAnswers() {
        return userAnswerRepository.findAll();
    }

    @Override
    public UserAnswer findByAnswerUserId(Integer userId) {
        return userAnswerRepository.findAnswerByAnswerUser_UserId(userId);
    }

    @Override
    public Optional<UserAnswer> findByAnswerId(Integer answerId) {
        return userAnswerRepository.findById(answerId);
    }

    @Override
    public UserAnswer createUserAnswer(UserAnswerDTO userAnswerDTO) {
        User user = userRepository.findById(userAnswerDTO.getUserId())
                .orElseThrow(()-> new EntityNotFoundException("User not found"));
        Question question = questionRepository.findById(userAnswerDTO.getQuestionId())
                .orElseThrow(()-> new EntityNotFoundException("Question not found"));
        AnswerOpinion answerOpinion = answerOpinionRepository.findById(userAnswerDTO.getOpinionId())
                .orElseThrow(()-> new EntityNotFoundException("Opinion not found"));

        UserAnswer userAnswer = new UserAnswer();

        userAnswer.setAnswerUser(user);
        userAnswer.setAnswerQuestion(question);
        userAnswer.setAnswerOpinion(answerOpinion);

        return userAnswerRepository.save(userAnswer);
    }

    @Override
    public void deleteUserAnswer(Integer answerId) {
        userAnswerRepository.deleteById(answerId);
    }
}
