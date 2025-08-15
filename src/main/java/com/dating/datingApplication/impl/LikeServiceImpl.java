package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.Like;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.repository.LikeRepository;
import com.dating.datingApplication.services.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class LikeServiceImpl implements LikeService {
    private LikeRepository likeRepository;

    @Override
    public List<Like> findAllLikes() {
        return likeRepository.findAll();
    }

    @Override
    public Like createLike(Like like) {
        return likeRepository.save(like);
    }

    @Override
    public Like updateLike(Like like) {
        return likeRepository.save(like);
    }

    @Override
    public Like findByLikeFromUserId(Integer userId) {
        return likeRepository.findLikeByLikeFromUser_UserId(userId);
    }

    @Override
    public Like findByLikeToUserId(Integer userId) {
        return likeRepository.findLikeByLikeToUser_UserId(userId);
    }

    @Override
    public Like findByLikeId(Integer likeId) {
        return likeRepository.findLikeByLikeId(likeId);
    }

    @Override
    public void deleteLike(Integer likeId) {
        likeRepository.delete(findByLikeId(likeId));
    }
}
