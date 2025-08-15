package com.dating.datingApplication.controllers;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/messages")
@AllArgsConstructor
public class MessageController {
    private MessageService messageService;

    @GetMapping
    public List<Message> findAllMessage() {
        return messageService.findAllMessage();
    }

    @PostMapping("create_message")
    public String createMessage(@RequestBody Message message) {
        messageService.createMessage(message);
        return "The message successfully created";
    }

    @PutMapping("update_message")
    public Message updeteMessage(@RequestBody Message message) {
        return messageService.updeteMessage(message);
    }

    @GetMapping("/chat/{messageChat}")
    public Message findByMessageChat(@PathVariable("messageChat") Integer chatId) {
        return messageService.findByMessageChatId(chatId);
    }

    @GetMapping("/sender/userId")
    public Message findByMessageSenderId(@PathVariable("userId") Integer userId) {
        return messageService.findByMessageSenderId(userId);
    }

    @GetMapping("/{messageId}")
    public Message findByMessageId(@PathVariable("messageId") Integer messageId) {
        return messageService.findByMessageId(messageId);
    }

    @DeleteMapping("delete_message/{messageId}")
    public void deleteMessage(@PathVariable("messageId") Integer messageId) {
        messageService.deleteMessage(messageId);
    }

    @DeleteMapping("/delete_message/chat/{chatId}")
    public void deleteMessageByMessageChatId(@PathVariable("chatId") Integer chatId) {
        messageService.deleteMessageByMessageChatId(chatId);
    }

    @DeleteMapping("/delete_message/sender/{userId}")
    public void deleteMessageByMessageSenderId(@PathVariable("userId") Integer userId) {
        messageService.deleteMessageByMessageSenderId(userId);
    }
}
