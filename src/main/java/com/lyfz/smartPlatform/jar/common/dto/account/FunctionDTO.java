package com.lyfz.smartPlatform.jar.common.dto.account;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class FunctionDTO implements Serializable {

    private List<String> functionId;

    private List<String> menuId;

    private List<RatioDTO> ratio;
}