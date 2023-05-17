package com.csgczdh.antiuav.controller.Impl;

import com.csgczdh.antiuav.controller.SiteController;
import com.csgczdh.antiuav.domain.Site;
import com.csgczdh.antiuav.service.SiteService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.csgczdh.antiuav.controller.Impl.UserControllerImpl.isAdmin;

@Controller
@ResponseBody
public class SiteControllerImpl implements SiteController {

    @Autowired
    private SiteService siteService;

    @Override
    @RequestMapping("/selectSiteBySiteId")
    public Site selectSiteBySiteId(HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        return siteService.selectSiteBySiteId(id);
    }

    @Override
    @RequestMapping("/insertSite")
    public Integer insertSite(HttpServletRequest request) {
        if (!isAdmin(request)) {
            return -1;
        }
        String name = request.getParameter("name");
        Boolean state = Boolean.parseBoolean(request.getParameter("state"));
        Integer belong = Integer.parseInt(request.getParameter("belong"));
        return siteService.insertSite(name, state, belong);
    }

    @Override
    @RequestMapping("/updateSite")
    public Integer updateById(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (!isAdmin(request)) {
            return -1;
        }
        String name = request.getParameter("name");
        Boolean state = Boolean.parseBoolean(request.getParameter("state"));
        Integer id = Integer.parseInt(request.getParameter("id"));
        return siteService.updateById(name, state, id);
    }

}
