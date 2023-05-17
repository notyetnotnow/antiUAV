package com.csgczdh.antiuav.domain;

public class User {
    private Integer id;
    private String name;
    private String role;
    private String password;

    public User() {
    }

    public User(Integer id, String name, String role, String password) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.password = password;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
