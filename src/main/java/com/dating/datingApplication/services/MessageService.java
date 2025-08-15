package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.models.User;

import java.util.List;

public interface MessageService {
    List<Message> findAllMessage();
    Message createMessage(Message message);
    Message updeteMessage(Message message);
    Message findByMessageChatId(Integer chatId);
    Message findByMessageSenderId(Integer userId);
    Message findByMessageId(Integer messageId);
    void deleteMessage(Integer messageId);
    void deleteMessageByMessageChatId(Integer chatId);
    void deleteMessageByMessageSenderId(Integer userId);
}
