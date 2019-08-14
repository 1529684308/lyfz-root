package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum MirrorMsgEnum implements IEnum {
    Mirror_001("客人订单后X分钟", "Mirror_001"),
    Mirror_002("拍照预约后X分钟", "Mirror_002"),
    Mirror_003("拍照预约后拍照前X天", "Mirror_003"),
    Mirror_004("拍照完成后X分钟", "Mirror_004"),
    Mirror_005("服务预约后X分钟", "Mirror_005"),
    Mirror_006("服务预约后服务前X天", "Mirror_006"),
    Mirror_007("服务完成后X分钟", "Mirror_007"),
    Mirror_008("客人预约选片后X分钟", "Mirror_008"),
    Mirror_009("选片预约后选片前X天", "Mirror_009"),
    Mirror_010("客人选片完成后X分钟", "Mirror_010"),
    Mirror_011("客人预约看样后X分钟", "Mirror_011"),
    Mirror_012("看样预约后看样前X天", "Mirror_012"),
    Mirror_013("客人看样后X分钟", "Mirror_013"),
    Mirror_014("订单件齐后X分钟发送取件通知", "Mirror_014"),
    Mirror_015("客人取件后X分钟", "Mirror_015"),
    ;

    private String desc;

    private String code;

    MirrorMsgEnum(String desc, String code){
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
