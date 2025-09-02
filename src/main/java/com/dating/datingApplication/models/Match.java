package com.dating.datingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "match_first_user_id", nullable = false)
    private User matchFirstUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "match_second_user_id", nullable = false)
    private User matchSecondUser;

    @OneToOne(mappedBy = "chatMatch", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Chat matchChat;

    public Match(){}

    public Match(Integer matchId, User matchFirstUser, User matchSecondUser, Chat matchChat) {
        this.matchId = matchId;
        this.matchFirstUser = matchFirstUser;
        this.matchSecondUser = matchSecondUser;
        this.matchChat = matchChat;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public User getMatchFirstUser() {
        return matchFirstUser;
    }

    public void setMatchFirstUser(User matchFirstUser) {
        this.matchFirstUser = matchFirstUser;
    }

    public User getMatchSecondUser() {
        return matchSecondUser;
    }

    public void setMatchSecondUser(User matchSecondUser) {
        this.matchSecondUser = matchSecondUser;
    }

    public Chat getMatchChat() {
        return matchChat;
    }

    public void setMatchChat(Chat matchChat) {
        this.matchChat = matchChat;
    }
}
