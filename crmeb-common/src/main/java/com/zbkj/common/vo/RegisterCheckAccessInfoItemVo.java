package com.zbkj.common.vo;

import lombok.Data;

/**
 *

 */
@Data
public class RegisterCheckAccessInfoItemVo {
    // 上传商品并审核成功
    private Integer spu_audit_success;
    // 发起第一笔订单并支付成功
    private Integer pay_order_success;
}
