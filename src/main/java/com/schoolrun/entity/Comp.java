package com.schoolrun.entity;

import lombok.ToString;

import java.util.Date;

@ToString
public class Comp {
    private Integer cid;

    private Integer tid;

    private Integer uid;

    private String utel;

    private Integer pid;

    private String ptel;

    private Integer aid;

    private Integer ctype;

    private String cmain;

    private String cproof;

    private Date cstart;

    private Date cfinish;

    private Integer cstate;

    private String cresult;

    private Integer cuint;

    private Integer cpint;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel == null ? null : utel.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel == null ? null : ptel.trim();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public String getCmain() {
        return cmain;
    }

    public void setCmain(String cmain) {
        this.cmain = cmain == null ? null : cmain.trim();
    }

    public String getCproof() {
        return cproof;
    }

    public void setCproof(String cproof) {
        this.cproof = cproof == null ? null : cproof.trim();
    }

    public Date getCstart() {
        return cstart;
    }

    public void setCstart(Date cstart) {
        this.cstart = cstart;
    }

    public Date getCfinish() {
        return cfinish;
    }

    public void setCfinish(Date cfinish) {
        this.cfinish = cfinish;
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }

    public String getCresult() {
        return cresult;
    }

    public void setCresult(String cresult) {
        this.cresult = cresult == null ? null : cresult.trim();
    }

    public Integer getCuint() {
        return cuint;
    }

    public void setCuint(Integer cuint) {
        this.cuint = cuint;
    }

    public Integer getCpint() {
        return cpint;
    }

    public void setCpint(Integer cpint) {
        this.cpint = cpint;
    }
}