package com.lyfz.smartPlatform.jar.common.enums.finance;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @Author: mzh
 * @CreateTime: 2019-12-19
 */
public enum ReceiptType implements IEnum<Integer> {
    TOTAL_PAY(1, "全款"),
    EARLY_FIRST_PAY(2, "预约收款"),
    EARLY_REPLENISH_PAY(3, "预约补款"),
    LATE_PAY(4, "后期补款");

    private Integer index;

    private String text;

    ReceiptType(Integer index, String text) {
        this.index = index;
        this.text = text;
    }

    @Override
    public Integer getValue() {
        return index;
    }
}
