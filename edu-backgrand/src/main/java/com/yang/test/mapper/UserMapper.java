package com.yang.test.mapper;
import com.yang.test.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface UserMapper extends BaseMapper<User> {

    //特有的方法
    public User login(@Param("username") String username,@Param("password") String password);

    public List<User> findAllUser();

    public User findUserForUpdate(int id);
}
