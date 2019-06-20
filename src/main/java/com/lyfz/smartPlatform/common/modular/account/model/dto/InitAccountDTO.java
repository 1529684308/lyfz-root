package com.lyfz.smartPlatform.common.modular.account.model.dto;

import lombok.Data;

@Data
public class InitAccountDTO {

    /**
     * 账号
     */
    private String username;

    /**
     * 企业id
     */
    private Long enterpriseId;

    /**
     * 门店id
     */
    private Long shopId;

    /**
     * 功能ids
     */
    private String functionIds;


}
