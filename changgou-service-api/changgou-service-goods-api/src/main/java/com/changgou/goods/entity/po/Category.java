package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.changgou.entity.SuperEntitySnow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/****
 * @Author:admin
 * @Description:Category构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Category",value = "Category")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_category")
public class Category extends SuperEntitySnow<Long> {

	@ApiModelProperty(value = "分类名称",required = false)
    @TableField(value = "name")
	private String name;//分类名称
	@ApiModelProperty(value = "商品数量",required = false)
    @TableField(value = "goods_num")
	private Integer goodsNum;//商品数量
	@ApiModelProperty(value = "是否显示",required = false)
    @TableField(value = "is_show")
	private String isShow;//是否显示
	@ApiModelProperty(value = "是否导航",required = false)
    @TableField(value = "is_menu")
	private String isMenu;//是否导航
	@ApiModelProperty(value = "排序",required = false)
    @TableField(value = "seq")
	private Integer seq;//排序
	@ApiModelProperty(value = "上级ID",required = false)
    @TableField(value = "parent_id")
	private Integer parentId;//上级ID
	@ApiModelProperty(value = "模板ID",required = false)
    @TableField(value = "template_id")
	private Long templateId;//模板ID

}
