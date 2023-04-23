package com.csgczdh.antiuav.domain;

import java.util.List;

public class CommandCenter {
    private Integer id;
    private String name;
    private Boolean state;
    private List<Site> siteList;

    public CommandCenter() {
    }

    public CommandCenter(Integer id, String name, Boolean state, List<Site> siteList) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.siteList = siteList;
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

    public List<Site> getSiteList() {
        return siteList;
    }

    public void setSiteList(List<Site> siteList) {
        this.siteList = siteList;
    }

    @Override
    public String toString() {
        return "CommandCenter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", siteList=" + siteList +
                '}';
    }
}
