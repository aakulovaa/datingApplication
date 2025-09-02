package com.dating.datingApplication.services;

import com.dating.datingApplication.dto.ChatDTO;
import com.dating.datingApplication.models.Chat;

import java.util.List;
import java.util.Optional;

public interface ChatService {
    List<Chat> findAllChats();

    Chat findByChatMatchId(Integer matchId);
    Optional<Chat> findByChatId(Integer chatId);

    Chat createChat(ChatDTO chatDTO);
    Chat updateChat(Integer chatId, ChatDTO chatDTO);

    void deleteChat(Integer chatId);
}
