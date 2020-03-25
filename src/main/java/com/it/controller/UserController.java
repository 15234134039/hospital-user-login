package com.it.controller;

import com.it.pojo.TbUser;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public void find(String username){
        TbUser user = userService.findOne(username);
        System.out.println(user);
    }
}
