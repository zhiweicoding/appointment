package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * 组合数据表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_system_group")
@ApiModel(value = "SystemGroupRequest对象", description = "组合数据表")
public class SystemGroupRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 2823615960331985910L;

    /**
     * 数据组名称长度不能超过50个字符
     */
    @ApiModelProperty(value = "数据组名称")
    private String name;

    /**
     * 数据组名称长度不能超过256个字符
     */
    @ApiModelProperty(value = "简介")
    private String info;

    @ApiModelProperty(value = "form 表单 id")
    private Integer formId;

}
