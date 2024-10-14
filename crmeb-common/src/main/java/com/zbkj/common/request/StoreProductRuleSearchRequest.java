package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * 商品规则值(规格)表

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_store_product_rule")
@ApiModel(value="StoreProductRuleSearchRequest对象", description="商品规则值(规格)表")
public class StoreProductRuleSearchRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= 3466107365768606068L;

    @ApiModelProperty(value = "搜索关键字")
    private String keywords;
}
