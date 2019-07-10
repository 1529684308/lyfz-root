package com.lyfz.smartPlatform.common.modular.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Created by mzh on 2019/6/28.
 */
public enum ProductPurchaseType implements IEnum<Integer>{

    /**
     * 套餐订购
     */
    PACKAGE(1),
    /**
     * 礼包订购
     */
    GIFT(2),
    /**
     * 其他订购
     */
    OTHER(3)
    ;

    private Integer index;

    ProductPurchaseType(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
