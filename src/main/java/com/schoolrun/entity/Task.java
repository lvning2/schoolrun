package com.schoolrun.entity;

import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@ToString
@Entity
public class Task {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tid;
    @Column
    private Integer uid;
    @Column
    private String utel;
    @Column
    private Integer pid;
    @Column
    private String ptel;
    @Column
    private String trecom;
    @Column
    private String tadress;
    @Column
    private String tmain;
    @Column
    private String tdemand;
    @Column
    private String tgift;
    @Column
    private Integer teva;
    @Column
    private Date tstart;
    @Column
    private Date tend;
    @Column
    private Integer tcompalin;
    @Column
    private Integer tstate;

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

    public String getTrecom() {
        return trecom;
    }

    public void setTrecom(String trecom) {
        this.trecom = trecom == null ? null : trecom.trim();
    }

    public String getTadress() {
        return tadress;
    }

    public void setTadress(String tadress) {
        this.tadress = tadress == null ? null : tadress.trim();
    }

    public String getTmain() {
        return tmain;
    }

    public void setTmain(String tmain) {
        this.tmain = tmain == null ? null : tmain.trim();
    }

    public String getTdemand() {
        return tdemand;
    }

    public void setTdemand(String tdemand) {
        this.tdemand = tdemand == null ? null : tdemand.trim();
    }

    public String getTgift() {
        return tgift;
    }

    public void setTgift(String tgift) {
        this.tgift = tgift == null ? null : tgift.trim();
    }

    public Integer getTeva() {
        return teva;
    }

    public void setTeva(Integer teva) {
        this.teva = teva;
    }

    public Date getTstart() {
        return tstart;
    }

    public void setTstart(Date tstart) {
        this.tstart = tstart;
    }

    public Date getTend() {
        return tend;
    }

    public void setTend(Date tend) {
        this.tend = tend;
    }

    public Integer getTcompalin() {
        return tcompalin;
    }

    public void setTcompalin(Integer tcompalin) {
        this.tcompalin = tcompalin;
    }

    public Integer getTstate() {
        return tstate;
    }

    public void setTstate(Integer tstate) {
        this.tstate = tstate;
    }
}