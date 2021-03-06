package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum OrderTypeEnum implements IEnum<String> {

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
    public String getValue() {
        return message;
    }
}
