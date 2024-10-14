package com.zbkj.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品ExcelVo对象类

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ProductExcelVo对象", description = "产品导出")
public class ProductExcelVo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "商品名称")
    private String storeName;

    @ApiModelProperty(value = "商品简介")
    private String storeInfo;

    @ApiModelProperty(value = "商品分类")
    private String cateName;

    @ApiModelProperty(value = "价格")
    private String price;

    @ApiModelProperty(value = "库存")
    private String stock;

    @ApiModelProperty(value = "销量")
    private String sales;

    @ApiModelProperty(value = "浏览量")
    private String browse;
}
