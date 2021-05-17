package com.example.shopping_back.dao;

import com.example.shopping_back.entity.HomeCommodity;

import java.util.List;

public interface HomeCommodityDao {
    List<HomeCommodity> selectAllHomeCommodity();

    int deleteByPrimaryKey(Integer id);

    int insert(HomeCommodity record);

    int insertSelective(HomeCommodity record);

    HomeCommodity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomeCommodity record);

    int updateByPrimaryKey(HomeCommodity record);
}