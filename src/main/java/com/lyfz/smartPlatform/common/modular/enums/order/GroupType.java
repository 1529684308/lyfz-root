package com.lyfz.smartPlatform.common.modular.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-06-28
 */
public enum GroupType implements IEnum<Integer> {
    /**
     * 宝宝类型
     */
    BABY(1),
    /**
     * 联系人类型
     */
    CONTACT(2);

    private Integer index;

    GroupType(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
