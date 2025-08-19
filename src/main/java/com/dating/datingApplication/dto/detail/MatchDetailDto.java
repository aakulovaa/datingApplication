package com.dating.datingApplication.dto.detail;

import com.dating.datingApplication.dto.basic.ChatBasicDto;
import com.dating.datingApplication.dto.basic.UserBasicDto;
import com.dating.datingApplication.models.Match;
import lombok.Data;

@Data
public class MatchDetailDto {
    private Integer matchId;
    private UserBasicDto firstUser;
    private UserBasicDto secondUser;
    private ChatBasicDto chat;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public UserBasicDto getFirstUser() {
        return firstUser;
    }

    public void setFirstUser(UserBasicDto firstUser) {
        this.firstUser = firstUser;
    }

    public UserBasicDto getSecondUser() {
        return secondUser;
    }

    public void setSecondUser(UserBasicDto secondUser) {
        this.secondUser = secondUser;
    }

    public ChatBasicDto getChat() {
        return chat;
    }

    public void setChat(ChatBasicDto chat) {
        this.chat = chat;
    }

    public static MatchDetailDto fromEntity(Match match) {
        MatchDetailDto dto = new MatchDetailDto();
        dto.setMatchId(match.getMatchId());
        dto.setFirstUser(UserBasicDto.fromEntity(match.getMatchFirstUser()));
        dto.setSecondUser(UserBasicDto.fromEntity(match.getMatchSecondUser()));
        if (match.getMatchChat() != null) {
            dto.setChat(ChatBasicDto.fromEntity(match.getMatchChat()));
        }
        return dto;
    }
}