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
    public List<Commoditys> getCommodityByName(String name) {
        return dao.selectByName(name);
    }

    @Override
    public Commoditys getCommodityById(int id) {
        //规格
        String str1=dao.selectByPrimaryKey(id).getSpecifications();
        String[] specifications=str1.split(",");
        Commoditys commoditys=dao.selectByPrimaryKey(id);
        commoditys.setSpecifications1(specifications);
        //服务
        String str2=dao.selectByPrimaryKey(id).getServer();
        String[] server=str2.split(",");
        commoditys.setServer1(server);
        return commoditys;
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
