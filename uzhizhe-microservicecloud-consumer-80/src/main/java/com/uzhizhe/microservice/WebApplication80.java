package com.uzhizhe.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qingjiang.li
 * @since 2019-06-25 10:52 AM
 */
@SpringBootApplication
@EnableEurekaClient
public class WebApplication80 {

    private static final Logger log = LoggerFactory.getLogger(WebApplication80.class);


    public static void main(String[] args) {
        SpringApplication.run(WebApplication80.class, args);
        log.info(" ===>>> WebApplication80 init successful.");
    }

}
