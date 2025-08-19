package com.dating.datingApplication.dto.detail;

import com.dating.datingApplication.dto.basic.MatchBasicDto;
import com.dating.datingApplication.dto.basic.MessageBasicDto;
import com.dating.datingApplication.models.Chat;
import lombok.Data;

import java.util.List;

@Data
public class ChatDetailDto {
    private Integer chatId;
    private MatchBasicDto match;
    private List<MessageBasicDto> messages;

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public MatchBasicDto getMatch() {
        return match;
    }

    public void setMatch(MatchBasicDto match) {
        this.match = match;
    }

    public List<MessageBasicDto> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageBasicDto> messages) {
        this.messages = messages;
    }

    public static ChatDetailDto fromEntity(Chat chat) {
        ChatDetailDto dto = new ChatDetailDto();
        dto.setChatId(chat.getChatId());
        dto.setMatch(MatchBasicDto.fromEntity(chat.getChatMatch()));
        return dto;
    }
}