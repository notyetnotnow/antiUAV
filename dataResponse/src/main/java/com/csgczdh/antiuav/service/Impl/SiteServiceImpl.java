package com.csgczdh.antiuav.service.Impl;

import com.csgczdh.antiuav.dao.SiteDao;
import com.csgczdh.antiuav.domain.Site;
import com.csgczdh.antiuav.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteDao siteDao;
    @Override
    public Site selectSiteBySiteId(Integer id) {
        return siteDao.selectSiteBySiteId(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return siteDao.deleteById(id);
    }

    @Override
    public Integer deleteByCenterId(Integer centerId) {
        return siteDao.deleteByCenterId(centerId);
    }

    @Override
    public List<Integer> selectSitesIdByCenterId(Integer centerId) {
        return siteDao.selectSitesIdByCenterId(centerId);
    }

    @Override
    public Integer insertSite(String name, Boolean state,Integer belong) {
        return siteDao.insertSite(name, state, belong);
    }

    @Override
    public Integer updateById(String name, Boolean state, Integer id) {
        return siteDao.updateById(name, state, id);
    }
}
