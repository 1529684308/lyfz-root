package com.lyfz.smartPlatform.jar.common.enums.customer;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-22
 */
public enum Compare {
    EQ("="),
    GT(">"),
    LT("<"),
    GE(">="),
    LE("<="),
    ;

    private String compareCode;

    Compare(String compareCode) {
        this.compareCode = compareCode;
    }
}
