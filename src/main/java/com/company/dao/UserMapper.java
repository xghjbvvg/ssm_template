package com.company.dao;


import com.company.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllUser();
}
