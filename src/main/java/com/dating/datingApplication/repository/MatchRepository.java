package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
    Match findMatchByMatchFirstUser(User matchFirstUser);
    Match findMatchByMatchSecondUser(User matchSecondUser);
    Match findMathByMathId(Integer matchId);
}
