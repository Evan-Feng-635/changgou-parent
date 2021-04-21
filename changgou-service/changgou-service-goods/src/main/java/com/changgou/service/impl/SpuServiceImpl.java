package com.changgou.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.changgou.dao.SpuMapper;
import com.changgou.goods.entity.po.Spu;
import com.changgou.service.SpuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class SpuServiceImpl extends ServiceImpl<SpuMapper, Spu> implements SpuService {

    @Override
    public Spu add(Spu spu){
        super.save(spu);
        return spu;
    }
}
