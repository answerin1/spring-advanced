package org.example.expert.domain.user.dto.UserRequestDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter

public class UserChangePasswordRequestDto {

    @NotBlank
    private String oldPassword;
    @NotBlank
    private String newPassword;

    public UserChangePasswordRequestDto(String oldPassword, String newPassword) {
        this.oldPassword = oldPassword;
    }
}
