package com.hjl.learn.service.impl;

import com.hjl.learn.dao.EquipmentDao;
import com.hjl.learn.dao.impl.EquipmentDaoImpl;
import com.hjl.learn.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentDao equipmentDao;
    @Override
    public void print() {
        System.out.println("service is exe");
        equipmentDao.print();
    }
}
