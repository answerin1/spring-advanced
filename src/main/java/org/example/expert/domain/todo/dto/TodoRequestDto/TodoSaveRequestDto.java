package org.example.expert.domain.todo.dto.TodoRequestDto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TodoSaveRequestDto {

    @NotBlank
    private String title;
    @NotBlank
    private String contents;
}
