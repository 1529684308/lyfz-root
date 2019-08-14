package com.lyfz.smartPlatform.jar.common.enums.customer;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-15
 */
public enum ContactStatus implements IEnum<Integer> {
    NORMAL(1),
    TRACK(2),
    LOSS(3);


    private Integer index;

    ContactStatus(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
