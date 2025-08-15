package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.services.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/chats")
@AllArgsConstructor
public class ChatController {
    private ChatService chatService;

    @GetMapping
    public List<Chat> findAllChats() {
        return chatService.findAllChats();
    }

    @PostMapping("create_chat")
    public Chat createChat(@RequestBody Chat chat) {
        return chatService.createChat(chat);
    }

    @PutMapping("update_chat")
    public Chat updateChat(@RequestBody Chat chat) {
        return chatService.updateChat(chat);
    }

    @GetMapping("/match/{matchId}")
    public Chat findByChatMatchId(@PathVariable("matchId") Integer matchId) {
        return chatService.findByChatMatchId(matchId);
    }

    @GetMapping("/chat/{chatId}")
    public Chat findByChatId(@PathVariable("chatId") Integer chatId) {
        return chatService.findByChatId(chatId);
    }

    @DeleteMapping("delete_chat")
    public void deleteChat(@PathVariable("chatId") Integer chatId) {
        chatService.deleteChat(chatId);
    }

    @DeleteMapping("delete_chat/match/{matchId}")
    public void deleteChatByChatMatchId(Integer matchId) {
        chatService.deleteChatByChatMatchId(matchId);
    }
}
