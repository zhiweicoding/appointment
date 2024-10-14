package com.zbkj.common.vo;

import lombok.Data;

/**
 * 上传类目资质 itemData

 */
@Data
public class ShopAuditCategoryRequestItemDataVo {
        private Integer level1; // 一级类目
        private Integer level2; // 二级类目
        private Integer level3; // 三级类目
        private String certificate; // 资质材料
}
