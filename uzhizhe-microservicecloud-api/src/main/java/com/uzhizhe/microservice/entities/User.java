package com.uzhizhe.microservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * microservice_user
 * @author qingjiang.li
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * phone
     */
    private String phone;

    /**
     * age
     */
    private Integer age;

    /**
     * gender
     */
    private Byte gender;

    /**
     * create time
     */
    private Date createTime;

    /**
     * update time
     */
    private Date updateTime;



}