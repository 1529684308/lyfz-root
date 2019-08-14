package com.lyfz.smartPlatform.jar.common.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum CommonMsgEnum implements IEnum {
    COM_001("客人生日前X天","COM_001"),
    COM_002("客片上传完成后X分钟发通知短信","COM_002"),
    COM_003("客户云选片完成后发通知短信","COM_003"),
    COM_004("客户云看样完成后发通知短信","COM_004"),
    COM_005("当积分接近X的百分之80时","COM_005"),
    COM_006("当积分达到或超过X分时","COM_006"),
    COM_007("转介绍后X分钟发送短信给介绍人","COM_007"),
    COM_008("发放会员卡后X分钟发会员短信","COM_008"),
    COM_009("积分兑换后X分钟发提醒短信","COM_009"),
    COM_010("现金卡消费后X分钟后发提醒短信","COM_010"),
    COM_011("现金卡充值后X分钟后发提醒短信","COM_011"),
    COM_012("员工生日前X天","COM_012"),
    COM_013("每天X时X分发送财务短信到X手机","COM_013"),
    COM_014("客户来电挂机后X分钟","COM_014"),
    COM_015("未知来电挂机后X分钟","COM_015"),
    COM_016("员工来电挂机后X分钟","COM_016"),
    COM_017("员工生日前X天发送短信给X手机号","COM_017"),
    COM_018("会员积分变动后X分钟","COM_018"),
    COM_019("删除会员后X分钟","COM_019"),
    COM_020("注消会员后X分钟","COM_020"),
    COM_021("修改会员支付密码后X分钟","COM_021"),
    COM_022("会员服务卡使用后X分钟","COM_022"),
    COM_023("会员积分有效期到期前X天","COM_023"),
    COM_024("会员储值有效期到期前X天","COM_024"),
    COM_025("会员服务套餐有效期到期前X天","COM_025"),
    COM_026("会员新摄会有效期到期前X天","COM_026"),
    COM_027("会员返现卡有效期到期前X天","COM_027"),
    COM_028("会员返现卡提现后X分钟","COM_028"),
    COM_029("会员返现卡获得返现金后X分钟","COM_029"),
    COM_030("支付成功后X分钟发提醒消息","COM_030"),
    ;
    private String desc;

    private String code;

    CommonMsgEnum(String desc, String code){
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
        return null;
    }
}
