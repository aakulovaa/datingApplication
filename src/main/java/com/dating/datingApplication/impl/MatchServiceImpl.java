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
    public Match findByMatchFirstUser(User matchFirstUser) {
        return matchRepository.findMatchByMatchFirstUser(matchFirstUser);
    }

    @Override
    public Match findByMatchSecondUser(User matchSecondUser) {
        return matchRepository.findMatchByMatchSecondUser(matchSecondUser);
    }

    @Override
    public Match findByMatchId(Integer matchId) {
        return matchRepository.findMathByMathId(matchId);
    }

    @Override
    public void deleteMatch(Match match) {
        matchRepository.delete(findByMatchId(match.getMatchId()));
    }
}
