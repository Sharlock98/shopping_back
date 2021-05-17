package com.example.shopping_back.dao;

import com.example.shopping_back.entity.DutyFreeStore;

import java.util.List;

public interface DutyFreeStoreDao {
    List<DutyFreeStore> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(DutyFreeStore record);

    int insertSelective(DutyFreeStore record);

    DutyFreeStore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DutyFreeStore record);

    int updateByPrimaryKey(DutyFreeStore record);
}