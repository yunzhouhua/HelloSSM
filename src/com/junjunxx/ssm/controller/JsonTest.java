package com.junjunxx.ssm.controller;

import com.junjunxx.ssm.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class JsonTest {

    @RequestMapping(value = "/requestJson", method = RequestMethod.GET)
    public @ResponseBody User requestJson(){
        User user = new User();
        user.setId(1);
        user.setUsername("huayunzhou");
        user.setSex("Male");
        user.setAddress("红星路100号");
        user.setBirthday(new Date());
        return user;
    }

}
