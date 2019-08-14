package com.lyfz.smartPlatform.jar.common.enums.account;

/**
 * 操作状态
 */
public enum OperationEnum {

    ADD("新增", 0),
    UPDATE("更新", 1),
    DELETE("删除", 2);

    private String desc;
    private Integer code;

    private OperationEnum(String desc, Integer code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    public Integer getCode() {
        return this.code;
    }
}
