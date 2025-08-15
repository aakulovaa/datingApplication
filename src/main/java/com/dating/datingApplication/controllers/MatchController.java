package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.services.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/matches")
@AllArgsConstructor
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Match> findAllMatches() {
        return matchService.findAllMatches();
    }

    @PostMapping("create_match")
    public String createMatch(@RequestBody Match match) {
        matchService.createMatch(match);
        return "The match successfully created";
    }

    @PutMapping("update_match")
    public Match updateMatch(@RequestBody Match match) {
        return matchService.updateMatch(match);
    }

    @PostMapping("/first_user/{userId}")
    public Match findByMatchFirstUserId(@PathVariable("userId") Integer userId) {
        return matchService.findByMatchFirstUserId(userId);
    }

    @PostMapping("/second_user/{userId}")
    public Match findByMatchSecondUserId(@PathVariable("userId") Integer userId) {
        return matchService.findByMatchSecondUserId(userId);
    }

    @PostMapping("{matchId}")
    public Match findByMatchId(@PathVariable("userId") Integer matchId) {
        return matchService.findByMatchId(matchId);
    }

    @DeleteMapping("delete_match")
    public void deleteMatch(@PathVariable("matchId") Integer matchId) {
        matchService.deleteMatch(matchId);
    }
}
