package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum BackStatusEnum implements IEnum {

    BACK("已回衣", "BACK"),
    NOT_BACK("未回衣", "NOT_BACK"),
    DAMAGE("已报损", "DAMAGE"),
    ;
    private String desc;
    private String message;


    BackStatusEnum(String desc, String message) {
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
