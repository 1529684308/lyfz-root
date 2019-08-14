package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum WedDressesMsgEnum implements IEnum {
    WD_001("客人订单后X分钟","WD_001"),
    WD_002("拍照预约后X分钟","WD_002"),
    WD_003("拍照预约后拍照前X天","WD_003"),
    WD_004("拍照完成后X分钟","WD_004"),
    WD_005("服务预约后X分钟","WD_005"),
    WD_006("服务预约后服务前X天","WD_006"),
    WD_007("服务完成后X分钟","WD_007"),
    WD_008("客人预约选片后X分钟","WD_008"),
    WD_009("选片预约后选片前X天","WD_009"),
    WD_010("客人选片完成后X分钟","WD_010"),
    WD_011("看样预约后看样前X天","WD_011"),
    WD_012("客人看样后X分钟","WD_012"),
    WD_013("订单件齐后X分钟发送取件通知","WD_013"),
    WD_014("客人取件后X分钟","WD_014"),
    WD_015("客人婚礼前X天","WD_015"),
    WD_016("结婚纪念日前X天","WD_016"),
    WD_017("男宾生日前X天发短信给女宾","WD_017"),
    WD_018("女宾生日前X天发短信给男宾","WD_018"),
    ;
    private String desc;

    private String code;

    WedDressesMsgEnum(String desc, String code){
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
