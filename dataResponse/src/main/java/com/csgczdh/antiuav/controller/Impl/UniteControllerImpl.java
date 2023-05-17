package com.csgczdh.antiuav.controller.Impl;

import com.csgczdh.antiuav.service.CommandCenterService;
import com.csgczdh.antiuav.service.EquipmentService;
import com.csgczdh.antiuav.service.SiteService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Iterator;
import java.util.List;

import static com.csgczdh.antiuav.controller.Impl.UserControllerImpl.isAdmin;


@Controller
@ResponseBody
public class UniteControllerImpl{
    @Autowired
    private CommandCenterService commandCenterService;
    @Autowired
    private SiteService siteService;
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("/sse")
    public ResponseEntity<SseEmitter> getSSE() {
        SseEmitter emitter = new SseEmitter();
        try {
            emitter.send(commandCenterService.selectCenters());
            emitter.complete();

        } catch (Exception ex) {
            emitter.completeWithError(ex);
        }
        return ResponseEntity.ok().body(emitter);
    }

    @RequestMapping("/deleteByLevelAndId")
    public Integer deleteByLevelAndId(HttpServletRequest request){
        if (!isAdmin(request)) {
            return -1;
        }
        Integer level = Integer.parseInt(request.getParameter("level"));
        Integer id = Integer.parseInt(request.getParameter("id"));
        System.out.println(level);
        System.out.println(id);
        Integer rowCount = 0;
        if (level == 1) {
            rowCount = commandCenterService.deleteById(id);
            rowCount = siteService.deleteByCenterId(id);
            List<Integer> sitesIdList = siteService.selectSitesIdByCenterId(id);
            for (Integer integer : sitesIdList) {
                rowCount = equipmentService.deleteBySiteId(integer);
            }
        } else if (level == 2) {
            rowCount = siteService.deleteById(id);
            rowCount = equipmentService.deleteBySiteId(id);
        } else if (level == 3) {
            rowCount = equipmentService.deleteById(id);
        }
        return rowCount;
    }

}
