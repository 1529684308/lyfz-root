package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-09-12
 */
public enum BillEntryType implements IEnum<String> {
    EARLY("EARLY","前期"),
    LATE("LATE","后期"),
    ;


    private String code;

    private String description;

    BillEntryType(String code, String description) {
        this.code = code;
        this.description = description;
    }
    @Override
    public String getValue() {
        return code;
    }
}
