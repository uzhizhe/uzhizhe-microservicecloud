package com.uzhizhe.microservice.cache;

import com.uzhizhe.microservice.entities.User;

/**
 * @author qingjiang.li
 * @since 2019-06-25 9:30 AM
 */
public interface UserRedisService {

    /**
     * add user cache
     * @param user
     * @return
     */
    boolean add(User user);

    /**
     * query by id
     * @param id
     * @return
     */
    User queryById(Integer id);



}
