package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum GatherEnum implements IEnum {

    ORDER("礼服租金", "ORDER"),
    DEPOSIT("礼服押金", "DEPOSIT"),
    OTHER("其他消费", "OTHER"),
    REFUND("退款", "REFUND")
    ;
    private String desc;
    private String message;


    GatherEnum(String desc, String message) {
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
    } {}
}
