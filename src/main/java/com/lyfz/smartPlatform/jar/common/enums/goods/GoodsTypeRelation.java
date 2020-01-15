package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-12-16
 */

public enum GoodsTypeRelation implements IEnum<Integer>{
    ASSEMBLY(1, "套系"),
    GIFT(2, "礼包"),
    PLACE(3, "景点");

    private Integer index;
    private String text;

    GoodsTypeRelation(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
