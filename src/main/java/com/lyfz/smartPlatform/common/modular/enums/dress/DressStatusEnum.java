package com.lyfz.smartPlatform.common.modular.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum DressStatusEnum implements IEnum {
    NORMAL("正常", "NORMAL"),
    SOLD("已销售", "SOLD"),
    SCRAP("已报废", "SCRAP");
    private String desc;
    private String message;


    DressStatusEnum(String desc, String message) {
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