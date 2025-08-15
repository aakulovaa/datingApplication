package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.User;
import com.dating.datingApplication.models.UserAnswer;
import com.dating.datingApplication.services.UserAnswerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/answers")
@AllArgsConstructor
public class UserAnswerController {
    private UserAnswerService userAnswerService;

    @GetMapping
    public List<UserAnswer> findAllUserAnswers() {
        return userAnswerService.findAllUserAnswers();
    }

    @PostMapping("create_answer")
    public String createUserAnswer(@RequestBody UserAnswer userAnswer) {
        userAnswerService.createUserAnswer(userAnswer);
        return "The answer successfully created";
    }


    @GetMapping("/user/{userId}")
    public UserAnswer findByAnswerUserId(@PathVariable("userId") Integer userId) {
        return userAnswerService.findByAnswerUserId(userId);
    }


    @GetMapping("/answer/{answerId}")
    public UserAnswer findByAnswerId(@PathVariable("answerId") Integer answerId) {
        return userAnswerService.findByAnswerId(answerId);
    }


    @DeleteMapping("delete_answer/{answerId}")
    public void deleteUserAnswer(@PathVariable("answerId") Integer answerId) {
        userAnswerService.deleteUserAnswer(answerId);
    }
}
