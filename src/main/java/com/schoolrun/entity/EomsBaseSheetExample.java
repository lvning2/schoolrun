package com.schoolrun.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EomsBaseSheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EomsBaseSheetExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreatedeptIsNull() {
            addCriterion("CREATEDEPT is null");
            return (Criteria) this;
        }

        public Criteria andCreatedeptIsNotNull() {
            addCriterion("CREATEDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedeptEqualTo(String value) {
            addCriterion("CREATEDEPT =", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotEqualTo(String value) {
            addCriterion("CREATEDEPT <>", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptGreaterThan(String value) {
            addCriterion("CREATEDEPT >", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDEPT >=", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptLessThan(String value) {
            addCriterion("CREATEDEPT <", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptLessThanOrEqualTo(String value) {
            addCriterion("CREATEDEPT <=", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptLike(String value) {
            addCriterion("CREATEDEPT like", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotLike(String value) {
            addCriterion("CREATEDEPT not like", value, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptIn(List<String> values) {
            addCriterion("CREATEDEPT in", values, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotIn(List<String> values) {
            addCriterion("CREATEDEPT not in", values, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptBetween(String value1, String value2) {
            addCriterion("CREATEDEPT between", value1, value2, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptNotBetween(String value1, String value2) {
            addCriterion("CREATEDEPT not between", value1, value2, "createdept");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidIsNull() {
            addCriterion("CREATEDEPTID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidIsNotNull() {
            addCriterion("CREATEDEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidEqualTo(String value) {
            addCriterion("CREATEDEPTID =", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidNotEqualTo(String value) {
            addCriterion("CREATEDEPTID <>", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidGreaterThan(String value) {
            addCriterion("CREATEDEPTID >", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEDEPTID >=", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidLessThan(String value) {
            addCriterion("CREATEDEPTID <", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidLessThanOrEqualTo(String value) {
            addCriterion("CREATEDEPTID <=", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidLike(String value) {
            addCriterion("CREATEDEPTID like", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidNotLike(String value) {
            addCriterion("CREATEDEPTID not like", value, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidIn(List<String> values) {
            addCriterion("CREATEDEPTID in", values, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidNotIn(List<String> values) {
            addCriterion("CREATEDEPTID not in", values, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidBetween(String value1, String value2) {
            addCriterion("CREATEDEPTID between", value1, value2, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatedeptidNotBetween(String value1, String value2) {
            addCriterion("CREATEDEPTID not between", value1, value2, "createdeptid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CREATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CREATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CREATEUSER like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CREATEUSER not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CREATEUSER not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CREATEUSERID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CREATEUSERID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CREATEUSERID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CREATEUSERID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CREATEUSERID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CREATEUSERID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CREATEUSERID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CREATEUSERID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CREATEUSERID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleIsNull() {
            addCriterion("CREATEUSERROLE is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleIsNotNull() {
            addCriterion("CREATEUSERROLE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleEqualTo(String value) {
            addCriterion("CREATEUSERROLE =", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleNotEqualTo(String value) {
            addCriterion("CREATEUSERROLE <>", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleGreaterThan(String value) {
            addCriterion("CREATEUSERROLE >", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERROLE >=", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleLessThan(String value) {
            addCriterion("CREATEUSERROLE <", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERROLE <=", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleLike(String value) {
            addCriterion("CREATEUSERROLE like", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleNotLike(String value) {
            addCriterion("CREATEUSERROLE not like", value, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleIn(List<String> values) {
            addCriterion("CREATEUSERROLE in", values, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleNotIn(List<String> values) {
            addCriterion("CREATEUSERROLE not in", values, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleBetween(String value1, String value2) {
            addCriterion("CREATEUSERROLE between", value1, value2, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERROLE not between", value1, value2, "createuserrole");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidIsNull() {
            addCriterion("CREATEUSERROLEID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidIsNotNull() {
            addCriterion("CREATEUSERROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERROLEID =", value, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidNotEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERROLEID <>", value, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidGreaterThan(BigDecimal value) {
            addCriterion("CREATEUSERROLEID >", value, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERROLEID >=", value, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidLessThan(BigDecimal value) {
            addCriterion("CREATEUSERROLEID <", value, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERROLEID <=", value, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidIn(List<BigDecimal> values) {
            addCriterion("CREATEUSERROLEID in", values, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidNotIn(List<BigDecimal> values) {
            addCriterion("CREATEUSERROLEID not in", values, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEUSERROLEID between", value1, value2, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserroleidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEUSERROLEID not between", value1, value2, "createuserroleid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnIsNull() {
            addCriterion("CREATEUSERPSN is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnIsNotNull() {
            addCriterion("CREATEUSERPSN is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnEqualTo(String value) {
            addCriterion("CREATEUSERPSN =", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnNotEqualTo(String value) {
            addCriterion("CREATEUSERPSN <>", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnGreaterThan(String value) {
            addCriterion("CREATEUSERPSN >", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERPSN >=", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnLessThan(String value) {
            addCriterion("CREATEUSERPSN <", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERPSN <=", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnLike(String value) {
            addCriterion("CREATEUSERPSN like", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnNotLike(String value) {
            addCriterion("CREATEUSERPSN not like", value, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnIn(List<String> values) {
            addCriterion("CREATEUSERPSN in", values, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnNotIn(List<String> values) {
            addCriterion("CREATEUSERPSN not in", values, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnBetween(String value1, String value2) {
            addCriterion("CREATEUSERPSN between", value1, value2, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERPSN not between", value1, value2, "createuserpsn");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidIsNull() {
            addCriterion("CREATEUSERPSNID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidIsNotNull() {
            addCriterion("CREATEUSERPSNID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERPSNID =", value, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidNotEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERPSNID <>", value, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidGreaterThan(BigDecimal value) {
            addCriterion("CREATEUSERPSNID >", value, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERPSNID >=", value, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidLessThan(BigDecimal value) {
            addCriterion("CREATEUSERPSNID <", value, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERPSNID <=", value, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidIn(List<BigDecimal> values) {
            addCriterion("CREATEUSERPSNID in", values, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidNotIn(List<BigDecimal> values) {
            addCriterion("CREATEUSERPSNID not in", values, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEUSERPSNID between", value1, value2, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserpsnidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEUSERPSNID not between", value1, value2, "createuserpsnid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobIsNull() {
            addCriterion("CREATEUSERJOB is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobIsNotNull() {
            addCriterion("CREATEUSERJOB is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobEqualTo(String value) {
            addCriterion("CREATEUSERJOB =", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobNotEqualTo(String value) {
            addCriterion("CREATEUSERJOB <>", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobGreaterThan(String value) {
            addCriterion("CREATEUSERJOB >", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERJOB >=", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobLessThan(String value) {
            addCriterion("CREATEUSERJOB <", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERJOB <=", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobLike(String value) {
            addCriterion("CREATEUSERJOB like", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobNotLike(String value) {
            addCriterion("CREATEUSERJOB not like", value, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobIn(List<String> values) {
            addCriterion("CREATEUSERJOB in", values, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobNotIn(List<String> values) {
            addCriterion("CREATEUSERJOB not in", values, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobBetween(String value1, String value2) {
            addCriterion("CREATEUSERJOB between", value1, value2, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERJOB not between", value1, value2, "createuserjob");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidIsNull() {
            addCriterion("CREATEUSERJOBID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidIsNotNull() {
            addCriterion("CREATEUSERJOBID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERJOBID =", value, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidNotEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERJOBID <>", value, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidGreaterThan(BigDecimal value) {
            addCriterion("CREATEUSERJOBID >", value, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERJOBID >=", value, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidLessThan(BigDecimal value) {
            addCriterion("CREATEUSERJOBID <", value, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEUSERJOBID <=", value, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidIn(List<BigDecimal> values) {
            addCriterion("CREATEUSERJOBID in", values, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidNotIn(List<BigDecimal> values) {
            addCriterion("CREATEUSERJOBID not in", values, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEUSERJOBID between", value1, value2, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andCreateuserjobidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEUSERJOBID not between", value1, value2, "createuserjobid");
            return (Criteria) this;
        }

        public Criteria andSheetidIsNull() {
            addCriterion("SHEETID is null");
            return (Criteria) this;
        }

        public Criteria andSheetidIsNotNull() {
            addCriterion("SHEETID is not null");
            return (Criteria) this;
        }

        public Criteria andSheetidEqualTo(String value) {
            addCriterion("SHEETID =", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotEqualTo(String value) {
            addCriterion("SHEETID <>", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidGreaterThan(String value) {
            addCriterion("SHEETID >", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidGreaterThanOrEqualTo(String value) {
            addCriterion("SHEETID >=", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidLessThan(String value) {
            addCriterion("SHEETID <", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidLessThanOrEqualTo(String value) {
            addCriterion("SHEETID <=", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidLike(String value) {
            addCriterion("SHEETID like", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotLike(String value) {
            addCriterion("SHEETID not like", value, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidIn(List<String> values) {
            addCriterion("SHEETID in", values, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotIn(List<String> values) {
            addCriterion("SHEETID not in", values, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidBetween(String value1, String value2) {
            addCriterion("SHEETID between", value1, value2, "sheetid");
            return (Criteria) this;
        }

        public Criteria andSheetidNotBetween(String value1, String value2) {
            addCriterion("SHEETID not between", value1, value2, "sheetid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneIsNull() {
            addCriterion("CREATEUSERTELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneIsNotNull() {
            addCriterion("CREATEUSERTELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneEqualTo(String value) {
            addCriterion("CREATEUSERTELEPHONE =", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneNotEqualTo(String value) {
            addCriterion("CREATEUSERTELEPHONE <>", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneGreaterThan(String value) {
            addCriterion("CREATEUSERTELEPHONE >", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERTELEPHONE >=", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneLessThan(String value) {
            addCriterion("CREATEUSERTELEPHONE <", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERTELEPHONE <=", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneLike(String value) {
            addCriterion("CREATEUSERTELEPHONE like", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneNotLike(String value) {
            addCriterion("CREATEUSERTELEPHONE not like", value, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneIn(List<String> values) {
            addCriterion("CREATEUSERTELEPHONE in", values, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneNotIn(List<String> values) {
            addCriterion("CREATEUSERTELEPHONE not in", values, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneBetween(String value1, String value2) {
            addCriterion("CREATEUSERTELEPHONE between", value1, value2, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andCreateusertelephoneNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERTELEPHONE not between", value1, value2, "createusertelephone");
            return (Criteria) this;
        }

        public Criteria andSheetstateIsNull() {
            addCriterion("SHEETSTATE is null");
            return (Criteria) this;
        }

        public Criteria andSheetstateIsNotNull() {
            addCriterion("SHEETSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andSheetstateEqualTo(String value) {
            addCriterion("SHEETSTATE =", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateNotEqualTo(String value) {
            addCriterion("SHEETSTATE <>", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateGreaterThan(String value) {
            addCriterion("SHEETSTATE >", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateGreaterThanOrEqualTo(String value) {
            addCriterion("SHEETSTATE >=", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateLessThan(String value) {
            addCriterion("SHEETSTATE <", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateLessThanOrEqualTo(String value) {
            addCriterion("SHEETSTATE <=", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateLike(String value) {
            addCriterion("SHEETSTATE like", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateNotLike(String value) {
            addCriterion("SHEETSTATE not like", value, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateIn(List<String> values) {
            addCriterion("SHEETSTATE in", values, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateNotIn(List<String> values) {
            addCriterion("SHEETSTATE not in", values, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateBetween(String value1, String value2) {
            addCriterion("SHEETSTATE between", value1, value2, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheetstateNotBetween(String value1, String value2) {
            addCriterion("SHEETSTATE not between", value1, value2, "sheetstate");
            return (Criteria) this;
        }

        public Criteria andSheettypeIsNull() {
            addCriterion("SHEETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSheettypeIsNotNull() {
            addCriterion("SHEETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSheettypeEqualTo(String value) {
            addCriterion("SHEETTYPE =", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeNotEqualTo(String value) {
            addCriterion("SHEETTYPE <>", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeGreaterThan(String value) {
            addCriterion("SHEETTYPE >", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHEETTYPE >=", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeLessThan(String value) {
            addCriterion("SHEETTYPE <", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeLessThanOrEqualTo(String value) {
            addCriterion("SHEETTYPE <=", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeLike(String value) {
            addCriterion("SHEETTYPE like", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeNotLike(String value) {
            addCriterion("SHEETTYPE not like", value, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeIn(List<String> values) {
            addCriterion("SHEETTYPE in", values, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeNotIn(List<String> values) {
            addCriterion("SHEETTYPE not in", values, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeBetween(String value1, String value2) {
            addCriterion("SHEETTYPE between", value1, value2, "sheettype");
            return (Criteria) this;
        }

        public Criteria andSheettypeNotBetween(String value1, String value2) {
            addCriterion("SHEETTYPE not between", value1, value2, "sheettype");
            return (Criteria) this;
        }

        public Criteria andPiidIsNull() {
            addCriterion("PIID is null");
            return (Criteria) this;
        }

        public Criteria andPiidIsNotNull() {
            addCriterion("PIID is not null");
            return (Criteria) this;
        }

        public Criteria andPiidEqualTo(String value) {
            addCriterion("PIID =", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotEqualTo(String value) {
            addCriterion("PIID <>", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThan(String value) {
            addCriterion("PIID >", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThanOrEqualTo(String value) {
            addCriterion("PIID >=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThan(String value) {
            addCriterion("PIID <", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThanOrEqualTo(String value) {
            addCriterion("PIID <=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLike(String value) {
            addCriterion("PIID like", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotLike(String value) {
            addCriterion("PIID not like", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidIn(List<String> values) {
            addCriterion("PIID in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotIn(List<String> values) {
            addCriterion("PIID not in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidBetween(String value1, String value2) {
            addCriterion("PIID between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotBetween(String value1, String value2) {
            addCriterion("PIID not between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("CREATEUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("CREATEUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("CREATEUSERNAME =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("CREATEUSERNAME <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("CREATEUSERNAME >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("CREATEUSERNAME <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERNAME <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("CREATEUSERNAME like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("CREATEUSERNAME not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("CREATEUSERNAME in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("CREATEUSERNAME not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERNAME not between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameIsNull() {
            addCriterion("CURRENTSTEPNAME is null");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameIsNotNull() {
            addCriterion("CURRENTSTEPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameEqualTo(String value) {
            addCriterion("CURRENTSTEPNAME =", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameNotEqualTo(String value) {
            addCriterion("CURRENTSTEPNAME <>", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameGreaterThan(String value) {
            addCriterion("CURRENTSTEPNAME >", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTSTEPNAME >=", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameLessThan(String value) {
            addCriterion("CURRENTSTEPNAME <", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameLessThanOrEqualTo(String value) {
            addCriterion("CURRENTSTEPNAME <=", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameLike(String value) {
            addCriterion("CURRENTSTEPNAME like", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameNotLike(String value) {
            addCriterion("CURRENTSTEPNAME not like", value, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameIn(List<String> values) {
            addCriterion("CURRENTSTEPNAME in", values, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameNotIn(List<String> values) {
            addCriterion("CURRENTSTEPNAME not in", values, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameBetween(String value1, String value2) {
            addCriterion("CURRENTSTEPNAME between", value1, value2, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andCurrentstepnameNotBetween(String value1, String value2) {
            addCriterion("CURRENTSTEPNAME not between", value1, value2, "currentstepname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(BigDecimal value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(BigDecimal value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(BigDecimal value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(BigDecimal value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<BigDecimal> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<BigDecimal> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andFilingfileIsNull() {
            addCriterion("FILINGFILE is null");
            return (Criteria) this;
        }

        public Criteria andFilingfileIsNotNull() {
            addCriterion("FILINGFILE is not null");
            return (Criteria) this;
        }

        public Criteria andFilingfileEqualTo(String value) {
            addCriterion("FILINGFILE =", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileNotEqualTo(String value) {
            addCriterion("FILINGFILE <>", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileGreaterThan(String value) {
            addCriterion("FILINGFILE >", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileGreaterThanOrEqualTo(String value) {
            addCriterion("FILINGFILE >=", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileLessThan(String value) {
            addCriterion("FILINGFILE <", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileLessThanOrEqualTo(String value) {
            addCriterion("FILINGFILE <=", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileLike(String value) {
            addCriterion("FILINGFILE like", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileNotLike(String value) {
            addCriterion("FILINGFILE not like", value, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileIn(List<String> values) {
            addCriterion("FILINGFILE in", values, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileNotIn(List<String> values) {
            addCriterion("FILINGFILE not in", values, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileBetween(String value1, String value2) {
            addCriterion("FILINGFILE between", value1, value2, "filingfile");
            return (Criteria) this;
        }

        public Criteria andFilingfileNotBetween(String value1, String value2) {
            addCriterion("FILINGFILE not between", value1, value2, "filingfile");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("OVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("OVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Date value) {
            addCriterionForJDBCDate("OVERTIME =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OVERTIME <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OVERTIME >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OVERTIME >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Date value) {
            addCriterionForJDBCDate("OVERTIME <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OVERTIME <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Date> values) {
            addCriterionForJDBCDate("OVERTIME in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OVERTIME not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OVERTIME between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OVERTIME not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptIsNull() {
            addCriterion("OVERTIMEDEPT is null");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptIsNotNull() {
            addCriterion("OVERTIMEDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptEqualTo(String value) {
            addCriterion("OVERTIMEDEPT =", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptNotEqualTo(String value) {
            addCriterion("OVERTIMEDEPT <>", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptGreaterThan(String value) {
            addCriterion("OVERTIMEDEPT >", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIMEDEPT >=", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptLessThan(String value) {
            addCriterion("OVERTIMEDEPT <", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptLessThanOrEqualTo(String value) {
            addCriterion("OVERTIMEDEPT <=", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptLike(String value) {
            addCriterion("OVERTIMEDEPT like", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptNotLike(String value) {
            addCriterion("OVERTIMEDEPT not like", value, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptIn(List<String> values) {
            addCriterion("OVERTIMEDEPT in", values, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptNotIn(List<String> values) {
            addCriterion("OVERTIMEDEPT not in", values, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptBetween(String value1, String value2) {
            addCriterion("OVERTIMEDEPT between", value1, value2, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimedeptNotBetween(String value1, String value2) {
            addCriterion("OVERTIMEDEPT not between", value1, value2, "overtimedept");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagIsNull() {
            addCriterion("OVERTIMEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagIsNotNull() {
            addCriterion("OVERTIMEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagEqualTo(String value) {
            addCriterion("OVERTIMEFLAG =", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagNotEqualTo(String value) {
            addCriterion("OVERTIMEFLAG <>", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagGreaterThan(String value) {
            addCriterion("OVERTIMEFLAG >", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIMEFLAG >=", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagLessThan(String value) {
            addCriterion("OVERTIMEFLAG <", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagLessThanOrEqualTo(String value) {
            addCriterion("OVERTIMEFLAG <=", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagLike(String value) {
            addCriterion("OVERTIMEFLAG like", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagNotLike(String value) {
            addCriterion("OVERTIMEFLAG not like", value, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagIn(List<String> values) {
            addCriterion("OVERTIMEFLAG in", values, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagNotIn(List<String> values) {
            addCriterion("OVERTIMEFLAG not in", values, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagBetween(String value1, String value2) {
            addCriterion("OVERTIMEFLAG between", value1, value2, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimeflagNotBetween(String value1, String value2) {
            addCriterion("OVERTIMEFLAG not between", value1, value2, "overtimeflag");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonIsNull() {
            addCriterion("OVERTIMEPERSON is null");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonIsNotNull() {
            addCriterion("OVERTIMEPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonEqualTo(String value) {
            addCriterion("OVERTIMEPERSON =", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonNotEqualTo(String value) {
            addCriterion("OVERTIMEPERSON <>", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonGreaterThan(String value) {
            addCriterion("OVERTIMEPERSON >", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonGreaterThanOrEqualTo(String value) {
            addCriterion("OVERTIMEPERSON >=", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonLessThan(String value) {
            addCriterion("OVERTIMEPERSON <", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonLessThanOrEqualTo(String value) {
            addCriterion("OVERTIMEPERSON <=", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonLike(String value) {
            addCriterion("OVERTIMEPERSON like", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonNotLike(String value) {
            addCriterion("OVERTIMEPERSON not like", value, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonIn(List<String> values) {
            addCriterion("OVERTIMEPERSON in", values, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonNotIn(List<String> values) {
            addCriterion("OVERTIMEPERSON not in", values, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonBetween(String value1, String value2) {
            addCriterion("OVERTIMEPERSON between", value1, value2, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andOvertimepersonNotBetween(String value1, String value2) {
            addCriterion("OVERTIMEPERSON not between", value1, value2, "overtimeperson");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNull() {
            addCriterion("REPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andReplytimeIsNotNull() {
            addCriterion("REPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("REPLYTIME =", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("REPLYTIME <>", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("REPLYTIME >", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REPLYTIME >=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThan(Date value) {
            addCriterionForJDBCDate("REPLYTIME <", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REPLYTIME <=", value, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("REPLYTIME in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("REPLYTIME not in", values, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REPLYTIME between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andReplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REPLYTIME not between", value1, value2, "replytime");
            return (Criteria) this;
        }

        public Criteria andTodeptIsNull() {
            addCriterion("TODEPT is null");
            return (Criteria) this;
        }

        public Criteria andTodeptIsNotNull() {
            addCriterion("TODEPT is not null");
            return (Criteria) this;
        }

        public Criteria andTodeptEqualTo(String value) {
            addCriterion("TODEPT =", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptNotEqualTo(String value) {
            addCriterion("TODEPT <>", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptGreaterThan(String value) {
            addCriterion("TODEPT >", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptGreaterThanOrEqualTo(String value) {
            addCriterion("TODEPT >=", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptLessThan(String value) {
            addCriterion("TODEPT <", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptLessThanOrEqualTo(String value) {
            addCriterion("TODEPT <=", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptLike(String value) {
            addCriterion("TODEPT like", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptNotLike(String value) {
            addCriterion("TODEPT not like", value, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptIn(List<String> values) {
            addCriterion("TODEPT in", values, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptNotIn(List<String> values) {
            addCriterion("TODEPT not in", values, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptBetween(String value1, String value2) {
            addCriterion("TODEPT between", value1, value2, "todept");
            return (Criteria) this;
        }

        public Criteria andTodeptNotBetween(String value1, String value2) {
            addCriterion("TODEPT not between", value1, value2, "todept");
            return (Criteria) this;
        }

        public Criteria andToroleIsNull() {
            addCriterion("TOROLE is null");
            return (Criteria) this;
        }

        public Criteria andToroleIsNotNull() {
            addCriterion("TOROLE is not null");
            return (Criteria) this;
        }

        public Criteria andToroleEqualTo(String value) {
            addCriterion("TOROLE =", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleNotEqualTo(String value) {
            addCriterion("TOROLE <>", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleGreaterThan(String value) {
            addCriterion("TOROLE >", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleGreaterThanOrEqualTo(String value) {
            addCriterion("TOROLE >=", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleLessThan(String value) {
            addCriterion("TOROLE <", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleLessThanOrEqualTo(String value) {
            addCriterion("TOROLE <=", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleLike(String value) {
            addCriterion("TOROLE like", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleNotLike(String value) {
            addCriterion("TOROLE not like", value, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleIn(List<String> values) {
            addCriterion("TOROLE in", values, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleNotIn(List<String> values) {
            addCriterion("TOROLE not in", values, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleBetween(String value1, String value2) {
            addCriterion("TOROLE between", value1, value2, "torole");
            return (Criteria) this;
        }

        public Criteria andToroleNotBetween(String value1, String value2) {
            addCriterion("TOROLE not between", value1, value2, "torole");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andApproveextentIsNull() {
            addCriterion("APPROVEEXTENT is null");
            return (Criteria) this;
        }

        public Criteria andApproveextentIsNotNull() {
            addCriterion("APPROVEEXTENT is not null");
            return (Criteria) this;
        }

        public Criteria andApproveextentEqualTo(BigDecimal value) {
            addCriterion("APPROVEEXTENT =", value, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentNotEqualTo(BigDecimal value) {
            addCriterion("APPROVEEXTENT <>", value, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentGreaterThan(BigDecimal value) {
            addCriterion("APPROVEEXTENT >", value, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVEEXTENT >=", value, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentLessThan(BigDecimal value) {
            addCriterion("APPROVEEXTENT <", value, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVEEXTENT <=", value, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentIn(List<BigDecimal> values) {
            addCriterion("APPROVEEXTENT in", values, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentNotIn(List<BigDecimal> values) {
            addCriterion("APPROVEEXTENT not in", values, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVEEXTENT between", value1, value2, "approveextent");
            return (Criteria) this;
        }

        public Criteria andApproveextentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVEEXTENT not between", value1, value2, "approveextent");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andOperuseridIsNull() {
            addCriterion("OPERUSERID is null");
            return (Criteria) this;
        }

        public Criteria andOperuseridIsNotNull() {
            addCriterion("OPERUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andOperuseridEqualTo(String value) {
            addCriterion("OPERUSERID =", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridNotEqualTo(String value) {
            addCriterion("OPERUSERID <>", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridGreaterThan(String value) {
            addCriterion("OPERUSERID >", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridGreaterThanOrEqualTo(String value) {
            addCriterion("OPERUSERID >=", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridLessThan(String value) {
            addCriterion("OPERUSERID <", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridLessThanOrEqualTo(String value) {
            addCriterion("OPERUSERID <=", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridLike(String value) {
            addCriterion("OPERUSERID like", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridNotLike(String value) {
            addCriterion("OPERUSERID not like", value, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridIn(List<String> values) {
            addCriterion("OPERUSERID in", values, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridNotIn(List<String> values) {
            addCriterion("OPERUSERID not in", values, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridBetween(String value1, String value2) {
            addCriterion("OPERUSERID between", value1, value2, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperuseridNotBetween(String value1, String value2) {
            addCriterion("OPERUSERID not between", value1, value2, "operuserid");
            return (Criteria) this;
        }

        public Criteria andOperusernameIsNull() {
            addCriterion("OPERUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperusernameIsNotNull() {
            addCriterion("OPERUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperusernameEqualTo(String value) {
            addCriterion("OPERUSERNAME =", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotEqualTo(String value) {
            addCriterion("OPERUSERNAME <>", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameGreaterThan(String value) {
            addCriterion("OPERUSERNAME >", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERUSERNAME >=", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameLessThan(String value) {
            addCriterion("OPERUSERNAME <", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameLessThanOrEqualTo(String value) {
            addCriterion("OPERUSERNAME <=", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameLike(String value) {
            addCriterion("OPERUSERNAME like", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotLike(String value) {
            addCriterion("OPERUSERNAME not like", value, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameIn(List<String> values) {
            addCriterion("OPERUSERNAME in", values, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotIn(List<String> values) {
            addCriterion("OPERUSERNAME not in", values, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameBetween(String value1, String value2) {
            addCriterion("OPERUSERNAME between", value1, value2, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperusernameNotBetween(String value1, String value2) {
            addCriterion("OPERUSERNAME not between", value1, value2, "operusername");
            return (Criteria) this;
        }

        public Criteria andOperorgidIsNull() {
            addCriterion("OPERORGID is null");
            return (Criteria) this;
        }

        public Criteria andOperorgidIsNotNull() {
            addCriterion("OPERORGID is not null");
            return (Criteria) this;
        }

        public Criteria andOperorgidEqualTo(String value) {
            addCriterion("OPERORGID =", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidNotEqualTo(String value) {
            addCriterion("OPERORGID <>", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidGreaterThan(String value) {
            addCriterion("OPERORGID >", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidGreaterThanOrEqualTo(String value) {
            addCriterion("OPERORGID >=", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidLessThan(String value) {
            addCriterion("OPERORGID <", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidLessThanOrEqualTo(String value) {
            addCriterion("OPERORGID <=", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidLike(String value) {
            addCriterion("OPERORGID like", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidNotLike(String value) {
            addCriterion("OPERORGID not like", value, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidIn(List<String> values) {
            addCriterion("OPERORGID in", values, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidNotIn(List<String> values) {
            addCriterion("OPERORGID not in", values, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidBetween(String value1, String value2) {
            addCriterion("OPERORGID between", value1, value2, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgidNotBetween(String value1, String value2) {
            addCriterion("OPERORGID not between", value1, value2, "operorgid");
            return (Criteria) this;
        }

        public Criteria andOperorgnameIsNull() {
            addCriterion("OPERORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperorgnameIsNotNull() {
            addCriterion("OPERORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperorgnameEqualTo(String value) {
            addCriterion("OPERORGNAME =", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotEqualTo(String value) {
            addCriterion("OPERORGNAME <>", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameGreaterThan(String value) {
            addCriterion("OPERORGNAME >", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERORGNAME >=", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameLessThan(String value) {
            addCriterion("OPERORGNAME <", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameLessThanOrEqualTo(String value) {
            addCriterion("OPERORGNAME <=", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameLike(String value) {
            addCriterion("OPERORGNAME like", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotLike(String value) {
            addCriterion("OPERORGNAME not like", value, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameIn(List<String> values) {
            addCriterion("OPERORGNAME in", values, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotIn(List<String> values) {
            addCriterion("OPERORGNAME not in", values, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameBetween(String value1, String value2) {
            addCriterion("OPERORGNAME between", value1, value2, "operorgname");
            return (Criteria) this;
        }

        public Criteria andOperorgnameNotBetween(String value1, String value2) {
            addCriterion("OPERORGNAME not between", value1, value2, "operorgname");
            return (Criteria) this;
        }

        public Criteria andUppersheetidIsNull() {
            addCriterion("UPPERSHEETID is null");
            return (Criteria) this;
        }

        public Criteria andUppersheetidIsNotNull() {
            addCriterion("UPPERSHEETID is not null");
            return (Criteria) this;
        }

        public Criteria andUppersheetidEqualTo(String value) {
            addCriterion("UPPERSHEETID =", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidNotEqualTo(String value) {
            addCriterion("UPPERSHEETID <>", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidGreaterThan(String value) {
            addCriterion("UPPERSHEETID >", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidGreaterThanOrEqualTo(String value) {
            addCriterion("UPPERSHEETID >=", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidLessThan(String value) {
            addCriterion("UPPERSHEETID <", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidLessThanOrEqualTo(String value) {
            addCriterion("UPPERSHEETID <=", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidLike(String value) {
            addCriterion("UPPERSHEETID like", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidNotLike(String value) {
            addCriterion("UPPERSHEETID not like", value, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidIn(List<String> values) {
            addCriterion("UPPERSHEETID in", values, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidNotIn(List<String> values) {
            addCriterion("UPPERSHEETID not in", values, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidBetween(String value1, String value2) {
            addCriterion("UPPERSHEETID between", value1, value2, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andUppersheetidNotBetween(String value1, String value2) {
            addCriterion("UPPERSHEETID not between", value1, value2, "uppersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidIsNull() {
            addCriterion("LOWERSHEETID is null");
            return (Criteria) this;
        }

        public Criteria andLowersheetidIsNotNull() {
            addCriterion("LOWERSHEETID is not null");
            return (Criteria) this;
        }

        public Criteria andLowersheetidEqualTo(String value) {
            addCriterion("LOWERSHEETID =", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidNotEqualTo(String value) {
            addCriterion("LOWERSHEETID <>", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidGreaterThan(String value) {
            addCriterion("LOWERSHEETID >", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidGreaterThanOrEqualTo(String value) {
            addCriterion("LOWERSHEETID >=", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidLessThan(String value) {
            addCriterion("LOWERSHEETID <", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidLessThanOrEqualTo(String value) {
            addCriterion("LOWERSHEETID <=", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidLike(String value) {
            addCriterion("LOWERSHEETID like", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidNotLike(String value) {
            addCriterion("LOWERSHEETID not like", value, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidIn(List<String> values) {
            addCriterion("LOWERSHEETID in", values, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidNotIn(List<String> values) {
            addCriterion("LOWERSHEETID not in", values, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidBetween(String value1, String value2) {
            addCriterion("LOWERSHEETID between", value1, value2, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andLowersheetidNotBetween(String value1, String value2) {
            addCriterion("LOWERSHEETID not between", value1, value2, "lowersheetid");
            return (Criteria) this;
        }

        public Criteria andOperroleIsNull() {
            addCriterion("OPERROLE is null");
            return (Criteria) this;
        }

        public Criteria andOperroleIsNotNull() {
            addCriterion("OPERROLE is not null");
            return (Criteria) this;
        }

        public Criteria andOperroleEqualTo(String value) {
            addCriterion("OPERROLE =", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleNotEqualTo(String value) {
            addCriterion("OPERROLE <>", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleGreaterThan(String value) {
            addCriterion("OPERROLE >", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleGreaterThanOrEqualTo(String value) {
            addCriterion("OPERROLE >=", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleLessThan(String value) {
            addCriterion("OPERROLE <", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleLessThanOrEqualTo(String value) {
            addCriterion("OPERROLE <=", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleLike(String value) {
            addCriterion("OPERROLE like", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleNotLike(String value) {
            addCriterion("OPERROLE not like", value, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleIn(List<String> values) {
            addCriterion("OPERROLE in", values, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleNotIn(List<String> values) {
            addCriterion("OPERROLE not in", values, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleBetween(String value1, String value2) {
            addCriterion("OPERROLE between", value1, value2, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperroleNotBetween(String value1, String value2) {
            addCriterion("OPERROLE not between", value1, value2, "operrole");
            return (Criteria) this;
        }

        public Criteria andOperrolenameIsNull() {
            addCriterion("OPERROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andOperrolenameIsNotNull() {
            addCriterion("OPERROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperrolenameEqualTo(String value) {
            addCriterion("OPERROLENAME =", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameNotEqualTo(String value) {
            addCriterion("OPERROLENAME <>", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameGreaterThan(String value) {
            addCriterion("OPERROLENAME >", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERROLENAME >=", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameLessThan(String value) {
            addCriterion("OPERROLENAME <", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameLessThanOrEqualTo(String value) {
            addCriterion("OPERROLENAME <=", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameLike(String value) {
            addCriterion("OPERROLENAME like", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameNotLike(String value) {
            addCriterion("OPERROLENAME not like", value, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameIn(List<String> values) {
            addCriterion("OPERROLENAME in", values, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameNotIn(List<String> values) {
            addCriterion("OPERROLENAME not in", values, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameBetween(String value1, String value2) {
            addCriterion("OPERROLENAME between", value1, value2, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOperrolenameNotBetween(String value1, String value2) {
            addCriterion("OPERROLENAME not between", value1, value2, "operrolename");
            return (Criteria) this;
        }

        public Criteria andOldeomsidIsNull() {
            addCriterion("OLDEOMSID is null");
            return (Criteria) this;
        }

        public Criteria andOldeomsidIsNotNull() {
            addCriterion("OLDEOMSID is not null");
            return (Criteria) this;
        }

        public Criteria andOldeomsidEqualTo(String value) {
            addCriterion("OLDEOMSID =", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidNotEqualTo(String value) {
            addCriterion("OLDEOMSID <>", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidGreaterThan(String value) {
            addCriterion("OLDEOMSID >", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidGreaterThanOrEqualTo(String value) {
            addCriterion("OLDEOMSID >=", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidLessThan(String value) {
            addCriterion("OLDEOMSID <", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidLessThanOrEqualTo(String value) {
            addCriterion("OLDEOMSID <=", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidLike(String value) {
            addCriterion("OLDEOMSID like", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidNotLike(String value) {
            addCriterion("OLDEOMSID not like", value, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidIn(List<String> values) {
            addCriterion("OLDEOMSID in", values, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidNotIn(List<String> values) {
            addCriterion("OLDEOMSID not in", values, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidBetween(String value1, String value2) {
            addCriterion("OLDEOMSID between", value1, value2, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andOldeomsidNotBetween(String value1, String value2) {
            addCriterion("OLDEOMSID not between", value1, value2, "oldeomsid");
            return (Criteria) this;
        }

        public Criteria andIsmergerIsNull() {
            addCriterion("ISMERGER is null");
            return (Criteria) this;
        }

        public Criteria andIsmergerIsNotNull() {
            addCriterion("ISMERGER is not null");
            return (Criteria) this;
        }

        public Criteria andIsmergerEqualTo(Short value) {
            addCriterion("ISMERGER =", value, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerNotEqualTo(Short value) {
            addCriterion("ISMERGER <>", value, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerGreaterThan(Short value) {
            addCriterion("ISMERGER >", value, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerGreaterThanOrEqualTo(Short value) {
            addCriterion("ISMERGER >=", value, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerLessThan(Short value) {
            addCriterion("ISMERGER <", value, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerLessThanOrEqualTo(Short value) {
            addCriterion("ISMERGER <=", value, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerIn(List<Short> values) {
            addCriterion("ISMERGER in", values, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerNotIn(List<Short> values) {
            addCriterion("ISMERGER not in", values, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerBetween(Short value1, Short value2) {
            addCriterion("ISMERGER between", value1, value2, "ismerger");
            return (Criteria) this;
        }

        public Criteria andIsmergerNotBetween(Short value1, Short value2) {
            addCriterion("ISMERGER not between", value1, value2, "ismerger");
            return (Criteria) this;
        }

        public Criteria andMergeridIsNull() {
            addCriterion("MERGERID is null");
            return (Criteria) this;
        }

        public Criteria andMergeridIsNotNull() {
            addCriterion("MERGERID is not null");
            return (Criteria) this;
        }

        public Criteria andMergeridEqualTo(BigDecimal value) {
            addCriterion("MERGERID =", value, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridNotEqualTo(BigDecimal value) {
            addCriterion("MERGERID <>", value, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridGreaterThan(BigDecimal value) {
            addCriterion("MERGERID >", value, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MERGERID >=", value, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridLessThan(BigDecimal value) {
            addCriterion("MERGERID <", value, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MERGERID <=", value, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridIn(List<BigDecimal> values) {
            addCriterion("MERGERID in", values, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridNotIn(List<BigDecimal> values) {
            addCriterion("MERGERID not in", values, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERGERID between", value1, value2, "mergerid");
            return (Criteria) this;
        }

        public Criteria andMergeridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERGERID not between", value1, value2, "mergerid");
            return (Criteria) this;
        }

        public Criteria andReplyuserIsNull() {
            addCriterion("REPLYUSER is null");
            return (Criteria) this;
        }

        public Criteria andReplyuserIsNotNull() {
            addCriterion("REPLYUSER is not null");
            return (Criteria) this;
        }

        public Criteria andReplyuserEqualTo(String value) {
            addCriterion("REPLYUSER =", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserNotEqualTo(String value) {
            addCriterion("REPLYUSER <>", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserGreaterThan(String value) {
            addCriterion("REPLYUSER >", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYUSER >=", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserLessThan(String value) {
            addCriterion("REPLYUSER <", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserLessThanOrEqualTo(String value) {
            addCriterion("REPLYUSER <=", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserLike(String value) {
            addCriterion("REPLYUSER like", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserNotLike(String value) {
            addCriterion("REPLYUSER not like", value, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserIn(List<String> values) {
            addCriterion("REPLYUSER in", values, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserNotIn(List<String> values) {
            addCriterion("REPLYUSER not in", values, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserBetween(String value1, String value2) {
            addCriterion("REPLYUSER between", value1, value2, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyuserNotBetween(String value1, String value2) {
            addCriterion("REPLYUSER not between", value1, value2, "replyuser");
            return (Criteria) this;
        }

        public Criteria andReplyorgidIsNull() {
            addCriterion("REPLYORGID is null");
            return (Criteria) this;
        }

        public Criteria andReplyorgidIsNotNull() {
            addCriterion("REPLYORGID is not null");
            return (Criteria) this;
        }

        public Criteria andReplyorgidEqualTo(String value) {
            addCriterion("REPLYORGID =", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidNotEqualTo(String value) {
            addCriterion("REPLYORGID <>", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidGreaterThan(String value) {
            addCriterion("REPLYORGID >", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYORGID >=", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidLessThan(String value) {
            addCriterion("REPLYORGID <", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidLessThanOrEqualTo(String value) {
            addCriterion("REPLYORGID <=", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidLike(String value) {
            addCriterion("REPLYORGID like", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidNotLike(String value) {
            addCriterion("REPLYORGID not like", value, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidIn(List<String> values) {
            addCriterion("REPLYORGID in", values, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidNotIn(List<String> values) {
            addCriterion("REPLYORGID not in", values, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidBetween(String value1, String value2) {
            addCriterion("REPLYORGID between", value1, value2, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andReplyorgidNotBetween(String value1, String value2) {
            addCriterion("REPLYORGID not between", value1, value2, "replyorgid");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("UPDATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("UPDATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("UPDATEUSER =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("UPDATEUSER <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("UPDATEUSER >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("UPDATEUSER <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("UPDATEUSER like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("UPDATEUSER not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("UPDATEUSER in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("UPDATEUSER not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("UPDATEUSER between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSER not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateogridIsNull() {
            addCriterion("UPDATEOGRID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateogridIsNotNull() {
            addCriterion("UPDATEOGRID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateogridEqualTo(String value) {
            addCriterion("UPDATEOGRID =", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridNotEqualTo(String value) {
            addCriterion("UPDATEOGRID <>", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridGreaterThan(String value) {
            addCriterion("UPDATEOGRID >", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEOGRID >=", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridLessThan(String value) {
            addCriterion("UPDATEOGRID <", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridLessThanOrEqualTo(String value) {
            addCriterion("UPDATEOGRID <=", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridLike(String value) {
            addCriterion("UPDATEOGRID like", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridNotLike(String value) {
            addCriterion("UPDATEOGRID not like", value, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridIn(List<String> values) {
            addCriterion("UPDATEOGRID in", values, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridNotIn(List<String> values) {
            addCriterion("UPDATEOGRID not in", values, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridBetween(String value1, String value2) {
            addCriterion("UPDATEOGRID between", value1, value2, "updateogrid");
            return (Criteria) this;
        }

        public Criteria andUpdateogridNotBetween(String value1, String value2) {
            addCriterion("UPDATEOGRID not between", value1, value2, "updateogrid");
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