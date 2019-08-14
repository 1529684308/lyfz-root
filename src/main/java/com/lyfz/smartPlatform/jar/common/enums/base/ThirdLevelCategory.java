package com.lyfz.smartPlatform.jar.common.enums.base;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-05
 */
public enum ThirdLevelCategory {

    COMMUNICATION_TYPE1("选衣客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL,3),
    COMMUNICATION_TYPE2("拍照客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL,3),
    COMMUNICATION_TYPE3("看版客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL,3),
    COMMUNICATION_TYPE4("取件客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL,3),
    COMMUNICATION_TYPE5("服务客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL,3),

    COMMUNICATION_TYPE6("已定未拍", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE7("已拍未修", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE8("已拍未选", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE9("已修未选", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE10("已选未设计", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE11("已设计未看", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE12("已看未发片", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE13("已发未回件", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),
    COMMUNICATION_TYPE14("已回件未取", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL,3),

    COMMUNICATION_TYPE15("会员积分", SecondaryCategory.COMMUNICATION_TYPE_COMMUNICATION_ASSISTANT,3),
    COMMUNICATION_TYPE16("怀孕周期", SecondaryCategory.COMMUNICATION_TYPE_COMMUNICATION_ASSISTANT,3),

    ;

    private SecondaryCategory secondaryCategory;

    private String categoryName;

    private Integer level;

    ThirdLevelCategory(String categoryName, SecondaryCategory secondaryCategory, Integer level) {
        this.categoryName = categoryName;
        this.secondaryCategory = secondaryCategory;
        this.level = level;
    }

    public SecondaryCategory getSecondaryCategory() {
        return secondaryCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Integer getLevel() {
        return level;
    }
}
