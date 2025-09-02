package com.dating.datingApplication.services;

import com.dating.datingApplication.dto.LikeDTO;
import com.dating.datingApplication.models.Like;

import java.util.List;
import java.util.Optional;

public interface LikeService {
    List<Like> findAllLikes();
    Optional<Like> findByLikeId(Integer likeId);

    Like findByLikeFromUserId(Integer userId);
    Like findByLikeToUserId(Integer userId);

//    Like createLike(Like like);
//    Like updateLike(Like like);

    Like createLike(LikeDTO likeDTO);
    Like updateLike(Integer likeId, LikeDTO likeDTO);

    void deleteLike(Integer likeId);
}
