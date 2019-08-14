package com.lyfz.smartPlatform.jar.common.vo.order;

import com.lyfz.smartPlatform.jar.common.enums.customer.ContactStatus;
import com.lyfz.smartPlatform.core.model.vo.IVo;
import lombok.Data;

import java.util.List;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-23
 */
@Data
public class CustomerGroupInfoVo implements IVo {

    private Long id;

    /**
     *  类别客户等级
     */
    private Long customerLevel;

    /**
     * 来源ID
     */
    private Long originId;

    /**
     *客户状态1.正常 2.意向 3.流失
     */
    private ContactStatus contactStatus;

    /**
     * 流失类型
     */
    private Long lossType;


    /**
     * 是否意客户
     */
    private Boolean isIntention;


    /**
     * 意向程度
     */
    private Long intentionLevel;

    /**
     * 流失原因
     */
    private String lossReason;

    private List<ContactVo> contactVos;

    private List<BabyVo> babyVos;
}
