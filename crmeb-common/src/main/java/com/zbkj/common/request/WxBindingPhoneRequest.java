package com.zbkj.common.request;

import com.zbkj.common.constants.RegularConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.validation.constraints.Pattern;
import java.io.Serial;
import java.io.Serializable;

/**
 * 微信绑定手机号请求对象

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WxBindingPhoneRequest", description="微信绑定手机号请求对象")
public class WxBindingPhoneRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= 2439736458210930033L;

    @ApiModelProperty(value = "手机号", required = true)
    @Pattern(regexp = RegularConstants.PHONE_TWO, message = "请输入正确的手机号")
    private String phone;

    @ApiModelProperty(value = "验证码", required = true)
    @Pattern(regexp = RegularConstants.VALIDATE_CODE_NUM_SIX, message = "请输入6位验证码")
    private String captcha;

    @ApiModelProperty(value = "类型:public-公众号，routine-小程序,iosWx-苹果微信，androidWx-安卓微信, ios-ios登录")
    @NotBlank(message = "类型不能为空")
    private String type;

    @ApiModelProperty(value = "新用户登录时返回的key")
    @NotBlank(message = "key不能为空")
    private String key;

    @ApiModelProperty(value = "小程序获取手机号加密数据")
    private String encryptedData;

    @ApiModelProperty(value = "加密算法的初始向量")
    private String iv;

    @ApiModelProperty(value = "小程序code")
    private String code;
}
