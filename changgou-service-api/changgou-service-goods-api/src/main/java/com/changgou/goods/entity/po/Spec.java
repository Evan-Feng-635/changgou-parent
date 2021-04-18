package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.changgou.entity.SuperEntityAuto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:admin
 * @Description:Spec构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Spec",value = "Spec")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName(value="tb_spec")
public class Spec extends SuperEntityAuto<Long> {


	@ApiModelProperty(value = "名称",required = false)
    @TableField(value = "name")
	private String name;//名称
	@ApiModelProperty(value = "规格选项",required = false)
    @TableField(value = "options")
	private String options;//规格选项
	@ApiModelProperty(value = "排序",required = false)
    @TableField(value = "seq")
	private Integer seq;//排序
	@ApiModelProperty(value = "模板ID",required = false)
    @TableField(value = "template_id")
	private Long templateId;//模板ID

}
