package com.schoolrun.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class EomsSheetFaultsheet {
    private String basesheetid;

    private Date affirmtimelimit;

    private Date allocationclaimovertime;

    private Date allocationovertime;

    private BigDecimal bigfaultflag;

    private BigDecimal companyid;

    private String faultcity;

    private String exigence;

    private String netname;

    private String faultprovince;

    private Date faultresumetime;

    private Date faultstarttime;

    private BigDecimal netmodifyflag;

    private String networktype;

    private Date operationresumetime;

    private BigDecimal sourcetype;

    private Date t1overtime;

    private Date t2overtime;

    private Date t3overtime;

    private Date disposalcompletetime;

    private String disposallevel;

    private String faultdisposalresult;

    private BigDecimal returnflag;

    private String equipmenttype;

    private String faultreason;

    private Date cleartime;

    private String alarmstatus;

    private String createtype;

    private BigDecimal isknowledge;

    private String sercaller;

    private String disposalmeasure;

    private String alarmdes;

    private BigDecimal postponeflag;

    private BigDecimal pretreatmentflag;

    private BigDecimal affoperationflag;

    private BigDecimal autotransferflag;

    private String faultfindtype;

    private String t1rudimentdisposeresult;

    private String t1claimdept;

    private String t1claimuser;

    private String t2claimdept;

    private String t2lastdept;

    private String t2lastuser;

    private String lastreplydept;

    private String lastreplyuser;

    private String finishuser;

    private String faultlasttime;

    private String faultresponselevel;

    private String alarmsource;

    private String alarmlogictype;

    private String alarmsubclass;

    private String cchsheetid;

    private String equipmodle;

    private Date t1claimedtime;

    private Date t1operatetime;

    private BigDecimal communicateflag;

    private BigDecimal safeflag;

    private String t1transferdept;

    private Date t2claimedtime;

    private Date t2operatetime;

    private BigDecimal finallyprojectflag;

    private String affectoperationtime;

    private String rejectedreason;

    private String fillingidea;

    private String alarmid;

    private String alarmsheetid;

    private String t1transferrole;

    private String t2replyrole;

    private String filingrole;

    private String t1transferuser;

    private String filingdept;

    private String createuserphone;

    private String t1transferphone;

    private String t2disposeuserphone;

    private String filinguserphone;

    private String remarksone;

    private String remarkstwo;

    private String remarksthree;

    private String neid;

    private BigDecimal autofillingflag;

    private BigDecimal isexistcheckfailure;

    private BigDecimal checkpassflag;

    private String taskid;

    private Date tempaffirmtimelimit;

    private BigDecimal issendtoacms;

    private String sendacmsarea;

    private String replyacmsarea;

    private Date t2firstaffirmtimelimit;

    private String t1firstaffirmdept;

    private String t2firstaffirmdept;

    private String issendacmsnumber;

    private String replyacmsname;

    private BigDecimal acmsdelaytimeflag;

    private String applydalystate;

    private String isautosendacms;

    private String dealdept;

    private String worksheettype;

    private String servicelevel;

    private String alertdeal;

    private String alarmcode;

    private BigDecimal issendok;

    private String sendinvalid;

    private String acmsreceive;

    private String deptid;

    private String predeal;

    private String disposelevel;

    private String autoreplyflag;

    private Date sendacmstime;

    private Date acmsreplytime;

    private String acmsreplyuser;

    private String acmsreplydept;

    private Date t1transfertime;

    private String t2transferuser;

    private String t2transferdept;

    private Date t2transfertime;

    private String powerfaultfactory;

    private String powerfaultdetail;

    private String failtofrontlinereason;

    private BigDecimal failtofrontlineissolved;

    private String failtofrontlinenotsolvedreason;

    private Date beforetime;

    private String predealtype;

    private String ivrcallstate;

    private String checkmode;

    private Date alarmfoundtime;

    private String iscityrejecttot1;

    private String checkname;

    private String checktime;

    private String checksummary;

    private String resourceid;

    private String resourcetype;

    private String scenetype;

    private String scenetypese;

    private String ispredealvalid;

    private String disposalmeasurejectbefore;

    private String checksummaryother;

    private String acmsaccflag;

    private String alarmcount;

    private String istowner;

    private String covertype;

    private String roomproperty;

    private BigDecimal sheetprioritylevel;

    private String urgencydegree;

    private String asitename;

    private String zsitename;

    private String alocation;

    private String zlocation;

    private String transname;

    private String cablename;

    private String asitenum;

    private String zsitenum;

    private String acuid;

    private String zcuid;

    private String wdtype;

    private String onupattern;

    private String acname;

    private String cellcode;

    private String towersitename;

    private String towersiteid;

    private String siteinterruptionreason;

    private BigDecimal t1overtimeflage;

    private BigDecimal t2overtimeflage;

    private BigDecimal acmsovertimeflage;

    private String delayclassify;

    private String businessdamage;

    private String brasfaultport;

    private String jtattachurl;

    private Date disposaltime;

    private Short isexistcheckfailurenum;

    private String faultreasondesc;

    private Date recoveroperationtime;

    private String alarmtitle;

    private String devicetype;

    private String isuploadjt;

    private String frequentsheet;

    private String explain;

    private String portinfo;

    private String respectiveregion;

    private String correlationcircuitlist;

    public String getBasesheetid() {
        return basesheetid;
    }

    public void setBasesheetid(String basesheetid) {
        this.basesheetid = basesheetid == null ? null : basesheetid.trim();
    }

    public Date getAffirmtimelimit() {
        return affirmtimelimit;
    }

    public void setAffirmtimelimit(Date affirmtimelimit) {
        this.affirmtimelimit = affirmtimelimit;
    }

    public Date getAllocationclaimovertime() {
        return allocationclaimovertime;
    }

    public void setAllocationclaimovertime(Date allocationclaimovertime) {
        this.allocationclaimovertime = allocationclaimovertime;
    }

    public Date getAllocationovertime() {
        return allocationovertime;
    }

    public void setAllocationovertime(Date allocationovertime) {
        this.allocationovertime = allocationovertime;
    }

    public BigDecimal getBigfaultflag() {
        return bigfaultflag;
    }

    public void setBigfaultflag(BigDecimal bigfaultflag) {
        this.bigfaultflag = bigfaultflag;
    }

    public BigDecimal getCompanyid() {
        return companyid;
    }

    public void setCompanyid(BigDecimal companyid) {
        this.companyid = companyid;
    }

    public String getFaultcity() {
        return faultcity;
    }

    public void setFaultcity(String faultcity) {
        this.faultcity = faultcity == null ? null : faultcity.trim();
    }

    public String getExigence() {
        return exigence;
    }

    public void setExigence(String exigence) {
        this.exigence = exigence == null ? null : exigence.trim();
    }

    public String getNetname() {
        return netname;
    }

    public void setNetname(String netname) {
        this.netname = netname == null ? null : netname.trim();
    }

    public String getFaultprovince() {
        return faultprovince;
    }

    public void setFaultprovince(String faultprovince) {
        this.faultprovince = faultprovince == null ? null : faultprovince.trim();
    }

    public Date getFaultresumetime() {
        return faultresumetime;
    }

    public void setFaultresumetime(Date faultresumetime) {
        this.faultresumetime = faultresumetime;
    }

    public Date getFaultstarttime() {
        return faultstarttime;
    }

    public void setFaultstarttime(Date faultstarttime) {
        this.faultstarttime = faultstarttime;
    }

    public BigDecimal getNetmodifyflag() {
        return netmodifyflag;
    }

    public void setNetmodifyflag(BigDecimal netmodifyflag) {
        this.netmodifyflag = netmodifyflag;
    }

    public String getNetworktype() {
        return networktype;
    }

    public void setNetworktype(String networktype) {
        this.networktype = networktype == null ? null : networktype.trim();
    }

    public Date getOperationresumetime() {
        return operationresumetime;
    }

    public void setOperationresumetime(Date operationresumetime) {
        this.operationresumetime = operationresumetime;
    }

    public BigDecimal getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(BigDecimal sourcetype) {
        this.sourcetype = sourcetype;
    }

    public Date getT1overtime() {
        return t1overtime;
    }

    public void setT1overtime(Date t1overtime) {
        this.t1overtime = t1overtime;
    }

    public Date getT2overtime() {
        return t2overtime;
    }

    public void setT2overtime(Date t2overtime) {
        this.t2overtime = t2overtime;
    }

    public Date getT3overtime() {
        return t3overtime;
    }

    public void setT3overtime(Date t3overtime) {
        this.t3overtime = t3overtime;
    }

    public Date getDisposalcompletetime() {
        return disposalcompletetime;
    }

    public void setDisposalcompletetime(Date disposalcompletetime) {
        this.disposalcompletetime = disposalcompletetime;
    }

    public String getDisposallevel() {
        return disposallevel;
    }

    public void setDisposallevel(String disposallevel) {
        this.disposallevel = disposallevel == null ? null : disposallevel.trim();
    }

    public String getFaultdisposalresult() {
        return faultdisposalresult;
    }

    public void setFaultdisposalresult(String faultdisposalresult) {
        this.faultdisposalresult = faultdisposalresult == null ? null : faultdisposalresult.trim();
    }

    public BigDecimal getReturnflag() {
        return returnflag;
    }

    public void setReturnflag(BigDecimal returnflag) {
        this.returnflag = returnflag;
    }

    public String getEquipmenttype() {
        return equipmenttype;
    }

    public void setEquipmenttype(String equipmenttype) {
        this.equipmenttype = equipmenttype == null ? null : equipmenttype.trim();
    }

    public String getFaultreason() {
        return faultreason;
    }

    public void setFaultreason(String faultreason) {
        this.faultreason = faultreason == null ? null : faultreason.trim();
    }

    public Date getCleartime() {
        return cleartime;
    }

    public void setCleartime(Date cleartime) {
        this.cleartime = cleartime;
    }

    public String getAlarmstatus() {
        return alarmstatus;
    }

    public void setAlarmstatus(String alarmstatus) {
        this.alarmstatus = alarmstatus == null ? null : alarmstatus.trim();
    }

    public String getCreatetype() {
        return createtype;
    }

    public void setCreatetype(String createtype) {
        this.createtype = createtype == null ? null : createtype.trim();
    }

    public BigDecimal getIsknowledge() {
        return isknowledge;
    }

    public void setIsknowledge(BigDecimal isknowledge) {
        this.isknowledge = isknowledge;
    }

    public String getSercaller() {
        return sercaller;
    }

    public void setSercaller(String sercaller) {
        this.sercaller = sercaller == null ? null : sercaller.trim();
    }

    public String getDisposalmeasure() {
        return disposalmeasure;
    }

    public void setDisposalmeasure(String disposalmeasure) {
        this.disposalmeasure = disposalmeasure == null ? null : disposalmeasure.trim();
    }

    public String getAlarmdes() {
        return alarmdes;
    }

    public void setAlarmdes(String alarmdes) {
        this.alarmdes = alarmdes == null ? null : alarmdes.trim();
    }

    public BigDecimal getPostponeflag() {
        return postponeflag;
    }

    public void setPostponeflag(BigDecimal postponeflag) {
        this.postponeflag = postponeflag;
    }

    public BigDecimal getPretreatmentflag() {
        return pretreatmentflag;
    }

    public void setPretreatmentflag(BigDecimal pretreatmentflag) {
        this.pretreatmentflag = pretreatmentflag;
    }

    public BigDecimal getAffoperationflag() {
        return affoperationflag;
    }

    public void setAffoperationflag(BigDecimal affoperationflag) {
        this.affoperationflag = affoperationflag;
    }

    public BigDecimal getAutotransferflag() {
        return autotransferflag;
    }

    public void setAutotransferflag(BigDecimal autotransferflag) {
        this.autotransferflag = autotransferflag;
    }

    public String getFaultfindtype() {
        return faultfindtype;
    }

    public void setFaultfindtype(String faultfindtype) {
        this.faultfindtype = faultfindtype == null ? null : faultfindtype.trim();
    }

    public String getT1rudimentdisposeresult() {
        return t1rudimentdisposeresult;
    }

    public void setT1rudimentdisposeresult(String t1rudimentdisposeresult) {
        this.t1rudimentdisposeresult = t1rudimentdisposeresult == null ? null : t1rudimentdisposeresult.trim();
    }

    public String getT1claimdept() {
        return t1claimdept;
    }

    public void setT1claimdept(String t1claimdept) {
        this.t1claimdept = t1claimdept == null ? null : t1claimdept.trim();
    }

    public String getT1claimuser() {
        return t1claimuser;
    }

    public void setT1claimuser(String t1claimuser) {
        this.t1claimuser = t1claimuser == null ? null : t1claimuser.trim();
    }

    public String getT2claimdept() {
        return t2claimdept;
    }

    public void setT2claimdept(String t2claimdept) {
        this.t2claimdept = t2claimdept == null ? null : t2claimdept.trim();
    }

    public String getT2lastdept() {
        return t2lastdept;
    }

    public void setT2lastdept(String t2lastdept) {
        this.t2lastdept = t2lastdept == null ? null : t2lastdept.trim();
    }

    public String getT2lastuser() {
        return t2lastuser;
    }

    public void setT2lastuser(String t2lastuser) {
        this.t2lastuser = t2lastuser == null ? null : t2lastuser.trim();
    }

    public String getLastreplydept() {
        return lastreplydept;
    }

    public void setLastreplydept(String lastreplydept) {
        this.lastreplydept = lastreplydept == null ? null : lastreplydept.trim();
    }

    public String getLastreplyuser() {
        return lastreplyuser;
    }

    public void setLastreplyuser(String lastreplyuser) {
        this.lastreplyuser = lastreplyuser == null ? null : lastreplyuser.trim();
    }

    public String getFinishuser() {
        return finishuser;
    }

    public void setFinishuser(String finishuser) {
        this.finishuser = finishuser == null ? null : finishuser.trim();
    }

    public String getFaultlasttime() {
        return faultlasttime;
    }

    public void setFaultlasttime(String faultlasttime) {
        this.faultlasttime = faultlasttime == null ? null : faultlasttime.trim();
    }

    public String getFaultresponselevel() {
        return faultresponselevel;
    }

    public void setFaultresponselevel(String faultresponselevel) {
        this.faultresponselevel = faultresponselevel == null ? null : faultresponselevel.trim();
    }

    public String getAlarmsource() {
        return alarmsource;
    }

    public void setAlarmsource(String alarmsource) {
        this.alarmsource = alarmsource == null ? null : alarmsource.trim();
    }

    public String getAlarmlogictype() {
        return alarmlogictype;
    }

    public void setAlarmlogictype(String alarmlogictype) {
        this.alarmlogictype = alarmlogictype == null ? null : alarmlogictype.trim();
    }

    public String getAlarmsubclass() {
        return alarmsubclass;
    }

    public void setAlarmsubclass(String alarmsubclass) {
        this.alarmsubclass = alarmsubclass == null ? null : alarmsubclass.trim();
    }

    public String getCchsheetid() {
        return cchsheetid;
    }

    public void setCchsheetid(String cchsheetid) {
        this.cchsheetid = cchsheetid == null ? null : cchsheetid.trim();
    }

    public String getEquipmodle() {
        return equipmodle;
    }

    public void setEquipmodle(String equipmodle) {
        this.equipmodle = equipmodle == null ? null : equipmodle.trim();
    }

    public Date getT1claimedtime() {
        return t1claimedtime;
    }

    public void setT1claimedtime(Date t1claimedtime) {
        this.t1claimedtime = t1claimedtime;
    }

    public Date getT1operatetime() {
        return t1operatetime;
    }

    public void setT1operatetime(Date t1operatetime) {
        this.t1operatetime = t1operatetime;
    }

    public BigDecimal getCommunicateflag() {
        return communicateflag;
    }

    public void setCommunicateflag(BigDecimal communicateflag) {
        this.communicateflag = communicateflag;
    }

    public BigDecimal getSafeflag() {
        return safeflag;
    }

    public void setSafeflag(BigDecimal safeflag) {
        this.safeflag = safeflag;
    }

    public String getT1transferdept() {
        return t1transferdept;
    }

    public void setT1transferdept(String t1transferdept) {
        this.t1transferdept = t1transferdept == null ? null : t1transferdept.trim();
    }

    public Date getT2claimedtime() {
        return t2claimedtime;
    }

    public void setT2claimedtime(Date t2claimedtime) {
        this.t2claimedtime = t2claimedtime;
    }

    public Date getT2operatetime() {
        return t2operatetime;
    }

    public void setT2operatetime(Date t2operatetime) {
        this.t2operatetime = t2operatetime;
    }

    public BigDecimal getFinallyprojectflag() {
        return finallyprojectflag;
    }

    public void setFinallyprojectflag(BigDecimal finallyprojectflag) {
        this.finallyprojectflag = finallyprojectflag;
    }

    public String getAffectoperationtime() {
        return affectoperationtime;
    }

    public void setAffectoperationtime(String affectoperationtime) {
        this.affectoperationtime = affectoperationtime == null ? null : affectoperationtime.trim();
    }

    public String getRejectedreason() {
        return rejectedreason;
    }

    public void setRejectedreason(String rejectedreason) {
        this.rejectedreason = rejectedreason == null ? null : rejectedreason.trim();
    }

    public String getFillingidea() {
        return fillingidea;
    }

    public void setFillingidea(String fillingidea) {
        this.fillingidea = fillingidea == null ? null : fillingidea.trim();
    }

    public String getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid == null ? null : alarmid.trim();
    }

    public String getAlarmsheetid() {
        return alarmsheetid;
    }

    public void setAlarmsheetid(String alarmsheetid) {
        this.alarmsheetid = alarmsheetid == null ? null : alarmsheetid.trim();
    }

    public String getT1transferrole() {
        return t1transferrole;
    }

    public void setT1transferrole(String t1transferrole) {
        this.t1transferrole = t1transferrole == null ? null : t1transferrole.trim();
    }

    public String getT2replyrole() {
        return t2replyrole;
    }

    public void setT2replyrole(String t2replyrole) {
        this.t2replyrole = t2replyrole == null ? null : t2replyrole.trim();
    }

    public String getFilingrole() {
        return filingrole;
    }

    public void setFilingrole(String filingrole) {
        this.filingrole = filingrole == null ? null : filingrole.trim();
    }

    public String getT1transferuser() {
        return t1transferuser;
    }

    public void setT1transferuser(String t1transferuser) {
        this.t1transferuser = t1transferuser == null ? null : t1transferuser.trim();
    }

    public String getFilingdept() {
        return filingdept;
    }

    public void setFilingdept(String filingdept) {
        this.filingdept = filingdept == null ? null : filingdept.trim();
    }

    public String getCreateuserphone() {
        return createuserphone;
    }

    public void setCreateuserphone(String createuserphone) {
        this.createuserphone = createuserphone == null ? null : createuserphone.trim();
    }

    public String getT1transferphone() {
        return t1transferphone;
    }

    public void setT1transferphone(String t1transferphone) {
        this.t1transferphone = t1transferphone == null ? null : t1transferphone.trim();
    }

    public String getT2disposeuserphone() {
        return t2disposeuserphone;
    }

    public void setT2disposeuserphone(String t2disposeuserphone) {
        this.t2disposeuserphone = t2disposeuserphone == null ? null : t2disposeuserphone.trim();
    }

    public String getFilinguserphone() {
        return filinguserphone;
    }

    public void setFilinguserphone(String filinguserphone) {
        this.filinguserphone = filinguserphone == null ? null : filinguserphone.trim();
    }

    public String getRemarksone() {
        return remarksone;
    }

    public void setRemarksone(String remarksone) {
        this.remarksone = remarksone == null ? null : remarksone.trim();
    }

    public String getRemarkstwo() {
        return remarkstwo;
    }

    public void setRemarkstwo(String remarkstwo) {
        this.remarkstwo = remarkstwo == null ? null : remarkstwo.trim();
    }

    public String getRemarksthree() {
        return remarksthree;
    }

    public void setRemarksthree(String remarksthree) {
        this.remarksthree = remarksthree == null ? null : remarksthree.trim();
    }

    public String getNeid() {
        return neid;
    }

    public void setNeid(String neid) {
        this.neid = neid == null ? null : neid.trim();
    }

    public BigDecimal getAutofillingflag() {
        return autofillingflag;
    }

    public void setAutofillingflag(BigDecimal autofillingflag) {
        this.autofillingflag = autofillingflag;
    }

    public BigDecimal getIsexistcheckfailure() {
        return isexistcheckfailure;
    }

    public void setIsexistcheckfailure(BigDecimal isexistcheckfailure) {
        this.isexistcheckfailure = isexistcheckfailure;
    }

    public BigDecimal getCheckpassflag() {
        return checkpassflag;
    }

    public void setCheckpassflag(BigDecimal checkpassflag) {
        this.checkpassflag = checkpassflag;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public Date getTempaffirmtimelimit() {
        return tempaffirmtimelimit;
    }

    public void setTempaffirmtimelimit(Date tempaffirmtimelimit) {
        this.tempaffirmtimelimit = tempaffirmtimelimit;
    }

    public BigDecimal getIssendtoacms() {
        return issendtoacms;
    }

    public void setIssendtoacms(BigDecimal issendtoacms) {
        this.issendtoacms = issendtoacms;
    }

    public String getSendacmsarea() {
        return sendacmsarea;
    }

    public void setSendacmsarea(String sendacmsarea) {
        this.sendacmsarea = sendacmsarea == null ? null : sendacmsarea.trim();
    }

    public String getReplyacmsarea() {
        return replyacmsarea;
    }

    public void setReplyacmsarea(String replyacmsarea) {
        this.replyacmsarea = replyacmsarea == null ? null : replyacmsarea.trim();
    }

    public Date getT2firstaffirmtimelimit() {
        return t2firstaffirmtimelimit;
    }

    public void setT2firstaffirmtimelimit(Date t2firstaffirmtimelimit) {
        this.t2firstaffirmtimelimit = t2firstaffirmtimelimit;
    }

    public String getT1firstaffirmdept() {
        return t1firstaffirmdept;
    }

    public void setT1firstaffirmdept(String t1firstaffirmdept) {
        this.t1firstaffirmdept = t1firstaffirmdept == null ? null : t1firstaffirmdept.trim();
    }

    public String getT2firstaffirmdept() {
        return t2firstaffirmdept;
    }

    public void setT2firstaffirmdept(String t2firstaffirmdept) {
        this.t2firstaffirmdept = t2firstaffirmdept == null ? null : t2firstaffirmdept.trim();
    }

    public String getIssendacmsnumber() {
        return issendacmsnumber;
    }

    public void setIssendacmsnumber(String issendacmsnumber) {
        this.issendacmsnumber = issendacmsnumber == null ? null : issendacmsnumber.trim();
    }

    public String getReplyacmsname() {
        return replyacmsname;
    }

    public void setReplyacmsname(String replyacmsname) {
        this.replyacmsname = replyacmsname == null ? null : replyacmsname.trim();
    }

    public BigDecimal getAcmsdelaytimeflag() {
        return acmsdelaytimeflag;
    }

    public void setAcmsdelaytimeflag(BigDecimal acmsdelaytimeflag) {
        this.acmsdelaytimeflag = acmsdelaytimeflag;
    }

    public String getApplydalystate() {
        return applydalystate;
    }

    public void setApplydalystate(String applydalystate) {
        this.applydalystate = applydalystate == null ? null : applydalystate.trim();
    }

    public String getIsautosendacms() {
        return isautosendacms;
    }

    public void setIsautosendacms(String isautosendacms) {
        this.isautosendacms = isautosendacms == null ? null : isautosendacms.trim();
    }

    public String getDealdept() {
        return dealdept;
    }

    public void setDealdept(String dealdept) {
        this.dealdept = dealdept == null ? null : dealdept.trim();
    }

    public String getWorksheettype() {
        return worksheettype;
    }

    public void setWorksheettype(String worksheettype) {
        this.worksheettype = worksheettype == null ? null : worksheettype.trim();
    }

    public String getServicelevel() {
        return servicelevel;
    }

    public void setServicelevel(String servicelevel) {
        this.servicelevel = servicelevel == null ? null : servicelevel.trim();
    }

    public String getAlertdeal() {
        return alertdeal;
    }

    public void setAlertdeal(String alertdeal) {
        this.alertdeal = alertdeal == null ? null : alertdeal.trim();
    }

    public String getAlarmcode() {
        return alarmcode;
    }

    public void setAlarmcode(String alarmcode) {
        this.alarmcode = alarmcode == null ? null : alarmcode.trim();
    }

    public BigDecimal getIssendok() {
        return issendok;
    }

    public void setIssendok(BigDecimal issendok) {
        this.issendok = issendok;
    }

    public String getSendinvalid() {
        return sendinvalid;
    }

    public void setSendinvalid(String sendinvalid) {
        this.sendinvalid = sendinvalid == null ? null : sendinvalid.trim();
    }

    public String getAcmsreceive() {
        return acmsreceive;
    }

    public void setAcmsreceive(String acmsreceive) {
        this.acmsreceive = acmsreceive == null ? null : acmsreceive.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getPredeal() {
        return predeal;
    }

    public void setPredeal(String predeal) {
        this.predeal = predeal == null ? null : predeal.trim();
    }

    public String getDisposelevel() {
        return disposelevel;
    }

    public void setDisposelevel(String disposelevel) {
        this.disposelevel = disposelevel == null ? null : disposelevel.trim();
    }

    public String getAutoreplyflag() {
        return autoreplyflag;
    }

    public void setAutoreplyflag(String autoreplyflag) {
        this.autoreplyflag = autoreplyflag == null ? null : autoreplyflag.trim();
    }

    public Date getSendacmstime() {
        return sendacmstime;
    }

    public void setSendacmstime(Date sendacmstime) {
        this.sendacmstime = sendacmstime;
    }

    public Date getAcmsreplytime() {
        return acmsreplytime;
    }

    public void setAcmsreplytime(Date acmsreplytime) {
        this.acmsreplytime = acmsreplytime;
    }

    public String getAcmsreplyuser() {
        return acmsreplyuser;
    }

    public void setAcmsreplyuser(String acmsreplyuser) {
        this.acmsreplyuser = acmsreplyuser == null ? null : acmsreplyuser.trim();
    }

    public String getAcmsreplydept() {
        return acmsreplydept;
    }

    public void setAcmsreplydept(String acmsreplydept) {
        this.acmsreplydept = acmsreplydept == null ? null : acmsreplydept.trim();
    }

    public Date getT1transfertime() {
        return t1transfertime;
    }

    public void setT1transfertime(Date t1transfertime) {
        this.t1transfertime = t1transfertime;
    }

    public String getT2transferuser() {
        return t2transferuser;
    }

    public void setT2transferuser(String t2transferuser) {
        this.t2transferuser = t2transferuser == null ? null : t2transferuser.trim();
    }

    public String getT2transferdept() {
        return t2transferdept;
    }

    public void setT2transferdept(String t2transferdept) {
        this.t2transferdept = t2transferdept == null ? null : t2transferdept.trim();
    }

    public Date getT2transfertime() {
        return t2transfertime;
    }

    public void setT2transfertime(Date t2transfertime) {
        this.t2transfertime = t2transfertime;
    }

    public String getPowerfaultfactory() {
        return powerfaultfactory;
    }

    public void setPowerfaultfactory(String powerfaultfactory) {
        this.powerfaultfactory = powerfaultfactory == null ? null : powerfaultfactory.trim();
    }

    public String getPowerfaultdetail() {
        return powerfaultdetail;
    }

    public void setPowerfaultdetail(String powerfaultdetail) {
        this.powerfaultdetail = powerfaultdetail == null ? null : powerfaultdetail.trim();
    }

    public String getFailtofrontlinereason() {
        return failtofrontlinereason;
    }

    public void setFailtofrontlinereason(String failtofrontlinereason) {
        this.failtofrontlinereason = failtofrontlinereason == null ? null : failtofrontlinereason.trim();
    }

    public BigDecimal getFailtofrontlineissolved() {
        return failtofrontlineissolved;
    }

    public void setFailtofrontlineissolved(BigDecimal failtofrontlineissolved) {
        this.failtofrontlineissolved = failtofrontlineissolved;
    }

    public String getFailtofrontlinenotsolvedreason() {
        return failtofrontlinenotsolvedreason;
    }

    public void setFailtofrontlinenotsolvedreason(String failtofrontlinenotsolvedreason) {
        this.failtofrontlinenotsolvedreason = failtofrontlinenotsolvedreason == null ? null : failtofrontlinenotsolvedreason.trim();
    }

    public Date getBeforetime() {
        return beforetime;
    }

    public void setBeforetime(Date beforetime) {
        this.beforetime = beforetime;
    }

    public String getPredealtype() {
        return predealtype;
    }

    public void setPredealtype(String predealtype) {
        this.predealtype = predealtype == null ? null : predealtype.trim();
    }

    public String getIvrcallstate() {
        return ivrcallstate;
    }

    public void setIvrcallstate(String ivrcallstate) {
        this.ivrcallstate = ivrcallstate == null ? null : ivrcallstate.trim();
    }

    public String getCheckmode() {
        return checkmode;
    }

    public void setCheckmode(String checkmode) {
        this.checkmode = checkmode == null ? null : checkmode.trim();
    }

    public Date getAlarmfoundtime() {
        return alarmfoundtime;
    }

    public void setAlarmfoundtime(Date alarmfoundtime) {
        this.alarmfoundtime = alarmfoundtime;
    }

    public String getIscityrejecttot1() {
        return iscityrejecttot1;
    }

    public void setIscityrejecttot1(String iscityrejecttot1) {
        this.iscityrejecttot1 = iscityrejecttot1 == null ? null : iscityrejecttot1.trim();
    }

    public String getCheckname() {
        return checkname;
    }

    public void setCheckname(String checkname) {
        this.checkname = checkname == null ? null : checkname.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
    }

    public String getChecksummary() {
        return checksummary;
    }

    public void setChecksummary(String checksummary) {
        this.checksummary = checksummary == null ? null : checksummary.trim();
    }

    public String getResourceid() {
        return resourceid;
    }

    public void setResourceid(String resourceid) {
        this.resourceid = resourceid == null ? null : resourceid.trim();
    }

    public String getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype == null ? null : resourcetype.trim();
    }

    public String getScenetype() {
        return scenetype;
    }

    public void setScenetype(String scenetype) {
        this.scenetype = scenetype == null ? null : scenetype.trim();
    }

    public String getScenetypese() {
        return scenetypese;
    }

    public void setScenetypese(String scenetypese) {
        this.scenetypese = scenetypese == null ? null : scenetypese.trim();
    }

    public String getIspredealvalid() {
        return ispredealvalid;
    }

    public void setIspredealvalid(String ispredealvalid) {
        this.ispredealvalid = ispredealvalid == null ? null : ispredealvalid.trim();
    }

    public String getDisposalmeasurejectbefore() {
        return disposalmeasurejectbefore;
    }

    public void setDisposalmeasurejectbefore(String disposalmeasurejectbefore) {
        this.disposalmeasurejectbefore = disposalmeasurejectbefore == null ? null : disposalmeasurejectbefore.trim();
    }

    public String getChecksummaryother() {
        return checksummaryother;
    }

    public void setChecksummaryother(String checksummaryother) {
        this.checksummaryother = checksummaryother == null ? null : checksummaryother.trim();
    }

    public String getAcmsaccflag() {
        return acmsaccflag;
    }

    public void setAcmsaccflag(String acmsaccflag) {
        this.acmsaccflag = acmsaccflag == null ? null : acmsaccflag.trim();
    }

    public String getAlarmcount() {
        return alarmcount;
    }

    public void setAlarmcount(String alarmcount) {
        this.alarmcount = alarmcount == null ? null : alarmcount.trim();
    }

    public String getIstowner() {
        return istowner;
    }

    public void setIstowner(String istowner) {
        this.istowner = istowner == null ? null : istowner.trim();
    }

    public String getCovertype() {
        return covertype;
    }

    public void setCovertype(String covertype) {
        this.covertype = covertype == null ? null : covertype.trim();
    }

    public String getRoomproperty() {
        return roomproperty;
    }

    public void setRoomproperty(String roomproperty) {
        this.roomproperty = roomproperty == null ? null : roomproperty.trim();
    }

    public BigDecimal getSheetprioritylevel() {
        return sheetprioritylevel;
    }

    public void setSheetprioritylevel(BigDecimal sheetprioritylevel) {
        this.sheetprioritylevel = sheetprioritylevel;
    }

    public String getUrgencydegree() {
        return urgencydegree;
    }

    public void setUrgencydegree(String urgencydegree) {
        this.urgencydegree = urgencydegree == null ? null : urgencydegree.trim();
    }

    public String getAsitename() {
        return asitename;
    }

    public void setAsitename(String asitename) {
        this.asitename = asitename == null ? null : asitename.trim();
    }

    public String getZsitename() {
        return zsitename;
    }

    public void setZsitename(String zsitename) {
        this.zsitename = zsitename == null ? null : zsitename.trim();
    }

    public String getAlocation() {
        return alocation;
    }

    public void setAlocation(String alocation) {
        this.alocation = alocation == null ? null : alocation.trim();
    }

    public String getZlocation() {
        return zlocation;
    }

    public void setZlocation(String zlocation) {
        this.zlocation = zlocation == null ? null : zlocation.trim();
    }

    public String getTransname() {
        return transname;
    }

    public void setTransname(String transname) {
        this.transname = transname == null ? null : transname.trim();
    }

    public String getCablename() {
        return cablename;
    }

    public void setCablename(String cablename) {
        this.cablename = cablename == null ? null : cablename.trim();
    }

    public String getAsitenum() {
        return asitenum;
    }

    public void setAsitenum(String asitenum) {
        this.asitenum = asitenum == null ? null : asitenum.trim();
    }

    public String getZsitenum() {
        return zsitenum;
    }

    public void setZsitenum(String zsitenum) {
        this.zsitenum = zsitenum == null ? null : zsitenum.trim();
    }

    public String getAcuid() {
        return acuid;
    }

    public void setAcuid(String acuid) {
        this.acuid = acuid == null ? null : acuid.trim();
    }

    public String getZcuid() {
        return zcuid;
    }

    public void setZcuid(String zcuid) {
        this.zcuid = zcuid == null ? null : zcuid.trim();
    }

    public String getWdtype() {
        return wdtype;
    }

    public void setWdtype(String wdtype) {
        this.wdtype = wdtype == null ? null : wdtype.trim();
    }

    public String getOnupattern() {
        return onupattern;
    }

    public void setOnupattern(String onupattern) {
        this.onupattern = onupattern == null ? null : onupattern.trim();
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname == null ? null : acname.trim();
    }

    public String getCellcode() {
        return cellcode;
    }

    public void setCellcode(String cellcode) {
        this.cellcode = cellcode == null ? null : cellcode.trim();
    }

    public String getTowersitename() {
        return towersitename;
    }

    public void setTowersitename(String towersitename) {
        this.towersitename = towersitename == null ? null : towersitename.trim();
    }

    public String getTowersiteid() {
        return towersiteid;
    }

    public void setTowersiteid(String towersiteid) {
        this.towersiteid = towersiteid == null ? null : towersiteid.trim();
    }

    public String getSiteinterruptionreason() {
        return siteinterruptionreason;
    }

    public void setSiteinterruptionreason(String siteinterruptionreason) {
        this.siteinterruptionreason = siteinterruptionreason == null ? null : siteinterruptionreason.trim();
    }

    public BigDecimal getT1overtimeflage() {
        return t1overtimeflage;
    }

    public void setT1overtimeflage(BigDecimal t1overtimeflage) {
        this.t1overtimeflage = t1overtimeflage;
    }

    public BigDecimal getT2overtimeflage() {
        return t2overtimeflage;
    }

    public void setT2overtimeflage(BigDecimal t2overtimeflage) {
        this.t2overtimeflage = t2overtimeflage;
    }

    public BigDecimal getAcmsovertimeflage() {
        return acmsovertimeflage;
    }

    public void setAcmsovertimeflage(BigDecimal acmsovertimeflage) {
        this.acmsovertimeflage = acmsovertimeflage;
    }

    public String getDelayclassify() {
        return delayclassify;
    }

    public void setDelayclassify(String delayclassify) {
        this.delayclassify = delayclassify == null ? null : delayclassify.trim();
    }

    public String getBusinessdamage() {
        return businessdamage;
    }

    public void setBusinessdamage(String businessdamage) {
        this.businessdamage = businessdamage == null ? null : businessdamage.trim();
    }

    public String getBrasfaultport() {
        return brasfaultport;
    }

    public void setBrasfaultport(String brasfaultport) {
        this.brasfaultport = brasfaultport == null ? null : brasfaultport.trim();
    }

    public String getJtattachurl() {
        return jtattachurl;
    }

    public void setJtattachurl(String jtattachurl) {
        this.jtattachurl = jtattachurl == null ? null : jtattachurl.trim();
    }

    public Date getDisposaltime() {
        return disposaltime;
    }

    public void setDisposaltime(Date disposaltime) {
        this.disposaltime = disposaltime;
    }

    public Short getIsexistcheckfailurenum() {
        return isexistcheckfailurenum;
    }

    public void setIsexistcheckfailurenum(Short isexistcheckfailurenum) {
        this.isexistcheckfailurenum = isexistcheckfailurenum;
    }

    public String getFaultreasondesc() {
        return faultreasondesc;
    }

    public void setFaultreasondesc(String faultreasondesc) {
        this.faultreasondesc = faultreasondesc == null ? null : faultreasondesc.trim();
    }

    public Date getRecoveroperationtime() {
        return recoveroperationtime;
    }

    public void setRecoveroperationtime(Date recoveroperationtime) {
        this.recoveroperationtime = recoveroperationtime;
    }

    public String getAlarmtitle() {
        return alarmtitle;
    }

    public void setAlarmtitle(String alarmtitle) {
        this.alarmtitle = alarmtitle == null ? null : alarmtitle.trim();
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype == null ? null : devicetype.trim();
    }

    public String getIsuploadjt() {
        return isuploadjt;
    }

    public void setIsuploadjt(String isuploadjt) {
        this.isuploadjt = isuploadjt == null ? null : isuploadjt.trim();
    }

    public String getFrequentsheet() {
        return frequentsheet;
    }

    public void setFrequentsheet(String frequentsheet) {
        this.frequentsheet = frequentsheet == null ? null : frequentsheet.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getPortinfo() {
        return portinfo;
    }

    public void setPortinfo(String portinfo) {
        this.portinfo = portinfo == null ? null : portinfo.trim();
    }

    public String getRespectiveregion() {
        return respectiveregion;
    }

    public void setRespectiveregion(String respectiveregion) {
        this.respectiveregion = respectiveregion == null ? null : respectiveregion.trim();
    }

    public String getCorrelationcircuitlist() {
        return correlationcircuitlist;
    }

    public void setCorrelationcircuitlist(String correlationcircuitlist) {
        this.correlationcircuitlist = correlationcircuitlist == null ? null : correlationcircuitlist.trim();
    }
}