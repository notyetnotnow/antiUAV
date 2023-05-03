package com.csgczdh.antiuav.controller.Impl;

import com.csgczdh.antiuav.controller.CommandCenterController;
import com.csgczdh.antiuav.domain.CommandCenter;
import com.csgczdh.antiuav.service.CommandCenterService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.List;

@Controller
@ResponseBody
public class CommandCenterControllerImpl implements CommandCenterController {
    @Autowired
    private CommandCenterService commandCenterService;

    @Override
    @RequestMapping("/selectCenterByCenterIdAndSiteId")
    public CommandCenter selectCenterByCenterIdAndSiteId(HttpServletRequest request) {
        Integer centerId = Integer.parseInt(request.getParameter("centerId"));
        Integer siteId = Integer.parseInt(request.getParameter("siteId"));
        return commandCenterService.selectCenterByCenterIdAndSiteId(centerId, siteId);
    }

    @Override
    @RequestMapping("/selectCenters")
    public List<CommandCenter> selectCenters(HttpServletRequest request) {
        return commandCenterService.selectCenters();
    }

    @GetMapping("/sse")
    public ResponseEntity<SseEmitter> getSSE() {
        SseEmitter emitter = new SseEmitter();
        try {
            if(true){
                emitter.send(commandCenterService.selectCenters());
                emitter.complete();
            }

        } catch (Exception ex) {
            emitter.completeWithError(ex);
        }
        return ResponseEntity.ok().body(emitter);
    }
}
