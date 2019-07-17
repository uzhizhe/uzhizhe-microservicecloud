package com.uzhizhe.microservice.cache.impl;

import com.uzhizhe.microservice.cache.UserRedisService;
import com.uzhizhe.microservice.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * @author qingjiang.li
 * @since 2019-06-25 9:33 AM
 */
@Service
public class UserRedisServiceImpl implements UserRedisService {

    private static final String REDIS_PRE = "uzhizhe.microservicecloud.";

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * add user cache
     *
     * @param user
     * @return
     */
    @Override
    public boolean add(User user) {
        String key = REDIS_PRE + "user." + user.getId();
        ValueOperations operations = redisTemplate.opsForValue();
        operations.set(key, user);
        return true;
    }

    /**
     * query by id
     *
     * @param id
     * @return
     */
    @Override
    public User queryById(Integer id) {
        String key = REDIS_PRE + "user." + id;
        ValueOperations operations = redisTemplate.opsForValue();
        Object obj = operations.get(key);
        if (obj != null) {
            return (User) obj;
        }
        return null;
    }
}
