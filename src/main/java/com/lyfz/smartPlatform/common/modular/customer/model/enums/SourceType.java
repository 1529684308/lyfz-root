package com.lyfz.smartPlatform.common.modular.customer.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Created by mzh on 2019/6/28.
 */
public enum SourceType implements IEnum<Integer> {
    /**
     * 其他客户
     */
    OTHER_CUSTOMERS(0),
    /**
     * 老客户
     */
    OLD_CUSTOMERS(1),
    /**
     * 朋友介绍的客户
     */
    FRIEND_CUSTOMERS(2),
    /**
     * 资质客户
     */
    QUALIFICATION_CUSTOMERS(3);

    private Integer index;

    SourceType(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
