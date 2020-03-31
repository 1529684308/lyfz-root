package com.lyfz.smartPlatform.jar.common.dto.message;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MessageDTO {

    public List<String> phones = new ArrayList<>();

    private String content;

    private Integer shopId;

    private Integer enterpriseId;
}
