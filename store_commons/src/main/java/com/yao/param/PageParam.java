package com.yao.param;

import lombok.Data;


@Data
public class PageParam {

    private int    currentPage = 1;
    private int    pageSize = 15;
}
