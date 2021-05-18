package com.example.shopping_back.service;

import com.example.shopping_back.entity.DutyFreeStore;

import java.util.List;

public interface DutyFreeStoreService {
    List<DutyFreeStore> getAllDutyFreeStore();

    DutyFreeStore getDutyFreeStoreById(int id);


}
