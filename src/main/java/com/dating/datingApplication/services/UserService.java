package com.dating.datingApplication.services;

import com.dating.datingApplication.dto.UserDTO;
import com.dating.datingApplication.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAllUsers();

    Optional<User> findUserByUserId(Integer userId);
    List<User> findUserByUserName(String userName);

    User createUser(UserDTO userDTO);

    User updateUser(Integer userId, UserDTO userDTO);

    void deleteUser(Integer userId);
}
