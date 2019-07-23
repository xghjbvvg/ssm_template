package com.company.controller;

import com.company.domain.User;
import com.company.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAll();
    }
}
