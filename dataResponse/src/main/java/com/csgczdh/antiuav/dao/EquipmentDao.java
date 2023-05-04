package com.csgczdh.antiuav.dao;

import com.csgczdh.antiuav.domain.Equipment;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EquipmentDao {

    @Insert("insert into equipment (id, name, longitude, latitude, elevation, ip, state, type, siteId) " +
            "values(null, #{name}, #{longitude}, #{latitude}, #{elevation}, #{ip}, #{state}, #{type}, #{siteId})")
    Integer insertSingle(Equipment equipment);

    @Delete("delete from equipment where site_id = #{siteId} and type = #{type}")
    Integer deleteSingleBySiteIdAndType(@Param("siteId") Integer siteId,@Param("type") Integer type);

    @Delete("delete from equipment e where e.id = #{id}")
    Integer deleteById(@Param("id") Integer id);

    @Delete("delete from equipment e where e.site_id = #{siteId}")
    Integer deleteBySiteId(@Param("siteId") Integer siteId);

    @Update("update equipment set longitude = #{longitude}, latitude = #{latitude}, elevation = #{elevation}, " +
            "ip = #{ip}, state = #{state} " +
            "where site_id = #{siteId} and type = #{type}")
    Integer updateSingleBySiteIdAndType(@Param("longitude") Double longitude,
                                        @Param("latitude") Double latitude,
                                        @Param("elevation") Double elevation,
                                        @Param("ip") String ip,
                                        @Param("state") Boolean state,
                                        @Param("siteId") Integer siteId,
                                        @Param("type") Integer type);
    @Results(id = "equipmentMap" ,value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "longitude", column = "longitude"),
            @Result(property = "latitude", column = "latitude"),
            @Result(property = "elevation", column = "elevation"),
            @Result(property = "ip", column = "ip"),
            @Result(property = "state", column = "state"),
            @Result(property = "siteId", column = "site_id"),
            @Result(property = "type", column = "type")
    })
    @Select("select e.* from equipment e " +
            "where e.site_id = #{siteId}")
    List<Equipment> selectEquipments(@Param("siteId") Integer siteId);

    @Select("select e.* from equipment e")
    List<Equipment> selectAll();
    @Select("select e.* from equipment e " +
            "where e.site_id = #{siteId}")
    @ResultMap("equipmentMap")
    List<Equipment> selectEquipmentsBySiteId(@Param("siteId") Integer siteId);

}
