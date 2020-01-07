package com.lyfz.smartPlatform.jar.common.enums.customer;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-12-06
 */
public enum CustomerOriginType implements IEnum<Integer> {

    ORIGIN_INTRODUCE(1, "转介绍"),
    ORIGIN_CUSTOMER(2, "客资客户"),
    ORIGIN_BABY(3, "爱婴跟踪客户"),
    ORIGIN_OTHER(4, "其他"),
            ;

    private Integer index;

    private String text;

    CustomerOriginType(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return this.index;
    }
}
