package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.changgou.entity.SuperEntitySnow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/****
 * @Author:admin
 * @Description:Pref构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "Pref",value = "Pref")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_pref")
public class Pref extends SuperEntitySnow<Long> {


	@ApiModelProperty(value = "分类ID",required = false)
    @TableField(value = "cate_id")
	private Long cateId;//分类ID
	@ApiModelProperty(value = "消费金额",required = false)
    @TableField(value = "buy_money")
	private BigDecimal buyMoney;//消费金额
	@ApiModelProperty(value = "优惠金额",required = false)
    @TableField(value = "pre_money")
	private BigDecimal preMoney;//优惠金额
	@ApiModelProperty(value = "活动开始日期",required = false)
    @TableField(value = "start_time")
	private Date startTime;//活动开始日期
	@ApiModelProperty(value = "活动截至日期",required = false)
    @TableField(value = "end_time")
	private Date endTime;//活动截至日期
	@ApiModelProperty(value = "类型,1:普通订单，2：限时活动",required = false)
    @TableField(value = "type")
	private String type;//类型,1:普通订单，2：限时活动
	@ApiModelProperty(value = "状态,1:有效，0：无效",required = false)
    @TableField(value = "state")
	private String state;//状态,1:有效，0：无效

}
