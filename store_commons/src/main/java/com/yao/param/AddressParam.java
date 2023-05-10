package com.yao.param;

import com.yao.pojo.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class AddressParam {

    @JsonProperty("user_id")
    private Integer userId;
    private Address add;
}
