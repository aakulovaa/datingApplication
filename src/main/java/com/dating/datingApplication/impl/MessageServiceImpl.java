package com.dating.datingApplication.impl;

import com.dating.datingApplication.dto.MessageDTO;
import com.dating.datingApplication.models.Chat;
import com.dating.datingApplication.models.Message;
import com.dating.datingApplication.models.User;
import com.dating.datingApplication.repository.ChatRepository;
import com.dating.datingApplication.repository.MessageRepository;
import com.dating.datingApplication.repository.UserRepository;
import com.dating.datingApplication.services.MessageService;
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
public class MessageServiceImpl implements MessageService {
    private final ChatRepository chatRepository;
    private final UserRepository userRepository;
    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(ChatRepository chatRepository, UserRepository userRepository, MessageRepository messageRepository) {
        this.chatRepository = chatRepository;
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> findAllMessage() {
        return messageRepository.findAll();
    }

    @Override
    public Message findByMessageChatId(Integer chatId) {
        return messageRepository.findMessageByMessageChat_ChatId(chatId);
    }

    @Override
    public Message findByMessageSenderId(Integer userId) {
        return messageRepository.findMessageByMessageSender_UserId(userId);
    }

    @Override
    public Optional<Message> findByMessageId(Integer messageId) {
        return messageRepository.findById(messageId);
    }

    @Override
    public Message createMessage(MessageDTO messageDTO) {
        Chat chat = chatRepository.findById(messageDTO.getChatId())
                .orElseThrow(()->new EntityNotFoundException("Chat not found"));
        User user = userRepository.findById(messageDTO.getUserId())
                .orElseThrow(()->new EntityNotFoundException("Chat not found"));

        Message message = new Message();

        message.setMessageChat(chat);
        message.setMessageSender(user);
        message.setMessageText(messageDTO.getMessageText());

        return messageRepository.save(message);
    }

    @Override
    public Message updeteMessage(Integer messageId, MessageDTO messageDTO) {
        Message message = messageRepository.findById(messageId)
                .orElseThrow(()->new EntityNotFoundException("Message not found"));
        Chat chat = chatRepository.findById(messageDTO.getChatId())
                .orElseThrow(()->new EntityNotFoundException("Chat not found"));
        User user = userRepository.findById(messageDTO.getUserId())
                .orElseThrow(()->new EntityNotFoundException("Chat not found"));

        message.setMessageChat(chat);
        message.setMessageSender(user);
        if(messageDTO.getMessageText()!=null) {
            message.setMessageText(messageDTO.getMessageText());
        }

        return messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Integer messageId) {
        messageRepository.deleteById(messageId);
    }

}
