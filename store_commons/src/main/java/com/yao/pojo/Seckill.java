package com.yao.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@TableName("seckill")
public class Seckill implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer seckillId;

    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("seckill_price")
    private Double seckillPrice;


    @JsonProperty("begin_time")
    private LocalDate beginTime;

    @JsonProperty("end_time")
    private LocalDate endTime;

}
