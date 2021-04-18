package com.changgou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.changgou.goods.entity.po.Category;

public interface CategoryService extends IService<Category> {

    Category add(Category category);
}
