package com.bjb.daijia.driver.service.impl;

import com.bjb.daijia.common.result.Result;
import com.bjb.daijia.driver.client.OcrFeignClient;
import com.bjb.daijia.driver.service.OcrService;
import com.bjb.daijia.model.vo.driver.DriverLicenseOcrVo;
import com.bjb.daijia.model.vo.driver.IdCardOcrVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Service
@SuppressWarnings({"unchecked", "rawtypes"})
public class OcrServiceImpl implements OcrService {

    @Autowired
    private OcrFeignClient ocrFeignClient;

    //身份证识别
    @Override
    public IdCardOcrVo idCardOcr(MultipartFile file) {
        Result<IdCardOcrVo> ocrVoResult = ocrFeignClient.idCardOcr(file);
        IdCardOcrVo idCardOcrVo = ocrVoResult.getData();
        return idCardOcrVo;
    }

    //驾驶证识别
    @Override
    public DriverLicenseOcrVo driverLicenseOcr(MultipartFile file) {
        Result<DriverLicenseOcrVo> driverLicenseOcrVoResult = ocrFeignClient.driverLicenseOcr(file);
        DriverLicenseOcrVo driverLicenseOcrVo = driverLicenseOcrVoResult.getData();
        return driverLicenseOcrVo;
    }
}
