package com.itxiaopy.service.impl;

import com.itxiaopy.mapper.LogMapper;
import com.itxiaopy.pojo.LogTb;
import com.itxiaopy.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @projectName: tlias-web-management
 * @package: com.itxiaopy.service.impl
 * @className: LogServiceImpl
 * @author: cyl
 * @description: TODO
 * @date: 2024/2/8 21:06
 * @version: 1.0
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public void insertLog(LogTb logTb) {
        logMapper.insert(logTb);
    }
}
