package com.csgczdh.antiuav.service;

import com.csgczdh.antiuav.domain.Site;
import org.springframework.transaction.annotation.Transactional;

@Transactional//开启事务
public interface SiteService {


    Site selectSiteBySiteId(Integer id);
}
