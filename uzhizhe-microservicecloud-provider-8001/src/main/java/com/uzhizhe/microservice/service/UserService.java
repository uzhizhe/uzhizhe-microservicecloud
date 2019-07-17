package com.uzhizhe.microservice.service;

import com.uzhizhe.microservice.entities.User;

import java.util.List;

/**
 * @author qingjiang.li
 * @since 2019-06-24 4:19 PM
 */
public interface UserService {

    /**
     * add user
     *
     * @param user
     * @return
     */
    User add(User user) throws Exception;

    /**
     * query user by id
     *
     * @param id
     * @return
     */
    User query(Integer id) throws Exception;

    /**
     * query all user
     *
     * @return
     */
    List<User> queryAll() throws Exception;

}
