package com.schoolrun.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EomsBaseSheetValue {
    private BigDecimal id;

    private BigDecimal basesheetid;

    private String key;

    private String value;

    private String actionname;

    private Date createtime;

    private BigDecimal operlogid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getBasesheetid() {
        return basesheetid;
    }

    public void setBasesheetid(BigDecimal basesheetid) {
        this.basesheetid = basesheetid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getOperlogid() {
        return operlogid;
    }

    public void setOperlogid(BigDecimal operlogid) {
        this.operlogid = operlogid;
    }
}