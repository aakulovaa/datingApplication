package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.Like;
import com.dating.datingApplication.services.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/likes")
@AllArgsConstructor
public class LikeController {
    @Autowired
    private LikeService likeService;

    @GetMapping
    public List<Like> findAllLikes() {
        return likeService.findAllLikes();
    }

    @PostMapping("create_like")
    public String createLike(@RequestBody Like like) {
        likeService.createLike(like);
        return "The like successfully created";
    }

    @PutMapping("update_like")
    public Like updateLike(@RequestBody Like like) {
        return likeService.updateLike(like);
    }

    @GetMapping("/from_user/{userId}")
    public Like findByLikeFromUserId(@PathVariable("userId") Integer userId) {
        return likeService.findByLikeFromUserId(userId);
    }

    @GetMapping("to_user/{userId}")
    public Like findByLikeToUserId(@PathVariable("userId") Integer userId) {
        return likeService.findByLikeToUserId(userId);
    }

    @GetMapping("/{likeId}")
    public Like findByLikeId(@PathVariable("likeId") Integer likeId) {
        return likeService.findByLikeId(likeId);
    }

    @DeleteMapping
    public void deleteLike(@PathVariable("likeId") Integer likeId) {
       likeService.deleteLike(likeId);
    }
}
