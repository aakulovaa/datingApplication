package com.dating.datingApplication.dto.detail;

import com.dating.datingApplication.dto.basic.UserBasicDto;
import com.dating.datingApplication.models.Like;
import lombok.Data;

@Data
public class LikeDetailDto {
    private Integer likeId;
    private UserBasicDto fromUser;
    private UserBasicDto toUser;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public UserBasicDto getFromUser() {
        return fromUser;
    }

    public void setFromUser(UserBasicDto fromUser) {
        this.fromUser = fromUser;
    }

    public UserBasicDto getToUser() {
        return toUser;
    }

    public void setToUser(UserBasicDto toUser) {
        this.toUser = toUser;
    }

    public static LikeDetailDto fromEntity(Like like) {
        LikeDetailDto dto = new LikeDetailDto();
        dto.setLikeId(like.getLikeId());
        dto.setFromUser(UserBasicDto.fromEntity(like.getLikeFromUser()));
        dto.setToUser(UserBasicDto.fromEntity(like.getLikeToUser()));
        return dto;
    }
}