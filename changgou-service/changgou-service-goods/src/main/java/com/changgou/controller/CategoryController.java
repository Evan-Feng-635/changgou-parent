package com.changgou.controller;

import com.changgou.entity.BaseResponse;
import com.changgou.goods.entity.po.Category;
import com.changgou.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/addTest")
    public BaseResponse add(Category category){
        return BaseResponse.SUCCESS(categoryService.add(category));
    }
}
