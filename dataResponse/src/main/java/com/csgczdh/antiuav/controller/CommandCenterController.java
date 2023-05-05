package com.csgczdh.antiuav.controller;

import com.csgczdh.antiuav.domain.CommandCenter;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public interface CommandCenterController {
    CommandCenter selectCenterByCenterIdAndSiteId(HttpServletRequest request);

    List<CommandCenter> selectCenters(HttpServletRequest request);

    Integer insertCenter(HttpServletRequest request);

    Integer updateById(HttpServletRequest request);
}

