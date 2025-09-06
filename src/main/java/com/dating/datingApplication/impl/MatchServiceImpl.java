package com.dating.datingApplication.impl;

import com.dating.datingApplication.dto.MatchDTO;
import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.repository.MatchRepository;
import com.dating.datingApplication.repository.UserRepository;
import com.dating.datingApplication.services.MatchService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {
    private final UserRepository userRepository;
    private final MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(UserRepository userRepository, MatchRepository matchRepository) {
        this.userRepository = userRepository;
        this.matchRepository = matchRepository;
    }

    @Override
    public List<Match> findAllMatches() {
        return matchRepository.findAll();
    }

    @Override
    public List<Match> findByMatchFirstUserId(Integer userId) {
        return matchRepository.findMatchByMatchFirstUser_UserId(userId);
    }

    @Override
    public List<Match> findByMatchSecondUserId(Integer userId) {
        return matchRepository.findMatchByMatchSecondUser_UserId(userId);
    }

    @Override
    public Optional<Match> findByMatchId(Integer matchId) {
        return matchRepository.findById(matchId);
    }

    @Override
    public Match createMatch(MatchDTO matchDTO) {
        User firstUser = userRepository.findById(matchDTO.getMatchFirstUserId())
                .orElseThrow(()->new EntityNotFoundException("First match user not found"));
        User secondUser = userRepository.findById(matchDTO.getMatchSecondUserId())
                .orElseThrow(()->new EntityNotFoundException("Second match user not found"));

        Match match = new Match();

        match.setMatchFirstUser(firstUser);
        match.setMatchSecondUser(secondUser);

        return matchRepository.save(match);
    }

    @Override
    public Match updateMatch(Integer matchId, MatchDTO matchDTO) {
        Match match = matchRepository.findById(matchId)
                .orElseThrow(()->new EntityNotFoundException("Match not found"));

        User firstUser = userRepository.findById(matchDTO.getMatchFirstUserId())
                .orElseThrow(()->new EntityNotFoundException("First match user not found"));
        User secondUser = userRepository.findById(matchDTO.getMatchSecondUserId())
                .orElseThrow(()->new EntityNotFoundException("Second match user not found"));

        match.setMatchFirstUser(firstUser);
        match.setMatchSecondUser(secondUser);

        return matchRepository.save(match);
    }

    @Override
    public void deleteMatch(Integer matchId) {
        matchRepository.deleteById(matchId);
    }
}
