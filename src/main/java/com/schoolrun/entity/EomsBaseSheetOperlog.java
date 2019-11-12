package com.schoolrun.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EomsBaseSheetOperlog {
    private BigDecimal id;

    private BigDecimal basesheetid;

    private String activedefid;

    private String userid;

    private String username;

    private String orgname;

    private String jobname;

    private String operType;

    private Date createtime;

    private String actionname;

    private String processdefid;

    private String pageId;

    private String orgid;

    private String jobid;

    private String roleid;

    private String rolename;

    private String sheetstate;

    private String sheettype;

    private String todept;

    private String toperson;

    private String torole;

    private Date endtime;

    private Date starttime;

    private BigDecimal ismessage;

    private String useraccount;

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

    public String getActivedefid() {
        return activedefid;
    }

    public void setActivedefid(String activedefid) {
        this.activedefid = activedefid == null ? null : activedefid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    public String getProcessdefid() {
        return processdefid;
    }

    public void setProcessdefid(String processdefid) {
        this.processdefid = processdefid == null ? null : processdefid.trim();
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId == null ? null : pageId.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid == null ? null : jobid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getSheetstate() {
        return sheetstate;
    }

    public void setSheetstate(String sheetstate) {
        this.sheetstate = sheetstate == null ? null : sheetstate.trim();
    }

    public String getSheettype() {
        return sheettype;
    }

    public void setSheettype(String sheettype) {
        this.sheettype = sheettype == null ? null : sheettype.trim();
    }

    public String getTodept() {
        return todept;
    }

    public void setTodept(String todept) {
        this.todept = todept == null ? null : todept.trim();
    }

    public String getToperson() {
        return toperson;
    }

    public void setToperson(String toperson) {
        this.toperson = toperson == null ? null : toperson.trim();
    }

    public String getTorole() {
        return torole;
    }

    public void setTorole(String torole) {
        this.torole = torole == null ? null : torole.trim();
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public BigDecimal getIsmessage() {
        return ismessage;
    }

    public void setIsmessage(BigDecimal ismessage) {
        this.ismessage = ismessage;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount == null ? null : useraccount.trim();
    }
}