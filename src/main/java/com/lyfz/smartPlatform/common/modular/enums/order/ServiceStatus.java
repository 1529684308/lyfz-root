package com.lyfz.smartPlatform.common.modular.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-24
 */
public enum ServiceStatus implements IEnum<Integer> {

    NONE(-1,""),
    NOT_PROCESSING(0,"未进行"),
    PROCESSING(1,"进行中"),
    COMPLETE(2,"完成"),
    ;


    private Integer index;

    private String description;

    ServiceStatus(Integer index, String description) {
        this.index = index;
        this.description = description;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
