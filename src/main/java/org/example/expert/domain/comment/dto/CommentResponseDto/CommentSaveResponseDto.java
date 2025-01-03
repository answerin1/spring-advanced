package org.example.expert.domain.comment.dto.CommentResponseDto;

import lombok.Getter;
import org.example.expert.domain.user.dto.UserResponseDto.UserResponseDto;

@Getter
public class CommentSaveResponseDto {

    private final Long id;
    private final String contents;
    private final UserResponseDto user;

    public CommentSaveResponseDto(Long id, String contents, UserResponseDto user) {
        this.id = id;
        this.contents = contents;
        this.user = user;
    }
}
