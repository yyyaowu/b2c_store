package com.yao.user.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserLoginParam {
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
}
