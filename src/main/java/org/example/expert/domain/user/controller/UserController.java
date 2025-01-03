package org.example.expert.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.example.expert.domain.common.annotation.Auth;
import org.example.expert.domain.common.dto.AuthUserDto;
import org.example.expert.domain.user.dto.UserRequestDto.UserChangePasswordRequestDto;
import org.example.expert.domain.user.dto.UserResponseDto.UserResponseDto;
import org.example.expert.domain.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable long userId) {
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @PutMapping("/users")
    public void changePassword(@Auth AuthUserDto authUserDto, @RequestBody UserChangePasswordRequestDto userChangePasswordRequestDto) {
        userService.changePassword(authUserDto.getId(), userChangePasswordRequestDto);
    }
}
