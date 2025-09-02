package com.dating.datingApplication.impl;

import com.dating.datingApplication.dto.ChatDTO;
import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Match;
import com.dating.datingApplication.repository.ChatRepository;
import com.dating.datingApplication.repository.MatchRepository;
import com.dating.datingApplication.services.ChatService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
@AllArgsConstructor
public class ChatServiceImpl implements ChatService {
    private final MatchRepository matchRepository;
    private final ChatRepository chatRepository;

    @Autowired
    public ChatServiceImpl(MatchRepository matchRepository, ChatRepository chatRepository) {
        this.matchRepository = matchRepository;
        this.chatRepository = chatRepository;
    }

    @Override
    public List<Chat> findAllChats() {
        return chatRepository.findAll();
    }

    @Override
    public Chat findByChatMatchId(Integer matchId) {
        return chatRepository.findChatByChatMatch_MatchId(matchId);
    }

    @Override
    public Optional<Chat> findByChatId(Integer chatId) {
        return chatRepository.findById(chatId);
    }

    @Override
    public Chat createChat(ChatDTO chatDTO) {
        Match match = matchRepository.findById(chatDTO.getChatMatchId())
                .orElseThrow(()->new EntityNotFoundException("Match not found"));

        Chat chat = new Chat();

        chat.setChatMatch(match);

        return chatRepository.save(chat);
    }

    @Override
    public Chat updateChat(Integer chatId, ChatDTO chatDTO) {
        Chat chat = chatRepository.findById(chatId)
                .orElseThrow(()->new EntityNotFoundException("Chat not found"));
        Match match = matchRepository.findById(chatDTO.getChatMatchId())
                .orElseThrow(()->new EntityNotFoundException("Match not found"));

        chat.setChatMatch(match);

        return chatRepository.save(chat);
    }

    @Override
    public void deleteChat(Integer chatId) {
        chatRepository.deleteById(chatId);
    }

}
