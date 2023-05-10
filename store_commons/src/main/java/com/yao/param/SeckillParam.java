package com.yao.param;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yao.vo.CartVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class SeckillParam implements Serializable {

    public static final Long serialVersionUID = 1L;

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("product_id")
    private Integer productId;
    private double price;
    private String  code;

}
