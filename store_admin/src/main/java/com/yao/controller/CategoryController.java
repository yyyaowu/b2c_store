package com.yao.controller;

import com.yao.param.PageParam;
import com.yao.pojo.Category;
import com.yao.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public Object list(PageParam pageParam){

        return  categoryService.listPage(pageParam);
    }

    @PostMapping("/update")
    public Object update(Category category){

        return categoryService.update(category);
    }


    @PostMapping("/remove")
    public Object remove(Integer categoryId){

        return categoryService.remove(categoryId);
    }


    @PostMapping("/save")
    public Object save(Category category){

        return categoryService.save(category);
    }
}
