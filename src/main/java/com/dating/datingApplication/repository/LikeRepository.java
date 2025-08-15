package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Like;
import com.dating.datingApplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like,Integer> {
    Like findLikeByLikeFromUser(User likeFromUser);
    Like findLikeByLikeToUser(User likeToUser);
}
