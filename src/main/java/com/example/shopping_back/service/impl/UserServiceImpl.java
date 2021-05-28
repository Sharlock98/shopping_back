package com.example.shopping_back.service.impl;

import com.example.shopping_back.dao.UserDao;
import com.example.shopping_back.entity.User;
import com.example.shopping_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public List<User> getUserInfoByPhone(String phone) {
        return dao.selectByPhone(phone);
    }

    @Override
    public boolean makeSureByName(String username, String password) {
        return dao.selectByName(username,password);
    }
}
