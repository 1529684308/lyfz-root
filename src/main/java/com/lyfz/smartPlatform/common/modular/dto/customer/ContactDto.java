package com.lyfz.smartPlatform.common.modular.dto.customer;

import com.lyfz.smartPlatform.common.modular.enums.order.SourceType;
import com.lyfz.smartPlatform.core.model.dto.IDto;
import com.lyfz.smartPlatform.core.verify.Verify;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by mzh on 2019/6/26.
 */
@ApiModel(value = "联系人对象")
@Data
public class ContactDto implements IDto {

    @ApiModelProperty(hidden = true)
    private Long id;

    /**
     * 来源,0:其它,1:老客户,2:朋友介绍,3:客资客户
     */
    @ApiModelProperty(value = "来源类型--orderDto的值是一样的", example = "0")
    private SourceType sourceType;

    /**
     * 来源ID
     */
    @ApiModelProperty(value = "来源ID--orderDto的值是一样的", example = "0")
    @Verify(name = "来源ID", value = "positiveInteger")
    private Long originId;

    /**
     * 来源名
     */
    @ApiModelProperty(value = "来源名--orderDto的值是一样的", example = "老客户")
    @Verify(name = "来源名", value = "len_1_55")
    private String originName;

    @ApiModelProperty(value = "客户姓名", example = "老客户", required = true)
    @Verify(name = "客户姓名", value = "required|len_1_55")
    private String name;

    @ApiModelProperty(value = "手机号码", example = "15888888888")
    @Verify(name = "手机号码", value = "len_1_55")
    private String mobile;

    /**
     * 性别，0：女，1：男
     */
    @ApiModelProperty(value = "性别，0：女，1：男", example = "0")
    private Boolean sex;

    /**
     * 客户区域Id
     */
    @ApiModelProperty(value = "客户区域", example = "1")
    @Verify(name = "客户区域", value = "positiveInteger")
    private Long categoryId;

    /**
     * 区域名称
     */
    @ApiModelProperty(value = "区域名称", example = "黄山")
    @Verify(name = "客户区域", value = "len_0_55")
    private String categoryName;

    /**
     * 固定电话
     */
    @ApiModelProperty(value = "固定电话", example = "0752-8888888")
    @Verify(name = "固定电话", value = "tel")
    private String tel;

    @ApiModelProperty(value = "QQ", example = "888888888")
    @Verify(name = "QQ", value = "len_0_10")
    private String qq;

    @ApiModelProperty(value = "微信", example = "888888888")
    @Verify(name = "微信", value = "len_0_50")
    private String wechat;

    /**
     * 生日年，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-年，主要是考虑农历的情况", example = "2019")
    @Verify(name = "年", value = "positiveInteger")
    private Integer birthdayYear;

    /**
     * 生日月，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-月，主要是考虑农历的情况", example = "6")
    @Verify(name = "月", value = "positiveInteger")
    private Integer birthdayMonth;

    /**
     * 生日日，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-日，主要是考虑农历的情况", example = "27")
    @Verify(name = "日", value = "positiveInteger")
    private Integer birthdayDay;

    /**
     * 是否农历
     */
    @ApiModelProperty(value = "是否农历", example = "true")
    private Boolean birthdayLunar;

    /**
     * 工作单位
     */
    @ApiModelProperty(value = "工作单位", example = "利亚方舟")
    @Verify(name = "工作单位", value = "len_0_170")
    private String workUnit;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址", example = "惠州市三环")
    @Verify(name = "地址", value = "len_0_220")
    private String address;

    /**
     * 关系(多个宝宝的情况，关系可能不一样)
     */
    @ApiModelProperty(value = "宝宝关系数据JSON--这个数据格式后面商量决定", example = "{}")
    private String relationship;

    /**
     * 婚期年
     */
    @ApiModelProperty(value = "婚期年-年，主要是考虑农历的情况", example = "2019")
    @Verify(name = "年", value = "positiveInteger")
    private Integer marriageYear;

    /**
     * 婚期月
     */
    @ApiModelProperty(value = "婚期年-月，主要是考虑农历的情况", example = "6")
    @Verify(name = "月", value = "positiveInteger")
    private Integer marriageMonth;

    /**
     * 婚期日
     */
    @ApiModelProperty(value = "婚期年-日，主要是考虑农历的情况", example = "27")
    @Verify(name = "日", value = "positiveInteger")
    private Integer marriageDay;

    /**
     * 是否农历
     */
    @ApiModelProperty(value = "婚期-是否农历", example = "true")
    private Boolean marriageLunar;

    /**
     * 预产期
     */
    @ApiModelProperty(value = "预产期")
    private Date expectedDate;

    /**
     * 介绍人ID
     */
    @ApiModelProperty(value = "介绍人ID", example = "1")
    @Verify(name = "介绍人", value = "positiveInteger")
    private Long friendId;

}
