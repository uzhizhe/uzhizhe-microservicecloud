package com.uzhizhe.microservice.service.impl;

import com.monker.common.exception.ErrorServiceException;
import com.uzhizhe.microservice.cache.UserRedisService;
import com.uzhizhe.microservice.dao.UserDao;
import com.uzhizhe.microservice.entities.User;
import com.uzhizhe.microservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qingjiang.li
 * @since 2019-06-24 4:23 PM
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    private UserDao userDao;

    @Autowired
    private UserRedisService userRedisService;

    /**
     * add user
     *
     * @param user
     * @return
     */
    @Override
    public User add(User user) throws Exception {
        int insert = userDao.insert(user);
        if (insert != 1) {
            throw new ErrorServiceException("添加用户-数据库操作失败");
        }
        return user;
    }

    /**
     * query user by id
     *
     * @param id
     * @return
     */
    @Override
    public User query(Integer id) throws Exception {
//        User user = userRedisService.queryById(id);
//        if (user == null) {
//            //log.info("query by mysql");
//            user = userDao.selectByPrimaryKey(id);
//            if (user != null) {
//                userRedisService.add(user);
//            }
//        }
        User user = userDao.selectByPrimaryKey(id);
        return user;
    }

    /**
     * query all user
     *
     * @return
     */
    @Override
    public List<User> queryAll() throws Exception {
        List<User> userList = userDao.selectAll();
        return userList;
    }
}
