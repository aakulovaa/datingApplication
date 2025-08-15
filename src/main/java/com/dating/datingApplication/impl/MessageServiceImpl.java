package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.repository.MessageRepository;
import com.dating.datingApplication.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {
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
    public Message findByMessageChat(Chat messageChat) {
        return messageRepository.findMessageByMessageChat(messageChat);
    }

    @Override
    public Message findByMessageSender(User messageSender) {
        return messageRepository.findMessageByMessageSender(messageSender);
    }

    @Override
    public Message findByMessageId(Integer messageId) {
        return messageRepository.findMessageByMessageId(messageId);
    }

    @Override
    public void deleteMessage(Message message) {
        messageRepository.delete(findByMessageId(message.getMessageId()));
    }

    @Override
    public void deleteMessageByMessageChat(Chat messageChat) {
        messageRepository.deleteMessageByMessageChat(messageChat);
    }

    @Override
    public void deleteMessageByMessageSender(User messageSender) {

    }
}
