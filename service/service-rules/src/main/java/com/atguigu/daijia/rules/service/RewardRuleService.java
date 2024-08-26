package com.bjb.daijia.rules.service;

import com.bjb.daijia.model.form.rules.RewardRuleRequestForm;
import com.bjb.daijia.model.vo.rules.RewardRuleResponseVo;

public interface RewardRuleService {

    RewardRuleResponseVo calculateOrderRewardFee(RewardRuleRequestForm rewardRuleRequestForm);
}
