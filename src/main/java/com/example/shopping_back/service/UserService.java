package com.example.shopping_back.service;

import com.example.shopping_back.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserInfoByPhone(String phone);

    boolean makeSureByName(String username,String password);
}
