package com.yao.clients;

import com.yao.param.ProductParamsSearch;
import com.yao.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "search-service")
public interface SearchClient {

    /**
     * 搜索服务 商品查询
     * @param productParamsSearch
     * @return
     */
    @PostMapping("/search/product")
    R search(@RequestBody ProductParamsSearch productParamsSearch);

}
