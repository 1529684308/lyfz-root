package com.lyfz.smartPlatform.common.modular.enums.message;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum HospitalMsgEnum implements IEnum {
    HOSPITAL_001("","");

    private String desc;

    private String code;

    HospitalMsgEnum(String desc, String code){
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }

    @Override
    public Serializable getValue() {
        return code;
    }
}
