package com.example.web;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.service.UserService;

/**
 * 用户控制器
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userDao;

    @RequestMapping("/view")
    public String view() {
        return "/login";
    }

    @RequestMapping("/indexview")
    public String index() {
        return "/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(User model) {
         userDao.insert(model);
         User user =userDao.find(model).get(0);
        if (user == null || !user.getPassWord().equals(model.getPassWord())) {
            return new ModelAndView("redirect:login.jsp");
        } else {
           // session.setAttribute("user", user);
            ModelAndView mav = new ModelAndView();
            mav.setViewName("index");
            return mav;
        }
    }
    @RequestMapping(value = "/getusers", method = RequestMethod.GET,produces="application/json")
    public List<User> getUser() {
       return userDao.findAll();
   }
}