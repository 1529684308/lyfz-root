package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Created by mzh on 2019/6/28.
 */
public enum SourceProducts implements IEnum<Integer> {

    ASSEMBLY(1, "套系"),
    GIFT(2, "礼包"),
    ADD(3, "加挑");

    private Integer index;
    private String text;

    SourceProducts(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
