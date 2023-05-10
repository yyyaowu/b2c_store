package com.yao.product.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.pojo.Seckill;
import com.yao.product.mapper.SeckillMapper;
import com.yao.product.service.SeckillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeckillServiceImpl extends ServiceImpl<SeckillMapper,Seckill> implements SeckillService {
    @Override
    public List<Seckill> getList() {
        return this.list();
    }

}
