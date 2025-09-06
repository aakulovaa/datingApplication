package com.dating.datingApplication.services;

import com.dating.datingApplication.dto.MatchDTO;
import com.dating.datingApplication.models.Match;

import java.util.List;
import java.util.Optional;

public interface MatchService {
    List<Match> findAllMatches();

    List<Match> findByMatchFirstUserId(Integer userId);
    List<Match> findByMatchSecondUserId(Integer userId);
    Optional<Match> findByMatchId(Integer matchId);

    Match createMatch(MatchDTO matchDTO);
    Match updateMatch(Integer matchId, MatchDTO matchDTO);

    void deleteMatch(Integer matchId);
}
