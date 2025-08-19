package com.dating.datingApplication.dto.detail;

import com.dating.datingApplication.dto.basic.LikeBasicDto;
import com.dating.datingApplication.dto.basic.MatchBasicDto;
import com.dating.datingApplication.dto.basic.UserAnswerBasicDto;
import com.dating.datingApplication.models.User;
import lombok.Data;

import java.util.List;

@Data
public class UserDetailDto {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userGender;
    private String userDescription;
    private String userPhotoUrl;
    private List<UserAnswerBasicDto> userAnswers;
    private List<LikeBasicDto> sentLikes;
    private List<LikeBasicDto> receivedLikes;
    private List<MatchBasicDto> matchesAsFirstUser;
    private List<MatchBasicDto> matchesAsSecondUser;

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

    public List<UserAnswerBasicDto> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(List<UserAnswerBasicDto> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public List<LikeBasicDto> getSentLikes() {
        return sentLikes;
    }

    public void setSentLikes(List<LikeBasicDto> sentLikes) {
        this.sentLikes = sentLikes;
    }

    public List<LikeBasicDto> getReceivedLikes() {
        return receivedLikes;
    }

    public void setReceivedLikes(List<LikeBasicDto> receivedLikes) {
        this.receivedLikes = receivedLikes;
    }

    public List<MatchBasicDto> getMatchesAsFirstUser() {
        return matchesAsFirstUser;
    }

    public void setMatchesAsFirstUser(List<MatchBasicDto> matchesAsFirstUser) {
        this.matchesAsFirstUser = matchesAsFirstUser;
    }

    public List<MatchBasicDto> getMatchesAsSecondUser() {
        return matchesAsSecondUser;
    }

    public void setMatchesAsSecondUser(List<MatchBasicDto> matchesAsSecondUser) {
        this.matchesAsSecondUser = matchesAsSecondUser;
    }

    public static UserDetailDto fromEntity(User user) {
        UserDetailDto dto = new UserDetailDto();
        dto.setUserId(user.getUserId());
        dto.setUserName(user.getUserName());
        dto.setUserAge(user.getUserAge());
        dto.setUserGender(user.getUserGender());
        dto.setUserDescription(user.getUserDescription());
        dto.setUserPhotoUrl(user.getUserPhotoUrl());

        // Ленивая загрузка через сервис
        return dto;
    }
}