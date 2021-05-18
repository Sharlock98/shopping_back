package com.example.shopping_back.service.impl;

import com.example.shopping_back.dao.CommoditysDao;
import com.example.shopping_back.entity.Commoditys;
import com.example.shopping_back.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommoditysDao dao;

    @Override
    public List<Commoditys> getAllCommodity() {
        return dao.selectAllCommodity();
    }

    @Override
    public Commoditys getCommodityById(int id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteCommodity(int id) {
        return dao.deleteByPrimaryKey(id)>0;
    }

    @Override
    public boolean modifyCommodity(Commoditys commoditys) {
        return dao.updateByPrimaryKeySelective(commoditys)>0;
    }

    @Override
    public boolean addCommodity(Commoditys commodity) {
        return dao.insert(commodity)>0;
    }
}
