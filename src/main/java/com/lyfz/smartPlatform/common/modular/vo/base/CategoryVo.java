package com.lyfz.smartPlatform.common.modular.vo.base;

import com.lyfz.smartPlatform.common.modular.enums.base.CategoryType;
import com.lyfz.smartPlatform.core.model.vo.IVo;
import lombok.Data;

/**
 * @Author: mzh
 * @CreateTime: 2019-07-05
 */
@Data
public class CategoryVo implements IVo {

    private Long id;

    private Long parentId;

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
}
