package com.lyfz.smartPlatform.common.modular.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum ProductType implements IEnum {

    GOODS("商品", "GOODS"),
    PLACE("景点", "PLACE"),
    SERVICE("服务", "SERVICE"),
    GROW("成长", "GROW");

    private String desc;
    private String message;

    ProductType(String desc, String message){
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
    public Serializable getValue() {
        return message;
    }
}
