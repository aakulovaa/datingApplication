package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUserName(String userName);
    User findUserByUserId(Integer userId);
}
