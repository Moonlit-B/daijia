package com.bjb.daijia.customer.service;

import com.bjb.daijia.model.form.customer.UpdateWxPhoneForm;
import com.bjb.daijia.model.vo.customer.CustomerLoginVo;

public interface CustomerService {

    //微信登录
    String login(String code);

    //获取用户信息
    CustomerLoginVo getCustomerLoginInfo(String token);

    //获取用户信息
    CustomerLoginVo getCustomerInfo(Long customerId);

    //更新用户微信手机号
    Boolean updateWxPhoneNumber(UpdateWxPhoneForm updateWxPhoneForm);
}
