package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum OrdinaryOrGrowEnum implements IEnum<String> {
    ORDINARY("普通套系", "ORDINARY"),
    GROW("成长套系", "GROW");

    private String desc;
    private String message;

    OrdinaryOrGrowEnum(String desc, String message){
        this.desc = desc;
        this.message = message;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getMessage(){
        return this.message;
    }

    @Override
    public String getValue() {
        return message;
    }
}
