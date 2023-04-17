package com.csgczdh.antiuav.controller.Impl;

import com.csgczdh.antiuav.controller.EquipmentController;
import com.csgczdh.antiuav.domain.Equipment;
import com.csgczdh.antiuav.service.EquipmentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EquipmentControllerImpl implements EquipmentController {
    @Autowired
    private EquipmentService equipmentService;


    @Override
    @RequestMapping("/insertSingle")
    @ResponseBody
    public Integer insertSingle(HttpServletRequest request) {
        String name = request.getParameter("name");
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        double elevation = Double.parseDouble(request.getParameter("elevation"));
        String ip = request.getParameter("ip");
        boolean state = Boolean.parseBoolean(request.getParameter("state"));
        Integer type = Integer.parseInt(request.getParameter("type"));
        Integer siteId = Integer.parseInt(request.getParameter("siteId"));
        Equipment equipment = new Equipment(null, name, longitude, latitude, elevation, ip, state, type, siteId);
        return equipmentService.insertSingle(equipment);
    }

    @Override
    @RequestMapping("/deleteSingleBySiteIdAndType")
    @ResponseBody
    public Integer deleteSingleBySiteIdAndType(HttpServletRequest request) {
        Integer type = Integer.parseInt(request.getParameter("type"));
        Integer siteId = Integer.parseInt(request.getParameter("siteId"));
        return equipmentService.deleteSingleBySiteIdAndType(siteId, type);
    }

    @Override
    @RequestMapping("/updateSingleBySiteIdAndType")
    @ResponseBody
    public Integer updateSingleBySiteIdAndType(HttpServletRequest request) {
        Double longitude = Double.parseDouble(request.getParameter("longitude"));
        Double latitude = Double.parseDouble(request.getParameter("latitude"));
        Double elevation = Double.parseDouble(request.getParameter("elevation"));
        String ip = request.getParameter("ip");
        Boolean state = Boolean.parseBoolean(request.getParameter("state"));
        Integer type = Integer.parseInt(request.getParameter("type"));
        Integer siteId = Integer.parseInt(request.getParameter("siteId"));
        return equipmentService.updateSingleBySiteIdAndType(longitude, latitude, elevation, ip, state, siteId, type);
    }


    @Override
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Equipment> queryAll() {
        List<Equipment> equipments = equipmentService.queryAll();
        System.out.println(equipments);
        return equipments;
    }
}
