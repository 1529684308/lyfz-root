package com.lyfz.smartPlatform.common.modular.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum ChildMsgEnum implements IEnum {
    CHILD_001("客人订单后X分钟","CHILD_001"),
    CHILD_002("拍照预约后X分钟","CHILD_002"),
    CHILD_003("拍照预约后拍照前X天","CHILD_003"),
    CHILD_004("拍照完成后X分钟","CHILD_004"),
    CHILD_005("服务预约后X分钟","CHILD_005"),
    CHILD_006("服务预约后服务前X天","CHILD_006"),
    CHILD_007("服务完成后X分钟","CHILD_007"),
    CHILD_008("客人预约选片后X分钟","CHILD_008"),
    CHILD_009("选片预约后选片前X天","CHILD_009"),
    CHILD_010("客人选片完成后X分钟","CHILD_010"),
    CHILD_011("客人预约看样后X分钟","CHILD_011"),
    CHILD_012("看样预约后看样前X天","CHILD_012"),
    CHILD_013("客人看样后X分钟","CHILD_013"),
    CHILD_014("订单件齐后X分钟发送取件通知","CHILD_014"),
    CHILD_015("客人取件后X分钟","CHILD_015"),
    CHILD_016("宝宝生日前X天","CHILD_016"),
    CHILD_017("宝宝X天成长跟踪短信","CHILD_017"),
    CHILD_018("宝宝X岁前X天成长跟踪短信","CHILD_018"),
    CHILD_019("家长生日前X天","CHILD_019"),
    CHILD_020("宝宝生日前X天且X岁以下","CHILD_020"),
    ;

    private String desc;

    private String code;

    ChildMsgEnum(String desc, String code){
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
        return null;
    }
}
