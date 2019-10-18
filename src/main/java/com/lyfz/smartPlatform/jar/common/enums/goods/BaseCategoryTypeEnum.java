package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum BaseCategoryTypeEnum implements IEnum<String> {
    PLACE("PLACE"),
    GOODS("GOODS"),
    SERVICE("SERVICE"),
    DRESS("DRESS");

    private String message;

    BaseCategoryTypeEnum(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    @Override
    public String getValue() {
        return message;
    }
}
