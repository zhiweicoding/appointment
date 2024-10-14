package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 优惠卷表

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_store_coupon")
@ApiModel(value="StoreCouponRequest对象", description="优惠券表")
public class StoreCouponRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= 4931778676123737425L;

    @ApiModelProperty(value = "优惠券名称", required = true)
    @NotBlank(message = "请填写优惠券名称")
    @Size(max = 64, message = "优惠券名称长度不能超过64个字符")
    private String name;

    @ApiModelProperty(value = "兑换的优惠券面值", required = true)
    @NotNull(message = "请填写优惠券兑换的优惠券面值")
    @DecimalMax(value = "99999.99", message = "优惠券面值不能大于99999.99")
    private BigDecimal money;

    @ApiModelProperty(value = "是否限量, 默认0 否， 1是", required = true)
    @NotNull(message = "请设置是否限量")
    private Boolean isLimited;

    @ApiModelProperty(value = "发放总数")
    private Integer total;

    @ApiModelProperty(value = "使用类型 1 全场通用, 2 商品券, 3 品类券")
    @Size(min = 1, max = 3, message = "请选择优惠券使用类型")
    private Integer useType;

    @ApiModelProperty(value = "主键id 商品id/分类id", required = true)
    private String primaryKey;

    @ApiModelProperty(value = "最低消费，0代表不限制", required = true)
    private BigDecimal minPrice;

    @ApiModelProperty(value = "是否固定领取时间， 默认0 否， 1是", required = true)
    @NotNull(message = "请选择领取是否限时")
    private Boolean isForever;

    @ApiModelProperty(value = "可领取开始时间")
    private Date receiveStartTime;

    @ApiModelProperty(value = "可领取结束时间")
    private Date receiveEndTime;

    @ApiModelProperty(value = "请设置是否固定使用时间, 默认0 否， 1是", required = true)
    @NotNull(message = "请设置是否固定使用时间")
    private Boolean isFixedTime;

    @ApiModelProperty(value = "可使用时间范围 开始时间")
    private Date useStartTime;

    @ApiModelProperty(value = "可使用时间范围 结束时间")
    private Date useEndTime;

    @ApiModelProperty(value = "天数")
    @Max(value = 999, message = "天数不能超过999天")
    private Integer day;

    @ApiModelProperty(value = "优惠券类型 1 手动领取, 2 新人券, 3 赠送券")
    @Size(min = 1, max = 3, message = "请选择优惠券领取方式")
    private Integer type;

    @ApiModelProperty(value = "排序")
    @NotNull(message = "排序不能为空")
    @Min(value = 0, message = "排序不能小于0")
    private Integer sort;

    @ApiModelProperty(value = "状态（0：关闭，1：开启）")
    @NotNull(message = "优惠券状态不能为空")
    private Boolean status;
}
