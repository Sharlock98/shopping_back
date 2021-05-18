package com.example.shopping_back.dao;

import com.example.shopping_back.entity.Commoditys;

import java.util.List;

public interface CommoditysDao {
    List<Commoditys> selectAllCommodity();

    int deleteByPrimaryKey(Integer id);

    int insert(Commoditys record);

    int insertSelective(Commoditys record);

    Commoditys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Commoditys record);

    int updateByPrimaryKey(Commoditys record);
}