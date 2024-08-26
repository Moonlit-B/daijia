package com.bjb.daijia.rules.service;

import com.bjb.daijia.model.form.rules.FeeRuleRequestForm;
import com.bjb.daijia.model.vo.rules.FeeRuleResponseVo;

public interface FeeRuleService {

    //计算订单费用
    FeeRuleResponseVo calculateOrderFee(FeeRuleRequestForm calculateOrderFeeForm);
}
