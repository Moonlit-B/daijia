package com.bjb.daijia.map.service;

import com.bjb.daijia.model.form.map.CalculateDrivingLineForm;
import com.bjb.daijia.model.vo.map.DrivingLineVo;

public interface MapService {

    //计算驾驶线路
    DrivingLineVo calculateDrivingLine(CalculateDrivingLineForm calculateDrivingLineForm);
}
