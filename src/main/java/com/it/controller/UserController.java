package com.it.controller;

import com.it.common.Result;
import com.it.pojo.TbUser;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public void find(String username){
        TbUser user = userService.findOne(username);
        System.out.println(user);
    }

    @RequestMapping("/register")
    public Result register(@RequestBody TbUser user){
        user.setCreated(new Date());
        user.setUpdated(new Date());
        int num = userService.insert(user);
        if(num > 0){
            return new Result(true, "注册成功");
        } else {
            return new Result(false, "注册失败");
        }

    }
}
