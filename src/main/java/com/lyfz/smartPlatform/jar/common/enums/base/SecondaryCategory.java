package com.lyfz.smartPlatform.jar.common.enums.base;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-05
 */
public enum SecondaryCategory {
    GOODS_UNIT_BEN("本", CategoryType.GOODS_UNIT, 2),
    GOODS_UNIT_TAO("套", CategoryType.GOODS_UNIT, 2),
    GOODS_UNIT_FU("副", CategoryType.GOODS_UNIT, 2),
    GOODS_UNIT_ZHANG("张", CategoryType.GOODS_UNIT, 2),
    GOODS_UNIT_GE("个", CategoryType.GOODS_UNIT, 2),
    GOODS_UNIT_F("幅", CategoryType.GOODS_UNIT, 2),
    GOODS_UNIT_LIANG("量", CategoryType.GOODS_UNIT, 2),

    PAY_METHOD_CASH("现金", CategoryType.PAY_METHOD, 2),
    PAY_METHOD_POS("POS机刷卡", CategoryType.PAY_METHOD, 2),
    PAY_METHOD_TRANSFER("银行转账", CategoryType.PAY_METHOD, 2),
    PAY_METHOD_WITHHOLDING("储值卡扣款", CategoryType.PAY_METHOD, 2),
    PAY_METHOD_VOLUME("代金券", CategoryType.PAY_METHOD, 2),

    GOODS_SERVICE("服务类别", CategoryType.GOODS, 2),

    SECONDARY_SALES_SELECTION("选片师二销", CategoryType.SECONDARY_SALES, 2),
    SECONDARY_SALES_DOCUMENT_PHOTO("证件照", CategoryType.SECONDARY_SALES, 2),

    CUSTOMER_SOURCE_OLD("老客户", CategoryType.CUSTOMER_SOURCE, 2),
    CUSTOMER_SOURCE_FRIEND("朋友介绍", CategoryType.CUSTOMER_SOURCE, 2),
    CUSTOMER_SOURCE_CAPITAL("客资客户", CategoryType.CUSTOMER_SOURCE, 2),
    CUSTOMER_SOURCE_BABY("爱婴跟踪客户", CategoryType.CUSTOMER_SOURCE, 2),

    PACKAGE_ACTIVITY("活动套系", CategoryType.PACKAGE, 2),

    COMMUNICATION_TYPE_PROCESS_CONTROL("流程把控", CategoryType.COMMUNICATION_TYPE, 2),
    COMMUNICATION_TYPE_BUSINESS_CONSULTING("业务咨询", CategoryType.COMMUNICATION_TYPE, 2),
    COMMUNICATION_TYPE_EVALUATION_SURVEY("满意度调查", CategoryType.COMMUNICATION_TYPE, 2),
    COMMUNICATION_TYPE_INTENTION_TRACKING("意向跟踪", CategoryType.COMMUNICATION_TYPE, 2),
    COMMUNICATION_TYPE_RELATIONSHIP_MAINTENANCE("关系维护", CategoryType.COMMUNICATION_TYPE, 2),
    COMMUNICATION_TYPE_PHOTO_CONTROL("摄控安排", CategoryType.COMMUNICATION_TYPE, 2),
    COMMUNICATION_TYPE_COMMUNICATION_ASSISTANT("沟通助手", CategoryType.COMMUNICATION_TYPE, 2),
    COMMUNICATION_TYPE8_ORDER_COMMUNICATION("订单沟通", CategoryType.COMMUNICATION_TYPE, 2),


    IMAGE_COMPRESSION_800X800("800x800", CategoryType.IMAGE_COMPRESSION, 2),
    IMAGE_COMPRESSION_800X900("800x900", CategoryType.IMAGE_COMPRESSION, 2),

    ;


    private String categoryName;

    private CategoryType categoryType;

    private Integer level;

    SecondaryCategory(String categoryName, CategoryType categoryType, Integer level) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.level = level;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Integer getLevel() {
        return level;
    }
}
