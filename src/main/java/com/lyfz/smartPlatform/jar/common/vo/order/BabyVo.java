package com.lyfz.smartPlatform.jar.common.vo.order;

import com.lyfz.smartPlatform.core.model.vo.IVo;
import lombok.Data;

/**
 * @CreateTime: 2019-07-23
 */
@Data
public class BabyVo implements IVo{


    private Long id;

    private String name;

    /**
     * 性别，0：女，1：男
     */
    private Boolean sex;

    private Long categoryId;

    private String categoryName;

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
    private Boolean isLunar;

    /**
     * 生肖
     */
    private String zodiac;


    /**
     * 关系
     */
    private String relationJson;

}
