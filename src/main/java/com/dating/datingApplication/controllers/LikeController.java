package com.dating.datingApplication.controllers;

import com.dating.datingApplication.dto.LikeDTO;
import com.dating.datingApplication.models.Like;
import com.dating.datingApplication.services.LikeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("/create_like")
    public ResponseEntity<Like> createLike(@RequestBody LikeDTO likeDTO) {
        Like createdLike = likeService.createLike(likeDTO);
        return ResponseEntity.ok(createdLike);
    }

    @PutMapping("/update_like/{likeId}")
    public ResponseEntity<Like> updateLike(@PathVariable("likeId") Integer likeId, @RequestBody LikeDTO likeDTO) {
        Like updatedLike = likeService.updateLike(likeId, likeDTO);
        return ResponseEntity.ok(updatedLike);
    }

    @GetMapping("/from_user/{userId}")
    public List<Like> findByLikeFromUserId(@PathVariable("userId") Integer userId) {
        return likeService.findByLikeFromUserId(userId);
    }

    @GetMapping("to_user/{userId}")
    public List<Like> findByLikeToUserId(@PathVariable("userId") Integer userId) {
        return likeService.findByLikeToUserId(userId);
    }

    @GetMapping("/{likeId}")
    public Optional<Like> findByLikeId(@PathVariable("likeId") Integer likeId) {
        return likeService.findByLikeId(likeId);
    }

    @DeleteMapping("/delete_like/{likeId}")
    public void deleteLike(@PathVariable("likeId") Integer likeId) {
       likeService.deleteLike(likeId);
    }
}
