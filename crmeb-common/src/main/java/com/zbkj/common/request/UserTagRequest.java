package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serial;
import java.io.Serializable;

/**
 * 用户分组表

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UserTagRequest对象", description="会员标签")
public class UserTagRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= -5123557967819071568L;

    @ApiModelProperty(value = "标签名称")
    @NotBlank(message = "请填写标签名称")
    @Size(max = 50, message = "标签名称不能超过50个字符")
    private String name;


}
