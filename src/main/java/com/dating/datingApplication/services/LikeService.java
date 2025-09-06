package com.dating.datingApplication.services;

import com.dating.datingApplication.dto.LikeDTO;
import com.dating.datingApplication.models.Like;

import java.util.List;
import java.util.Optional;

public interface LikeService {
    List<Like> findAllLikes();
    Optional<Like> findByLikeId(Integer likeId);

    List<Like> findByLikeFromUserId(Integer userId);
    List<Like> findByLikeToUserId(Integer userId);

    Like createLike(LikeDTO likeDTO);
    Like updateLike(Integer likeId, LikeDTO likeDTO);

    void deleteLike(Integer likeId);
}
