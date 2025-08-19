package com.dating.datingApplication.dto.detail;

import com.dating.datingApplication.dto.basic.ChatBasicDto;
import com.dating.datingApplication.dto.basic.UserBasicDto;
import com.dating.datingApplication.models.Message;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDetailDto {
    private Integer messageId;
    private ChatBasicDto chat;
    private UserBasicDto sender;
    private String messageText;
    private LocalDateTime timestamp;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public ChatBasicDto getChat() {
        return chat;
    }

    public void setChat(ChatBasicDto chat) {
        this.chat = chat;
    }

    public UserBasicDto getSender() {
        return sender;
    }

    public void setSender(UserBasicDto sender) {
        this.sender = sender;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public static MessageDetailDto fromEntity(Message message) {
        MessageDetailDto dto = new MessageDetailDto();
        dto.setMessageId(message.getMessageId());
        dto.setChat(ChatBasicDto.fromEntity(message.getMessageChat()));
        dto.setSender(UserBasicDto.fromEntity(message.getMessageSender()));
        dto.setMessageText(message.getMessageText());
        return dto;
    }
}