package com.lyfz.smartPlatform.common.modular.dto.customer;

import com.lyfz.smartPlatform.core.model.dto.IDto;
import lombok.Data;

import java.util.List;

/**
 * @Author: mzh
 * @CreateTime: 2019-06-28
 */
@Data
public class RemoveOrderCustomerDto implements IDto {
    private List<Long> babyIds;
    private List<Long> contactIds;
}
