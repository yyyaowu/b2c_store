package com.yao.order.controller;

import com.yao.order.service.OrderService;
import com.yao.param.OrderParam;
import com.yao.param.PageParam;
import com.yao.param.SeckillParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderService orderService;

    /**
     * 订单数据保存
     * @param orderParam
     * @return
     */
    @PostMapping("save")
    public Object save(@RequestBody OrderParam orderParam){


        return orderService.save(orderParam);
    }

    @PostMapping("/seckillSave")
    public Object seckillSave(@RequestBody SeckillParam seckillParam){


        return orderService.seckillSave(seckillParam);
    }



    /**
     * 订单集合查询,注意,按照类别查询!
     * @param orderParam
     * @return
     */
    @PostMapping("/list")
    public Object list(@RequestBody OrderParam orderParam){

        return orderService.list(orderParam);
    }


    /**
     * 检查订单是否包含要删除的商品
     * @param productId
     * @return
     */
    @PostMapping("/check")
    public  Object check(@RequestBody Integer productId){
        return orderService.check(productId);
    }


    @PostMapping("/admin/list")
    public Object adminList(@RequestBody PageParam pageParam){

        return orderService.adminList(pageParam);
    }
}
