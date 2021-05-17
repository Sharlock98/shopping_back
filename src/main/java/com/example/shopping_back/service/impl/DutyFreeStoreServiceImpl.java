package com.example.shopping_back.service.impl;

import com.example.shopping_back.dao.DutyFreeStoreDao;
import com.example.shopping_back.entity.DutyFreeStore;
import com.example.shopping_back.service.DutyFreeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyFreeStoreServiceImpl implements DutyFreeStoreService {
    @Autowired
    private DutyFreeStoreDao dao;

    @Override
    public List<DutyFreeStore> getAllDutyFreeStore() {
        return dao.selectAll();
    }

    @Override
    public DutyFreeStore getDutyFreeStoreById(int id) {
        return dao.selectByPrimaryKey(id);
    }
}
