package com.yao.pojo.user;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserCheckParam {

    @NotBlank
    private String UserName;

}
