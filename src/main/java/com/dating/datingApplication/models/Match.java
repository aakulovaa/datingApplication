package com.dating.datingApplication.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_first_user_id", nullable = false)
    private User matchFirstUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_second_user_id", nullable = false)
    private User matchSecondUser;

    @OneToOne(mappedBy = "chatMatch", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Chat matchChat;
}
