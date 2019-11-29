package com.lyfz.smartPlatform.jar.common.dto.account;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import lombok.Data;

@Data
public class JwtAuthenticationRequest implements IDto {
    private String number;
    private String username;
    private String password;
}
