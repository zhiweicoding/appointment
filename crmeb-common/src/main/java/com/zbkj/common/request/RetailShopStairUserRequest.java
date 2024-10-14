package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 推广列表参数

 */
@Data
@ApiModel(value = "RetailShopStairUserRequest对象", description = "推广等级参数")
public class RetailShopStairUserRequest {

    @ApiModelProperty(value = "搜索关键字")
    private String nickName;

    @ApiModelProperty(value = "时间参数 today,yesterday,lately7,lately30,month,year,/yyyy-MM-dd hh:mm:ss,yyyy-MM-dd hh:mm:ss/")
    private String dateLimit;

    // 类型 0 = 全部 1=一级推广人 2=二级推广人
    @ApiModelProperty(value = "类型 0 = 全部 1=一级推广人 2=二级推广人")
    @NotNull(message = "推广人类型不能为空")
    @Size(min = 0, max = 3, message = "请选择正确的用户类型")
    private Integer type;

    @ApiModelProperty(value = "用户id")
    @Min(value = 1, message = "用户id不能为空")
    private Integer uid;
}
