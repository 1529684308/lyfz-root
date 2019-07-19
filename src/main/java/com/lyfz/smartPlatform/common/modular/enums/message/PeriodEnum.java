package com.lyfz.smartPlatform.common.modular.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

/**
 * 周期
 */
public enum PeriodEnum implements IEnum {
    P_001("一年内一次","P_001"),
    P_002("一月内一次","P_002"),
    P_003("一天内一次","P_003"),
    ;

    private String desc;
    private String code;

    PeriodEnum(String desc, String code){
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }

    @Override
    public Serializable getValue() {
        return code;
    }
}
