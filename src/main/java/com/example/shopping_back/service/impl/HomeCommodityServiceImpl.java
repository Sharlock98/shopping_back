package com.example.shopping_back.service.impl;

import com.example.shopping_back.dao.HomeCommodityDao;
import com.example.shopping_back.entity.HomeCommodity;
import com.example.shopping_back.service.HomeCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeCommodityServiceImpl implements HomeCommodityService {
    @Autowired
    private HomeCommodityDao dao;

    @Override
    public List<HomeCommodity> getAllHomeCommodity() {
        return dao.selectAllHomeCommodity();
    }

    @Override
    public HomeCommodity getHomeCommodityById(int id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteHomeCommodity(int id) {
        return dao.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean modifyHomeCommodity(HomeCommodity homeCommodity) {
        return dao.updateByPrimaryKeySelective(homeCommodity)>0;
    }

    @Override
    public boolean addHomeCommodity(HomeCommodity homeCommodity) {
        return dao.insert(homeCommodity)>0;
    }
}
