package com.csgczdh.antiuav.dao;

import com.csgczdh.antiuav.domain.CommandCenter;
import com.csgczdh.antiuav.domain.Site;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CommandCenterDao {
    @Results(id = "centerCommandMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "state", column = "state"),
            @Result(property = "siteList",
                    javaType = List.class,
                    many = @Many(select = "com.csgczdh.antiuav.dao.SiteDao.selectSiteBySiteId"),
                    column = "id")
    })
    @Select("select c.* from command_center c " +
            "where c.id = #{centerId}")
    CommandCenter selectCenterByCenterIdAndSiteId(@Param("centerId") Integer centerId, @Param("siteId") Integer siteId);

    @Results(id = "centerCommandMaps", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "state", column = "state"),
            @Result(property = "siteList",
                    javaType = List.class,
                    many = @Many(select = "com.csgczdh.antiuav.dao.SiteDao.selectSites"),
                    column = "id")
    })
    @Select("select c.* from command_center c ")
    List<CommandCenter> selectCenters();
}
