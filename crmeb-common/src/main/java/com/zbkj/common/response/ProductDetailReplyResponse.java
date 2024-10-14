package com.zbkj.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 商品详情评论响应对象

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ProductDetailReplyResponse对象", description="商品详情评论响应对象")
public class ProductDetailReplyResponse implements Serializable {

    private static final long serialVersionUID = 8822745472328151094L;

    @ApiModelProperty(value = "评论总数")
    private Integer sumCount;

    @ApiModelProperty(value = "好评率")
    private String replyChance;

    @ApiModelProperty(value = "最后一条评论信息")
    private ProductReplyResponse productReply;
}
