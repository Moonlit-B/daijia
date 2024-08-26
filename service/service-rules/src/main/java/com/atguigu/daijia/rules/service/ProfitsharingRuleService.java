package com.bjb.daijia.rules.service;

import com.bjb.daijia.model.form.rules.ProfitsharingRuleRequestForm;
import com.bjb.daijia.model.vo.rules.ProfitsharingRuleResponseVo;

public interface ProfitsharingRuleService {

    ProfitsharingRuleResponseVo calculateOrderProfitsharingFee(ProfitsharingRuleRequestForm profitsharingRuleRequestForm);
}
