package com.lyfz.smartPlatform.jar.common.enums.transaction;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum AnnouncementTypeEnum implements IEnum<Integer> {
    DAILY_NOTICE("日常通知公告", 1),
    REGULATION("规章制度",2),
    HONOR("荣誉表彰",3),
    PUNISHMENT("惩罚警示",4),
    STAFF_HANDBOOK("员工手册",5),
    STUDY_MATERIAL("学习资料",6),
    ;

    private String desc;

    private Integer code;

    AnnouncementTypeEnum(String desc, Integer code){
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getCode() {
        return code;
    }


    @Override
    public Integer getValue() {
        return code;
    }
}
