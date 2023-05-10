package com.yao.service;

import com.yao.param.PageParam;
import com.yao.param.ProductParamsString;
import com.yao.pojo.Category;
import com.yao.utils.R;

import java.util.List;


public interface CategoryService {

    /**
     * 查询类别数据
     * @return 类别集合
     */
    List<Category> list();

    /**
     * 类别详情查询
     * @param categoryName
     * @return
     */
    Category detail(String categoryName);

    /**
     * 类别名称查询,类别id集合
     * @param productParamsString
     * @return 类别id集合
     */
    List<Integer> names(ProductParamsString productParamsString);

    /**
     * 分页查询
     * @param pageParam
     * @return
     */
    R page(PageParam pageParam);

    /**
     * 修改类别名
     * @param category
     * @return
     */
    R update(Category category);

    /**
     * 删除对应的类别! 需要判断是否被引用
     * @param categoryId
     * @return
     */
    R remove(Integer categoryId);

    /**
     * 保存类别数据
     * @param category
     * @return
     */
    R save(Category category);
}
