package com.example.demo.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class ManagementLoggerFactory {
    public static ConcurrentHashMap<Long, String> txIdMap = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<Long, String> eventKeyMap = new ConcurrentHashMap<>();

    public static Logger getLogger(Class clazz) {
        Logger internalLogger = LoggerFactory.getLogger(clazz);
        return new ManagementLogger(internalLogger);
    }
}

