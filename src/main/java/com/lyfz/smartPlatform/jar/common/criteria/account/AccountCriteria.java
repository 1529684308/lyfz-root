package com.lyfz.smartPlatform.jar.common.criteria.account;

import com.lyfz.smartPlatform.core.model.criteria.PageCriteria;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AccountCriteria extends PageCriteria {

    private Integer enterpriseId;

    private Integer shopId;

    private List userIds = new ArrayList<>();

}
