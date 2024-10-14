package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 配置表表单字段明细

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SystemFormItemCheckRequest对象", description="表单字段明细")
public class SystemFormItemCheckRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "字段名称", required = true)
    @NotBlank(message = "请设置 SystemFormItemCheckRequest 对象的 name 属性")
    private String name;

    @ApiModelProperty(value = "字段值", required = true)
    private String value;

    @ApiModelProperty(value = "字段显示文字", required = true)
    private String title;

}
