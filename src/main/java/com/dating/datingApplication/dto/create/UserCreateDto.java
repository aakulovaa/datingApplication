package com.dating.datingApplication.dto.create;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserCreateDto {
    @NotBlank(message = "Username is mandatory")
    private String userName;

    @NotBlank(message = "Phone is mandatory")
    private String userPhone;

    @NotBlank(message = "Password is mandatory")
    private String userPassword;

    @Min(value = 18, message = "Age must be at least 18")
    private Integer userAge;

    @NotBlank(message = "Gender is mandatory")
    private String userGender;

    private String userDescription;
    private String userPhotoUrl;
}