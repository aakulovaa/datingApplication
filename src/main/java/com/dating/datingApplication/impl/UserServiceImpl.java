package com.dating.datingApplication.impl;

import com.dating.datingApplication.dto.UserDTO;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.repository.UserRepository;
import com.dating.datingApplication.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Primary
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findUserByUserId(Integer userId) {
        return userRepository.findById(userId);
    }

    @Override
    public List<User> findUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User();

        user.setUserName(userDTO.getUserName());
        user.setUserPhone(userDTO.getUserPhone());
        user.setUserPassword(userDTO.getUserPassword());
        user.setUserAge(userDTO.getUserAge());
        user.setUserGender(userDTO.getUserGender());
        user.setUserDescription(userDTO.getUserDescription());
        user.setUserPhotoUrl(userDTO.getUserPhotoUrl());

        return userRepository.save(user);
    }

    @Override
    public User updateUser(Integer userId, UserDTO userDTO) {
        User user = userRepository.findById(userId)
                .orElseThrow(()-> new EntityNotFoundException("User not found"));

        if(userDTO.getUserName()!=null){
            user.setUserName(userDTO.getUserName());
        }
        if(userDTO.getUserPhone()!=null){
            user.setUserPhone(userDTO.getUserPhone());
        }
        if(userDTO.getUserPassword()!=null){
            user.setUserPassword(userDTO.getUserPassword());
        }
        if(userDTO.getUserAge()!=null){
            user.setUserAge(userDTO.getUserAge());
        }
        if(userDTO.getUserGender()!=null){
            user.setUserGender(userDTO.getUserGender());
        }
        if(userDTO.getUserDescription()!=null){
            user.setUserDescription(userDTO.getUserDescription());
        }
        if(userDTO.getUserPhotoUrl()!=null){
            user.setUserPhotoUrl(userDTO.getUserPhotoUrl());
        }

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
