package com.lyfz.smartPlatform.jar.common.enums.goods;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum ApplyStatusEnum implements IEnum<Integer> {
    APPLY("申请中", "APPLY", 1),
    BUY("采购中", "BUY", 2),
    FINISH("采购完成", "FINISH", 0);

    private String desc;
    private String code;
    private Integer index;

    ApplyStatusEnum(String desc, String code, Integer index) {
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
