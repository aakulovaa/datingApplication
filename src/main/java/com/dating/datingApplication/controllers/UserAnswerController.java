package com.dating.datingApplication.controllers;

import com.dating.datingApplication.dto.UserAnswerDTO;
import com.dating.datingApplication.models.UserAnswer;
import com.dating.datingApplication.services.UserAnswerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/answers")
@AllArgsConstructor
public class UserAnswerController {
    @Autowired
    private UserAnswerService userAnswerService;

    @GetMapping
    public List<UserAnswer> findAllUserAnswers() {
        return userAnswerService.findAllUserAnswers();
    }

    @PostMapping("/create_answer")
    public ResponseEntity<UserAnswer> createUserAnswer(@RequestBody UserAnswerDTO userAnswerDTO) {
        UserAnswer createdUserAnswer = userAnswerService.createUserAnswer(userAnswerDTO);
        return ResponseEntity.ok(createdUserAnswer);
    }


    @GetMapping("/find_user/{userId}")
    public UserAnswer findByAnswerUserId(@PathVariable("userId") Integer userId) {
        return userAnswerService.findByAnswerUserId(userId);
    }


    @GetMapping("/find_answer/{answerId}")
    public Optional<UserAnswer> findByAnswerId(@PathVariable("answerId") Integer answerId) {
        return userAnswerService.findByAnswerId(answerId);
    }


    @DeleteMapping("/delete_answer/{answerId}")
    public void deleteUserAnswer(@PathVariable("answerId") Integer answerId) {
        userAnswerService.deleteUserAnswer(answerId);
    }
}
