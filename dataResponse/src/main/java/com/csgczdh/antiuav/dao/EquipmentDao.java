package com.csgczdh.antiuav.dao;

import com.csgczdh.antiuav.domain.Equipment;
import org.apache.ibatis.annotations.*;

import java.util.List;
public interface EquipmentDao {
    @Insert("insert into equipment (id, name, longitude, latitude, elevation, ip, state, type, siteId) " +
            "values(null, #{name}, #{longitude}, #{latitude}, #{elevation}, #{ip}, #{state}, #{type}, #{siteId})")
    Integer insertSingle(Equipment equipment);

    @Delete("delete from equipment where siteId = #{siteId} and type = #{type}")
    Integer deleteSingleBySiteIdAndType(@Param("siteId") Integer siteId,@Param("type") Integer type);

    @Update("update equipment set longitude = #{longitude}, latitude = #{latitude}, elevation = #{elevation}, " +
            "ip = #{ip}, state = #{state} " +
            "where siteId = #{siteId} and type = #{type}")
    Integer updateSingleBySiteIdAndType(@Param("longitude") Double longitude, @Param("latitude") Double latitude,
                                        @Param("elevation") Double elevation, @Param("ip") String ip,
                                        @Param("state") Boolean state,
                                        @Param("siteId") Integer siteId,@Param("type") Integer type);
    @Select("select id, name, longitude, latitude, elevation, ip, state, type, siteId from equipment")
    List<Equipment> queryAll();

}
