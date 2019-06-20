package com.lyfz.smartPlatform.common.modular.account.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ValidFunctionVO implements Serializable {

    private Integer enterpriseId;

    private Integer shopId;

    private String moduleFunId;

    private String parentId;

    private String moduleId;

    private String name;

    private Boolean menu;

    private Integer sort;

    private String ico;

    private String url;

    private Date endTime;

}

