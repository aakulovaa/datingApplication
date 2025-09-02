package com.dating.datingApplication.dto;

public class LikeDTO {
    private Integer likeId;
    private Integer likeFromUserId;
    private Integer likeToUserId;

    public Integer getLikeId() {
        return likeId;
    }

    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    public Integer getLikeFromUserId() {
        return likeFromUserId;
    }

    public void setLikeFromUserId(Integer likeFromUserId) {
        this.likeFromUserId = likeFromUserId;
    }

    public Integer getLikeToUserId() {
        return likeToUserId;
    }

    public void setLikeToUserId(Integer likeToUserId) {
        this.likeToUserId = likeToUserId;
    }
}
