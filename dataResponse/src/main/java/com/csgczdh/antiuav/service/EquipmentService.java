package com.csgczdh.antiuav.service;

import com.csgczdh.antiuav.domain.Equipment;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//开启事务
public interface EquipmentService {
    Integer insertSingle(Equipment equipment);
    Integer deleteSingleBySiteIdAndType(Integer siteId, Integer type);
    Integer updateSingleBySiteIdAndType(Double longitude, Double latitude, Double elevation, String ip,
                                        Boolean state, Integer siteId,Integer type);

    Integer updateById(Double longitude, Double latitude, Double elevation, String ip,
                       Boolean state, String name, Integer type, Integer id);
    List<Equipment> selectAll();

    Integer deleteById(Integer id);

    Integer deleteBySiteId(Integer siteId);

}
