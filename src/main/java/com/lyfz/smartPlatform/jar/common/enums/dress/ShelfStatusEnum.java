package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum ShelfStatusEnum implements IEnum {
    TRUE("上架", "TRUE",true),
    FALSE("下架", "FALSE", false);

    private String desc;
    private String message;
    private Boolean index;

    ShelfStatusEnum(String desc, String message, Boolean index){
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

    public Boolean getIndex() {
        return this.index;
    }

    @Override
    public Serializable getValue() {
        return index;
    }
}
