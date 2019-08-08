package com.lyfz.smartPlatform.common.modular.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum ProductTypeEnum implements IEnum {

    GOODS("商品", "GOODS"),
    PLACE("景点", "PLACE"),
    SERVICE("服务", "SERVICE"),
    GROW("成长", "GROW"),
    BOOK_COUNT("入册", "BOOK_COUNT"),
    BOTTOM_COUNT("入底", "BOTTOM_COUNT"),
    GARMENT_COUNT("服装套数", "GARMENT_COUNT")
    ;

    private String desc;
    private String message;

    ProductTypeEnum(String desc, String message){
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
