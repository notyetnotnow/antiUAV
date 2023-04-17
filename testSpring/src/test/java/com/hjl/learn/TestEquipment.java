package com.hjl.learn;

import com.hjl.learn.config.SpringConfig;
import com.hjl.learn.controller.EquipmentController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestEquipment {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EquipmentController equipmentController = context.getBean(EquipmentController.class);
        equipmentController.print();
    }
}
