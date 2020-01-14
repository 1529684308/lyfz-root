package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum AuditStatusEnum implements IEnum<Integer> {

    AUDITING("审核中", "AUDITING", 0),
    PASS("通过", "PASS", 1),
    NO_PASS("未通过", "NO_PASS", 2),
    ;

    private String desc;
    private String code;
    private Integer index;

    AuditStatusEnum(String desc, String code, Integer index) {
        this.desc = desc;
        this.code = code;
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }

    public Integer getIndex() {
        return index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
