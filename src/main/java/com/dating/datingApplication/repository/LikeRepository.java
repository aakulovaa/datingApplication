package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like,Integer> {
    Like findLikeByLikeFromUser_UserId(Integer userId);
    Like findLikeByLikeToUser_UserId(Integer userId);
}
