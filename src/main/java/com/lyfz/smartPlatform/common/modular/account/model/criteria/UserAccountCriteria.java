package com.lyfz.smartPlatform.common.modular.account.model.criteria;

import com.lyfz.smartPlatform.core.model.criteria.PageCriteria;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserAccountCriteria extends PageCriteria {

    private Integer enterpriseId;

    private Integer shopId;

    private List userIds = new ArrayList<>();

}
