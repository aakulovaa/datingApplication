package com.dating.datingApplication.services;

import com.dating.datingApplication.models.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();
    User findByUserId(Integer userId);
    User createUser(User user);
    User findByUserName(String userName);
    User updateUser(User user);
    void deleteUser(User user);
}
