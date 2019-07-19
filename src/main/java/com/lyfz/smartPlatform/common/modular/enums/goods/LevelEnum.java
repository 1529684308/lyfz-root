package com.lyfz.smartPlatform.common.modular.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum LevelEnum implements IEnum {
    ONE("一级", "ONE",1),
    TWO("二级", "TWO", 2),
    THREE("三级", "THREE", 3);

    private String desc;
    private String message;
    private Integer index;

    LevelEnum(String desc, String message, Integer index){
        this.desc = desc;
        this.message = message;
        this.index = index;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getMessage(){
        return this.message;
    }

    public Integer getIndex() {
        return this.index;
    }

    @Override
    public Serializable getValue() {
        return index;
    }
}
