package com.lyfz.smartPlatform.common.modular.enums.base;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-05
 */
public enum  CategoryType implements IEnum<String> {

    CUSTOMER_REGION("客户区域","PACKAGE"),
    CUSTOMER_SOURCE("客户来源","CUSTOMER_SOURCE"),
    CUSTOMER_LOSE("客户流失原因","CUSTOMER_LOSE"),
    CUSTOMER_INTENTION("客户意向程度","CUSTOMER_INTENTION"),
    CUSTOMER_INTENTION_LOSE("意向客户流失类型","CUSTOMER_INTENTION_LOSE"),
    CUSTOMER_RELATION("客户关系","CUSTOMER_RELATION"),
    CUSTOMER_LEVEL("客户等级","CUSTOMER_LEVEL"),
    CUSTOMER_TYPE("客户类别","CUSTOMER_TYPE"),

    PACKAGE("套系大类","PACKAGE"),
    PACKAGE_GIFT("套系礼包大类","PACKAGE_GIFT"),
    VIP_SERVICE_PACKAGE("会员服务套系大类","VIP_SERVICE_PACKAGE"),
    SHOOT_STAGE("拍摄阶段","SHOOT_STAGE"),
    PLACE_LEVEL("景点等级","PLACE_LEVEL"),
    PLACE_TYPE("景点分类","PLACE_TYPE"),


    DRESS("礼服","DRESS"),
    DRESS_OTHER_TYPE("礼服其他类别","DRESS_OTHER_TYPE"),
    DRESS_SUPPLIER("礼服进货厂家","DRESS_SUPPLIER"),
    DRESS_COLOR("礼服颜色","DRESS_COLOR"),
    DRESS_STYLE("礼服风格","DRESS_STYLE"),
    DRESS_PATTERN("礼服样式","DRESS_PATTERN"),
    DRESS_SLEEVE_LENGTH("礼服袖长","DRESS_SLEEVE_LENGTH"),
    DRESS_SKIRT_LENGTH("礼服裙长","DRESS_SKIRT_LENGTH"),
    DRESS_SIEZ("礼服尺寸","DRESS_SIEZ"),
    DRESS_OTHER("礼服其他","DRESS_OTHER"),

    ORDER_TYPE("订单类别","ORDER_TYPE"),
    HOSPITAL_ORDER("来单医院","HOSPITAL_ORDER"),

    GOODS("商品类别","GOODS"),
    GOODS_UNIT("商品单位","GOODS_UNIT"),


    SECONDARY_SALES("二销类别","SECONDARY_SALES"),
    SECONDARY_SALES_PROJECT("二销项目名称","SECONDARY_SALES_PROJECT"),
    COMMISSION_PLAN("提成方案","COMMISSION_PLAN"),

    PAY_METHOD("支付方式","PAY_METHOD"),
    COST("费用类别","COST"),
    FINANCE_EXPENDITURE("财务支出","FINANCE_EXPENDITURE"),


    WORK_CONTENT("工作内容","WORK_CONTENT"),
    WORK_APPROVAL("工作审批评价","WORK_APPROVAL"),

    SET_UP("摆放区域","SET_UP"),
    IMAGE_COMPRESSION("图片压缩尺寸","IMAGE_COMPRESSION"),
    IMAGE_THEME("相片主题","IMAGE_THEME"),

    COMMUNICATION_TYPE("沟通类型","COMMUNICATION_TYPE"),
    COMMUNICATION_METHOD("沟通方式","COMMUNICATION_METHOD"),
    COMMUNICATION_SITUATION("沟通情况","COMMUNICATION_SITUATION"),


    FEED_METHOD("喂养方式","FEED_METHOD"),
    BUSINESS_TYPE("业务类型","BUSINESS_TYPE"),
    BUSINESS_INTENTION("业务意向","BUSINESS_INTENTION"),

    MATTERS_TYPE("事项类别","MATTERS_TYPE"),
    SPECIFIC_MATTERS("具体事项","SPECIFIC_MATTERS"),
    LEAVE_TYPE("请假类别","LEAVE_TYPE"),

    PICKUP_METHOD("取件方式","PICKUP_METHOD"),

    FIXED_ASSETS("固定资产类别","FIXED_ASSETS"),

    ;




    private String code;

    private String categoryName;

    CategoryType(String categoryName,String code) {
        this.code = code;
        this.categoryName = categoryName;
    }

    @Override
    public String getValue() {
        return code;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
