package com.bjb.daijia.driver.service;

import com.bjb.daijia.model.vo.driver.CosUploadVo;
import org.springframework.web.multipart.MultipartFile;

public interface CosService {

    CosUploadVo upload(MultipartFile file, String path);

    //获取临时签名URL
    String getImageUrl(String path);

}
