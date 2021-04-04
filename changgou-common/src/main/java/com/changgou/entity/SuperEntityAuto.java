package com.changgou.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@Data
public class SuperEntityAuto<ID extends Serializable>  implements Serializable{
    /**
     * UUID
     */
    @Id()
    @TableId(type = IdType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableField("id")
    @ApiModelProperty(value = "ID")
    private ID id;

    /**
     * 记录创建人标识，记录用户的UUID
     */
    @ApiModelProperty(value = "创建人", hidden = true)
    @TableField(fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 记录创建日期
     */
    @ApiModelProperty(value = "创建日期", hidden = true)
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 记录最后更新人标识，记录用户的UUID
     */
    @ApiModelProperty(value = "更新人", hidden = true)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    /**
     * 记录最后更新日期
     */
    @ApiModelProperty(value = "更新日期", hidden = true)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
     * 删除标识,1:是,0:否
     */
    @ApiModelProperty(value = "删除标识", hidden = true)
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

}
