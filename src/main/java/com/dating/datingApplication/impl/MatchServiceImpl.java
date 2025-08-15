package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.repository.MatchRepository;
import com.dating.datingApplication.services.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {
    private MatchRepository matchRepository;

    @Override
    public List<Match> findAllMatches() {
        return matchRepository.findAll();
    }

    @Override
    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match updateMatch(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match findByMatchFirstUserId(Integer userId) {
        return matchRepository.findMatchByMatchFirstUser_UserId(userId);
    }

    @Override
    public Match findByMatchSecondUserId(Integer userId) {
        return matchRepository.findMatchByMatchSecondUser_UserId(userId);
    }

    @Override
    public Match findByMatchId(Integer matchId) {
        return matchRepository.findMathByMatchId(matchId);
    }

    @Override
    public void deleteMatch(Integer matchId) {
        matchRepository.delete(findByMatchId(matchId));
    }
}
