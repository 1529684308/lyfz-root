package com.lyfz.smartPlatform.jar.common.vo.customer;

import com.lyfz.smartPlatform.jar.common.enums.customer.GroupType;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: mzh
 * @CreateTime: 2019-08-26
 */
@Data
public class ESCustomer implements Serializable {

    private Long id;

    private GroupType groupType;

    private String name;

    private String mobile;

    private Boolean sex;

    private Long birthdayDay;

    private String categoryName;

    public ESCustomer() {
    }

    public ESCustomer(Long id, GroupType groupType,String name, String mobile, Boolean sex, Long birthdayDay, String categoryName) {
        this.id = id;
        this.groupType = groupType;
        this.name = name;
        this.mobile = mobile;
        this.sex = sex;
        this.birthdayDay = birthdayDay;
        this.categoryName = categoryName;
    }
}
