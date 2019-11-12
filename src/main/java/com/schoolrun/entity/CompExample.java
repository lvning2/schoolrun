package com.schoolrun.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUtelIsNull() {
            addCriterion("utel is null");
            return (Criteria) this;
        }

        public Criteria andUtelIsNotNull() {
            addCriterion("utel is not null");
            return (Criteria) this;
        }

        public Criteria andUtelEqualTo(String value) {
            addCriterion("utel =", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotEqualTo(String value) {
            addCriterion("utel <>", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelGreaterThan(String value) {
            addCriterion("utel >", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelGreaterThanOrEqualTo(String value) {
            addCriterion("utel >=", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLessThan(String value) {
            addCriterion("utel <", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLessThanOrEqualTo(String value) {
            addCriterion("utel <=", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelLike(String value) {
            addCriterion("utel like", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotLike(String value) {
            addCriterion("utel not like", value, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelIn(List<String> values) {
            addCriterion("utel in", values, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotIn(List<String> values) {
            addCriterion("utel not in", values, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelBetween(String value1, String value2) {
            addCriterion("utel between", value1, value2, "utel");
            return (Criteria) this;
        }

        public Criteria andUtelNotBetween(String value1, String value2) {
            addCriterion("utel not between", value1, value2, "utel");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPtelIsNull() {
            addCriterion("ptel is null");
            return (Criteria) this;
        }

        public Criteria andPtelIsNotNull() {
            addCriterion("ptel is not null");
            return (Criteria) this;
        }

        public Criteria andPtelEqualTo(String value) {
            addCriterion("ptel =", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotEqualTo(String value) {
            addCriterion("ptel <>", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelGreaterThan(String value) {
            addCriterion("ptel >", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelGreaterThanOrEqualTo(String value) {
            addCriterion("ptel >=", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLessThan(String value) {
            addCriterion("ptel <", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLessThanOrEqualTo(String value) {
            addCriterion("ptel <=", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLike(String value) {
            addCriterion("ptel like", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotLike(String value) {
            addCriterion("ptel not like", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelIn(List<String> values) {
            addCriterion("ptel in", values, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotIn(List<String> values) {
            addCriterion("ptel not in", values, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelBetween(String value1, String value2) {
            addCriterion("ptel between", value1, value2, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotBetween(String value1, String value2) {
            addCriterion("ptel not between", value1, value2, "ptel");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(Integer value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(Integer value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(Integer value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(Integer value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<Integer> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<Integer> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(Integer value1, Integer value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCmainIsNull() {
            addCriterion("cmain is null");
            return (Criteria) this;
        }

        public Criteria andCmainIsNotNull() {
            addCriterion("cmain is not null");
            return (Criteria) this;
        }

        public Criteria andCmainEqualTo(String value) {
            addCriterion("cmain =", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainNotEqualTo(String value) {
            addCriterion("cmain <>", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainGreaterThan(String value) {
            addCriterion("cmain >", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainGreaterThanOrEqualTo(String value) {
            addCriterion("cmain >=", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainLessThan(String value) {
            addCriterion("cmain <", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainLessThanOrEqualTo(String value) {
            addCriterion("cmain <=", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainLike(String value) {
            addCriterion("cmain like", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainNotLike(String value) {
            addCriterion("cmain not like", value, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainIn(List<String> values) {
            addCriterion("cmain in", values, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainNotIn(List<String> values) {
            addCriterion("cmain not in", values, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainBetween(String value1, String value2) {
            addCriterion("cmain between", value1, value2, "cmain");
            return (Criteria) this;
        }

        public Criteria andCmainNotBetween(String value1, String value2) {
            addCriterion("cmain not between", value1, value2, "cmain");
            return (Criteria) this;
        }

        public Criteria andCproofIsNull() {
            addCriterion("cproof is null");
            return (Criteria) this;
        }

        public Criteria andCproofIsNotNull() {
            addCriterion("cproof is not null");
            return (Criteria) this;
        }

        public Criteria andCproofEqualTo(String value) {
            addCriterion("cproof =", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofNotEqualTo(String value) {
            addCriterion("cproof <>", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofGreaterThan(String value) {
            addCriterion("cproof >", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofGreaterThanOrEqualTo(String value) {
            addCriterion("cproof >=", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofLessThan(String value) {
            addCriterion("cproof <", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofLessThanOrEqualTo(String value) {
            addCriterion("cproof <=", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofLike(String value) {
            addCriterion("cproof like", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofNotLike(String value) {
            addCriterion("cproof not like", value, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofIn(List<String> values) {
            addCriterion("cproof in", values, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofNotIn(List<String> values) {
            addCriterion("cproof not in", values, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofBetween(String value1, String value2) {
            addCriterion("cproof between", value1, value2, "cproof");
            return (Criteria) this;
        }

        public Criteria andCproofNotBetween(String value1, String value2) {
            addCriterion("cproof not between", value1, value2, "cproof");
            return (Criteria) this;
        }

        public Criteria andCstartIsNull() {
            addCriterion("cstart is null");
            return (Criteria) this;
        }

        public Criteria andCstartIsNotNull() {
            addCriterion("cstart is not null");
            return (Criteria) this;
        }

        public Criteria andCstartEqualTo(Date value) {
            addCriterion("cstart =", value, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartNotEqualTo(Date value) {
            addCriterion("cstart <>", value, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartGreaterThan(Date value) {
            addCriterion("cstart >", value, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartGreaterThanOrEqualTo(Date value) {
            addCriterion("cstart >=", value, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartLessThan(Date value) {
            addCriterion("cstart <", value, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartLessThanOrEqualTo(Date value) {
            addCriterion("cstart <=", value, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartIn(List<Date> values) {
            addCriterion("cstart in", values, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartNotIn(List<Date> values) {
            addCriterion("cstart not in", values, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartBetween(Date value1, Date value2) {
            addCriterion("cstart between", value1, value2, "cstart");
            return (Criteria) this;
        }

        public Criteria andCstartNotBetween(Date value1, Date value2) {
            addCriterion("cstart not between", value1, value2, "cstart");
            return (Criteria) this;
        }

        public Criteria andCfinishIsNull() {
            addCriterion("cfinish is null");
            return (Criteria) this;
        }

        public Criteria andCfinishIsNotNull() {
            addCriterion("cfinish is not null");
            return (Criteria) this;
        }

        public Criteria andCfinishEqualTo(Date value) {
            addCriterion("cfinish =", value, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishNotEqualTo(Date value) {
            addCriterion("cfinish <>", value, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishGreaterThan(Date value) {
            addCriterion("cfinish >", value, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishGreaterThanOrEqualTo(Date value) {
            addCriterion("cfinish >=", value, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishLessThan(Date value) {
            addCriterion("cfinish <", value, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishLessThanOrEqualTo(Date value) {
            addCriterion("cfinish <=", value, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishIn(List<Date> values) {
            addCriterion("cfinish in", values, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishNotIn(List<Date> values) {
            addCriterion("cfinish not in", values, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishBetween(Date value1, Date value2) {
            addCriterion("cfinish between", value1, value2, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCfinishNotBetween(Date value1, Date value2) {
            addCriterion("cfinish not between", value1, value2, "cfinish");
            return (Criteria) this;
        }

        public Criteria andCstateIsNull() {
            addCriterion("cstate is null");
            return (Criteria) this;
        }

        public Criteria andCstateIsNotNull() {
            addCriterion("cstate is not null");
            return (Criteria) this;
        }

        public Criteria andCstateEqualTo(Integer value) {
            addCriterion("cstate =", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotEqualTo(Integer value) {
            addCriterion("cstate <>", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThan(Integer value) {
            addCriterion("cstate >", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cstate >=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThan(Integer value) {
            addCriterion("cstate <", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateLessThanOrEqualTo(Integer value) {
            addCriterion("cstate <=", value, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateIn(List<Integer> values) {
            addCriterion("cstate in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotIn(List<Integer> values) {
            addCriterion("cstate not in", values, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateBetween(Integer value1, Integer value2) {
            addCriterion("cstate between", value1, value2, "cstate");
            return (Criteria) this;
        }

        public Criteria andCstateNotBetween(Integer value1, Integer value2) {
            addCriterion("cstate not between", value1, value2, "cstate");
            return (Criteria) this;
        }

        public Criteria andCresultIsNull() {
            addCriterion("cresult is null");
            return (Criteria) this;
        }

        public Criteria andCresultIsNotNull() {
            addCriterion("cresult is not null");
            return (Criteria) this;
        }

        public Criteria andCresultEqualTo(String value) {
            addCriterion("cresult =", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultNotEqualTo(String value) {
            addCriterion("cresult <>", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultGreaterThan(String value) {
            addCriterion("cresult >", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultGreaterThanOrEqualTo(String value) {
            addCriterion("cresult >=", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultLessThan(String value) {
            addCriterion("cresult <", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultLessThanOrEqualTo(String value) {
            addCriterion("cresult <=", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultLike(String value) {
            addCriterion("cresult like", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultNotLike(String value) {
            addCriterion("cresult not like", value, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultIn(List<String> values) {
            addCriterion("cresult in", values, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultNotIn(List<String> values) {
            addCriterion("cresult not in", values, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultBetween(String value1, String value2) {
            addCriterion("cresult between", value1, value2, "cresult");
            return (Criteria) this;
        }

        public Criteria andCresultNotBetween(String value1, String value2) {
            addCriterion("cresult not between", value1, value2, "cresult");
            return (Criteria) this;
        }

        public Criteria andCuintIsNull() {
            addCriterion("cuint is null");
            return (Criteria) this;
        }

        public Criteria andCuintIsNotNull() {
            addCriterion("cuint is not null");
            return (Criteria) this;
        }

        public Criteria andCuintEqualTo(Integer value) {
            addCriterion("cuint =", value, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintNotEqualTo(Integer value) {
            addCriterion("cuint <>", value, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintGreaterThan(Integer value) {
            addCriterion("cuint >", value, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuint >=", value, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintLessThan(Integer value) {
            addCriterion("cuint <", value, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintLessThanOrEqualTo(Integer value) {
            addCriterion("cuint <=", value, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintIn(List<Integer> values) {
            addCriterion("cuint in", values, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintNotIn(List<Integer> values) {
            addCriterion("cuint not in", values, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintBetween(Integer value1, Integer value2) {
            addCriterion("cuint between", value1, value2, "cuint");
            return (Criteria) this;
        }

        public Criteria andCuintNotBetween(Integer value1, Integer value2) {
            addCriterion("cuint not between", value1, value2, "cuint");
            return (Criteria) this;
        }

        public Criteria andCpintIsNull() {
            addCriterion("cpint is null");
            return (Criteria) this;
        }

        public Criteria andCpintIsNotNull() {
            addCriterion("cpint is not null");
            return (Criteria) this;
        }

        public Criteria andCpintEqualTo(Integer value) {
            addCriterion("cpint =", value, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintNotEqualTo(Integer value) {
            addCriterion("cpint <>", value, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintGreaterThan(Integer value) {
            addCriterion("cpint >", value, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpint >=", value, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintLessThan(Integer value) {
            addCriterion("cpint <", value, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintLessThanOrEqualTo(Integer value) {
            addCriterion("cpint <=", value, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintIn(List<Integer> values) {
            addCriterion("cpint in", values, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintNotIn(List<Integer> values) {
            addCriterion("cpint not in", values, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintBetween(Integer value1, Integer value2) {
            addCriterion("cpint between", value1, value2, "cpint");
            return (Criteria) this;
        }

        public Criteria andCpintNotBetween(Integer value1, Integer value2) {
            addCriterion("cpint not between", value1, value2, "cpint");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}