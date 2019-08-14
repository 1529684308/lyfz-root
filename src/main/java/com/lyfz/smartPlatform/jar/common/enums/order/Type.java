package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Created by mzh on 2019/6/26.
 */
public enum Type implements IEnum<Integer> {
    /**
     * 婚纱类型
     */
    WEDDING_DRESS(1),
    /**
     * 儿童类型
     */
    BABY(2),
    /**
     * 写真类型
     */
    PORTRAY(3),
    /**
     * 服务类型
     */
    SERVICE(4),
    /**
     * 婚庆类型
     */
    WEDDING(5);

    private Integer index;

    Type(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}


