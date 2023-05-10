package com.yao.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDate;

@Data
@TableName("user_detail")
public class UserDetail {

    private Integer userId;

    private Integer age;

    // 0男 1女
    private Integer sex;

    private String position;

    private LocalDate birthday;

    private String hobby;

}
