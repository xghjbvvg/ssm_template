package com.company.service.impl;

import com.company.dao.UserMapper;
import com.company.domain.User;
import com.company.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    public List<User> findAll() {
        return userMapper.findAllUser();
    }
}
