package com.schoolrun.entity;

import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uname;

    @Column
    private Integer uid;
    @Column
    private String upwd;
    @Column
    private String uaddress;
    @Column
    private String utel;
    @Column
    private Date uzerostart;
    @Column
    private Integer ustate;
    @Column
    private Integer urole;
    @Column
    private Date ustart;
    @Column
    private Integer resover;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel == null ? null : utel.trim();
    }

    public Date getUzerostart() {
        return uzerostart;
    }

    public void setUzerostart(Date uzerostart) {
        this.uzerostart = uzerostart;
    }

    public Integer getUstate() {
        return ustate;
    }

    public void setUstate(Integer ustate) {
        this.ustate = ustate;
    }

    public Integer getUrole() {
        return urole;
    }

    public void setUrole(Integer urole) {
        this.urole = urole;
    }

    public Date getUstart() {
        return ustart;
    }

    public void setUstart(Date ustart) {
        this.ustart = ustart;
    }

    public Integer getResover() {
        return resover;
    }

    public void setResover(Integer resover) {
        this.resover = resover;
    }
}