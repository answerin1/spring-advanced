package org.example.expert.domain.manager.dto.ManagerResponseDto;

import lombok.Getter;
import org.example.expert.domain.user.dto.UserResponseDto.UserResponseDto;

@Getter
public class ManagerSaveResponseDto {

    private Long id;
    private UserResponseDto user;

    public ManagerSaveResponseDto(Long id, UserResponseDto user) {
        this.id = id;
        this.user = user;
    }
}
