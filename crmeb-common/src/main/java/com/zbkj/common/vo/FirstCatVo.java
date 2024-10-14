package com.zbkj.common.vo;

import lombok.Data;

import java.util.List;

/**
 * 第一级类目

 */
@Data
public class FirstCatVo {

    /** 一级类目ID */
    private Integer firstCatId;

    /** 一级类目名称 */
    private String firstCatName;

    /** 二级类目数组 */
    private List<SecondCatVo> secondCatList;

}
