package com.lyfz.smartPlatform.common.modular.base.model.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class ConfigInfo implements Serializable {
    private String key;
    /**
     * 是否选中
     */
    private Boolean checked;
    /**
     * 值
     */
    private JSONObject value;
}
