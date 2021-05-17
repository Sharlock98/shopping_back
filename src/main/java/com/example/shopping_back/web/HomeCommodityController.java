package com.example.shopping_back.web;

import com.example.shopping_back.entity.HomeCommodity;
import com.example.shopping_back.service.HomeCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeCommodityController {
    @Autowired
    private HomeCommodityService service;

    @RequestMapping(value = "/getAllHomeCommodity",method = RequestMethod.GET)
    private List<Object> getAllHomeCommodity(){
        List<Object> list =new ArrayList<>();
        list.add(service.getAllHomeCommodity());
        return list;
    }
    @RequestMapping(value = "/getHomeCommodityById",method = RequestMethod.GET)
    private List<Object> getHomeCommodityById(int id){
        List<Object> list =new ArrayList<>();
        HomeCommodity homeCommodity=service.getHomeCommodityById(id);
        list.add(homeCommodity);
        return list;
    }
}
