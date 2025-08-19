package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.Message;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageBasicDto {
    private Integer messageId;
    private Integer chatId;
    private Integer senderId;
    private String messageText;
    private LocalDateTime timestamp;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
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

    public static MessageBasicDto fromEntity(Message message) {
        MessageBasicDto dto = new MessageBasicDto();
        dto.setMessageId(message.getMessageId());
        dto.setChatId(message.getMessageChat().getChatId());
        dto.setSenderId(message.getMessageSender().getUserId());
        dto.setMessageText(message.getMessageText());
        return dto;
    }
}