package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum DressCategoryEnum implements IEnum {

    COLOR("颜色","COLOR"),
    TYPE("礼服类别","TYPE"),
    AREA("摆放区域","AREA"),
    STYLE("风格","STYLE"),
    VARIETY("样式","VARIETY"),
    SLEEVE("袖长","SLEEVE"),
    SKIRT("裙长","SKIRT"),
    SIZE("礼服尺寸","SIZE"),
    OTHER("其他","OTHER"),
    ;
    private String desc;
    private String message;


    DressCategoryEnum(String desc, String message) {
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
