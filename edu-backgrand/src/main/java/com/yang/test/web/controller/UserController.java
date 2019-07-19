package com.yang.test.web.controller;

import com.yang.test.mapper.IUserImpl;
import com.yang.test.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.yang.test.model.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "login")
    public String login(@Param("username") String username,@Param("password") String password) {
        User u = new User();
        u = userMapper.login(username,password);
        if(u!=null)
            return "true";
        else
            return "false";
    }

    @RequestMapping(value = "find",method = RequestMethod.GET)
    public User find(@RequestParam("id")  Integer id){
        User user = userMapper.findById(id);
        return user;
    }

    @RequestMapping(value="add",method = RequestMethod.POST)
    public void add(String username,String password){
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        userMapper.add(u);
    }

    @RequestMapping("findAllUser")
    public List<User> findAllUser(){
        List<User> ulist;
        ulist = userMapper.findAllUser();
        return ulist;
    }

    @RequestMapping("deleteById")
    public String deleteById(int id){
        userMapper.deleteById(id);
        return "index";
    }

    @RequestMapping(value="update",method = RequestMethod.POST)
    public String update(User user){
        userMapper.update(user);
        return "index";
    }

    @RequestMapping("findUserForUpdate")
    public User findUserForUpdate(int id){
        User u = new User();
        u=userMapper.findUserForUpdate(id);
        return u;
    }

}
