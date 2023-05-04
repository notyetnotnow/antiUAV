package com.csgczdh.antiuav.dao;


import com.csgczdh.antiuav.domain.Equipment;
import com.csgczdh.antiuav.domain.Site;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SiteDao {


    @Results(id = "siteMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "state", column = "state"),
            @Result(property = "centerId", column = "center_id"),
            @Result(property = "equipmentList",
                    javaType = List.class,
                    many = @Many(select = "com.csgczdh.antiuav.dao.EquipmentDao.selectEquipmentsBySiteId"),
                    column = "id")
    })
    @Select("select s.* from site s " +
            "where s.id = #{siteId}")
    Site selectSiteBySiteId(@Param("siteId") Integer siteId);

    @Results(id = "siteMaps", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "state", column = "state"),
            @Result(property = "centerId", column = "center_id"),
            @Result(property = "equipmentList",
                    javaType = List.class,
                    many = @Many(select = "com.csgczdh.antiuav.dao.EquipmentDao.selectEquipments"),
                    column = "id")
    })
    @Select("select s.* from site s " +
            "where s.center_id = #{centerId}")
    List<Site> selectSites(@Param("centerId") Integer centerId);

    @Delete("delete from site s where s.id = #{id}")
    Integer deleteById(@Param("id") Integer id);

    @Delete("delete from site s where s.center_id = #{centerId}")
    Integer deleteByCenterId(@Param("centerId") Integer centerId);

    @Select("select id from site s where s.center_id = #{centerId}")
    List<Integer> selectSitesIdByCenterId(@Param("centerId") Integer centerId);

    @Insert("insert into site(name, state, center_id) " +
            "values(#{name},#{state},#{centerId})")
    Integer insertSite(@Param("name") String name,@Param("state") Boolean state,@Param("centerId") Integer centerId);
}
