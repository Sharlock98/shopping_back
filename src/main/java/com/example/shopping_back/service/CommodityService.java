package com.example.shopping_back.service;


import com.example.shopping_back.entity.Commoditys;

import java.util.List;

public interface CommodityService {
    List<Commoditys> getAllCommodity();

    Commoditys getCommodityById(int id);

    boolean deleteCommodity(int id);

    boolean modifyCommodity(Commoditys commoditys);

    boolean addCommodity(Commoditys commoditys);
}
