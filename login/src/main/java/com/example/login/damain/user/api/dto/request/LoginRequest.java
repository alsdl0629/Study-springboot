package com.example.login.damain.user.api.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class LoginRequest {

    @NotBlank(message = "email은 Null 또는 공백 또는 띄어쓰기를 허용하지 않습니다.")
    private String email;

    @NotBlank(message = "password은 Null 또는 공백 또는 띄어쓰기를 허용하지 않습니다.")
    private String password;

}
