package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum MessageEnum implements IEnum {
    COMMON("公共短信","PUBLIC_MESSAGE"),
    WEDDING_DRESS("婚纱短信","WEDDING_DRESS"),
    BABY("儿童短信", "BABY"),
    PORTRAY("写真照片", "PORTRAY"),
    WEDDING("婚庆短信" ,"WEDDING"),
    SERVICE("服务短信", "SERVICE"),
    HOSPITAL("医院跟踪短信", "HOSPITAL"),
    DRESS("礼服管理短信", "DRESS");

    private String desc;

    private String code;

    MessageEnum(String desc, String code){
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
