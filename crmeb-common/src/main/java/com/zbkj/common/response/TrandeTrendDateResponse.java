package com.zbkj.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 交易概览数据对象

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TradingDataResponse对象", description="交易概览数据对象")
public class TrandeTrendDateResponse implements Serializable {

    private static final long serialVersionUID = -6332062115310922579L;

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "营业额")
    private BigDecimal turnover;

    @ApiModelProperty(value = "商品支付金额")
    private BigDecimal proPayAmount;

    @ApiModelProperty(value = "充值金额")
    private BigDecimal rechargeAmount;

    @ApiModelProperty(value = "支出金额")
    private BigDecimal payoutAmount;

}
