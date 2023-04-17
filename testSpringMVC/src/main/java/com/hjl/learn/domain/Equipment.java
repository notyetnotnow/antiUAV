package com.hjl.learn.domain;


public class Equipment {

    private Integer id;
    private String name;
    private double longitude;
    private double latitude;
    private double elevation;
    private String ipAddress;
    private boolean state;
    private Integer type;
    private String siteName;

    public Equipment() {
    }

    public Equipment(Integer id, String name, double longitude, double latitude, double elevation, String ipAddress, boolean state, Integer type, String siteName) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.elevation = elevation;
        this.ipAddress = ipAddress;
        this.state = state;
        this.type = type;
        this.siteName = siteName;
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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

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


    public String getSiteName() { return siteName; }

    public void setSiteName(String siteName) { this.siteName = siteName; }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", elevation=" + elevation +
                ", ipAddress='" + ipAddress + '\'' +
                ", state=" + state +
                ", type=" + type +
                ", siteName='" + siteName + '\'' +
                '}';
    }
}
