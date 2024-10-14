package com.zbkj.common.request;


import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import jakarta.validation.constraints.Size;

import javax.management.MXBean;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 城市表

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_system_city")
@ApiModel(value="SystemCity对象", description="城市表")
public class SystemCityRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "父级id", required = true, example= "0")
    @NotNull(message = "父级id不能为空")  //不可为空
    @DecimalMin(value = "0", message = "父级id必须大于等于0") //数字最小值为0
    private Integer parentId;

    @ApiModelProperty(value = "名称")
    @NotNull(message = "城市名称不能为空")
    @Size(max = 100, message = "城市名称不能超过100个字符")
    private String name;

}
