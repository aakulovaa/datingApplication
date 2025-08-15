package com.dating.datingApplication.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer messageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_id", nullable = false)
    private Chat messageChat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User messageSender;

    private String messageText;

    public Message(){}

    public Message(Integer messageId, Chat messageChat, User messageSender, String messageText) {
        this.messageId = messageId;
        this.messageChat = messageChat;
        this.messageSender = messageSender;
        this.messageText = messageText;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Chat getMessageChat() {
        return messageChat;
    }

    public void setMessageChat(Chat messageChat) {
        this.messageChat = messageChat;
    }

    public User getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(User messageSender) {
        this.messageSender = messageSender;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
