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

    public User(){}

    public User(Integer userId, String userName, String userPhone, String userPassword, Integer userAge, String userGender, String userDescription, String userPhotoUrl, List<UserAnswer> userAnswers, List<Like> userFromLike, List<Like> userToLike, List<Match> userToMatch, List<Match> userFromMatch, List<Message> userSenderMessage) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
        this.userAge = userAge;
        this.userGender = userGender;
        this.userDescription = userDescription;
        this.userPhotoUrl = userPhotoUrl;
        this.userAnswers = userAnswers;
        this.userFromLike = userFromLike;
        this.userToLike = userToLike;
        this.userToMatch = userToMatch;
        this.userFromMatch = userFromMatch;
        this.userSenderMessage = userSenderMessage;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
    }

    public List<UserAnswer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<UserAnswer> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public List<Like> getUserFromLike() {
        return userFromLike;
    }

    public void setUserFromLike(List<Like> userFromLike) {
        this.userFromLike = userFromLike;
    }

    public List<Like> getUserToLike() {
        return userToLike;
    }

    public void setUserToLike(List<Like> userToLike) {
        this.userToLike = userToLike;
    }

    public List<Match> getUserToMatch() {
        return userToMatch;
    }

    public void setUserToMatch(List<Match> userToMatch) {
        this.userToMatch = userToMatch;
    }

    public List<Match> getUserFromMatch() {
        return userFromMatch;
    }

    public void setUserFromMatch(List<Match> userFromMatch) {
        this.userFromMatch = userFromMatch;
    }

    public List<Message> getUserSenderMessage() {
        return userSenderMessage;
    }

    public void setUserSenderMessage(List<Message> userSenderMessage) {
        this.userSenderMessage = userSenderMessage;
    }
}
