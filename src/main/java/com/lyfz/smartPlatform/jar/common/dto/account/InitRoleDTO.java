package com.lyfz.smartPlatform.jar.common.dto.account;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import lombok.Data;

@Data
public class InitRoleDTO implements IDto {

    private Integer shopId;

    private Integer enterpriseId;

    private Long userId;

    private String functionIds;

}
