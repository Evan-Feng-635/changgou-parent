package com.changgou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.changgou.goods.entity.po.Brand;
import org.springframework.stereotype.Service;

public interface BrandService extends IService<Brand> {
    Brand test(Long id);
    Brand saveTest(Brand brand);
}
