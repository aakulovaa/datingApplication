package com.dating.datingApplication.controllers;

import com.dating.datingApplication.dto.UserDTO;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Optional<User>> findUserByUserId(@PathVariable Integer userId) {
        Optional<User> user = userService.findUserByUserId(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/name/{userName}")
    public List<User> findUserByUserName(@PathVariable("userName") String userName) {
        return userService.findUserByUserName(userName);
    }

    @GetMapping("/phone/{userPhone}")
    public List<User> findUserByUserPhone(@PathVariable("userPhone") String userPhone) {
        return userService.findUserByUserPhone(userPhone);
    }

    @PostMapping("/create_user")
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
        User createdUser = userService.createUser(userDTO);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/update_user/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable Integer userId,@RequestBody UserDTO userDTO) {
        User updatedUser = userService.updateUser(userId, userDTO);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/delete_user/{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUser(userId);
    }
}
