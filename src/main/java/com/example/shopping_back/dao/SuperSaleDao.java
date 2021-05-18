package com.example.shopping_back.dao;

import com.example.shopping_back.entity.SuperSale;

public interface SuperSaleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SuperSale record);

    int insertSelective(SuperSale record);

    SuperSale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SuperSale record);

    int updateByPrimaryKey(SuperSale record);
}