package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-24
 */
public enum OrderType implements IEnum<String> {
    INTENTION("INTENTION","意向订单"),
    COMPLETE("COMPLETE","完成订单")
    ;


    private String code;

    private String description;


    OrderType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getValue() {
        return code;
    }
}
