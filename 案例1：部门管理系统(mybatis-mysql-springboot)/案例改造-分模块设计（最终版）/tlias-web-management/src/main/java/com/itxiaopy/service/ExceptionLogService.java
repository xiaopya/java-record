package com.itxiaopy.service;

import com.itxiaopy.pojo.ExceptionLog;
import org.springframework.stereotype.Service;

@Service
public interface ExceptionLogService {
    void insertLog(ExceptionLog exceptionLog);
}
