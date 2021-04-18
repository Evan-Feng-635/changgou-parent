package com.changgou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.changgou.dao.CategoryMapper;
import com.changgou.goods.entity.po.Category;
import com.changgou.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Override
    public Category add(Category category){
        super.save(category);
        return category;
    }
}
