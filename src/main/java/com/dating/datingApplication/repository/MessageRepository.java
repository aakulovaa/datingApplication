package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
    Message findMessageByMessageChat(Chat messageChat);
    Message findMessageByMessageSender(User messageSender);
    Message findMessageByMessageId(Integer messageId);

    void deleteMessageByMessageChat(Chat messageChat);
    void deleteMessageByMessageSender(User messageSender);
}
