package com.itxiaopy.controller;

import com.itxiaopy.anno.Log;
import com.itxiaopy.pojo.Result;
import com.itxiaopy.utils.AliOSSUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.controller
 * @className: UploadController
 * @author: cyl
 * @description: TODO
 * @date: 2024/2/3 17:33
 * @version: 1.0
 */
@Slf4j
@RestController
public class UploadController {

    @Autowired
    private AliOSSUtil aliOSSUtil;

    @Log
    @PostMapping("/upload")
    public Result upload(MultipartFile image) throws Exception {
        log.info("文件上传，文件名：{}",image.getOriginalFilename());
        String url = aliOSSUtil.upload(image);
        log.info("文件上传完成，文件访问的url：{}",url);
        return Result.success(url);
    }
}
