package com.changgou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.changgou.dao.BrandMapper;
import com.changgou.goods.entity.po.Brand;
import com.changgou.service.BrandService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Override
    public Brand test(Long id){
        return super.getById(id);
    }

    @Override
    public Brand saveTest(Brand brand){
        super.save(brand);
        return brand;
    }
}
