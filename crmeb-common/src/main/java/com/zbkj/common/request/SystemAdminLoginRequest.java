package com.zbkj.common.request;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import jakarta.validation.constraints.Size;


/**
 * PC登录请求对象

 */
@Data
public class SystemAdminLoginRequest {
    @ApiModelProperty(value = "后台管理员账号", example = "userName")
    @NotEmpty(message = "账号 不能为空")
    @Size(max = 32, message = "账号长度不能超过32个字符")
    private String account;

    @ApiModelProperty(value = "后台管理员密码", example = "userPassword")
    @NotEmpty(message = "密码 不能为空")
    @Size(min = 6, max = 30 ,message = "密码长度在6-30个字符")
    private String pwd;

    @ApiModelProperty(value = "key", required = true)
    @NotEmpty(message = "验证码key 不能为空")
    private String key;

    @ApiModelProperty(value = "code", required = true)
    @NotEmpty(message = "验证码 不能为空")
    private String code;
}
