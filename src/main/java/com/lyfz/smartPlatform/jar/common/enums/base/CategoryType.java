package com.lyfz.smartPlatform.jar.common.enums.base;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-05
 */
public enum CategoryType implements IEnum<String> {

    CUSTOMER_REGION("客户区域", "CUSTOMER_REGION",1),
    CUSTOMER_SOURCE("客户来源", "CUSTOMER_SOURCE",1),
    CUSTOMER_LOSE("客户流失原因", "CUSTOMER_LOSE",1),
    CUSTOMER_INTENTION("客户意向程度", "CUSTOMER_INTENTION",1),
    CUSTOMER_INTENTION_LOSE("意向客户流失类型", "CUSTOMER_INTENTION_LOSE",1),
    CUSTOMER_RELATION("客户关系", "CUSTOMER_RELATION",1),
    CUSTOMER_LEVEL("客户等级", "CUSTOMER_LEVEL",1),
    CUSTOMER_TYPE("客户类别", "CUSTOMER_TYPE",1),

    PACKAGE("套系大类", "PACKAGE",1),
    PACKAGE_GIFT("套系礼包大类", "PACKAGE_GIFT",1),
    VIP_SERVICE_PACKAGE("会员服务套系大类", "VIP_SERVICE_PACKAGE",1),
    SHOOT_STAGE("拍摄阶段", "SHOOT_STAGE",1),



    DRESS("礼服", "DRESS",1),
    DRESS_OTHER_TYPE("礼服其他类别", "DRESS_OTHER_TYPE",1),
    DRESS_SUPPLIER("礼服进货厂家", "DRESS_SUPPLIER",1),
    DRESS_COLOR("礼服颜色", "DRESS_COLOR",1),
    DRESS_STYLE("礼服风格", "DRESS_STYLE",1),
    DRESS_PATTERN("礼服样式", "DRESS_PATTERN",1),
    DRESS_SLEEVE_LENGTH("礼服袖长", "DRESS_SLEEVE_LENGTH",1),
    DRESS_SKIRT_LENGTH("礼服裙长", "DRESS_SKIRT_LENGTH",1),
    DRESS_SIEZ("礼服尺寸", "DRESS_SIEZ",1),
    DRESS_OTHER("礼服其他", "DRESS_OTHER",1),

    ORDER_TYPE("订单类别", "ORDER_TYPE",1),
    HOSPITAL_ORDER("来单医院", "HOSPITAL_ORDER",1),

    GOODS("商品类别", "GOODS",1),
    GOODS_UNIT("商品单位", "GOODS_UNIT",1),


    SECONDARY_SALES("二销类别", "SECONDARY_SALES",1),
    SECONDARY_SALES_PROJECT("二销项目名称", "SECONDARY_SALES_PROJECT",1),
    COMMISSION_PLAN("提成方案", "COMMISSION_PLAN",1),

    PAY_METHOD("支付方式", "PAY_METHOD",1),
    COST("费用类别", "COST",1),
    FINANCE_EXPENDITURE("财务支出", "FINANCE_EXPENDITURE",1),


    WORK_CONTENT("工作内容", "WORK_CONTENT",1),
    WORK_APPROVAL("工作审批评价", "WORK_APPROVAL",1),

    SET_UP("摆放区域", "SET_UP",1),
    IMAGE_COMPRESSION("图片压缩尺寸", "IMAGE_COMPRESSION",1),
    IMAGE_THEME("相片主题", "IMAGE_THEME",1),

    COMMUNICATION_TYPE("沟通类型", "COMMUNICATION_TYPE",1),
    COMMUNICATION_METHOD("沟通方式", "COMMUNICATION_METHOD",1),
    COMMUNICATION_SITUATION("沟通情况", "COMMUNICATION_SITUATION",1),


    FEED_METHOD("喂养方式", "FEED_METHOD",1),
    BUSINESS_TYPE("业务类型", "BUSINESS_TYPE",1),
    BUSINESS_INTENTION("业务意向", "BUSINESS_INTENTION",1),

    MATTERS_TYPE("事项类别", "MATTERS_TYPE",1),
    SPECIFIC_MATTERS("具体事项", "SPECIFIC_MATTERS",1),
    LEAVE_TYPE("请假类别", "LEAVE_TYPE",1),

    PICKUP_METHOD("取件方式", "PICKUP_METHOD",1),

    FIXED_ASSETS("固定资产类别", "FIXED_ASSETS",1),



    DEPARTMENT("部门", "DEPARTMENT",1),

    POST("职位", "POST",1),

    SERVICES("服务", "SERVICES",1),

    PLACE("景点", "PLACE",1),

    DRESS_INFO_LEVEL("服装等级", "DRESS_INFO_LEVEL",1),
    RELATION("与主客户关系", "RELATION", 1)
    ;


    private String code;

    private String categoryName;

    private Integer level;

    CategoryType(String categoryName, String code, Integer level) {
        this.code = code;
        this.categoryName = categoryName;
        this.level = level;
    }

    @Override
    public String getValue() {
        return code;
    }

    public Integer getLevel() {
        return level;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
