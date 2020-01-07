package com.lyfz.smartPlatform.jar.common.enums.customer;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-15
 */
public enum CustomerGroupType implements IEnum<Integer> {

    CUSTOMER_ORDER(1, "订单客户"),
    CUSTOMER_INTENTION(2, "意向客户"),
    CUSTOMER_OTHER(3, "其他客户"),
    ;

    private Integer index;

    private String text;

    CustomerGroupType(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
