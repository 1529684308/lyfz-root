package com.lyfz.smartPlatform.common.modular.account.model.dto;

import lombok.Data;

@Data
public class InitAccountDTO {

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
     * 门店id
     */
    private Integer shopId;

    /**
     * 功能ids
     */
    private String functionIds;


}
