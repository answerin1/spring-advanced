package org.example.expert.domain.auth.dto.SignupRequestDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class SigninRequestDto {
    
    @NotBlank @Email
    private String email;
    @NotBlank
    private String password;

    public SigninRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
