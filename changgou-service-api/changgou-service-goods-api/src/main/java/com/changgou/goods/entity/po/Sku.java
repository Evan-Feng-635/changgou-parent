package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.changgou.entity.SuperEntity;
import com.changgou.entity.SuperEntitySnow;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/****
 * @Author:admin
 * @Description:Sku构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Sku",value = "Sku")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_sku")
public class Sku extends SuperEntitySnow<Long> {
	
	@ApiModelProperty(value = "商品条码",required = false)
    @TableField(value = "sn")
	private String sn;//商品条码
	@ApiModelProperty(value = "SKU名称",required = false)
    @TableField(value = "name")
	private String name;//SKU名称
	@ApiModelProperty(value = "价格（分）",required = false)
    @TableField(value = "price")
	private BigDecimal price;//价格（分）
	@ApiModelProperty(value = "库存数量",required = false)
    @TableField(value = "num")
	private Integer num;//库存数量
	@ApiModelProperty(value = "库存预警数量",required = false)
    @TableField(value = "alert_num")
	private Integer alertNum;//库存预警数量
	@ApiModelProperty(value = "商品图片",required = false)
    @TableField(value = "image")
	private String image;//商品图片
	@ApiModelProperty(value = "商品图片列表",required = false)
    @TableField(value = "images")
	private String images;//商品图片列表
	@ApiModelProperty(value = "重量（克）",required = false)
    @TableField(value = "weight")
	private Integer weight;//重量（克）
	@ApiModelProperty(value = "SPUID",required = false)
    @TableField(value = "spu_id")
	private Long spuId;//SPUID
	@ApiModelProperty(value = "类目ID",required = false)
    @TableField(value = "category_id")
	private Long categoryId;//类目ID
	@ApiModelProperty(value = "类目名称",required = false)
    @TableField(value = "category_name")
	private String categoryName;//类目名称
	@ApiModelProperty(value = "品牌名称",required = false)
    @TableField(value = "brand_name")
	private String brandName;//品牌名称
	@ApiModelProperty(value = "规格",required = false)
    @TableField(value = "spec")
	private String spec;//规格
	@ApiModelProperty(value = "销量",required = false)
    @TableField(value = "sale_num")
	private Integer saleNum;//销量
	@ApiModelProperty(value = "评论数",required = false)
    @TableField(value = "comment_num")
	private Integer commentNum;//评论数
	@ApiModelProperty(value = "商品状态 1-正常，2-下架",required = false)
    @TableField(value = "status")
	private String status;//商品状态 1-正常，2-下架

}
