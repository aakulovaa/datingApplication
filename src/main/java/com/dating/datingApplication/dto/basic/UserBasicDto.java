package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.User;
import lombok.Data;

@Data
public class UserBasicDto {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userGender;
    private String userDescription;
    private String userPhotoUrl;

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

    public static UserBasicDto fromEntity(User user) {
        UserBasicDto dto = new UserBasicDto();
        dto.setUserId(user.getUserId());
        dto.setUserName(user.getUserName());
        dto.setUserAge(user.getUserAge());
        dto.setUserGender(user.getUserGender());
        dto.setUserDescription(user.getUserDescription());
        dto.setUserPhotoUrl(user.getUserPhotoUrl());
        return dto;
    }
}
