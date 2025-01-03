package org.example.expert.domain.manager.dto.ManagerResponseDto;

import lombok.Getter;
import org.example.expert.domain.user.dto.UserResponseDto.UserResponseDto;

@Getter
public class ManagerResponseDto {

    private Long id;
    private UserResponseDto user;

    public ManagerResponseDto(Long id, UserResponseDto user) {
        this.id = id;
        this.user = user;
    }
}
