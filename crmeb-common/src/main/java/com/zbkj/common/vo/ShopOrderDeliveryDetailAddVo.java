package com.zbkj.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 生成订单Vo对象

 */
@Data
public class ShopOrderDeliveryDetailAddVo {

    /** 1: 正常快递, 2: 无需快递, 3: 线下配送, 4: 用户自提 （ 默认1） */
    @TableField(value = "delivery_type")
    private Integer deliveryType = 1;
}
