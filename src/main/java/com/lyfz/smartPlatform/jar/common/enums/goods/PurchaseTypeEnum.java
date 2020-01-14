package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;


public enum PurchaseTypeEnum implements IEnum {
    PHOTOGRAPH("拍照订单", "PHOTOGRAPH",1),
    PURCHASE("采购订单", "PURCHASE",2),
    ALLOT("调拨订单", "ALLOT", 3),
    OTHER("其他", "OTHER", 0)
    ;
    private String desc;
    private String message;
    private Integer index;

    PurchaseTypeEnum(String desc, String message, Integer index){
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
