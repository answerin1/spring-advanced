package org.example.expert.domain.user.dto.UserResponseDto;

import lombok.Getter;

@Getter
public class UserSaveResponseDto {

    private final String bearerToken;

    public UserSaveResponseDto(String bearerToken) {
        this.bearerToken = bearerToken;
    }
}
