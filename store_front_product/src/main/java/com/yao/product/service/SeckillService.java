package com.yao.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.pojo.Seckill;

import java.util.List;

public interface SeckillService extends IService<Seckill> {
    public List<Seckill> getList();


}
