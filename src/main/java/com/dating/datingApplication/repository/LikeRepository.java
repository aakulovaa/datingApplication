package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like,Integer> {
    List<Like> findLikeByLikeFromUser_UserId(Integer userId);
    List<Like> findLikeByLikeToUser_UserId(Integer userId);
}
