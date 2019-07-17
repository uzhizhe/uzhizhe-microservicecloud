package com.uzhizhe.microservice.web.controller;

import com.monker.common.result.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author qingjiang.li
 * @since 2019-06-25 10:40 AM
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/findOne/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResponseDto findOne(@PathVariable Integer id) throws Exception {
        String url = REST_URL_PREFIX + "/user/findOne/" + id;
        return restTemplate.getForObject(url, ResponseDto.class);
    }



}
