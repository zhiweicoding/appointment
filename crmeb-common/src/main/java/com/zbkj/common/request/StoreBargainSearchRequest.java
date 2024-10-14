package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 砍价商品查询Request

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StoreBargain对象", description="砍价表")
public class StoreBargainSearchRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "搜索关键字 商品id或者名称")
    private String keywords;

    @ApiModelProperty(value = "砍价状态 0(到砍价时间不自动开启)  1(到砍价时间自动开启时间)")
    private Integer status;

}
