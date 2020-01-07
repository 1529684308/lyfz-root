package com.lyfz.smartPlatform.jar.common.enums.customer;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-15
 */
public enum CustomerGroupStatus implements IEnum<Integer> {
    DEAL(1, "成交"),
    TRACK(2, "跟踪"),
    LOSS(3, "流失");

    private Integer index;

    private String text;

    CustomerGroupStatus(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
