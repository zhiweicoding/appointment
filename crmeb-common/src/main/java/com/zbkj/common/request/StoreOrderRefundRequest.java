package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.DecimalMin;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单退款表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "StoreOrderRefundRequest对象", description = "订单退款")
public class StoreOrderRefundRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -8406665193198164524L;

    @ApiModelProperty(value = "订单编号")
    @NotBlank(message = "订单编号不能为空")
    private String orderNo;

    @ApiModelProperty(value = "退款金额")
    @DecimalMin(value = "0.00", message = "退款金额不能少于0.00")
    private BigDecimal amount;

    private Integer orderId;
}
