package com.changgou.controller;

import com.changgou.entity.BaseResponse;
import com.changgou.goods.entity.po.Brand;
import com.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequestMapping(value = "/brand")
@CrossOrigin
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping(value = "/test")
    public BaseResponse test(@RequestParam(value = "id") Long id){
        return BaseResponse.SUCCESS(brandService.test(id));
    }

    @PostMapping(value = "/saveTest")
    public BaseResponse saveTest(@RequestBody Brand brand){
        return BaseResponse.SUCCESS(brandService.saveTest(brand));
    }
}
