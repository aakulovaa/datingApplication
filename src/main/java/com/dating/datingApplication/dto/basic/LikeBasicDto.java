package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.Like;
import lombok.Data;

@Data
public class LikeBasicDto {
    private Integer likeId;
    private Integer fromUserId;
    private Integer toUserId;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Integer getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Integer getToUserId() {
        return toUserId;
    }

    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    public static LikeBasicDto fromEntity(Like like) {
        LikeBasicDto dto = new LikeBasicDto();
        dto.setLikeId(like.getLikeId());
        dto.setFromUserId(like.getLikeFromUser().getUserId());
        dto.setToUserId(like.getLikeToUser().getUserId());
        return dto;
    }
}