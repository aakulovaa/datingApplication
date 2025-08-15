package com.dating.datingApplication.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String userPhone;
    private String userPassword;
    private Integer userAge;
    private String userGender;
    private String userDescription;
    private String userPhotoUrl;

    @OneToMany(mappedBy = "answerUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserAnswer> userAnswers = new ArrayList<>();

    @OneToMany(mappedBy = "likeFromUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Like> userFromLike = new ArrayList<>();

    @OneToMany(mappedBy = "likeToUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Like> userToLike = new ArrayList<>();

    @OneToMany(mappedBy = "matchFirstUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Match> userToMatch = new ArrayList<>();
    @OneToMany(mappedBy = "matchSecondUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Match> userFromMatch = new ArrayList<>();

    @OneToMany(mappedBy = "messageSender", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> userSenderMessage = new ArrayList<>();

}
