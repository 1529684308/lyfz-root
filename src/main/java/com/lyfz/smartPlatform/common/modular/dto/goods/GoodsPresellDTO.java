package com.lyfz.smartPlatform.common.modular.dto.goods;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import lombok.Data;

@Data
public class GoodsPresellDTO implements IDto {

    private Long id;

    private Integer presellNumber;
}
