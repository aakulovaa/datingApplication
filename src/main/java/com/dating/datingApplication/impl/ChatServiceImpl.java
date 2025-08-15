package com.dating.datingApplication.impl;

import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.repository.ChatRepository;
import com.dating.datingApplication.services.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class ChatServiceImpl implements ChatService {
    private ChatRepository chatRepository;

    @Override
    public List<Chat> findAllChats() {
        return chatRepository.findAll();
    }

    @Override
    public Chat createChat(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public Chat updateChat(Chat chat) {
        return chatRepository.save(chat);
    }

    @Override
    public Chat findByChatMatchId(Integer matchId) {
        return chatRepository.findChatByChatMatch_MatchId(matchId);
    }

    @Override
    public Chat findByChatId(Integer chatId) {
        return chatRepository.findChatByChatId(chatId);
    }

    @Override
    public void deleteChat(Integer chatId) {
        chatRepository.delete(findByChatId(chatId));
    }

    @Override
    public void deleteChatByChatMatchId(Integer matchId) {
        chatRepository.deleteChatByChatMatch_MatchId(matchId);
    }
}
