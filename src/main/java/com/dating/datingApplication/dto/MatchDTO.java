package com.dating.datingApplication.dto;

public class MatchDTO {
    private Integer matchId;
    private Integer matchFirstUserId;
    private Integer matchSecondUserId;
    private Integer matchChatId;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getMatchFirstUserId() {
        return matchFirstUserId;
    }

    public void setMatchFirstUserId(Integer matchFirstUserId) {
        this.matchFirstUserId = matchFirstUserId;
    }

    public Integer getMatchSecondUserId() {
        return matchSecondUserId;
    }

    public void setMatchSecondUserId(Integer matchSecondUserId) {
        this.matchSecondUserId = matchSecondUserId;
    }

    public Integer getMatchChatId() {
        return matchChatId;
    }

    public void setMatchChatId(Integer matchChatId) {
        this.matchChatId = matchChatId;
    }
}
