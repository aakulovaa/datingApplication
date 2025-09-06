package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
    List<Match> findMatchByMatchFirstUser_UserId(Integer userId);
    List<Match> findMatchByMatchSecondUser_UserId(Integer userId);
}
