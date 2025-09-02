package com.dating.datingApplication.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "chats")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chatId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "match_id", unique = true) // unique = true делает ее по смыслу OneToOne
    private Match chatMatch;

    @OneToMany(mappedBy = "messageChat", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Message> chatMessage = new ArrayList<>();

    public Chat(){}

    public Chat(Integer chatId, Match chatMatch, List<Message> chatMessage) {
        this.chatId = chatId;
        this.chatMatch = chatMatch;
        this.chatMessage = chatMessage;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Match getChatMatch() {
        return chatMatch;
    }

    public void setChatMatch(Match chatMatch) {
        this.chatMatch = chatMatch;
    }

    public List<Message> getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(List<Message> chatMessage) {
        this.chatMessage = chatMessage;
    }
}
