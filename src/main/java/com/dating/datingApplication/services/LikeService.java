package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Like;

import java.util.List;

public interface LikeService {
    List<Like> findAllLikes();
    Like createLike(Like like);
    Like updateLike(Like like);
    Like findByLikeFromUserId(Integer userId);
    Like findByLikeToUserId(Integer userId);
    Like findByLikeId(Integer likeId);
    void deleteLike(Integer likeId);
}
