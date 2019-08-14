package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum DressWashStatusEnum implements IEnum {

    PACK("已整件未送洗", "PACK"),
    NOT_BACK("已送洗未回衣", "NOT_BACK"),
    SOME_BACK("已送洗部分已回", "SOME_BACK"),
    BACK("已清洗并回衣", "BACK"),
    ;
    private String desc;
    private String message;


    DressWashStatusEnum(String desc, String message) {
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
