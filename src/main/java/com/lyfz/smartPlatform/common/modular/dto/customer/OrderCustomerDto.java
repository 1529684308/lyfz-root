package com.lyfz.smartPlatform.common.modular.dto.customer;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * Created by mzh on 2019/6/26.
 */
@ApiModel(value = "客户对象")
@Data
public class OrderCustomerDto implements IDto {


    /**
     * 联系人类
     */
    private List<ContactDto> contactDtos;

    /**
     * 宝宝类
     */
    private List<BabyDto> babyDtos;
}
