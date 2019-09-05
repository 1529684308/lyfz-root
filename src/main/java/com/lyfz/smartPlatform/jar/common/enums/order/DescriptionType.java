package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-08-28
 */
public enum DescriptionType implements IEnum<String> {


    ORDER("ORDER","订单备注"),
    WATCH("WATCH","看版备注"),
    GOODS_PROCESS("ORDER","返工备注"),
    REWORK("REWORK","返工备注"),
            ;


    private String code;

    private String description;

    DescriptionType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getValue() {
        return code;
    }
}
