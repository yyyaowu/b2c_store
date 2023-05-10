package com.yao.service.impl;

import com.yao.clients.OrderClient;
import com.yao.param.PageParam;
import com.yao.service.OrderService;
import com.yao.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderClient orderClient;

    /**
     * 分页查询订单数据
     *
     * @param pageParam
     * @return
     */
    @Override
    public Object list(PageParam pageParam) {

        R r = orderClient.adminList(pageParam);

        log.info("OrderServiceImpl.list业务结束，结果:{}",r);

        return r;
    }
}
