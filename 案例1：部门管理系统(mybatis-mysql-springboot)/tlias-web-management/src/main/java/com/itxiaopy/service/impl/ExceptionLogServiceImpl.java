package com.itxiaopy.service.impl;

import com.itxiaopy.mapper.ExceptionLogMapper;
import com.itxiaopy.pojo.ExceptionLog;
import com.itxiaopy.service.ExceptionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.service.impl
 * @className: ExceptionLogServiceImpl
 * @author: cyl
 * @description: TODO
 * @date: 2024/2/8 21:06
 * @version: 1.0
 */
@Service
public class ExceptionLogServiceImpl implements ExceptionLogService {

    @Autowired
    private ExceptionLogMapper exceptionLogMapper;

//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void insertLog(ExceptionLog exceptionLog) {
        exceptionLogMapper.insert(exceptionLog);
    }
}
