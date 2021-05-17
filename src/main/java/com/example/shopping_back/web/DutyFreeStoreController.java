package com.example.shopping_back.web;

import com.example.shopping_back.entity.DutyFreeStore;
import com.example.shopping_back.service.DutyFreeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DutyFreeStoreController {
    @Autowired
    private DutyFreeStoreService service;

    @RequestMapping(value = "/getAllDutyFreeStore",method = RequestMethod.GET)
    private List<Object> getAllDutyFreeStore(){
        List<Object> list =new ArrayList<>();
        list.add(service.getAllDutyFreeStore());
        return list;
    }
    @RequestMapping(value = "/getDutyFreeById",method = RequestMethod.GET)
    private List<Object> getDutyFreeById(int id) {
        List<Object> list=new ArrayList<>();
        DutyFreeStore dutyFreeStore=service.getDutyFreeStoreById(id);
        list.add(dutyFreeStore);
        return list;
    }
}
