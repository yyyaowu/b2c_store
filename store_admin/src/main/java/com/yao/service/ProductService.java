package com.yao.service;

import com.yao.param.ProductParamsSearch;
import com.yao.param.ProductSaveParam;
import com.yao.pojo.Product;


public interface ProductService {

    /**
     * 商品分页,关键字分页查询!
     * @param productParamsSearch
     * @return
     */
    Object list(ProductParamsSearch productParamsSearch);

    /**
     * 保存商品业务!
     *    1.保存商品
     *    2.保存商品图片 [异步]
     *    3.商品缓存数据处理 [注解]
     *    4.添加缓存es处理 [异步]
     * @param saveParam
     * @return
     */
    Object save(ProductSaveParam saveParam);

    /**
     * 修改商品信息
     *   1.修改商品信息
     *   2.清空商品缓存集合
     *   3.更新缓存es处理 [异步]
     * @param product
     * @return
     */
    Object update(Product product);

    /**
     * 删除商品数据
     * @param productId
     * @return
     */
    Object remove(Integer productId);
}
