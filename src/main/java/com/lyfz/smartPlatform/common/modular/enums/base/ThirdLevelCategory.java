package com.lyfz.smartPlatform.common.modular.enums.base;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-05
 */
public enum  ThirdLevelCategory {

    COMMUNICATION_TYPE1("选衣客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL),
    COMMUNICATION_TYPE2("拍照客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL),
    COMMUNICATION_TYPE3("看版客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL),
    COMMUNICATION_TYPE4("取件客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL),
    COMMUNICATION_TYPE5("服务客人", SecondaryCategory.COMMUNICATION_TYPE_PHOTO_CONTROL),

    COMMUNICATION_TYPE6("已定未拍", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE7("已拍未修", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE8("已拍未选", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE9("已修未选", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE10("已选未设计", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE11("已设计未看", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE12("已看未发片", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE13("已发未回件", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),
    COMMUNICATION_TYPE14("已回件未取", SecondaryCategory.COMMUNICATION_TYPE_PROCESS_CONTROL),

    COMMUNICATION_TYPE15("会员积分", SecondaryCategory.COMMUNICATION_TYPE_COMMUNICATION_ASSISTANT),
    COMMUNICATION_TYPE16("怀孕周期", SecondaryCategory.COMMUNICATION_TYPE_COMMUNICATION_ASSISTANT),

            ;

    private SecondaryCategory secondaryCategory;

    private String categoryName;

    ThirdLevelCategory(String categoryName,SecondaryCategory secondaryCategory) {
        this.categoryName = categoryName;
        this.secondaryCategory = secondaryCategory;
    }

    public SecondaryCategory getSecondaryCategory() {
        return secondaryCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
