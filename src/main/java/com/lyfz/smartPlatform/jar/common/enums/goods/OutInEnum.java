package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum OutInEnum implements IEnum<Integer> {

    NONE("无", "NONE",0),
    OUT("外景", "OUT",2),
    INT("内景", "INT", 1);
    private String desc;
    private String message;
    private Integer index;

    OutInEnum(String desc, String message, Integer index){
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
    public Integer getValue() {
        return index;
    }
}
