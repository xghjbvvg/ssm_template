package com.company;

import com.company.domain.User;
import com.company.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
public class UserTest {

    @Autowired
    IUserService userService;
    @Test
    public void findAll(){
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
