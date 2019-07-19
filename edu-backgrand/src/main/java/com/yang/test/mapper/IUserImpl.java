package com.yang.test.mapper;

import com.yang.test.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public  class IUserImpl extends BaseUserImpl<User> implements UserMapper{
    @Override
    public User login(String username, String password) {
        return userMapper.login(username,password);
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(User u) {

    }

    @Override
    public void add(User u) {

    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findUserForUpdate(int id) {
        return userMapper.findUserForUpdate(id);
    }
}
