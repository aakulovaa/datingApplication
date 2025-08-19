package com.dating.datingApplication.dto.create;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserAnswerCreateDto {
    @NotNull(message = "User ID is mandatory")
    private Integer userId;

    @NotNull(message = "Question ID is mandatory")
    private Integer questionId;

    @NotNull(message = "Opinion ID is mandatory")
    private Integer opinionId;
}