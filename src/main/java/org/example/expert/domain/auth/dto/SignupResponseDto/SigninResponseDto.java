package org.example.expert.domain.auth.dto.SignupResponseDto;

import lombok.Getter;

@Getter
public class SigninResponseDto {

    private final String bearerToken;

    public SigninResponseDto(String bearerToken) {
        this.bearerToken = bearerToken;
    }
}
