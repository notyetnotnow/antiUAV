package com.csgczdh.antiuav.service.Impl;

import com.csgczdh.antiuav.dao.CommandCenterDao;
import com.csgczdh.antiuav.domain.CommandCenter;
import com.csgczdh.antiuav.service.CommandCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandCenterServiceImpl implements CommandCenterService {
    @Autowired
    private CommandCenterDao commandCenterDao;
    @Override
    public CommandCenter selectCenterByCenterIdAndSiteId(Integer centerId, Integer siteId) {
        return commandCenterDao.selectCenterByCenterIdAndSiteId(centerId, siteId);
    }

    @Override
    public List<CommandCenter> selectCenters() {
        return commandCenterDao.selectCenters();
    }

    @Override
    public Integer deleteById(Integer id) {
        return commandCenterDao.deleteById(id);
    }

    @Override
    public Integer insertCenter(String centerName, Boolean centerState) {
        return commandCenterDao.insertCenter(centerName, centerState);
    }

}
