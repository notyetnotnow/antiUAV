package com.csgczdh.antiuav.service;

import com.csgczdh.antiuav.domain.Site;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//开启事务
public interface SiteService {


    Site selectSiteBySiteId(Integer id);

    Integer deleteById(Integer id);

    Integer deleteByCenterId(Integer centerId);

    List<Integer> selectSitesIdByCenterId(Integer centerId);

    Integer insertSite(String name, Boolean state, Integer belong);

    Integer updateById(String name, Boolean state, Integer id);
}
