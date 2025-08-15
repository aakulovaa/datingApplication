package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.AnswerOpinion;
import com.dating.datingApplication.services.AnswerOpinionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/opinions")
@AllArgsConstructor
public class AnswerOpinionController {
    private AnswerOpinionService answerOpinionService;

    @GetMapping
    public List<AnswerOpinion> findAllAnswerOpinion() {
        return answerOpinionService.findAllAnswerOpinion();
    }

    @GetMapping("/{opinionOrder}")
    public AnswerOpinion findByOpinionOrder(@PathVariable("opinionOrder") Integer opinionOrder) {
        return answerOpinionService.findByOpinionOrder(opinionOrder);
    }
}
