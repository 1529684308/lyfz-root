package com.lyfz.smartPlatform.jar.common.enums.dress;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum ActorPositionEnum implements IEnum<String> {
    RECEIVE("接单人员", "RECEIVE"),
    PLAN_CHOICE("预约选衣人", "PLAN_CHOICE"),
    FETCH("取衣人", "FETCH"),
    CHOICE("选衣人", "CHOICE"),
    PACK("整件人", "PACK"),
    SALESMAN("销售人", "SALESMAN"),
    ;
    private String desc;
    private String message;


    ActorPositionEnum(String desc, String message) {
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
