package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum RefundType implements IEnum<String> {
    DEPOSIT("押金", "DEPOSIT"),
    BROKEN("报损", "BROKEN")
            ;
    private String desc;
    private String message;


    RefundType(String desc, String message) {
        this.desc = desc;
        this.message = message;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getMessage() {
        return this.message;
    }


    @Override
    public String getValue() {
        return message;
    }
}
