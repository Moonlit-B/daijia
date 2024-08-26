package com.bjb.daijia.driver.service.impl;

import com.bjb.daijia.common.execption.GuiguException;
import com.bjb.daijia.common.result.Result;
import com.bjb.daijia.common.result.ResultCodeEnum;
import com.bjb.daijia.driver.client.DriverInfoFeignClient;
import com.bjb.daijia.driver.service.LocationService;
import com.bjb.daijia.map.client.LocationFeignClient;
import com.bjb.daijia.model.entity.driver.DriverSet;
import com.bjb.daijia.model.form.map.OrderServiceLocationForm;
import com.bjb.daijia.model.form.map.UpdateDriverLocationForm;
import com.bjb.daijia.model.form.map.UpdateOrderLocationForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@SuppressWarnings({"unchecked", "rawtypes"})
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationFeignClient locationFeignClient;

    @Autowired
    private DriverInfoFeignClient driverInfoFeignClient;

    //更新司机位置
    @Override
    public Boolean updateDriverLocation(UpdateDriverLocationForm updateDriverLocationForm) {
        //开启接单了才能更新司机接单位置
        DriverSet driverSet = driverInfoFeignClient.getDriverSet(updateDriverLocationForm.getDriverId()).getData();
        if(driverSet.getServiceStatus().intValue() == 1) {
            return locationFeignClient.updateDriverLocation(updateDriverLocationForm).getData();
        } else {
            throw new GuiguException(ResultCodeEnum.NO_START_SERVICE);
        }
        //根据司机id获取司机个性化设置信息
//        Long driverId = updateDriverLocationForm.getDriverId();
//        Result<DriverSet> driverSetResult = driverInfoFeignClient.getDriverSet(driverId);
//        DriverSet driverSet = driverSetResult.getData();
//
//        //判断：如果司机开始接单，更新位置信息
//        if(driverSet.getServiceStatus() == 1) {
//            Result<Boolean> booleanResult = locationFeignClient.updateDriverLocation(updateDriverLocationForm);
//            return booleanResult.getData();
//        } else {
//            //没有接单
//            throw new GuiguException(ResultCodeEnum.NO_START_SERVICE);
//        }
    }

    @Override
    public Boolean updateOrderLocationToCache(UpdateOrderLocationForm updateOrderLocationForm) {
        return locationFeignClient.updateOrderLocationToCache(updateOrderLocationForm).getData();
    }

    @Override
    public Boolean saveOrderServiceLocation(List<OrderServiceLocationForm> orderLocationServiceFormList) {
        return locationFeignClient.saveOrderServiceLocation(orderLocationServiceFormList).getData();
    }
}
