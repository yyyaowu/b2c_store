package com.yao.param;

import com.yao.pojo.Product;
import lombok.Data;

/***
 *
 */
@Data
public class ProductSaveParam extends Product {

    //商品详情图片地址, 多图片地址使用 + 号拼接
    private String pictures;
}
