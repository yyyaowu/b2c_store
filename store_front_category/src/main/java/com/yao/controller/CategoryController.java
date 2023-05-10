package com.yao.controller;

import com.yao.param.PageParam;
import com.yao.service.CategoryService;
import com.yao.param.ProductParamsString;
import com.yao.pojo.Category;
import com.yao.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询类别集合
     * @return
     */
    @GetMapping
    public List<Category> list(){

        return  categoryService.list();
    }

    @GetMapping("/{categoryName}")
    public Category detail(@PathVariable(value = "categoryName")String categoryName){

        return categoryService.detail(categoryName);
    }


    @PostMapping("/names")
    public List<Integer> names(@RequestBody ProductParamsString productParamsString){

        return categoryService.names(productParamsString);
    }


    /**
     * 后台管理调用服务
     * @param pageParam
     * @return
     */
    @PostMapping("admin/list")
    public R pageList(@RequestBody PageParam pageParam){

        return categoryService.page(pageParam);
    }


    @PostMapping("admin/update")
    public R update(@RequestBody Category category){

        return categoryService.update(category);
    }


    @PostMapping("admin/remove")
    public R remove(@RequestBody Integer categoryId){

        return categoryService.remove(categoryId);
    }


    @PostMapping("admin/save")
    public R remove(@RequestBody Category category){

        return categoryService.save(category);
    }

}
