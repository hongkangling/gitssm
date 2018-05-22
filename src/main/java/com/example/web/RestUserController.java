package com.example.web;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

/**
 * 用户控制器
 */
@RestController
@RequestMapping(value = "/restuser")
public class RestUserController {
    @Resource
    private UserService userDao;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestBody User model) {
         userDao.insert(model);
         User user =userDao.find(model).get(0);
         return user;
    }
    @RequestMapping(value = "/getusers", method = RequestMethod.POST)
    public List<User> getUser(@RequestBody String userName) {
       return userDao.find(new User(null,userName));
   }
}