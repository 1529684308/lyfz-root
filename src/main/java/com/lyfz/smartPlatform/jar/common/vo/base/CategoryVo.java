package com.lyfz.smartPlatform.jar.common.vo.base;

import com.lyfz.smartPlatform.jar.common.enums.base.CategoryType;
import com.lyfz.smartPlatform.core.model.vo.IVo;
import lombok.Data;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-05
 */
@Data
public class CategoryVo implements IVo {

    private String id;

    private String parentId;

    private String name;

    /**
     * 备注、描述
     */
    private String description;

    /**
     * 类别,所有涉及到类别的公共类
     */
    private CategoryType type;

    private Boolean isCategoryMenu;

    private Integer level;
}
