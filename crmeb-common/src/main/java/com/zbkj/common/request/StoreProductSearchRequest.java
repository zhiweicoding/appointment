package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;

/**
 * 商品表

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_store_product")
@ApiModel(value="StoreProduct对象", description="商品表")
public class StoreProductSearchRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= -9015697536111796950L;

    @ApiModelProperty(value = "类型（1：出售中（已上架），2：仓库中（未上架），3：已售罄，4：警戒库存，5：回收站）")
    @NotNull(message = "商品类型不能为空")
    @Size(min = 1, max = 5, message = "未知的商品类型")
    private int type;

    @ApiModelProperty(value = "分类ID， 多个逗号分隔")
    private String cateId;

    @ApiModelProperty(value = "关键字搜索， 支持(商品名称, 商品简介, 关键字, 商品条码)")
    private String keywords;

}
