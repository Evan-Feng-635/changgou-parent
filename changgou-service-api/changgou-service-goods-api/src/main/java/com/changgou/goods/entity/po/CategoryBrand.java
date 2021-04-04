package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/****
 * @Author:admin
 * @Description:CategoryBrand构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "CategoryBrand",value = "CategoryBrand")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tb_category_brand")
public class CategoryBrand implements Serializable{

	@ApiModelProperty(value = "分类ID",required = false)
	@Id
    @TableField(value = "category_id")
	private Integer categoryId;//分类ID

	@ApiModelProperty(value = "品牌ID",required = false)
	@Id
	@TableField(value = "brand_id")
	private Integer brandId;//品牌ID
}
