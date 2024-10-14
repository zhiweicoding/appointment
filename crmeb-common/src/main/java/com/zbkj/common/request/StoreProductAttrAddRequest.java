package com.zbkj.common.request;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 商品属性添加对象

 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StoreProductAttrAddRequest对象", description="商品属性添加对象")
public class StoreProductAttrAddRequest implements Serializable {

    @Serial
    private static final long serialVersionUID= 6869930204567165738L;

    @ApiModelProperty(value = "attrID|新增时不填，修改时必填")
    private Integer id;

    @ApiModelProperty(value = "属性名", required = true)
    private String attrName;

    @ApiModelProperty(value = "属性值|逗号分隔", required = true)
    private String attrValues;
}
