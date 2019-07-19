package com.lyfz.smartPlatform.common.modular.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum ServiceMsgEnum implements IEnum {
    SERVICE_001("客人订单后X分钟", "SERVICE_001"),
    SERVICE_002("服务预约后X分钟", "SERVICE_002"),
    SERVICE_003("服务预约后服务前X天", "SERVICE_003"),
    SERVICE_004("服务完成后X分钟", "SERVICE_004"),
    SERVICE_005("订单件齐后X分钟发送取件通知", "SERVICE_005"),
    SERVICE_006("客人取件后X分钟", "SERVICE_006"),
    ;

    private String desc;

    private String code;

    ServiceMsgEnum(String desc, String code){
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }

    @Override
    public Serializable getValue() {
        return code;
    }
}
