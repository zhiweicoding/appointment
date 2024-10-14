package com.zbkj.common.vo;

import lombok.Data;

import java.util.List;

/**
 * 第二级类目
 *

 */
@Data
public class SecondCatVo {

    /** 二级类目ID */
    private Integer secondCatId;

    /** 二级类目名称 */
    private String secondCatName;

    /** 三级类目数组 */
    private List<ThirdCatVo> thirdCatList;
}
