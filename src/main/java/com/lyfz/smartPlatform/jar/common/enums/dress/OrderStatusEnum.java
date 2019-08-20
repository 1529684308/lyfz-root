package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum OrderStatusEnum implements IEnum {

    WAIT_CHOOSE("待选衣", "WAIT_CHOOSE"),
    CHOOSE("已选衣", "CHOOSE"),
    PACK("已整件", "PACK"),
    FETCH("已取衣", "FETCH"),
    BACK("已回衣", "BACK"),
    NOT_BACK("未回衣", "NOT_BACK"),
    SOME_BACK("部分回衣", "SOME_BACK"),
    ;
    private String desc;
    private String message;


    OrderStatusEnum(String desc, String message) {
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
