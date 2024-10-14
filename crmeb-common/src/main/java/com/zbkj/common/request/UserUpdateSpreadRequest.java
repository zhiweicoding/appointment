package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

/**
 * 更新推广人请求对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserUpdateSpreadRequest对象", description = "更新推广人请求对象")
public class UserUpdateSpreadRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -928517626370777871L;

    @ApiModelProperty(value = "用户编号")
    @NotNull(message = "请选择用户")
    private Integer userId;

    @ApiModelProperty(value = "用户头像")
    @NotBlank(message = "请选择用户头像")
    private String image;

    @ApiModelProperty(value = "推广人编号")
    @NotNull(message = "请选择推广人")
    private Integer spreadUid;
}
