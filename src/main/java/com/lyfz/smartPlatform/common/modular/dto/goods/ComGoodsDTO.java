package com.lyfz.smartPlatform.common.modular.dto.goods;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import lombok.Data;

import java.util.List;

@Data
public class ComGoodsDTO implements IDto {

    private List<GoodsPresellDTO> goodsPresell;

}
