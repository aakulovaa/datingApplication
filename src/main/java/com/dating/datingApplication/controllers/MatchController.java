package com.dating.datingApplication.controllers;

import com.dating.datingApplication.dto.MatchDTO;
import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.services.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("/create_match")
    public ResponseEntity<Match> createMatch(@RequestBody MatchDTO matchDTO) {
        Match createdMatch = matchService.createMatch(matchDTO);
        return ResponseEntity.ok(createdMatch);
    }

    @PutMapping("/update_match/{matchId}")
    public Match updateMatch(@PathVariable("matchId") Integer matchId,@RequestBody MatchDTO matchDTO) {
        return matchService.updateMatch(matchId,matchDTO);
    }

    @GetMapping("/first_user/{userId}")
    public Match findByMatchFirstUserId(@PathVariable("userId") Integer userId) {
        return matchService.findByMatchFirstUserId(userId);
    }

    @GetMapping("/second_user/{userId}")
    public Match findByMatchSecondUserId(@PathVariable("userId") Integer userId) {
        return matchService.findByMatchSecondUserId(userId);
    }

    @GetMapping("/{matchId}")
    public Optional<Match> findByMatchId(@PathVariable("matchId") Integer matchId) {
        return matchService.findByMatchId(matchId);
    }

    @DeleteMapping("/delete_match/{matchId}")
    public void deleteMatch(@PathVariable("matchId") Integer matchId) {
        matchService.deleteMatch(matchId);
    }
}
