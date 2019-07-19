package com.yang.test.mapper;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseUserImpl<T> implements BaseMapper<T>{

    //统一管理DAO
    @Autowired
    protected UserMapper userMapper;
}
