package com.dating.datingApplication.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer likeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "like_from_user_id", nullable = false)
    private User likeFromUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "like_to_user_id", nullable = false)
    private User likeToUser;
}
