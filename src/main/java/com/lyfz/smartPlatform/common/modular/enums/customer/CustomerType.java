package com.lyfz.smartPlatform.common.modular.enums.customer;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-15
 */
public enum CustomerType implements IEnum<Integer> {

    ORDER_CONTACT(0),
    OLD_SYSTEM_CONTACT(1),
    OTHER_CONTACT(2),
    ;


    private  Integer index;

    CustomerType(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
