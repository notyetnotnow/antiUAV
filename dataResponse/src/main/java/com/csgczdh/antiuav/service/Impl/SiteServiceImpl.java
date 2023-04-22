package com.csgczdh.antiuav.service.Impl;

import com.csgczdh.antiuav.dao.SiteDao;
import com.csgczdh.antiuav.domain.Site;
import com.csgczdh.antiuav.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SiteServiceImpl implements SiteService {
    @Autowired
    private SiteDao siteDao;
    @Override
    public Site selectSiteBySiteId(Integer id) {
        return siteDao.selectSiteBySiteId(id);
    }
}
