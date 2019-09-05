package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-08-23
 */
public enum OutgoType implements IEnum<String> {


    REPAIR("REPAIR","初修外发"),
    REFINE("REFINE","精修外发"),
    DESIGN("DESIGN","设计外发"),
    GOODS("GOODS","商品外发"),
    ;


    private String code;

    private String description;

    OutgoType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getValue() {
        return code;
    }
}
