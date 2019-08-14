package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum WedMsgEnum implements IEnum {
    WEB_001("客人订单后X分钟", "Mirror_001"),
    WEB_002("服务预约后X分钟", "Mirror_002"),
    WEB_003("服务预约后服务前X天", "Mirror_003"),
    WEB_004("服务完成后X分钟", "Mirror_004"),
    WEB_005("订单件齐后X分钟发送取件通知", "Mirror_005"),
    WEB_006("客人取件后X分钟", "Mirror_006"),
    ;

    private String desc;

    private String code;

    WedMsgEnum(String desc, String code){
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
