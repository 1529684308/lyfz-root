package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum CheckStatusEnum implements IEnum<Integer> {
    NONE("未验收", "NONE", 0),
    SOME_CHECK("部分验收", "SOME_CHECK", 1),
    FINISH("验收完成", "FINISH", 2),
    ;

    private String desc;
    private String code;
    private Integer index;

    CheckStatusEnum(String desc, String code, Integer index) {
        this.desc = desc;
        this.code = code;
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
