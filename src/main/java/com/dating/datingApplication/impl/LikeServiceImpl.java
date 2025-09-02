package com.dating.datingApplication.impl;

import com.dating.datingApplication.dto.LikeDTO;
import com.dating.datingApplication.models.Like;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.repository.LikeRepository;
import com.dating.datingApplication.repository.UserRepository;
import com.dating.datingApplication.services.LikeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class LikeServiceImpl implements LikeService {
    private final UserRepository userRepository;
    private final LikeRepository likeRepository;

    @Autowired
    public LikeServiceImpl(UserRepository userRepository, LikeRepository likeRepository) {
        this.userRepository = userRepository;
        this.likeRepository = likeRepository;
    }

    @Override
    public List<Like> findAllLikes() {
        return likeRepository.findAll();
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
    public Like createLike(LikeDTO likeDTO) {
        User fromUser = userRepository.findById(likeDTO.getLikeFromUserId())
                .orElseThrow(()->new EntityNotFoundException("From user not found"));
        User toUser = userRepository.findById(likeDTO.getLikeToUserId())
                .orElseThrow(()->new EntityNotFoundException("To user not found"));

        Like like = new Like();

        like.setLikeFromUser(fromUser);
        like.setLikeToUser(toUser);

        return likeRepository.save(like);
    }

    @Override
    public Like updateLike(Integer likeId, LikeDTO likeDTO) {
        Like like = likeRepository.findById(likeId)
                .orElseThrow(()->new EntityNotFoundException("Like not found"));
        User fromUser = userRepository.findById(likeDTO.getLikeFromUserId())
                .orElseThrow(()->new EntityNotFoundException("From user not found"));
        User toUser = userRepository.findById(likeDTO.getLikeToUserId())
                .orElseThrow(()->new EntityNotFoundException("To user not found"));

        like.setLikeFromUser(fromUser);
        like.setLikeToUser(toUser);

        return likeRepository.save(like);
    }

    @Override
    public Optional<Like> findByLikeId(Integer likeId) {
        return likeRepository.findById(likeId);
    }

    @Override
    public void deleteLike(Integer likeId) {
        likeRepository.deleteById(likeId);
    }
}
