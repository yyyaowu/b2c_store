package com.yao.user.service;

import com.yao.param.AddressParam;
import com.yao.pojo.Address;
import com.yao.utils.R;


public interface AddressService {

    /**
     * 查询地址列表
     * @param userId
     * @return
     */
    R list(Integer userId);

    /**
     * 保存数据库数据
     * @param address
     * @return
     */
    R save(AddressParam address);

    /**
     * 删除地址数据
     * @param id
     * @return
     */
    R remove(Integer id);
}
