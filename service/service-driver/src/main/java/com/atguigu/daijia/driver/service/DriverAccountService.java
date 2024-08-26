package com.bjb.daijia.driver.service;

import com.bjb.daijia.model.entity.driver.DriverAccount;
import com.bjb.daijia.model.form.driver.TransferForm;
import com.baomidou.mybatisplus.extension.service.IService;

public interface DriverAccountService extends IService<DriverAccount> {

    Boolean transfer(TransferForm transferForm);
}
