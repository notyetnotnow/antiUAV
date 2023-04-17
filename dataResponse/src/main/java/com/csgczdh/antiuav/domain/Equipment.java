package com.csgczdh.antiuav.domain;


public class Equipment {

    private Integer id;
    private String name;
    private double longitude;
    private double latitude;
    private double elevation;
    private String ip;
    private boolean state;
    private Integer type;
    private Integer siteId;

    public Equipment() {
    }

    public Equipment(Integer id, String name, double longitude, double latitude, double elevation, String ip, boolean state, Integer type, Integer siteId) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.elevation = elevation;
        this.ip = ip;
        this.state = state;
        this.type = type;
        this.siteId = siteId;
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

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public String getIp() { return ip; }

    public void setIp(String ip) { this.ip = ip; }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    public Integer getSiteId() { return siteId; }

    public void setSiteId(Integer siteId) { this.siteId = siteId; }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", elevation=" + elevation +
                ", ip='" + ip + '\'' +
                ", state=" + state +
                ", type=" + type +
                ", siteId='" + siteId + '\'' +
                '}';
    }
}
