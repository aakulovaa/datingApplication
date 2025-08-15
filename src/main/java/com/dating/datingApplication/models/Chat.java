package com.dating.datingApplication.models;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id", unique = true)
    private Match chatMatch;

    @OneToMany(mappedBy = "messageChat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> chatMessage = new ArrayList<>();
}
