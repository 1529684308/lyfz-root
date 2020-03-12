package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2020-01-15
 */
public enum SourcePackage implements IEnum<Integer> {
    ASSEMBLY(1, "套系"),
    GIFT(2, "礼包");

    private Integer index;
    private String text;

    SourcePackage(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
