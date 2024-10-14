package com.zbkj.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 申请短信模板请求对象

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SmsApplyTempRequest对象", description="申请短信模板请求对象")
public class SmsApplyTempRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "模板标题")
    @NotBlank(message = "模板标题不能为空")
    private String title;

    @ApiModelProperty(value = "模板内容(仅内容，不需要签名)")
    @NotBlank(message = "模板内容不能为空")
    private String content;

    @ApiModelProperty(value = "模板类型：1验证码，2通知，3推广")
    @NotNull(message = "模板类型不能为空")
    @Size(min = 1, max = 3, message = "未知的模板类型")
    private Integer type;

}
