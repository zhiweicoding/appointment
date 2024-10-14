package com.zbkj.common.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;

/**
 * 商品点赞和收藏表

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StoreProductRelationRequest对象", description="商品点赞和收藏表")
public class UserCollectAllRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= 3175362051242474455L;

    @ApiModelProperty(value = "商品ID")
    @JsonProperty("id")
    @Size(min = 1, message = "请选择产品")
    private Integer[] productId;

    @ApiModelProperty(value = "产品类型|store=普通产品,product_seckill=秒杀产品(默认 普通产品 store)")
    @NotBlank(message = "请选择产品类型")
    private String category;
}
