package com.lyfz.smartPlatform.common.modular.vo.account;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class ValidFunctionVO implements Serializable {

    private Integer enterpriseId;

    private Integer shopId;

    /**
     * 功能id
     */
    private String moduleFunId;

    /**
     * 父id
     */
    private String parentId;

    private String moduleId;

    /**
     * 功能名
     */
    private String name;

    /**
     * 是否菜单
     */
    private Boolean menu;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 图标
     */
    private String ico;

    private String url;

    /**
     * 有效期结束时间
     */
    private Long endTime;

    private List<ValidFunctionVO> childNodes = new ArrayList<>();

}

