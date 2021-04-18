package com.changgou.goods.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.changgou.entity.SuperEntityAuto;
import com.changgou.entity.SuperEntitySnow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/****
 * @Author:admin
 * @Description:Album构建
 * @Date 2019/6/14 19:13
 *****/
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tb_album")
public class Album extends SuperEntityAuto<Long> {


    @TableField(value = "title")
	private String title;//相册名称
    @TableField(value = "image")
	private String image;//相册封面
    @TableField(value = "image_items")
	private String imageItems;//图片列表


}
