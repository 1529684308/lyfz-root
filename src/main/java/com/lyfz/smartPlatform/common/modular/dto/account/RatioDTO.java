package com.lyfz.smartPlatform.common.modular.dto.account;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import lombok.Data;

@Data
public class RatioDTO implements IDto {

    private String name;

    private Double ratio;

}
