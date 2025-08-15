package com.dating.datingApplication.repository;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer> {
    Chat findChatByChatMatch(Match chatMatch);

    void deleteChatByChatMatch(Match chatMatch);
}
