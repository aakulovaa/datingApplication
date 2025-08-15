package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
    Message findMessageByMessageChat_ChatId(Integer chatId);
    Message findMessageByMessageSender_UserId(Integer userId);
    Message findMessageByMessageId(Integer messageId);

    void deleteMessageByMessageChat_ChatId(Integer chatId);
    void deleteMessageByMessageSender_UserId(Integer userId);
}
