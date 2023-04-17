package com.hjl.learn;

import com.hjl.learn.controller.EquipmentController;
import com.hjl.learn.controller.Impl.EquipmentControllerImpl;
import com.hjl.learn.service.EquipmentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEquipment {
    @Test
    public void testServiceQueryAll(){
        ApplicationContext context = new AnnotationConfigApplicationContext(com.hjl.learn.config.SpringConfig.class);
        EquipmentService equipmentService = context.getBean(EquipmentService.class);
        System.out.println(equipmentService.queryAll());
    }
    @Test
    public void testControllerQueryAll(){
        ApplicationContext context = new AnnotationConfigApplicationContext(com.hjl.learn.config.SpringConfig.class);
        EquipmentController equipmentController = context.getBean(EquipmentController.class);
        System.out.println(equipmentController.queryAll());
    }
}
