package com.changgou.controller;

import com.changgou.entity.BaseResponse;
import com.changgou.goods.entity.po.Spu;
import com.changgou.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/spu")
@CrossOrigin
public class SpuController {
    @Autowired
    private SpuService spuService;

    @PostMapping("/add")
    public BaseResponse add(Spu spu){
        return BaseResponse.SUCCESS(spuService.add(spu));
    }
}
