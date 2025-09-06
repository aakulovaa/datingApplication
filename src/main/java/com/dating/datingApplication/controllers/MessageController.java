package com.dating.datingApplication.controllers;

import com.dating.datingApplication.dto.MessageDTO;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/messages")
@AllArgsConstructor
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> findAllMessage() {
        return messageService.findAllMessage();
    }

    @PostMapping("/create_message")
    public ResponseEntity<Message> createMessage(@RequestBody MessageDTO messageDTO) {
        Message createdMessage = messageService.createMessage(messageDTO);
        return ResponseEntity.ok(createdMessage);
    }

    @PutMapping("/update_message/{messageId}")
    public ResponseEntity<Message> updateMessage(@PathVariable("messageId") Integer messageId, @RequestBody MessageDTO messageDTO) {
        Message updatedMessage = messageService.updateMessage(messageId, messageDTO);
        return ResponseEntity.ok(updatedMessage);
    }

    @GetMapping("/chat/{chatId}")
    public List<Message> findByMessageChat(@PathVariable("chatId") Integer chatId) {
        return messageService.findByMessageChatId(chatId);
    }

    @GetMapping("/sender/{userId}")
    public List<Message> findByMessageSenderId(@PathVariable("userId") Integer userId) {
        return messageService.findByMessageSenderId(userId);
    }

    @GetMapping("/{messageId}")
    public Optional<Message> findByMessageId(@PathVariable("messageId") Integer messageId) {
        return messageService.findByMessageId(messageId);
    }

    @DeleteMapping("/delete_message/{messageId}")
    public void deleteMessage(@PathVariable("messageId") Integer messageId) {
        messageService.deleteMessage(messageId);
    }

}
