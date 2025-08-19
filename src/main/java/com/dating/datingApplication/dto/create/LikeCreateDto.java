package com.dating.datingApplication.dto.create;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LikeCreateDto {
    @NotNull(message = "From user ID is mandatory")
    private Integer fromUserId;

    @NotNull(message = "To user ID is mandatory")
    private Integer toUserId;
}
