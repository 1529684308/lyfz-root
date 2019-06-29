package com.lyfz.smartPlatform.common.modular.base.model.vo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

@Data
public class ConfigInfoVo implements Serializable {
    /**
     * 是否选中
     */
    private Boolean checked;
    /**
     * 值
     */
    private JSONObject value;
}