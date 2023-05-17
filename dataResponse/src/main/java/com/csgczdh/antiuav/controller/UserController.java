package com.csgczdh.antiuav.controller;

import com.csgczdh.antiuav.domain.User;
import jakarta.servlet.http.HttpServletRequest;

public interface UserController {
    User selectUserByName(HttpServletRequest request);
}
