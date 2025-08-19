package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.Match;
import lombok.Data;

@Data
public class MatchBasicDto {
    private Integer matchId;
    private Integer firstUserId;
    private Integer secondUserId;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getFirstUserId() {
        return firstUserId;
    }

    public void setFirstUserId(Integer firstUserId) {
        this.firstUserId = firstUserId;
    }

    public Integer getSecondUserId() {
        return secondUserId;
    }

    public void setSecondUserId(Integer secondUserId) {
        this.secondUserId = secondUserId;
    }

    public static MatchBasicDto fromEntity(Match match) {
        MatchBasicDto dto = new MatchBasicDto();
        dto.setMatchId(match.getMatchId());
        dto.setFirstUserId(match.getMatchFirstUser().getUserId());
        dto.setSecondUserId(match.getMatchSecondUser().getUserId());
        return dto;
    }
}