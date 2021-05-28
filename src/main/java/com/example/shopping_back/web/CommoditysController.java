package com.example.shopping_back.web;

import com.example.shopping_back.entity.Commoditys;
import com.example.shopping_back.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommoditysController {
    @Autowired
    private CommodityService service;

    @RequestMapping(value = "/getAllCommodity",method = RequestMethod.GET)
    private List<Object> getAllCommodity(){
        List<Object> list =new ArrayList<>();
        list.add(service.getAllCommodity());
        return list;
    }
    @RequestMapping(value = "/getCommodityById",method = RequestMethod.GET)
    private List<Object> getCommodityById(int id){
        List<Object> list =new ArrayList<>();
        list.add(service.getCommodityById(id));
        return list;
    }
    @RequestMapping(value = "/getCommodityByName",method = RequestMethod.GET)
    private List<Object> getCommodityByName(String name){
        List<Object> list =new ArrayList<>();
        list.add(service.getCommodityByName(name));
        return list;
    }
}
