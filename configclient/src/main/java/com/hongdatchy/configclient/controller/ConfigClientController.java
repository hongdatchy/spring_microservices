/**
 * Copyright(C) 2022 Phạm Hồng Đạt
 * 22/09/2022
 */
package com.hongdatchy.configclient.controller;

import com.hongdatchy.configclient.config.ClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author hongdatchy
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Autowired
    private ClientConfig clientConfig;

//    @Value("${sample/property2}")
//    private String property2;

    @RequestMapping("/config")
    public String printConfig(){
        return clientConfig.getProperty1() ;
    }
}
