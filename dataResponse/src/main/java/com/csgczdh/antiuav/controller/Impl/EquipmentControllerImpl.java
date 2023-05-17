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

import static com.csgczdh.antiuav.controller.Impl.UserControllerImpl.isAdmin;

@Controller
@ResponseBody
public class EquipmentControllerImpl implements EquipmentController {
    @Autowired
    private EquipmentService equipmentService;


    @Override
    @RequestMapping("/insertEquipment")
    public Integer insertSingle(HttpServletRequest request) {
        if (!isAdmin(request)) {
            return -1;
        }
        String name = request.getParameter("name");
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        double elevation = Double.parseDouble(request.getParameter("elevation"));
        String ip = request.getParameter("ip");
        boolean state = Boolean.parseBoolean(request.getParameter("state"));
        Integer type = Integer.parseInt(request.getParameter("type"));
        Integer siteId = Integer.parseInt(request.getParameter("belong"));
        Equipment equipment = new Equipment(null, name, longitude, latitude, elevation, ip, state, type, siteId);
        return equipmentService.insertSingle(equipment);
    }

    @Override
    @RequestMapping("/deleteEquipmentSingleBySiteIdAndType")
    public Integer deleteSingleBySiteIdAndType(HttpServletRequest request) {
        if (!isAdmin(request)) {
            return -1;
        }
        Integer type = Integer.parseInt(request.getParameter("type"));
        Integer siteId = Integer.parseInt(request.getParameter("siteId"));
        return equipmentService.deleteSingleBySiteIdAndType(siteId, type);
    }

    @Override
    @RequestMapping("/updateEquipmentSingleBySiteIdAndType")
    public Integer updateSingleBySiteIdAndType(HttpServletRequest request) {
        if (!isAdmin(request)) {
            return -1;
        }
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
    @RequestMapping("/selectEquipmentAll")
    public List<Equipment> queryAll() {
        List<Equipment> equipments = equipmentService.selectAll();
        System.out.println(equipments);
        return equipments;
    }

    @Override
    @RequestMapping("/updateEquipment")
    public Integer updateById(HttpServletRequest request) {
        if (!isAdmin(request)) {
            return -1;
        }
        String name = request.getParameter("name");
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        double elevation = Double.parseDouble(request.getParameter("elevation"));
        String ip = request.getParameter("ip");
        boolean state = Boolean.parseBoolean(request.getParameter("state"));
        Integer type = Integer.parseInt(request.getParameter("type"));
        Integer id = Integer.parseInt(request.getParameter("id"));

        return equipmentService.updateById(longitude, latitude, elevation, ip, state, name, type, id);
    }
}
