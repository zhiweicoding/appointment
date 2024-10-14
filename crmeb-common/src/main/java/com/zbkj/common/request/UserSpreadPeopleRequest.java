package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户表 推广人 Request
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "UserSpreadPeopleRequest对象", description = "推广用户")
public class UserSpreadPeopleRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -1535583221322457511L;


    @ApiModelProperty(value = "推荐人类型|0=一级|1=二级", allowableValues = "range[0,1]")
    @Size(min = 0, max = 1, message = "推荐人类型必须在 0（一级），1（二级） 中选择")
    private Integer grade = 0;

    @ApiModelProperty(value = "搜索关键字")
    private String keyword;

    @ApiModelProperty(value = "排序, 排序|childCount=团队排序,numberCount=金额排序,orderCount=订单排序", allowableValues = "range[childCount,numberCount,orderCount]")
    private String sortKey;

    @ApiModelProperty(value = "排序值 DESC ASC")
    private String isAsc = "DESC";
}
