package com.hjl.learn.dao;

import com.hjl.learn.domain.Equipment;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface EquipmentDao {
    @Select("select id, name, longitude, latitude, elevation, ip, state, type, siteName from equipment")
    List<Equipment> queryAll();
}
