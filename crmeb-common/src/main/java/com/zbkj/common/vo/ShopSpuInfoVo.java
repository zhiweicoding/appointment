package com.zbkj.common.vo;

import lombok.Data;

import java.util.List;

/**
 *  自定义交易组件商品详情Vo

 */
@Data
public class ShopSpuInfoVo {

    /** 商品详情图文 */
    private String desc;

    /** 商品详情图片 */
    private List<String> imgs;

}
