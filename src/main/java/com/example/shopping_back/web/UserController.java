package com.example.shopping_back.web;

import com.example.shopping_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/getUserInfoByPhone",method = RequestMethod.GET)
    private List<Object> getUserInfoByPhone(String phone){
        List<Object> list =new ArrayList<>();
        list.add(service.getUserInfoByPhone(phone));
        return list;
    }
    @RequestMapping(value = "/makeSureByName",method = RequestMethod.GET)
    private boolean makeSureByName(String username,String password){
        return service.makeSureByName(username,password);
    }
}
