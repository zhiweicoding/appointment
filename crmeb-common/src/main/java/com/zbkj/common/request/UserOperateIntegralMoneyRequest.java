package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 资金操作

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="资金操作", description="资金操作")
public class UserOperateIntegralMoneyRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= -3037433429511604182L;

    @ApiModelProperty(value = "uid")
    @NotNull
    @Min(value = 1, message = "请输入正确的uid")
    private Integer uid;

    @ApiModelProperty(value = "积分类型， 1 = 增加， 2 = 减少")
    @NotNull
    @Size(min = 1, max = 2, message = "请选择正确的类型， 【1 = 增加， 2 = 减少】")
    private Integer integralType;

    @ApiModelProperty(value = "积分")
    @Min(value = 0)
    @Max(value = 999999)
    private Integer integralValue;

    @ApiModelProperty(value = "余额类型， 1 = 增加， 2 = 减少")
    @NotNull
    @Size(min = 1, max = 2, message = "请选择正确的类型， 【1 = 增加， 2 = 减少】")
    private Integer moneyType;

    @ApiModelProperty(value = "余额")
    @DecimalMin(value = "0.00")
    @DecimalMax(value = "999999.99")
    private BigDecimal moneyValue;

}
