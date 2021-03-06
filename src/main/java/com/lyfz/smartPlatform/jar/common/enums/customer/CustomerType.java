package com.lyfz.smartPlatform.jar.common.enums.customer;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-06-28
 */
public enum CustomerType implements IEnum<Integer> {

    BABY(1, "宝宝"),
    CONTACT(2, "联系人");

    private Integer index;

    private String text;

    CustomerType(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
