package com.hjl.learn.service;

import com.hjl.learn.domain.Equipment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//开启事务
public interface EquipmentService {
    List<Equipment> queryAll();
}
