/**
 * Copyright(C) 2022 Phạm Hồng Đạt
 * 22/09/2022
 */
package com.hongdatchy.configclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @author hongdatchy
 */
@Component
@ConfigurationProperties(prefix = "sample")
public class ClientConfig {

    private String property1;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }
}
