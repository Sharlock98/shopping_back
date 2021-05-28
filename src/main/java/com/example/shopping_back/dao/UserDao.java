package com.example.shopping_back.dao;

import com.example.shopping_back.entity.User;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectByPhone(String phone);

    boolean selectByName(String username,String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}