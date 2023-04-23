package com.csgczdh.antiuav.domain;

import java.util.List;

public class Site {
    private Integer id;
    private String name;
    private Boolean state;
    private Integer centerId;
    private List<Equipment> equipmentList;

    public Site() {
    }

    public Site(Integer id, String name, Boolean state, Integer centerId, List<Equipment> equipmentList) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.centerId = centerId;
        this.equipmentList = equipmentList;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }


    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", centerId=" + centerId +
                ", equipmentList=" + equipmentList +
                '}';
    }
}
