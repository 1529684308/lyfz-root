package com.lyfz.smartPlatform.jar.common.dto.message;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class MessageInfoDTO {

    private String eventType;

    private Integer shopId;

    private Integer enterpriseId;

    /**
     * 信息接收对象的姓名 XXX
     */
    private String name;

    /**
     * 接收对象的手机号
     */
    private String phone;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 店名 XXSPDM
     */
    private String shopName;

    /**
     * 门店电话 XXSPTEL
     */
    private String shopPhone;

    /**
     * 门店地址 XXSPDZ
     */
    private String shopAddress;

    /**
     * 门店店长 XXSPDZM
     */
    private String shopLeader;

    /**
     * 生日日期 XXSR
     */
    private Date birthday;

    /**
     * 充值卡号 XXN
     */
    private String cardNumber;

    /**
     * 充值金额 XXCM
     */
    private BigDecimal upMoney;

    /**
     * 消费金额 XXQM
     */
    private BigDecimal payMoney;

    /**
     * 总金额/订单价格 XXM
     */
    private BigDecimal totalMoney;

    /**
     * 充值/消费/发卡/集齐时间 XXT
     */
    private Date payTime;

    /**
     * 积分 XXF
     */
    private Integer integral;

    /**
     * 被介绍客户 XXC
     */
    private String username;

    /**
     * 男女嘉宾 XXVN
     */
    private String guest;

    /**
     * 嘉宾生日 XXSR
     */
    private Date guestBirthday;

    /**
     * 订单号 XXZ
     */
    private String orderNo;

    /**
     * 套系名称 XXN
     */
    private String assemblyName;

    /**
     * 接单人 JDRN
     */
    private String receptionist;

    /**
     * 接单人电话 JDRDH
     */
    private String receptionistPhone;

    /**
     * 宝宝名字 XXB
     */
    private String childName;
}
