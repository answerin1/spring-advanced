package org.example.expert.domain.user.dto.UserRequestDto;

import lombok.Getter;

@Getter

public class UserRoleChangeRequestDto {

    private final String role;

    public UserRoleChangeRequestDto(String role) {
        this.role = role;
    }
}
