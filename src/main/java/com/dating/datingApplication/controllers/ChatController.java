package com.dating.datingApplication.controllers;

import com.dating.datingApplication.dto.ChatDTO;
import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.services.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/chats")
@AllArgsConstructor
public class ChatController {
    @Autowired
    private ChatService chatService;

    @GetMapping
    public List<Chat> findAllChats() {
        return chatService.findAllChats();
    }

    @PostMapping("/create_chat")
    public ResponseEntity<Chat> createChat(@RequestBody ChatDTO chatDTO) {
        Chat createdChat = chatService.createChat(chatDTO);
        return ResponseEntity.ok(createdChat);
    }

    @PutMapping("/update_chat/{chatId}")
    public ResponseEntity<Chat> updateChat(@PathVariable("chatId") Integer chatId,@RequestBody ChatDTO chatDTO) {
        Chat updatedChat = chatService.updateChat(chatId, chatDTO);
        return ResponseEntity.ok(updatedChat);
    }

    @GetMapping("/match/{matchId}")
    public Chat findByChatMatchId(@PathVariable("matchId") Integer matchId) {
        return chatService.findByChatMatchId(matchId);
    }

    @GetMapping("/{chatId}")
    public Optional<Chat> findByChatId(@PathVariable("chatId") Integer chatId) {
        return chatService.findByChatId(chatId);
    }

    @DeleteMapping("/delete_chat/{chatId}")
    public void deleteChat(@PathVariable("chatId") Integer chatId) {
        chatService.deleteChat(chatId);
    }

}
