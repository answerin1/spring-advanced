package org.example.expert.domain.comment.dto.CommentRequestDto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter

public class CommentSaveRequestDto {

    @NotBlank
    private final String contents;

    public CommentSaveRequestDto(String contents) {
        this.contents = contents;
    }
}
