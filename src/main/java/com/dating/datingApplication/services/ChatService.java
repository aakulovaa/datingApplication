package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Match;

import java.util.List;

public interface ChatService {
    List<Chat> findAllChats();
    Chat createChat(Chat chat);
    Chat updateChat(Chat chat);
    Chat findByChatMatchId(Integer matchId);
    Chat findByChatId(Integer chatId);
    void deleteChat(Integer chatId);
    void deleteChatByChatMatchId(Integer matchId);
}
