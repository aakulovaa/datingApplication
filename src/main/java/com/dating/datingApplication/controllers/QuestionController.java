package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.Question;
import com.dating.datingApplication.services.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/questions")
@AllArgsConstructor
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping
    public List<Question> findAllQuestions() {
        return questionService.findAllQuestions();
    }

    @GetMapping("/{questionOrder}")
    public Question findByQuestionOrder(@PathVariable("questionOrder") Integer questionOrder) {
        return questionService.findByQuestionOrder(questionOrder);
    }
}
