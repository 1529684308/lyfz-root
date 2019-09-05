package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-09-03
 */
public enum ProcessSonType implements IEnum<String> {
    BILLING_ENTRY("BILLING_ENTRY","开单录入员"),
    STORE("STORE","门市"),

    PHOTO_ENTRY("ENTRY","拍照录入员"),
    PHOTOGRAPHY("PHOTOGRAPHY","摄影师"),
    PHOTOGRAPHY_ASSISTANT("PHOTOGRAPHY_ASSISTANT","摄影师助理"),
    MAKEUP_ARTIST("MAKEUP_ARTIST","化妆师助理"),
    MAKEUP_ARTIST_ASSISTANT("MAKEUP_ARTIST_ASSISTANT","化妆师助理"),

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
    ;

    private String description;

    private String code;

    ProcessSonType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getValue() {
        return code;
    }
}
