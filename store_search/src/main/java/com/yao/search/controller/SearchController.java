package com.yao.search.controller;

import com.yao.param.ProductParamsSearch;
import com.yao.search.service.SearchService;
import com.yao.utils.R;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("product")
    public R productList(@RequestBody ProductParamsSearch productParamsSearch) throws JsonProcessingException {


        return searchService.search(productParamsSearch);
    }

}
