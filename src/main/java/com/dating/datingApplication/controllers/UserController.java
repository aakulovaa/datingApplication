package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.User;
import com.dating.datingApplication.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{userId}")
    public User findByUserId(@PathVariable("userId") Integer userId) {
        return userService.findByUserId(userId);
    }

    @PostMapping("create_user")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "The user successfully created";
    }

    @GetMapping("{userName}")
    public User findByUserName(@PathVariable("userName") String userName) {
        return userService.findByUserName(userName);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("delete_user/{userId}")
    public void deleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUser(userId);
    }
}
