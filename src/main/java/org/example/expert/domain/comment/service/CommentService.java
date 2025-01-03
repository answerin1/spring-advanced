package org.example.expert.domain.comment.service;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.expert.domain.comment.dto.CommentRequestDto.CommentSaveRequestDto;
import org.example.expert.domain.comment.dto.CommentResponseDto.CommentResponseDto;
import org.example.expert.domain.comment.dto.CommentResponseDto.CommentSaveResponseDto;
import org.example.expert.domain.comment.entity.Comment;
import org.example.expert.domain.comment.repository.CommentRepository;
import org.example.expert.domain.common.dto.AuthUserDto;
import org.example.expert.domain.common.exception.InvalidRequestException;
import org.example.expert.domain.todo.entity.Todo;
import org.example.expert.domain.todo.repository.TodoRepository;
import org.example.expert.domain.user.dto.UserResponseDto.UserResponseDto;
import org.example.expert.domain.user.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentService {

    private final TodoRepository todoRepository;
    private final CommentRepository commentRepository;

    @Transactional
    public CommentSaveResponseDto saveComment(AuthUserDto authUserDto, long todoId, CommentSaveRequestDto commentSaveRequestDto) {
        User user = User.fromAuthUser(authUserDto);
        Todo todo = todoRepository.findById(todoId).orElseThrow(() ->
                new InvalidRequestException("Todo not found"));

        Comment newComment = new Comment(
                commentSaveRequestDto.getContents(),
                user,
                todo
        );

        Comment savedComment = commentRepository.save(newComment);

        return new CommentSaveResponseDto(
                savedComment.getId(),
                savedComment.getContents(),
                new UserResponseDto(user.getId(), user.getEmail())
        );
    }

    public List<CommentResponseDto> getComments(long todoId) {
        List<Comment> commentList = commentRepository.findAllByTodoId(todoId);

        List<CommentResponseDto> dtoList = new ArrayList<>();
        for (Comment comment : commentList) {
            User user = comment.getUser();
            CommentResponseDto dto = new CommentResponseDto(
                    comment.getId(),
                    comment.getContents(),
                    new UserResponseDto(user.getId(), user.getEmail())
            );
            dtoList.add(dto);
        }
        return dtoList;
    }
}
