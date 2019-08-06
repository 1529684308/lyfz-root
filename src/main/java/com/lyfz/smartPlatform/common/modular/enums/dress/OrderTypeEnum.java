package com.lyfz.smartPlatform.common.modular.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum OrderTypeEnum implements IEnum {

    SALE("出售", "SALE"),
    RENT("出租", "RENT"),
    ;
    private String desc;
    private String message;


    OrderTypeEnum(String desc, String message) {
        this.desc = desc;
        this.message = message;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getMessage() {
        return this.message;
    }


    @Override
    public Serializable getValue() {
        return message;
    }
}
