package com.schoolrun.common;

public class Data {
    private String id;
    private String sign;
    private String experience;
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", sign='" + sign + '\'' +
                ", experience='" + experience + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
