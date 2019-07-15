package com.lyfz.smartPlatform.common.modular.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Created by mzh on 2019/6/28.
 */
public enum PhotoType implements IEnum<Integer> {

    /**
     * 正常
     */
    NORMAL(1),
    /**
     * 重拍
     */
    RETAKE(2),
    /**
     * 补拍
     */
    MAKE_UP(3);

    private Integer index;

    PhotoType(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
