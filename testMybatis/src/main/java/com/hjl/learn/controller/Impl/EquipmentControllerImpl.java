package com.hjl.learn.controller.Impl;

import com.hjl.learn.controller.EquipmentController;
import com.hjl.learn.domain.Equipment;
import com.hjl.learn.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("equipmentController")
public class EquipmentControllerImpl implements EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    public List<Equipment> queryAll(){
        return equipmentService.queryAll();
    }
}
