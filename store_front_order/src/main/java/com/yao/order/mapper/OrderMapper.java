package com.yao.order.mapper;

import com.yao.pojo.Order;
import com.yao.vo.AdminOrderVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface OrderMapper extends BaseMapper<Order> {

    /**
     * 分页查询数据,返回order封装vo
     * @param offset
     * @param number
     * @return
     */
    List<AdminOrderVo> selectAdminOrders(@Param("offset") int offset, @Param("number")int number);
}
