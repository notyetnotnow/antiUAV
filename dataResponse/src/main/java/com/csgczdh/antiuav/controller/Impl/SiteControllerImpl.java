package com.csgczdh.antiuav.controller.Impl;

import com.csgczdh.antiuav.controller.SiteController;
import com.csgczdh.antiuav.domain.Site;
import com.csgczdh.antiuav.service.SiteService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SiteControllerImpl implements SiteController {

    @Autowired
    private SiteService siteService;

    @Override
    @RequestMapping("/selectSiteBySiteId")
    @ResponseBody
    public Site selectSiteBySiteId(HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        return siteService.selectSiteBySiteId(id);
    }
}
