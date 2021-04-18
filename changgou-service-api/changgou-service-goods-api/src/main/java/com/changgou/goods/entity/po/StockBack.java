package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.changgou.entity.SuperEntity;
import com.changgou.entity.SuperEntitySnow;
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
import java.util.Date;

/****
 * @Author:admin
 * @Description:StockBack构建
 * @Date 2019/6/14 19:13
 *****/
@ApiModel(description = "StockBack",value = "StockBack")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName(value="tb_stock_back")
public class StockBack extends SuperEntitySnow<Long> {

	@ApiModelProperty(value = "订单id",required = false)
    @TableField(value = "order_id")
	private String orderId;//订单id
	@ApiModelProperty(value = "SKU的id",required = false)
	@Id
    @TableField(value = "sku_id")
	private String skuId;//SKU的id
	@ApiModelProperty(value = "回滚数量",required = false)
    @TableField(value = "num")
	private Integer num;//回滚数量
	@ApiModelProperty(value = "回滚状态",required = false)
    @TableField(value = "status")
	private String status;//回滚状态
	@ApiModelProperty(value = "回滚时间",required = false)
    @TableField(value = "back_time")
	private Date backTime;//回滚时间

}
