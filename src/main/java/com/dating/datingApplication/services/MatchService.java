package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Match;

import java.util.List;

public interface MatchService {
    List<Match> findAllMatches();
    Match createMatch(Match match);
    Match updateMatch(Match match);
    Match findByMatchFirstUserId(Integer userId);
    Match findByMatchSecondUserId(Integer userId);
    Match findByMatchId(Integer matchId);
    void deleteMatch(Integer matchId);
}
