package com.csgczdh.antiuav.service;

import com.csgczdh.antiuav.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    User selectUserByName(String name);
}
