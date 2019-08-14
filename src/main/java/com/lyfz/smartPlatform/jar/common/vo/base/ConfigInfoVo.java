package com.lyfz.smartPlatform.jar.common.vo.base;

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
