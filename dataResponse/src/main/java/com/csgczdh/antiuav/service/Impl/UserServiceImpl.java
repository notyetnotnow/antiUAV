package com.csgczdh.antiuav.service.Impl;

import com.csgczdh.antiuav.dao.UserDao;
import com.csgczdh.antiuav.domain.User;
import com.csgczdh.antiuav.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserByName(String name) {
        return userDao.selectUserByName(name);
    }
}
