package com.itxiaopy.service;

import com.itxiaopy.pojo.LogTb;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
    void insertLog(LogTb logTb);
}
