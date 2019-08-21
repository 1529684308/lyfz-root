package com.lyfz.smartPlatform.jar.common.criteria.permission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserRatioCriteria {

    @ApiModelProperty(value = "门店id")
    private Integer shopId;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    @ApiModelProperty(value = "门店名")
    private String shopName;

    @ApiModelProperty(value = "企业id")
    private Integer enterpriseId;
}
