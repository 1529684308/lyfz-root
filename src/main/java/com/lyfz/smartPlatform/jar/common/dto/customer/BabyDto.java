package com.lyfz.smartPlatform.jar.common.dto.customer;

import com.lyfz.smartPlatform.jar.common.enums.customer.GroupType;
import com.lyfz.smartPlatform.jar.common.enums.order.DataStatus;
import com.lyfz.smartPlatform.core.model.dto.IDto;
import com.lyfz.smartPlatform.core.verify.Verify;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by mzh on 2019/6/26.
 */
@ApiModel(value = "儿童对象")
@Data
public class BabyDto implements IDto {

    @ApiModelProperty(hidden = true)
    private Long id;

    @ApiModelProperty(value = "宝宝名称", example = "宝宝", required = true)
    @Verify(name = "宝宝姓名", value = "required|len_0_40")
    private String name;

    /**
     * 性别，0：女，1：男
     */
    @ApiModelProperty(value = "性别，0：女，1：男", example = "0")
    private Boolean sex;

    /**
     * 生日年，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日", example = "2019")
    @Verify(name = "生日", value = "positiveInteger")
    private Long birthdayTime;

    private Boolean birthdayLunar;


    /**
     * 是否农历
     */
    @ApiModelProperty(value = "是否农历", example = "true")
    private Boolean isLunar;

    /**
     * 生肖
     */
    @ApiModelProperty(value = "生肖", example = "猪")
    @Verify(name = "生肖", value = "chinese_0_2")
    private String zodiac;


    /**
     * 关系
     */
    @ApiModelProperty(value = "宝宝关系数据JSON--这个数据格式后面商量决定",example="{}")
    private Long relation;


    @ApiModelProperty(value = "加入组的ID",example = "1")
    private Long groupId;

    @ApiModelProperty(value = "客户类型")
    @Verify(name = "客户类型", value = "required")
    private GroupType groupType;

    @ApiModelProperty(value = "数据状态",example="ADD")
    @Verify(name = "数据状态", value = "required")
    private DataStatus dataStatus;


}

