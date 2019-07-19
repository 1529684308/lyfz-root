package com.lyfz.smartPlatform.common.modular.enums.account;

/**
 * 常用查询字段
 */
public enum BaseColumnEnum {

    ID("ID", "id"),
    ENTERPRISE_ID("企业ID", "enterprise_id"),
    SHOP_ID("门店ID", "shop_id"),
    USER_ID("用户id", "user_id"),

    ITEM_ID("子订单ID", "item_id"),
    ASSEMBLY_ID("套系ID", "assembly_id");


    private String desc;
    private String code;

    private BaseColumnEnum(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getCode() {
        return this.code;
    }
}
