package com.hjl.learn.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hjl.learn.domain.Equipment;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HelloController {
    // @RequestMapping注解：处理请求和控制器方法之间的映射关系
    // @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径
    // localhost:8080/
    @RequestMapping("/")
    public String index() {
        return "/WEB-INF/index.html";
    }
    @RequestMapping("testResponse")
    public void sendJson(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String id = httpServletRequest.getParameter("id");
        String name = httpServletRequest.getParameter("name");
        System.out.println("id is" + id + "name is" + name);
        //调用service得到对象结果
        Equipment equipment = new Equipment();
        equipment.setId(Integer.parseInt(id));
        equipment.setName(name);

        //把对象转为json
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(equipment);
        System.out.println("服务器端对象转为json==" + json);

        //输出json，相应ajax
        httpServletResponse.setContentType("application/json;charset=utf-8");
        PrintWriter pw = httpServletResponse.getWriter();
        pw.println(json);
        pw.flush();
        pw.close();
    }
    @RequestMapping("testResponseBody")
    @ResponseBody
    public Equipment testResponseBody(){
        return new Equipment(1,"张三",107.6,31.2,300.0,"192.168.62.13",true,0,"老龙山");
    }

}