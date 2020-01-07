package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-19
 */

public enum ProcessType implements IEnum<String> {
    BILLING("BILLING","开单"),
    PHOTO("PHOTO","拍照"),
    REPAIR("REPAIR","初修"),
    CHOOSE("CHOOSE","选片"),
    REFINE("REFINE","精修"),
    DESIGN("DESIGN","设计"),
    WATCH("WATCH","看版"),
    PICKUP("PICKUP","取件"),
    VIDEO("VIDEO","录像"),
    SERVICE("SERVICE","服务"),
    FINANCE("FINANCE", "财务")
    ;


    private String description;

    private String code;

    ProcessType(String code, String description) {
        this.code = code;
        this.description = description;
    }


    @Override
    public String getValue() {
        return code;
    }
}
