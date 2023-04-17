package com.hjl.learn.service.Impl;

import com.hjl.learn.dao.EquipmentDao;
import com.hjl.learn.domain.Equipment;
import com.hjl.learn.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentDao equipmentDao;

    public List<Equipment> queryAll() {
        return equipmentDao.queryAll();
    }
}
