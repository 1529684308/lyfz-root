package com.lyfz.smartPlatform.common.modular.account.model.dto;

import lombok.Data;

@Data
public class InitAccountDTO {

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
