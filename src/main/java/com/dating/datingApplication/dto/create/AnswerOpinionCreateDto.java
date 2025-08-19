package com.dating.datingApplication.dto.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AnswerOpinionCreateDto {
    @NotBlank(message = "Opinion text is mandatory")
    private String opinionText;

    @NotNull(message = "Order is mandatory")
    private Integer opinionOrder;

    @NotNull(message = "Question ID is mandatory")
    private Integer questionId;
}