package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
    Match findMatchByMatchFirstUser_UserId(Integer userId);
    Match findMatchByMatchSecondUser_UserId(Integer userId);
    Match findMathByMatchId(Integer matchId);
}
