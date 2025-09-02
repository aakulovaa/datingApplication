package com.dating.datingApplication.services;

import com.dating.datingApplication.dto.MessageDTO;
import com.dating.datingApplication.models.Message;

import java.util.List;
import java.util.Optional;

public interface MessageService {
    List<Message> findAllMessage();

    Message findByMessageChatId(Integer chatId);
    Message findByMessageSenderId(Integer userId);
    Optional<Message> findByMessageId(Integer messageId);

    Message createMessage(MessageDTO messageDTO);
    Message updeteMessage(Integer messageId, MessageDTO messageDTO);


    void deleteMessage(Integer messageId);
}
