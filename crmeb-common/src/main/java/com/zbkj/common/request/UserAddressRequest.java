package com.zbkj.common.request;

import com.zbkj.common.constants.RegularConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.Serial;
import java.io.Serializable;

/**
 * 新增用户地址对象

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UserAddressRequest对象", description="新增用户地址对象")
public class UserAddressRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= -8387835983723920016L;

    @ApiModelProperty(value = "用户地址id")
    private Integer id;

    @ApiModelProperty(value = "收货人姓名", required = true)
    @NotBlank(message = "收货人姓名不能为空")
    @Size(max = 32, message = "收货人姓名不能超过32个字符")
    private String realName;

    @ApiModelProperty(value = "收货人电话", required = true)
    @NotBlank(message = "收货人电话不能为空")
    @Pattern(regexp = RegularConstants.PHONE_TWO, message = "请填写正确的收货人电话")
    private String phone;

    @ApiModelProperty(value = "收货人详细地址", required = true)
    @NotBlank(message = "收货人详细地址不能为空")
    @Size(max = 256, message = "收货人详细地址不能超过32个字符")
    private String detail;

    @ApiModelProperty(value = "是否默认", example = "false", required = true)
    private Boolean isDefault;

    @Valid
    @ApiModelProperty(value = "城市信息", required = true)
    private UserAddressCityRequest address;
}
