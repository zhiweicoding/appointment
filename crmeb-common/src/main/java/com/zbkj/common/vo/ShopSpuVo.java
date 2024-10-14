package com.zbkj.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

/**
 * 自定义交易组件商品Vo

 */
@Data
public class ShopSpuVo {

    /** 商家自定义商品ID */
    @TableField(value = "out_product_id")
    private String outProductId;

    /** 标题 */
    private String title;

    /** 绑定的小程序商品路径 */
    private String path;

    /** 类主图,多张,列表 */
    @TableField(value = "head_img")
    private List<String> headImg;

    /** 商品详情 */
    @TableField(value = "desc_info")
    private ShopSpuInfoVo descInfo;

    /** 商品审核信息 */
    @TableField(value = "audit_info")
    private ShopSpuAuditVo auditInfo;

    /** 商品线上状态：0-初始值，5-上架，11-自主下架，13-违规下架/风控系统下架 */
    private Integer status;

    /** 商品草稿状态:1-未审核，2-审核中，3-审核失败，4-审核成功 */
    @TableField(value = "edit_status")
    private Integer editStatus;

    /** 第三级类目ID */
    @TableField(value = "third_cat_id")
    private Integer thirdCatId;

    /** 品牌id */
    @TableField(value = "brand_id")
    private Integer brandId;

    /** 预留字段，用于版本控制 */
    @TableField(value = "info_version")
    private Integer infoVersion;

    /** 创建时间 */
    @TableField(value = "create_time")
    private String createTime;

    /** 更新时间 */
    @TableField(value = "update_time")
    private String updateTime;

    /** sku数组 */
    private List<ShopSpuSkuVo> skus;
}
