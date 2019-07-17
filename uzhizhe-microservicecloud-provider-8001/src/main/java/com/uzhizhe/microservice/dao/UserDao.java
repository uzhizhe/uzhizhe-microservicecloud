package com.uzhizhe.microservice.dao;

import com.uzhizhe.microservice.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author qingjiang.li
 * @since 2019-06-24 4:19 PM
 */
@Mapper
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();
}
