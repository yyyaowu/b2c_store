package com.yao.search.service;

import com.yao.param.ProductParamsSearch;
import com.yao.utils.R;
import com.fasterxml.jackson.core.JsonProcessingException;


public interface SearchService {

    /**
     * 商品搜索
     * @param productParamsSearch
     * @return
     */
    R search(ProductParamsSearch productParamsSearch) throws JsonProcessingException;
}
