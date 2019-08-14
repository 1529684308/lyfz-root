package com.lyfz.smartPlatform.common.modular.dto.customer;

import com.lyfz.smartPlatform.common.modular.enums.order.DataStatus;
import com.lyfz.smartPlatform.common.modular.enums.order.GroupType;
import com.lyfz.smartPlatform.core.model.dto.IDto;
import com.lyfz.smartPlatform.core.verify.Verify;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by mzh on 2019/6/26.
 */
@ApiModel(value="联系人对象")
@Data
public class ContactDto implements IDto {

    /**
     * 业务需要使用
     */
    @ApiModelProperty(hidden = true)
    private Long id;

    @ApiModelProperty(value = "客户姓名",example="老客户",required = true)
    @Verify(name = "客户姓名", value = "required|len_1_55")
    private String name;

    @ApiModelProperty(value = "手机号码",example="15888888888")
    @Verify(name = "手机号码", value = "len_1_55")
    private String mobile;

    /**
     * 性别，0：女，1：男
     */
    @ApiModelProperty(value = "性别，0：女，1：男",example="0")
    private Boolean sex = false;

    /**
     * 客户区域Id
     */
    @ApiModelProperty(value = "客户区域ID",example="1")
    @Verify(name = "客户区域ID", value = "positiveInteger")
    private Long categoryId;

    /**
     * 客户区域Id
     */
    @ApiModelProperty(value = "客户区域名称",example="惠州")
    @Verify(name = "客户区域名称", value = "len_1_55")
    private String categoryName;


    /**
     * 固定电话
     */
    @ApiModelProperty(value = "固定电话",example="0752-8888888")
    @Verify(name = "固定电话", value = "tel")
    private String tel;

    @ApiModelProperty(value = "QQ",example="888888888")
    @Verify(name = "QQ", value = "len_0_10")
    private String qq;

    @ApiModelProperty(value = "微信",example="888888888")
    @Verify(name = "微信", value = "len_0_50")
    private String wechat;

    /**
     * 生日年，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-年，主要是考虑农历的情况",example="2019")
    @Verify(name = "年", value = "positiveInteger")
    private Integer birthdayYear;

    /**
     * 生日月，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-月，主要是考虑农历的情况",example="6")
    @Verify(name = "月", value = "positiveInteger")
    private Integer birthdayMonth;

    /**
     * 生日日，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-日，主要是考虑农历的情况",example="27")
    @Verify(name = "日", value = "positiveInteger")
    private Integer birthdayDay;

    /**
     * 是否农历
     */
    @ApiModelProperty(value = "是否农历",example="true")
    private Boolean birthdayLunar;

    /**
     * 工作单位
     */
    @ApiModelProperty(value = "工作单位",example="利亚方舟")
    @Verify(name = "工作单位", value = "len_0_170")
    private String workUnit;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址",example="惠州市三环")
    @Verify(name = "地址", value = "len_0_220")
    private String address;

    /**
     * 关系(多个宝宝的情况，关系可能不一样)
     */
    @ApiModelProperty(value = "宝宝关系数据JSON--这个数据格式后面商量决定",example="{}")
    private String relationJson;

    /**
     * 婚期年
     */
    @ApiModelProperty(value = "婚期年-年，主要是考虑农历的情况",example="2019")
    @Verify(name = "年", value = "positiveInteger")
    private Integer marriageYear;

    /**
     * 婚期月
     */
    @ApiModelProperty(value = "婚期年-月，主要是考虑农历的情况",example="6")
    @Verify(name = "月", value = "positiveInteger")
    private Integer marriageMonth;

    /**
     * 婚期日
     */
    @ApiModelProperty(value = "婚期年-日，主要是考虑农历的情况",example="27")
    @Verify(name = "日", value = "positiveInteger")
    private Integer marriageDay;


    /**
     * 是否农历
     */
    @ApiModelProperty(value = "婚期-是否农历",example="true")
    private Boolean marriageLunar;

    @ApiModelProperty(value = "是否主联系人",example = "true")
    private Boolean isLord;

    @ApiModelProperty(value = "加入组的ID",example = "1")
    private Long groupId;

    @ApiModelProperty(value = "客户类型")
    @Verify(name = "客户类型", value = "required")
    private GroupType groupType;


    @ApiModelProperty(value = "数据状态",example="ADD")
    @Verify(name = "数据状态", value = "required")
    private DataStatus dataStatus;


}
