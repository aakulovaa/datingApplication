package com.dating.datingApplication.services;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Match;

import java.util.List;

public interface ChatService {
    List<Chat> findAllChats();
    Chat createChat(Chat chat);
    Chat updateChat(Chat chat);
    Chat findByChatMatch(Match chatMatch);
    Chat findByChatId(Integer chatId);
    void deleteChat(Chat chat);
    void deleteChatByChatMatch(Match chatMatch);
}
