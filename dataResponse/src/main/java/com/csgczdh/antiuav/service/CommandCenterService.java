package com.csgczdh.antiuav.service;

import com.csgczdh.antiuav.domain.CommandCenter;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//开启事务
public interface CommandCenterService {

    CommandCenter selectCenterByCenterIdAndSiteId(Integer centerId, Integer siteId);

    List<CommandCenter> selectCenters();

    Integer deleteById(Integer id);

    Integer insertCenter(String centerName, Boolean centerState);
}
