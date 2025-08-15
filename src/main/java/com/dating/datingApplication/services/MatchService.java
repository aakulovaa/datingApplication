package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.models.User;

import java.util.List;

public interface MatchService {
    List<Match> findAllMatches();
    Match createMatch(Match match);
    Match updateMatch(Match match);
    Match findByMatchFirstUser(User matchFirstUser);
    Match findByMatchSecondUser(User matchSecondUser);
    void deleteMatch(Integer matchId);
}
