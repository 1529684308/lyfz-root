package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-09-12
 */
public enum OrderType implements IEnum<String> {
    PROCESS("PROCESS","流程订单"),
    GOODS("GOODS","商品订单")
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
