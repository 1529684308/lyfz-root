package com.lyfz.smartPlatform.common.modular.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-19
 */
public enum Position implements IEnum<String> {
    RECEIVER("接单","RECEIVER");


    private String description;

    private String code;

    Position(String description, String code) {
        this.description = description;
        this.code = code;
    }

    @Override
    public String getValue() {
        return code;
    }
}
