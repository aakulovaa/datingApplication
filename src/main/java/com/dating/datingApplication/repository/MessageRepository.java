package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
    List<Message> findMessageByMessageChat_ChatId(Integer chatId);
    List<Message> findMessageByMessageSender_UserId(Integer userId);
}
