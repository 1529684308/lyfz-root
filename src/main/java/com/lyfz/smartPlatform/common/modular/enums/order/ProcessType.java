package com.lyfz.smartPlatform.common.modular.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-19
 */

public enum ProcessType implements IEnum<String> {
    BILLING("开单","BILLING");


    private String description;

    private String code;

    ProcessType(String description, String code) {
        this.description = description;
        this.code = code;
    }


    @Override
    public String getValue() {
        return code;
    }
}
