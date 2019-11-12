package com.schoolrun.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class EomsBaseSheet {
    private BigDecimal id;

    private String createdept;

    private String createdeptid;

    private Date createtime;

    private String createuser;

    private String createuserid;

    private String createuserrole;

    private BigDecimal createuserroleid;

    private String createuserpsn;

    private BigDecimal createuserpsnid;

    private String createuserjob;

    private BigDecimal createuserjobid;

    private String sheetid;

    private String title;

    private String createusertelephone;

    private String sheetstate;

    private String sheettype;

    private String piid;

    private String createusername;

    private String currentstepname;

    private BigDecimal parentid;

    private String filingfile;

    private Date overtime;

    private String overtimedept;

    private String overtimeflag;

    private String overtimeperson;

    private Date replytime;

    private String todept;

    private String torole;

    private Date updatetime;

    private BigDecimal approveextent;

    private Date starttime;

    private String operuserid;

    private String operusername;

    private String operorgid;

    private String operorgname;

    private String uppersheetid;

    private String lowersheetid;

    private String operrole;

    private String operrolename;

    private String oldeomsid;

    private Short ismerger;

    private BigDecimal mergerid;

    private String replyuser;

    private String replyorgid;

    private String updateuser;

    private String updateogrid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCreatedept() {
        return createdept;
    }

    public void setCreatedept(String createdept) {
        this.createdept = createdept == null ? null : createdept.trim();
    }

    public String getCreatedeptid() {
        return createdeptid;
    }

    public void setCreatedeptid(String createdeptid) {
        this.createdeptid = createdeptid == null ? null : createdeptid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getCreateuserrole() {
        return createuserrole;
    }

    public void setCreateuserrole(String createuserrole) {
        this.createuserrole = createuserrole == null ? null : createuserrole.trim();
    }

    public BigDecimal getCreateuserroleid() {
        return createuserroleid;
    }

    public void setCreateuserroleid(BigDecimal createuserroleid) {
        this.createuserroleid = createuserroleid;
    }

    public String getCreateuserpsn() {
        return createuserpsn;
    }

    public void setCreateuserpsn(String createuserpsn) {
        this.createuserpsn = createuserpsn == null ? null : createuserpsn.trim();
    }

    public BigDecimal getCreateuserpsnid() {
        return createuserpsnid;
    }

    public void setCreateuserpsnid(BigDecimal createuserpsnid) {
        this.createuserpsnid = createuserpsnid;
    }

    public String getCreateuserjob() {
        return createuserjob;
    }

    public void setCreateuserjob(String createuserjob) {
        this.createuserjob = createuserjob == null ? null : createuserjob.trim();
    }

    public BigDecimal getCreateuserjobid() {
        return createuserjobid;
    }

    public void setCreateuserjobid(BigDecimal createuserjobid) {
        this.createuserjobid = createuserjobid;
    }

    public String getSheetid() {
        return sheetid;
    }

    public void setSheetid(String sheetid) {
        this.sheetid = sheetid == null ? null : sheetid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCreateusertelephone() {
        return createusertelephone;
    }

    public void setCreateusertelephone(String createusertelephone) {
        this.createusertelephone = createusertelephone == null ? null : createusertelephone.trim();
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

    public String getPiid() {
        return piid;
    }

    public void setPiid(String piid) {
        this.piid = piid == null ? null : piid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getCurrentstepname() {
        return currentstepname;
    }

    public void setCurrentstepname(String currentstepname) {
        this.currentstepname = currentstepname == null ? null : currentstepname.trim();
    }

    public BigDecimal getParentid() {
        return parentid;
    }

    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    public String getFilingfile() {
        return filingfile;
    }

    public void setFilingfile(String filingfile) {
        this.filingfile = filingfile == null ? null : filingfile.trim();
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }

    public String getOvertimedept() {
        return overtimedept;
    }

    public void setOvertimedept(String overtimedept) {
        this.overtimedept = overtimedept == null ? null : overtimedept.trim();
    }

    public String getOvertimeflag() {
        return overtimeflag;
    }

    public void setOvertimeflag(String overtimeflag) {
        this.overtimeflag = overtimeflag == null ? null : overtimeflag.trim();
    }

    public String getOvertimeperson() {
        return overtimeperson;
    }

    public void setOvertimeperson(String overtimeperson) {
        this.overtimeperson = overtimeperson == null ? null : overtimeperson.trim();
    }

    public Date getReplytime() {
        return replytime;
    }

    public void setReplytime(Date replytime) {
        this.replytime = replytime;
    }

    public String getTodept() {
        return todept;
    }

    public void setTodept(String todept) {
        this.todept = todept == null ? null : todept.trim();
    }

    public String getTorole() {
        return torole;
    }

    public void setTorole(String torole) {
        this.torole = torole == null ? null : torole.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getApproveextent() {
        return approveextent;
    }

    public void setApproveextent(BigDecimal approveextent) {
        this.approveextent = approveextent;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getOperuserid() {
        return operuserid;
    }

    public void setOperuserid(String operuserid) {
        this.operuserid = operuserid == null ? null : operuserid.trim();
    }

    public String getOperusername() {
        return operusername;
    }

    public void setOperusername(String operusername) {
        this.operusername = operusername == null ? null : operusername.trim();
    }

    public String getOperorgid() {
        return operorgid;
    }

    public void setOperorgid(String operorgid) {
        this.operorgid = operorgid == null ? null : operorgid.trim();
    }

    public String getOperorgname() {
        return operorgname;
    }

    public void setOperorgname(String operorgname) {
        this.operorgname = operorgname == null ? null : operorgname.trim();
    }

    public String getUppersheetid() {
        return uppersheetid;
    }

    public void setUppersheetid(String uppersheetid) {
        this.uppersheetid = uppersheetid == null ? null : uppersheetid.trim();
    }

    public String getLowersheetid() {
        return lowersheetid;
    }

    public void setLowersheetid(String lowersheetid) {
        this.lowersheetid = lowersheetid == null ? null : lowersheetid.trim();
    }

    public String getOperrole() {
        return operrole;
    }

    public void setOperrole(String operrole) {
        this.operrole = operrole == null ? null : operrole.trim();
    }

    public String getOperrolename() {
        return operrolename;
    }

    public void setOperrolename(String operrolename) {
        this.operrolename = operrolename == null ? null : operrolename.trim();
    }

    public String getOldeomsid() {
        return oldeomsid;
    }

    public void setOldeomsid(String oldeomsid) {
        this.oldeomsid = oldeomsid == null ? null : oldeomsid.trim();
    }

    public Short getIsmerger() {
        return ismerger;
    }

    public void setIsmerger(Short ismerger) {
        this.ismerger = ismerger;
    }

    public BigDecimal getMergerid() {
        return mergerid;
    }

    public void setMergerid(BigDecimal mergerid) {
        this.mergerid = mergerid;
    }

    public String getReplyuser() {
        return replyuser;
    }

    public void setReplyuser(String replyuser) {
        this.replyuser = replyuser == null ? null : replyuser.trim();
    }

    public String getReplyorgid() {
        return replyorgid;
    }

    public void setReplyorgid(String replyorgid) {
        this.replyorgid = replyorgid == null ? null : replyorgid.trim();
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public String getUpdateogrid() {
        return updateogrid;
    }

    public void setUpdateogrid(String updateogrid) {
        this.updateogrid = updateogrid == null ? null : updateogrid.trim();
    }
}