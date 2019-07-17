package com.uzhizhe.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qingjiang.li
 * @since 2019-06-24 5:13 PM
 */
@SpringBootApplication
@EnableEurekaClient
public class WebApplication8001 {

    private static final Logger log = LoggerFactory.getLogger(WebApplication8001.class);

    public static void main(String[] args) {
        SpringApplication.run(WebApplication8001.class, args);
        log.info(" ===>>> WebApplication8001 init successful");
    }

}
