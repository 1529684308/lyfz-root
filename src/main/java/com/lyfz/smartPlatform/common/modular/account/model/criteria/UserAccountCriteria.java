package com.lyfz.smartPlatform.common.modular.account.model.criteria;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserAccountCriteria{

    private Integer enterpriseId;

    private Integer shopId;

    private List userIds = new ArrayList<>();

}
