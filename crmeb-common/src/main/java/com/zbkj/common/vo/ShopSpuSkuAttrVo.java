package com.zbkj.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 *  自定义交易组件商品SkuAttrVo

 */
@Data
public class ShopSpuSkuAttrVo {

    /** 销售属性key（自定义） */
    @TableField(value = "attr_key")
    private String attrKey;

    /** 销售属性value（自定义） */
    @TableField(value = "attr_value")
    private String attrValue;
}
