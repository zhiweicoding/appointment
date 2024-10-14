package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serial;
import java.io.Serializable;

/**
 * 用户分组表

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_user_group")
@ApiModel(value="UserGroup对象", description="用户分组表")
public class UserGroupRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= 4922374993327408870L;

    @ApiModelProperty(value = "用户分组名称")
    @NotBlank(message = "请填写分组名称")
    @Size(max = 64, message = "用户分组名称不能超过64个字符")
    private String groupName;

}
