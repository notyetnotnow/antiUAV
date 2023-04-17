package com.hjl.learn.dao.impl;

import com.hjl.learn.dao.EquipmentDao;
import com.hjl.learn.domain.Equipment;
import org.springframework.stereotype.Repository;

@Repository
public class EquipmentDaoImpl implements EquipmentDao {
    @Override
    public void print() {
        System.out.println("dao is exe");
    }
}
