package com.hjl.learn.controller;

import com.hjl.learn.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;
    public void print(){
        System.out.println("controller is exe");
        equipmentService.print();
    }
}
