package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-24
 */
public enum OrderStatus implements IEnum<Integer> {
    INTENTION_ORDER(1,"意向订单"),
    COMPLETE_ORDER(2,"完成订单")
    ;


    private Integer index;

    private String description;


    OrderStatus(Integer index, String description) {
        this.index = index;
        this.description = description;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
