package com.lyfz.smartPlatform.common.modular.dto.customer;

import com.lyfz.smartPlatform.common.modular.enums.customer.ContactStatus;
import com.lyfz.smartPlatform.common.modular.enums.customer.CustomerType;
import com.lyfz.smartPlatform.common.modular.enums.order.Type;
import com.lyfz.smartPlatform.core.model.dto.IDto;
import com.lyfz.smartPlatform.core.verify.Verify;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-16
 */
@Data
public class UpdateCustomerGroupDto implements IDto {

    
    @ApiModelProperty(value = "订单号",example="orderNo")
    @Verify(name = "订单号",value = "required|len_1_20")
    private String orderNo;

    @ApiModelProperty(value = "客户姓名",example="老客户",required = true)
    @Verify(name = "客户姓名", value = "required|len_1_255")
    private String nameGroup;

    @ApiModelProperty(value = "手机号码",example="15888888888")
    @Verify(name = "手机号码", value = "required|len_1_255")
    private String mobileGroup;

    @ApiModelProperty(value = "性别，0：女，1：男",example="男")
    @Verify(name = "手机号码", value = "required|len_1_255")
    private String sexGroup;

    @ApiModelProperty(value = "宝宝生日",example="2019-7-16")
    @Verify(name = "宝宝生日", value = "len_1_255")
    private String birthdayGroup;

    @ApiModelProperty(value = "客户区域",example="惠州")
    @Verify(name = "客户区域", value = "len_1_255")
    private String categoryGroup;

    /**
     * 订单类型 1.婚纱 2.儿童 3.写真 4.服务 5.婚庆
     */
    @ApiModelProperty(value = "订单类型",example = "WEDDING_DRESS")
    private Type type;

    /**
     * 与订单类型相关,儿童没有,写真则是预产期，其他都是婚庆时间
     */
    @ApiModelProperty(value = "订单类型时间")
    @Verify(name = "订单类型", value = "positiveInteger")
    private Long typeTime;

    /**
     * 来源ID
     */
    @ApiModelProperty(value = "来源ID--orderDto的值是一样的",example="0")
    @Verify(name = "来源ID", value = "positiveInteger")
    private Long originId;

    /**
     *客户类型 0.系统订单 1.老客户 2.其他
     */
    @ApiModelProperty(value = "客户类型",example = "ORDER_CONTACT")
    private CustomerType contactType;

    /**
     *客户状态1.正常 2.意向 3.流失
     */
    @ApiModelProperty(value = "客户状态")
    private ContactStatus contactStatus;

    /**
     * 流失类型
     */
    @ApiModelProperty(value = "意向程度",example = "1")
    @Verify(name = "流失类型", value = "positiveInteger")
    private Long lossType;

    /**
     * 意向程度
     */
    @ApiModelProperty(value = "意向程度",example = "1")
    @Verify(name = "意向程度", value = "positiveInteger")
    private Long intentionLevel;

    /**
     * 流失原因
     */
    @ApiModelProperty(value = "流失原因",example = "")
    @Verify(name = "流失原因")
    private String lossReason;

    /**
     * 介绍人ID
     */
    @ApiModelProperty(value = "介绍人ID",example = "1")
    @Verify(name = "介绍人", value = "positiveInteger")
    private Long friendId;


    /**
     * 联系人类
     */
    private List<ContactDto> contactDtos;

    /**
     * 宝宝类
     */
    private List<BabyDto> babyDtos;

    /**
     * 意向跟踪人
     */
    @ApiModelProperty(value = "意向跟踪人员")
    private List<Long> userIds;

}
