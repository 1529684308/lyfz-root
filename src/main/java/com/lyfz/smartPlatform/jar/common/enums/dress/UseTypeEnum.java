package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum  UseTypeEnum implements IEnum<String> {
    RENT("单租", "RENT"),
    PHOTOGRAPH("拍照", "PHOTOGRAPH"),
    ENGAGEMENT("订婚", "ENGAGEMENT"),
    MARRY("结婚", "MARRY")
    ;
    private String desc;
    private String message;


    UseTypeEnum(String desc, String message) {
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
