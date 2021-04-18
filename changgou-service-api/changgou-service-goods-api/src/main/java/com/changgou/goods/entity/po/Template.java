package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.changgou.entity.SuperEntity;
import com.changgou.entity.SuperEntityAuto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/****
 * @Author:admin
 * @Description:Template构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Template",value = "Template")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value="tb_template")
public class Template extends SuperEntityAuto<Long> {

	@ApiModelProperty(value = "模板名称",required = false)
    @TableField(value = "name")
	private String name;//模板名称
	@ApiModelProperty(value = "规格数量",required = false)
	@TableField(value = "spec_num")
	private Integer specNum;//规格数量
	@ApiModelProperty(value = "参数数量",required = false)
	@TableField(value = "para_num")
	private Integer paraNum;//参数数量

}
