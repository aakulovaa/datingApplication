package com.dating.datingApplication.dto.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MessageCreateDto {
    @NotNull(message = "Chat ID is mandatory")
    private Integer chatId;

    @NotNull(message = "Sender ID is mandatory")
    private Integer senderId;

    @NotBlank(message = "Message text is mandatory")
    private String messageText;
}