package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum ChannelEnum implements IEnum<String> {
    SMS("短信","SMS"),
    WE_CHAT("微信","WE_CHAT"),
    ;

    private String desc;

    private String code;

    ChannelEnum(String desc, String code){
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
    public String getValue() {
        return code;
    }
}
