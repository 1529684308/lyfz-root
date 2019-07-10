package com.lyfz.smartPlatform.common.modular.dto.customer;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import com.lyfz.smartPlatform.core.verify.Verify;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by mzh on 2019/6/26.
 */
@ApiModel(value="儿童对象")
@Data
public class BabyDto implements IDto {

    @ApiModelProperty(hidden = true)
    private Long id;

    @ApiModelProperty(value = "宝宝名称",example="宝宝",required = true)
    @Verify(name = "宝宝姓名", value = "required|len_0_40")
    private String name;

    /**
     * 性别，0：女，1：男
     */
    @ApiModelProperty(value = "性别，0：女，1：男",example="0")
    private Boolean sex;

    /**
     * 生日年，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-年，主要是考虑农历的情况",example="2019")
    @Verify(name = "年", value = "positiveInteger")
    private Integer birthdayYear;

    /**
     * 生日月，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-月，主要是考虑农历的情况",example="6" )
    @Verify(name = "月", value = "positiveInteger")
    private Integer birthdayMonth;

    /**
     * 生日日，主要是考虑农历的情况
     */
    @ApiModelProperty(value = "生日-日，主要是考虑农历的情况",example="27" )
    @Verify(name = "日", value = "positiveInteger")
    private Integer birthdayDay;

    /**
     * 是否农历
     */
    @ApiModelProperty(value = "是否农历",example="true")
    private Boolean isLunar;

    /**
     * 生肖
     */
    @ApiModelProperty(value = "生肖",example="猪")
    @Verify(name = "生肖", value = "chinese_0_2")
    private String zodiac;

}

