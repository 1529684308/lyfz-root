package com.lyfz.smartPlatform.jar.common.dto.account;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import lombok.Data;

@Data
public class InitAccountDTO implements IDto {

    /**
     * 是否初始化 true代表初始化，false代表更新
     */
    private Boolean isInit;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 企业id
     */
    private Integer enterpriseId;

    /**
     * 企业名字
     */
    private String enterpriseName;

    /**
     * 门店id
     */
    private Integer shopId;

    /**
     * 门店名
     */
    private String shopName;

    /**
     * 功能ids
     */
    private FunctionDTO functionIds;


}