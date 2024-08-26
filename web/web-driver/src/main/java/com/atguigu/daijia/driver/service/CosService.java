package com.bjb.daijia.driver.service;

import com.bjb.daijia.model.vo.driver.CosUploadVo;
import org.springframework.web.multipart.MultipartFile;

public interface CosService {

    //文件上传接口
    CosUploadVo uploadFile(MultipartFile file, String path);
}
