package org.example.expert.domain.manager.dto.ManagerRequestDto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;


@Getter

public class ManagerSaveRequestDto {

    @NotNull
    private Long managerUserId; // 일정 작상자가 배치하는 유저 id

    public ManagerSaveRequestDto(Long managerUserId) {
        this.managerUserId = managerUserId;
    }
}
