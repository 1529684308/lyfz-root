package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum MessageCodeEnum implements IEnum {
    TEM_SMS_2("客人生日前D天","TEM_SMS_2"),
    TEM_SMS_3("客片上传完成后M分钟发通知短信","TEM_SMS_3"),
    TEM_SMS_4("客户云选片完成后发通知短信","TEM_SMS_4"),
    TEM_SMS_5("客户云看样完成后发通知短信","TEM_SMS_5"),
    TEM_SMS_6("当积分接近X的百分之80时","TEM_SMS_6"),
    TEM_SMS_7("当积分达到或超过X分时","TEM_SMS_7"),
    TEM_SMS_8("转介绍后M分钟发送短信给介绍人","TEM_SMS_8"),
    TEM_SMS_9("发放会员卡后M分钟发会员短信","TEM_SMS_9"),
    TEM_SMS_10("积分兑换后M分钟发提醒短信","TEM_SMS_10"),
    TEM_SMS_11("现金卡消费后M分钟后发提醒短信","TEM_SMS_11"),
    TEM_SMS_12("现金卡充值后M分钟后发提醒短信","TEM_SMS_12"),
    TEM_SMS_13("员工生日前D天","TEM_SMS_13"),
    TEM_SMS_14("每天D时M分发送财务短信到X手机","TEM_SMS_14"),
    TEM_SMS_15("客户来电挂机后M分钟","TEM_SMS_15"),
    TEM_SMS_16("未知来电挂机后M分钟","TEM_SMS_16"),
    TEM_SMS_17("员工来电挂机后M分钟","TEM_SMS_17"),
    TEM_SMS_18("员工生日前M天发送短信给X手机号","TEM_SMS_18"),
    TEM_SMS_19("会员积分变动后M分钟","TEM_SMS_19"),
    TEM_SMS_20("删除会员后M分钟","TEM_SMS_20"),
    TEM_SMS_21("注消会员后M分钟","TEM_SMS_21"),
    TEM_SMS_22("修改会员支付密码后M分钟","TEM_SMS_22"),
    TEM_SMS_23("会员服务卡使用后M分钟","TEM_SMS_23"),
    TEM_SMS_24("会员积分有效期到期前D天","TEM_SMS_24"),
    TEM_SMS_25("会员储值有效期到期前D天","TEM_SMS_25"),
    TEM_SMS_26("会员服务套餐有效期到期前D天","TEM_SMS_26"),
    TEM_SMS_27("会员新摄会有效期到期前D天","TEM_SMS_27"),
    TEM_SMS_28("会员返现卡有效期到期前D天","TEM_SMS_28"),
    TEM_SMS_29("会员返现卡提现后M分钟","TEM_SMS_29"),
    TEM_SMS_30("会员返现卡获得返现金后M分钟","TEM_SMS_30"),
    TEM_SMS_31("支付成功后M分钟发提醒消息","TEM_SMS_31"),

    TEM_SMS_32("客人订单后M分钟","TEM_SMS_32"),
    TEM_SMS_33("拍照预约后M分钟","TEM_SMS_33"),
    TEM_SMS_34("拍照预约后拍照前D天","TEM_SMS_34"),
    TEM_SMS_35("拍照完成后M分钟","TEM_SMS_35"),
    TEM_SMS_36("服务预约后M分钟","TEM_SMS_36"),
    TEM_SMS_37("服务预约后服务前D天","TEM_SMS_37"),
    TEM_SMS_38("服务完成后M分钟","TEM_SMS_38"),
    TEM_SMS_39("客人预约选片后M分钟","TEM_SMS_39"),
    TEM_SMS_40("选片预约后选片前D天","TEM_SMS_40"),
    TEM_SMS_41("客人选片完成后M分钟","TEM_SMS_41"),
    TEM_SMS_42("客人预约看样后M分钟","TEM_SMS_42"),
    TEM_SMS_43("看样预约后看样前D天","TEM_SMS_43"),
    TEM_SMS_44("客人看样后M分钟","TEM_SMS_44"),
    TEM_SMS_45("订单件齐后M分钟发送取件通知","TEM_SMS_45"),
    TEM_SMS_46("客人取件后M分钟","TEM_SMS_46"),
    TEM_SMS_47("客人婚礼前D天","TEM_SMS_47"),
    TEM_SMS_48("结婚纪念日前D天","TEM_SMS_48"),
    TEM_SMS_49("男宾生日前D天发短信给女宾","TEM_SMS_49"),
    TEM_SMS_50("女宾生日前D天发短信给男宾","TEM_SMS_50"),

    TEM_SMS_51("宝宝生日前D天且X岁以下","TEM_SMS_51"),
    TEM_SMS_52("宝宝X岁前X天成长跟踪短信","TEM_SMS_52"),
    TEM_SMS_53("家长生日前D天","TEM_SMS_53"),

    TEM_SMS_54("来单录入后M分钟","TEM_SMS_54"),
    TEM_SMS_55("怀孕X天周期跟踪短信","TEM_SMS_55"),
    TEM_SMS_56("服装出售订单后M分钟","TEM_SMS_56"),
    TEM_SMS_57("服装出售取衣前D天","TEM_SMS_57"),
    TEM_SMS_58("服装出租订单后M分钟","TEM_SMS_58"),
    TEM_SMS_59("服装出租取衣前D天","TEM_SMS_59"),
    TEM_SMS_60("服装出租还衣前D天","TEM_SMS_60"),
    TEM_SMS_61("服装出租还衣后M分钟","TEM_SMS_61"),


    ;
    private String desc;

    private String code;

    MessageCodeEnum(String desc, String code){
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }

    @Override
    public Serializable getValue() {
        return code;
    }
}
