package com.csgczdh.antiuav.dao;

import com.csgczdh.antiuav.domain.Site;
import com.csgczdh.antiuav.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    @Results(id = "userMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "user_name"),
            @Result(property = "password", column = "password"),
            @Result(property = "role", column = "role"),
    })
    @Select("select u.* from user u " +
            "where u.user_name = #{name}")
    User selectUserByName(@Param("name") String name);
}
