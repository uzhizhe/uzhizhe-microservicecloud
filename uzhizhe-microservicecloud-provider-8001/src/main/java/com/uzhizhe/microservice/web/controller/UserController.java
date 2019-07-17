package com.uzhizhe.microservice.web.controller;

import com.monker.common.result.PageResult;
import com.monker.common.result.ResponseDto;
import com.uzhizhe.microservice.entities.User;
import com.uzhizhe.microservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author qingjiang.li
 * @since 2019-06-24 4:40 PM
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseDto add(@RequestBody User user) throws Exception {
        //1.参数校验
        //2.添加
        Date date = new Date();
        user.setCreateTime(date);
        user.setUpdateTime(date);

        userService.add(user);
        //3.返回
        return ResponseDto.success();
    }

    @RequestMapping(value = "/findOne/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResponseDto<User> findById(@PathVariable Integer id) throws Exception {
        //log.info("user findOne, id={}", id);
        //1.参数校验
        //2.查询
        User user = userService.query(id);
        //3.返回
        return ResponseDto.success(user);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResponseDto<User> findAll() throws Exception {
        //1.参数校验
        //2.查询
        List<User> userList = userService.queryAll();
        PageResult<User> pageResult = new PageResult<>();
        pageResult.setPageNumber(1);
        pageResult.setPageSize(userList.size());
        pageResult.setTotalNumber(userList.size());
        pageResult.setData(userList);

        //3.返回
        return ResponseDto.success(pageResult);
    }


}
