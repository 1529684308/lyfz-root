package com.lyfz.smartPlatform.jar.common.enums.order;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * Created by mzh on 2019/6/28.
 */
public enum SourceType implements IEnum<Integer> {

    /**
     * //TODO
     * 注释这里的枚举类和客户服务,公用模块的枚举类一样的修改了，客户的枚举类也要修改，因为使用需要mybatis扫描
     */

    /**
     * 其他客户
     */
    OTHER_CUSTOMERS(0),
    /**
     * 老客户
     */
    OLD_CUSTOMERS(1),
    /**
     * 朋友介绍的客户
     */
    FRIEND_CUSTOMERS(2),
    /**
     * 资质客户
     */
    QUALIFICATION_CUSTOMERS(3);

    private Integer index;

    SourceType(Integer index) {
        this.index = index;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
