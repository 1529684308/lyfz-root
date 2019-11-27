package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;


public enum PickupStatus implements IEnum<Integer> {


    NOT_PICKUP(0, "未取件"),
    SOME_PICKUP(1, "部分取件"),
    PICKUP(2, "取件OK")
    ;

    private Integer index;

    private String description;


    PickupStatus(Integer index, String description) {
        this.index = index;
        this.description = description;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
