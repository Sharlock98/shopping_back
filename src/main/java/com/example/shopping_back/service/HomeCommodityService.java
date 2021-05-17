package com.example.shopping_back.service;

import com.example.shopping_back.entity.HomeCommodity;

import java.util.List;

public interface HomeCommodityService {
    List<HomeCommodity> getAllHomeCommodity();

    HomeCommodity getHomeCommodityById(int id);

    boolean deleteHomeCommodity(int id);

    boolean modifyHomeCommodity(HomeCommodity homeCommodity);

    boolean addHomeCommodity(HomeCommodity homeCommodity);
}
