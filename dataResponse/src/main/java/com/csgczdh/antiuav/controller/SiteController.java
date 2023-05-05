package com.csgczdh.antiuav.controller;

import com.csgczdh.antiuav.domain.Site;
import jakarta.servlet.http.HttpServletRequest;

public interface SiteController {
    Site selectSiteBySiteId(HttpServletRequest request);

    Integer insertSite(HttpServletRequest request);
    Integer updateById(HttpServletRequest request);
}
