package com.zbkj.common.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 充值

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UserRechargeRequest对象", description="充值")
public class UserRechargeRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= -5592613429645708152L;

    @ApiModelProperty(value = "充值金额")
//    @DecimalMin(value = "1", message = "充值金额不能小于1") todo 测试完后放开
    private BigDecimal price;

    @ApiModelProperty(value = "选择金额组合数据id")
    @JsonProperty(value = "rechar_id")
    private Integer groupDataId;

    @ApiModelProperty(value = "支付方式| weixin = 微信，alipay = 支付宝")
    private String payType = "weixin";

    @ApiModelProperty(value = "来源 | public =  微信公众号, weixinh5 =微信H5支付, routine = 小程序，weixinAppIos-微信appios支付，weixinAppAndroid-微信app安卓支付,alipay-支付包支付，appAliPay-App支付宝支付")
    @JsonProperty(value = "from")
    private String fromType;

    @ApiModelProperty(value = "客户端ip")
    @JsonIgnore
    private String clientIp;

    @ApiModelProperty(value = "用户id")
    @JsonIgnore
    private Integer userId;

    @ApiModelProperty(value = "赠送金额")
    @JsonIgnore
    private BigDecimal givePrice;
}
