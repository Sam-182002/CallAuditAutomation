package com.callaudit.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import com.callaudit.utils.LogUtil;

public class ConfigReader {

    private static Properties properties = new Properties();
    private static final Logger log = LogUtil.getLogger(ConfigReader.class);

    static {
        try {
            FileInputStream fis = new FileInputStream(
                "src/test/resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
        	log.error("Failed to load config.properties: " + e.getMessage());
            throw new RuntimeException("config.properties not found: " + e.getMessage());
        }
    }

    // Primary method used everywhere
    public  String getConfigData(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
        	 log.error("Key not found in config.properties: " + key);
            throw new RuntimeException("Key not found in config.properties: " + key);
          
        }
        return value.trim();
        
    }

    // Alias — delegates to getConfigData so ExtentManager works without change
    public  String get(String key) {
        return getConfigData(key);
    }
}
