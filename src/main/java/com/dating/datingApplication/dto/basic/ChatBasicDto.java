package com.dating.datingApplication.dto.basic;

import com.dating.datingApplication.models.Chat;
import lombok.Data;

@Data
public class ChatBasicDto {
    private Integer chatId;
    private Integer matchId;

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public static ChatBasicDto fromEntity(Chat chat) {
        ChatBasicDto dto = new ChatBasicDto();
        dto.setChatId(chat.getChatId());
        dto.setMatchId(chat.getChatMatch().getMatchId());
        return dto;
    }
}