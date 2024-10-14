package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import jakarta.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

/**
 * 回复商品评论对象

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StoreProductReplyCommentRequest对象", description="回复商品评论对象")
public class StoreProductReplyCommentRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= -6563840200224566374L;

    @ApiModelProperty(value = "评论id", required = true)
    @NotNull(message = "评论id不能为空")
    private Integer ids;

    @ApiModelProperty(value = "管理员回复内容", required = true)
    @NotBlank(message = "请填写评论内容")
    private String merchantReplyContent;
}
