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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "like_from_user_id", nullable = false)
    private User likeFromUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "like_to_user_id", nullable = false)
    private User likeToUser;

    public Like(){}

    public Like(Integer likeId, User likeFromUser, User likeToUser) {
        this.likeId = likeId;
        this.likeFromUser = likeFromUser;
        this.likeToUser = likeToUser;
    }

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public User getLikeFromUser() {
        return likeFromUser;
    }

    public void setLikeFromUser(User likeFromUser) {
        this.likeFromUser = likeFromUser;
    }

    public User getLikeToUser() {
        return likeToUser;
    }

    public void setLikeToUser(User likeToUser) {
        this.likeToUser = likeToUser;
    }
}
