package com.csgczdh.antiuav.controller;

import com.csgczdh.antiuav.domain.Equipment;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface EquipmentController {
    Integer insertSingle(HttpServletRequest request);
    Integer deleteSingleBySiteIdAndType(HttpServletRequest request);
    Integer updateSingleBySiteIdAndType(HttpServletRequest request);
    List<Equipment> queryAll();

}
