package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.repository.MessageRepository;
import com.dating.datingApplication.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> findAllMessage() {
        return messageRepository.findAll();
    }

    @Override
    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Message updeteMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Message findByMessageChatId(Integer chatId) {
        return messageRepository.findMessageByMessageChat_ChatId(chatId);
    }

    @Override
    public Message findByMessageSenderId(Integer userId) {
        return messageRepository.findMessageByMessageSender_UserId(userId);
    }

    @Override
    public Message findByMessageId(Integer messageId) {
        return messageRepository.findMessageByMessageId(messageId);
    }

    @Override
    public void deleteMessage(Integer messageId) {
        messageRepository.delete(findByMessageId(messageId));
    }

    @Override
    public void deleteMessageByMessageChatId(Integer chatId) {
        messageRepository.deleteMessageByMessageChat_ChatId(chatId);
    }

    @Override
    public void deleteMessageByMessageSenderId(Integer userId) {
        messageRepository.deleteMessageByMessageSender_UserId(userId);
    }
}
