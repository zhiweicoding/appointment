package com.zbkj.common.request;

import com.zbkj.common.constants.RegularConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import jakarta.validation.constraints.Size;

import jakarta.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 门店自提

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SystemStoreRequest对象", description="提货点")
public class SystemStoreRequest implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "门店名称")
    @NotBlank(message = "请填写门店名称")
    @Size(max = 100, message = "门店名称不能超过100个字符")
    private String name;

    @ApiModelProperty(value = "简介")
    private String introduction;

    @ApiModelProperty(value = "手机号码")
    @Pattern(regexp = RegularConstants.PHONE_TWO, message = "手机号码格式错误")
    private String phone;

    @ApiModelProperty(value = "提货点地址省市区")
    @NotBlank(message = "提货点地址")
    @Size(max = 255, message = "提货点地址不能超过255个字符")
    private String address;

    @ApiModelProperty(value = "详细地址")
    @NotBlank(message = "请填写详细地址")
    @Size(max = 255, message = "详细地址不能超过255个字符")
    private String detailedAddress;

    @ApiModelProperty(value = "每日营业开关时间")
    private String dayTime;

    @ApiModelProperty(value = "门店logo")
    @NotBlank(message = "请上传门店logo")
    @Size(max = 255, message = "门店logo不能超过255个字符")
    private String image;

    @ApiModelProperty(value = "纬度")
    @NotBlank(message = "请选择经纬度")
    private String latitude;

    @ApiModelProperty(value = "经度", example = "1,2")
    private String longitude;

    @ApiModelProperty(value = "核销有效日期")
    private String validTime;
}
