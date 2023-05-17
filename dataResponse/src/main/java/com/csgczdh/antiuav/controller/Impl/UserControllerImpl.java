package com.csgczdh.antiuav.controller.Impl;

import com.csgczdh.antiuav.controller.UserController;
import com.csgczdh.antiuav.domain.User;
import com.csgczdh.antiuav.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class UserControllerImpl implements UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/checkUser")
    @Override
    public User selectUserByName(HttpServletRequest request) {
        String name = request.getParameter("user");
        String password = request.getParameter("password");
        User user = userService.selectUserByName(name);
        if (user != null) {
            if(user.getPassword().equals(password)){
                HttpSession session = request.getSession();
                isAdmin(request);
                session.setAttribute("user", user);
                return user;
            }
        }
        return null;
    }

    //判断用户有没有权限，有admin权限才可以增删改
    public static boolean isAdmin(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(user == null){
            return false;
        } else {
            return user.getRole().equals("admin");
        }
    }
}
