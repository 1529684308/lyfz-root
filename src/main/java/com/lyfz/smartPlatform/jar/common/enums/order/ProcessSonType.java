package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-09-03
 */
public enum ProcessSonType implements IEnum<String> {
    BILLING_ENTRY("BILLING_ENTRY","开单录入员"),
    BILLING_STORE("BILLING_STORE","接单人"),
    BILLING_SERVICE("BILLING_SERVICE", "专服人员"),
    BILLING_NETWORK_SALES("BILLING_NETWORK_SALES", "网销人员"),


    PHOTO_ENTRY("PHOTO_ENTRY","拍照录入员"),
    PHOTO_GRAPHY("PHOTO_GRAPHY","摄影师"),
    PHOTO_GRAPHY_ASSISTANT("PHOTO_GRAPHY_ASSISTANT","摄影师助理"),
    PHOTO_MAKEUP("PHOTO_MAKEUP","化妆师"),
    PHOTO_MAKEUP_ASSISTANT("PHOTO_MAKEUP_ASSISTANT","化妆师助理"),

    REPAIR_ENTRY("REPAIR_ENTRY","初修录入员"),
    REPAIR_OUTGO("REPAIR_OUTGO","初修外发人员"),

    CHOOSE_ENTRY("REPAIR_ENTRY","选片录入员"),

    REFINE_ENTRY("REFINE_ENTRY","精修录入员"),
    REFINE_OUTGO("REFINE_OUTGO","精修外发人员"),

    DESIGN_ENTRY("DESIGN_ENTRY","设计录入员"),
    DESIGN_OUTGO("DESIGN_OUTGO","设计外发人员"),

    WATCH_ENTRY("WATCH_ENTRY","看版录入员"),

    VIDEO_ENTRY("VIDEO_ENTRY","录像录入员"),

    SERVICE_ENTRY("SERVICE_ENTRY","服务录入员"),

    GOODS_OUT("GOODS_OUT","商品外发录入人员"),

    GOODS_REWORK("GOODS_REWORK","商品返工录入人员"),

    GOODS_COMPLETE("GOODS_COMPLETE","商品完成录入人员"),

    GOODS_TOSHOP("GOODS_TOSHOP","商品到店录入人员"),

    GOODS_PICKUP("GOODS_PICKUP","商品到店录入人员"),

    FINANCE_EARLY_SALE("FINANCE_EARLY_SALE", "前期销售人员"),
    FINANCE_LATE_SALE("FINANCE_LATESALE", "后期销售人员")
    ;


    private String code;

    private String text;

    ProcessSonType(String code, String text) {
        this.code = code;
        this.text = text;
    }

    @Override
    public String getValue() {
        return code;
    }
}
