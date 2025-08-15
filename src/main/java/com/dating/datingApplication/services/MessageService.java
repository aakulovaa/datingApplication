package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.models.User;

import java.util.List;

public interface MessageService {
    List<Message> findAllMessage();
    Message createMessage(Message message);
    Message updeteMessage(Message message);
    Message findByMessageChat(Chat messageChat);
    Message findByMessageSender(User messageSender);
    Message findByMessageId(Integer messageId);
    void deleteMessage(Message message);
    void deleteMessageByMessageChat(Chat messageChat);
    void deleteMessageByMessageSender(User messageSender);
}
