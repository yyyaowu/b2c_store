package com.yao.param;

import lombok.Data;
import org.checkerframework.common.value.qual.MinLen;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * 登录用户实体
 */
@Data
public class AdminUserParam {

    @Length(min = 6)
    private String userAccount; //账号
    @Length(min = 6)
    private String userPassword; //密码
    @NotBlank
    private String verCode;  //验证码

}
