package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.changgou.entity.SuperEntitySnow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/****
 * @Author:admin
 * @Description:Spu构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Spu",value = "Spu")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName(value="tb_spu")
public class Spu extends SuperEntitySnow<Long> {

	@ApiModelProperty(value = "货号",required = false)
    @TableField(value = "sn")
	private String sn;//货号
	@ApiModelProperty(value = "SPU名",required = false)
    @TableField(value = "name")
	private String name;//SPU名
	@ApiModelProperty(value = "副标题",required = false)
    @TableField(value = "caption")
	private String caption;//副标题
	@ApiModelProperty(value = "品牌ID",required = false)
    @TableField(value = "brand_id")
	private Integer brandId;//品牌ID
	@ApiModelProperty(value = "一级分类",required = false)
    @TableField(value = "category1_id")
	private Integer category1Id;//一级分类
	@ApiModelProperty(value = "二级分类",required = false)
    @TableField(value = "category2_id")
	private Integer category2Id;//二级分类
	@ApiModelProperty(value = "三级分类",required = false)
    @TableField(value = "category3_id")
	private Integer category3Id;//三级分类
	@ApiModelProperty(value = "模板ID",required = false)
    @TableField(value = "template_id")
	private Integer templateId;//模板ID
	@ApiModelProperty(value = "运费模板id",required = false)
    @TableField(value = "freight_id")
	private Integer freightId;//运费模板id
	@ApiModelProperty(value = "图片",required = false)
    @TableField(value = "image")
	private String image;//图片
	@ApiModelProperty(value = "图片列表",required = false)
    @TableField(value = "images")
	private String images;//图片列表
	@ApiModelProperty(value = "售后服务",required = false)
    @TableField(value = "sale_service")
	private String saleService;//售后服务
	@ApiModelProperty(value = "介绍",required = false)
    @TableField(value = "introduction")
	private String introduction;//介绍
	@ApiModelProperty(value = "规格列表",required = false)
    @TableField(value = "spec_items")
	private String specItems;//规格列表
	@ApiModelProperty(value = "参数列表",required = false)
    @TableField(value = "para_items")
	private String paraItems;//参数列表
	@ApiModelProperty(value = "销量",required = false)
    @TableField(value = "sale_num")
	private Integer saleNum;//销量
	@ApiModelProperty(value = "评论数",required = false)
    @TableField(value = "comment_num")
	private Integer commentNum;//评论数
	@ApiModelProperty(value = "是否上架",required = false)
    @TableField(value = "is_marketable")
	private String isMarketable;//是否上架
	@ApiModelProperty(value = "是否启用规格",required = false)
    @TableField(value = "is_enable_spec")
	private String isEnableSpec;//是否启用规格
	@ApiModelProperty(value = "是否删除",required = false)
    @TableField(value = "is_delete")
	private String isDelete;//是否删除
	@ApiModelProperty(value = "审核状态",required = false)
    @TableField(value = "status")
	private String status;//审核状态

}
