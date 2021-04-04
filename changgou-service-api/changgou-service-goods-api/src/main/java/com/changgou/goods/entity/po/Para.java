package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/****
 * @Author:admin
 * @Description:Para构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Para",value = "Para")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_para")
public class Para implements Serializable{

	@ApiModelProperty(value = "id",required = false)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableField(value = "id")
	private Integer id;//id
	@ApiModelProperty(value = "名称",required = false)
    @TableField(value = "name")
	private String name;//名称
	@ApiModelProperty(value = "选项",required = false)
    @TableField(value = "options")
	private String options;//选项
	@ApiModelProperty(value = "排序",required = false)
    @TableField(value = "seq")
	private Integer seq;//排序
	@ApiModelProperty(value = "模板ID",required = false)
    @TableField(value = "template_id")
	private Integer templateId;//模板ID


}
