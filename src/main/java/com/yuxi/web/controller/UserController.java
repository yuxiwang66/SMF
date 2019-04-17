package com.yuxi.web.controller;

import com.yuxi.model.User;

import com.yuxi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Controller
//@EnableAutoConfiguration
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserServiceImpl userService;

    org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(UserController.class);

    @RequestMapping("register")
    @ResponseBody
    public String register(String username,String password){


        userService.register(username,password);

        return "success";
    }
    @RequestMapping("login")
//    @ResponseBody
    public String login(String username,String password){



        return "user/list";
    }


}
