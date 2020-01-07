package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum SendStatusEnum implements IEnum<String> {
//    发送状态 -1发送失败 0等待发送 1发送成功 2短信超时忽略发送 3当前账号错误
    FAIL("发送失败","FAIL"),
    WAIT("等待发送","WAIT"),
    SUCCESS("发送成功","SUCCESS"),
    TIME_OUT("短信超时忽略发送","TIME_OUT"),
    ERROR("当前账号错误","ERROR"),
    ;

    private String desc;

    private String code;

    SendStatusEnum(String desc, String code){
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
    public String getValue() {
        return code;
    }
}
