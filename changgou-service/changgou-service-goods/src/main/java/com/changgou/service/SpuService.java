package com.changgou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.changgou.goods.entity.po.Spu;

public interface SpuService extends IService<Spu> {

    Spu add(Spu spu);
}
