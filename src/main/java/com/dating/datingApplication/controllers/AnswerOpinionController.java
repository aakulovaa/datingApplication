package com.dating.datingApplication.controllers;

import com.dating.datingApplication.dto.AnswerOpinionDTO;
import com.dating.datingApplication.models.AnswerOpinion;
import com.dating.datingApplication.services.AnswerOpinionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/opinions")
@AllArgsConstructor
public class AnswerOpinionController {
    @Autowired
    private AnswerOpinionService answerOpinionService;

    @GetMapping
    public List<AnswerOpinion> findAllAnswerOpinion() {
        return answerOpinionService.findAllAnswerOpinion();
    }

    @GetMapping("/{opinionOrder}")
    public AnswerOpinion findByOpinionOrder(@PathVariable("opinionOrder") Integer opinionOrder) {
        return answerOpinionService.findByOpinionOrder(opinionOrder);
    }

    @PostMapping("/create_opinion")
    public ResponseEntity<AnswerOpinion> createAnswerOpinion(@RequestBody AnswerOpinionDTO answerOpinionDTO) {
        AnswerOpinion createdAnswerOpinion = answerOpinionService.createAnswerOpinion(answerOpinionDTO);
        return ResponseEntity.ok(createdAnswerOpinion);
    }
}
