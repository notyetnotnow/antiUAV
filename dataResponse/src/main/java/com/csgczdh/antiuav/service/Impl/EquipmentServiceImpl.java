package com.csgczdh.antiuav.service.Impl;

import com.csgczdh.antiuav.dao.EquipmentDao;
import com.csgczdh.antiuav.domain.Equipment;
import com.csgczdh.antiuav.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentDao equipmentDao;

    @Override
    public Integer insertSingle(Equipment equipment) {
        return equipmentDao.insertSingle(equipment);
    }

    @Override
    public Integer deleteSingleBySiteIdAndType(Integer siteId, Integer type) {
        return equipmentDao.deleteSingleBySiteIdAndType(siteId, type);
    }

    @Override
    public Integer updateSingleBySiteIdAndType(Double longitude, Double latitude, Double elevation, String ip, Boolean state, Integer siteId, Integer type) {
        return equipmentDao.updateSingleBySiteIdAndType(longitude, latitude, elevation, ip, state, siteId, type);
    }

    @Override
    public Integer updateById(Double longitude, Double latitude, Double elevation, String ip, Boolean state, String name, Integer type, Integer id) {
        return equipmentDao.updateById(longitude, latitude, elevation, ip, state, name, type, id);
    }


    @Override
    public List<Equipment> selectAll() {
        return equipmentDao.selectAll();
    }

    @Override
    public Integer deleteById(Integer id) {
        return equipmentDao.deleteById(id);
    }

    @Override
    public Integer deleteBySiteId(Integer siteId) {
        return equipmentDao.deleteBySiteId(siteId);
    }


}
