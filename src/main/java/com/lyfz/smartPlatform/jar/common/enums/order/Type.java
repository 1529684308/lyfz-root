package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Created by mzh on 2019/6/26.
 */
public enum Type implements IEnum<Integer> {

    
    WEDDING_DRESS(1, "婚纱"),
    BABY(2, "儿童"),
    PORTRAY(3, "写真"),
    SERVICE(4, "服务"),
    WEDDING(5, "婚庆");

    private Integer index;

    private String text;

    Type(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}


