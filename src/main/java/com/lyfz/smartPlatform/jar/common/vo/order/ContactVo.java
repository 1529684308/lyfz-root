package com.lyfz.smartPlatform.jar.common.vo.order;

import com.lyfz.smartPlatform.core.model.vo.IVo;
import com.lyfz.smartPlatform.jar.common.enums.customer.GroupType;
import lombok.Data;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-23
 */
@Data
public class ContactVo implements IVo{

    /**
     * 业务需要使用
     */
    private Long id;

    private String name;

    private String mobile;

    /**
     * 性别，0：女，1：男
     */
    private Boolean sex = false;

    /**
     * 客户区域Id
     */
    private Long categoryId;

    /**
     * 客户区域名称
     */
    private String categoryName;

    /**
     * 固定电话
     */
    private String tel;

    private String qq;

    private String wechat;

    /**
     * 生日年，主要是考虑农历的情况
     */
    private Integer birthdayYear;

    /**
     * 生日月，主要是考虑农历的情况
     */
    private Integer birthdayMonth;

    /**
     * 生日日，主要是考虑农历的情况
     */
    private Integer birthdayDay;

    /**
     * 是否农历
     */
    private Boolean birthdayLunar;

    private Long birthdayTime;

    /**
     * 工作单位
     */
    private String workUnit;

    /**
     * 地址
     */
    private String address;

    /**
     * 关系
     */
    private Long relation;

    /**
     * 婚期年
     */
    private Integer marriageYear;

    /**
     * 婚期月
     */
    private Integer marriageMonth;

    /**
     * 婚期日
     */
    private Integer marriageDay;


    /**
     * 是否农历
     */
    private Boolean marriageLunar;

    private Long marriageTime;

    /**
     * 是否主联系人
     */
    private Boolean isLord;

    private GroupType groupType;
}
