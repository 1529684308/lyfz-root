package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-09-12
 */
public enum ConsumeType implements IEnum<String> {
    ORDER("ORDER","订单消费"),
    GOODS("GOODS","商品消费"),
    OTHER("OTHER", "散客消费")
    ;

    private String code;

    private String text;


    ConsumeType(String code, String text) {
        this.code = code;
        this.text = text;
    }


    @Override
    public String getValue() {
        return code;
    }
}
