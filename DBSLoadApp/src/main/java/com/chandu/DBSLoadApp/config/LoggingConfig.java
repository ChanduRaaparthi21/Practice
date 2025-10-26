package com.chandu.DBSLoadApp.config;


import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class LoggingConfig {

    private static final Logger logger = LoggerFactory.getLogger(LoggingConfig.class);

    public LoggingConfig() {
        logger.info("Logging Configuration Initialized");
    }

    // Add custom logging configurations here if needed
}