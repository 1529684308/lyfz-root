package com.lyfz.smartPlatform.common.modular.account.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class FunctionDTO implements Serializable {

    private List<String> functionId;

    private List<String> menuId;

    private List<RatioDTO> ratio;
}
