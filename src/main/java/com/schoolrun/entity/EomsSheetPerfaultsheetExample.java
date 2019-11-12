package com.schoolrun.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EomsSheetPerfaultsheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EomsSheetPerfaultsheetExample() {
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

        public Criteria andBasesheetidIsNull() {
            addCriterion("BASESHEETID is null");
            return (Criteria) this;
        }

        public Criteria andBasesheetidIsNotNull() {
            addCriterion("BASESHEETID is not null");
            return (Criteria) this;
        }

        public Criteria andBasesheetidEqualTo(String value) {
            addCriterion("BASESHEETID =", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidNotEqualTo(String value) {
            addCriterion("BASESHEETID <>", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidGreaterThan(String value) {
            addCriterion("BASESHEETID >", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidGreaterThanOrEqualTo(String value) {
            addCriterion("BASESHEETID >=", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidLessThan(String value) {
            addCriterion("BASESHEETID <", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidLessThanOrEqualTo(String value) {
            addCriterion("BASESHEETID <=", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidLike(String value) {
            addCriterion("BASESHEETID like", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidNotLike(String value) {
            addCriterion("BASESHEETID not like", value, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidIn(List<String> values) {
            addCriterion("BASESHEETID in", values, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidNotIn(List<String> values) {
            addCriterion("BASESHEETID not in", values, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidBetween(String value1, String value2) {
            addCriterion("BASESHEETID between", value1, value2, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andBasesheetidNotBetween(String value1, String value2) {
            addCriterion("BASESHEETID not between", value1, value2, "basesheetid");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitIsNull() {
            addCriterion("AFFIRMTIMELIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitIsNotNull() {
            addCriterion("AFFIRMTIMELIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitEqualTo(Date value) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT =", value, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT <>", value, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitGreaterThan(Date value) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT >", value, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT >=", value, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitLessThan(Date value) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT <", value, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT <=", value, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitIn(List<Date> values) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT in", values, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT not in", values, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT between", value1, value2, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAffirmtimelimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AFFIRMTIMELIMIT not between", value1, value2, "affirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeIsNull() {
            addCriterion("ALLOCATIONCLAIMOVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeIsNotNull() {
            addCriterion("ALLOCATIONCLAIMOVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME =", value, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME <>", value, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME >", value, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME >=", value, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeLessThan(Date value) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME <", value, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME <=", value, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeIn(List<Date> values) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME in", values, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME not in", values, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME between", value1, value2, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationclaimovertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALLOCATIONCLAIMOVERTIME not between", value1, value2, "allocationclaimovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeIsNull() {
            addCriterion("ALLOCATIONOVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeIsNotNull() {
            addCriterion("ALLOCATIONOVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME =", value, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME <>", value, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME >", value, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME >=", value, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeLessThan(Date value) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME <", value, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME <=", value, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeIn(List<Date> values) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME in", values, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME not in", values, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME between", value1, value2, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andAllocationovertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALLOCATIONOVERTIME not between", value1, value2, "allocationovertime");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagIsNull() {
            addCriterion("BIGFAULTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagIsNotNull() {
            addCriterion("BIGFAULTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagEqualTo(BigDecimal value) {
            addCriterion("BIGFAULTFLAG =", value, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagNotEqualTo(BigDecimal value) {
            addCriterion("BIGFAULTFLAG <>", value, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagGreaterThan(BigDecimal value) {
            addCriterion("BIGFAULTFLAG >", value, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIGFAULTFLAG >=", value, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagLessThan(BigDecimal value) {
            addCriterion("BIGFAULTFLAG <", value, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIGFAULTFLAG <=", value, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagIn(List<BigDecimal> values) {
            addCriterion("BIGFAULTFLAG in", values, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagNotIn(List<BigDecimal> values) {
            addCriterion("BIGFAULTFLAG not in", values, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIGFAULTFLAG between", value1, value2, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andBigfaultflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIGFAULTFLAG not between", value1, value2, "bigfaultflag");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(BigDecimal value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(BigDecimal value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(BigDecimal value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(BigDecimal value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<BigDecimal> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<BigDecimal> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andFaultcityIsNull() {
            addCriterion("FAULTCITY is null");
            return (Criteria) this;
        }

        public Criteria andFaultcityIsNotNull() {
            addCriterion("FAULTCITY is not null");
            return (Criteria) this;
        }

        public Criteria andFaultcityEqualTo(String value) {
            addCriterion("FAULTCITY =", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityNotEqualTo(String value) {
            addCriterion("FAULTCITY <>", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityGreaterThan(String value) {
            addCriterion("FAULTCITY >", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTCITY >=", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityLessThan(String value) {
            addCriterion("FAULTCITY <", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityLessThanOrEqualTo(String value) {
            addCriterion("FAULTCITY <=", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityLike(String value) {
            addCriterion("FAULTCITY like", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityNotLike(String value) {
            addCriterion("FAULTCITY not like", value, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityIn(List<String> values) {
            addCriterion("FAULTCITY in", values, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityNotIn(List<String> values) {
            addCriterion("FAULTCITY not in", values, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityBetween(String value1, String value2) {
            addCriterion("FAULTCITY between", value1, value2, "faultcity");
            return (Criteria) this;
        }

        public Criteria andFaultcityNotBetween(String value1, String value2) {
            addCriterion("FAULTCITY not between", value1, value2, "faultcity");
            return (Criteria) this;
        }

        public Criteria andExigenceIsNull() {
            addCriterion("EXIGENCE is null");
            return (Criteria) this;
        }

        public Criteria andExigenceIsNotNull() {
            addCriterion("EXIGENCE is not null");
            return (Criteria) this;
        }

        public Criteria andExigenceEqualTo(String value) {
            addCriterion("EXIGENCE =", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceNotEqualTo(String value) {
            addCriterion("EXIGENCE <>", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceGreaterThan(String value) {
            addCriterion("EXIGENCE >", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceGreaterThanOrEqualTo(String value) {
            addCriterion("EXIGENCE >=", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceLessThan(String value) {
            addCriterion("EXIGENCE <", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceLessThanOrEqualTo(String value) {
            addCriterion("EXIGENCE <=", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceLike(String value) {
            addCriterion("EXIGENCE like", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceNotLike(String value) {
            addCriterion("EXIGENCE not like", value, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceIn(List<String> values) {
            addCriterion("EXIGENCE in", values, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceNotIn(List<String> values) {
            addCriterion("EXIGENCE not in", values, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceBetween(String value1, String value2) {
            addCriterion("EXIGENCE between", value1, value2, "exigence");
            return (Criteria) this;
        }

        public Criteria andExigenceNotBetween(String value1, String value2) {
            addCriterion("EXIGENCE not between", value1, value2, "exigence");
            return (Criteria) this;
        }

        public Criteria andNetnameIsNull() {
            addCriterion("NETNAME is null");
            return (Criteria) this;
        }

        public Criteria andNetnameIsNotNull() {
            addCriterion("NETNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNetnameEqualTo(String value) {
            addCriterion("NETNAME =", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameNotEqualTo(String value) {
            addCriterion("NETNAME <>", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameGreaterThan(String value) {
            addCriterion("NETNAME >", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameGreaterThanOrEqualTo(String value) {
            addCriterion("NETNAME >=", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameLessThan(String value) {
            addCriterion("NETNAME <", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameLessThanOrEqualTo(String value) {
            addCriterion("NETNAME <=", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameLike(String value) {
            addCriterion("NETNAME like", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameNotLike(String value) {
            addCriterion("NETNAME not like", value, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameIn(List<String> values) {
            addCriterion("NETNAME in", values, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameNotIn(List<String> values) {
            addCriterion("NETNAME not in", values, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameBetween(String value1, String value2) {
            addCriterion("NETNAME between", value1, value2, "netname");
            return (Criteria) this;
        }

        public Criteria andNetnameNotBetween(String value1, String value2) {
            addCriterion("NETNAME not between", value1, value2, "netname");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceIsNull() {
            addCriterion("FAULTPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceIsNotNull() {
            addCriterion("FAULTPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceEqualTo(String value) {
            addCriterion("FAULTPROVINCE =", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceNotEqualTo(String value) {
            addCriterion("FAULTPROVINCE <>", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceGreaterThan(String value) {
            addCriterion("FAULTPROVINCE >", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTPROVINCE >=", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceLessThan(String value) {
            addCriterion("FAULTPROVINCE <", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceLessThanOrEqualTo(String value) {
            addCriterion("FAULTPROVINCE <=", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceLike(String value) {
            addCriterion("FAULTPROVINCE like", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceNotLike(String value) {
            addCriterion("FAULTPROVINCE not like", value, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceIn(List<String> values) {
            addCriterion("FAULTPROVINCE in", values, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceNotIn(List<String> values) {
            addCriterion("FAULTPROVINCE not in", values, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceBetween(String value1, String value2) {
            addCriterion("FAULTPROVINCE between", value1, value2, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultprovinceNotBetween(String value1, String value2) {
            addCriterion("FAULTPROVINCE not between", value1, value2, "faultprovince");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeIsNull() {
            addCriterion("FAULTRESUMETIME is null");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeIsNotNull() {
            addCriterion("FAULTRESUMETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTRESUMETIME =", value, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTRESUMETIME <>", value, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("FAULTRESUMETIME >", value, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTRESUMETIME >=", value, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeLessThan(Date value) {
            addCriterionForJDBCDate("FAULTRESUMETIME <", value, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTRESUMETIME <=", value, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeIn(List<Date> values) {
            addCriterionForJDBCDate("FAULTRESUMETIME in", values, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("FAULTRESUMETIME not in", values, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FAULTRESUMETIME between", value1, value2, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultresumetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FAULTRESUMETIME not between", value1, value2, "faultresumetime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeIsNull() {
            addCriterion("FAULTSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeIsNotNull() {
            addCriterion("FAULTSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTSTARTTIME =", value, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTSTARTTIME <>", value, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("FAULTSTARTTIME >", value, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTSTARTTIME >=", value, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeLessThan(Date value) {
            addCriterionForJDBCDate("FAULTSTARTTIME <", value, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTSTARTTIME <=", value, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("FAULTSTARTTIME in", values, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("FAULTSTARTTIME not in", values, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FAULTSTARTTIME between", value1, value2, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andFaultstarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FAULTSTARTTIME not between", value1, value2, "faultstarttime");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagIsNull() {
            addCriterion("NETMODIFYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagIsNotNull() {
            addCriterion("NETMODIFYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagEqualTo(BigDecimal value) {
            addCriterion("NETMODIFYFLAG =", value, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagNotEqualTo(BigDecimal value) {
            addCriterion("NETMODIFYFLAG <>", value, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagGreaterThan(BigDecimal value) {
            addCriterion("NETMODIFYFLAG >", value, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NETMODIFYFLAG >=", value, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagLessThan(BigDecimal value) {
            addCriterion("NETMODIFYFLAG <", value, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NETMODIFYFLAG <=", value, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagIn(List<BigDecimal> values) {
            addCriterion("NETMODIFYFLAG in", values, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagNotIn(List<BigDecimal> values) {
            addCriterion("NETMODIFYFLAG not in", values, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NETMODIFYFLAG between", value1, value2, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetmodifyflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NETMODIFYFLAG not between", value1, value2, "netmodifyflag");
            return (Criteria) this;
        }

        public Criteria andNetworktypeIsNull() {
            addCriterion("NETWORKTYPE is null");
            return (Criteria) this;
        }

        public Criteria andNetworktypeIsNotNull() {
            addCriterion("NETWORKTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNetworktypeEqualTo(String value) {
            addCriterion("NETWORKTYPE =", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotEqualTo(String value) {
            addCriterion("NETWORKTYPE <>", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeGreaterThan(String value) {
            addCriterion("NETWORKTYPE >", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORKTYPE >=", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeLessThan(String value) {
            addCriterion("NETWORKTYPE <", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeLessThanOrEqualTo(String value) {
            addCriterion("NETWORKTYPE <=", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeLike(String value) {
            addCriterion("NETWORKTYPE like", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotLike(String value) {
            addCriterion("NETWORKTYPE not like", value, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeIn(List<String> values) {
            addCriterion("NETWORKTYPE in", values, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotIn(List<String> values) {
            addCriterion("NETWORKTYPE not in", values, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeBetween(String value1, String value2) {
            addCriterion("NETWORKTYPE between", value1, value2, "networktype");
            return (Criteria) this;
        }

        public Criteria andNetworktypeNotBetween(String value1, String value2) {
            addCriterion("NETWORKTYPE not between", value1, value2, "networktype");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeIsNull() {
            addCriterion("OPERATIONRESUMETIME is null");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeIsNotNull() {
            addCriterion("OPERATIONRESUMETIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME =", value, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME <>", value, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME >", value, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME >=", value, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeLessThan(Date value) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME <", value, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME <=", value, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME in", values, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME not in", values, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME between", value1, value2, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andOperationresumetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATIONRESUMETIME not between", value1, value2, "operationresumetime");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNull() {
            addCriterion("SOURCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("SOURCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(BigDecimal value) {
            addCriterion("SOURCETYPE =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(BigDecimal value) {
            addCriterion("SOURCETYPE <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(BigDecimal value) {
            addCriterion("SOURCETYPE >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCETYPE >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(BigDecimal value) {
            addCriterion("SOURCETYPE <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOURCETYPE <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<BigDecimal> values) {
            addCriterion("SOURCETYPE in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<BigDecimal> values) {
            addCriterion("SOURCETYPE not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCETYPE between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOURCETYPE not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andT1overtimeIsNull() {
            addCriterion("T1OVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andT1overtimeIsNotNull() {
            addCriterion("T1OVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andT1overtimeEqualTo(Date value) {
            addCriterionForJDBCDate("T1OVERTIME =", value, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T1OVERTIME <>", value, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T1OVERTIME >", value, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1OVERTIME >=", value, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeLessThan(Date value) {
            addCriterionForJDBCDate("T1OVERTIME <", value, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1OVERTIME <=", value, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeIn(List<Date> values) {
            addCriterionForJDBCDate("T1OVERTIME in", values, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T1OVERTIME not in", values, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1OVERTIME between", value1, value2, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT1overtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1OVERTIME not between", value1, value2, "t1overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeIsNull() {
            addCriterion("T2OVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andT2overtimeIsNotNull() {
            addCriterion("T2OVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andT2overtimeEqualTo(Date value) {
            addCriterionForJDBCDate("T2OVERTIME =", value, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T2OVERTIME <>", value, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T2OVERTIME >", value, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2OVERTIME >=", value, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeLessThan(Date value) {
            addCriterionForJDBCDate("T2OVERTIME <", value, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2OVERTIME <=", value, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeIn(List<Date> values) {
            addCriterionForJDBCDate("T2OVERTIME in", values, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T2OVERTIME not in", values, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2OVERTIME between", value1, value2, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT2overtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2OVERTIME not between", value1, value2, "t2overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeIsNull() {
            addCriterion("T3OVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andT3overtimeIsNotNull() {
            addCriterion("T3OVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andT3overtimeEqualTo(Date value) {
            addCriterionForJDBCDate("T3OVERTIME =", value, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T3OVERTIME <>", value, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T3OVERTIME >", value, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T3OVERTIME >=", value, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeLessThan(Date value) {
            addCriterionForJDBCDate("T3OVERTIME <", value, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T3OVERTIME <=", value, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeIn(List<Date> values) {
            addCriterionForJDBCDate("T3OVERTIME in", values, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T3OVERTIME not in", values, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T3OVERTIME between", value1, value2, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andT3overtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T3OVERTIME not between", value1, value2, "t3overtime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeIsNull() {
            addCriterion("DISPOSALCOMPLETETIME is null");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeIsNotNull() {
            addCriterion("DISPOSALCOMPLETETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeEqualTo(Date value) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME =", value, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME <>", value, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME >", value, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME >=", value, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeLessThan(Date value) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME <", value, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME <=", value, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeIn(List<Date> values) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME in", values, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME not in", values, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME between", value1, value2, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposalcompletetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DISPOSALCOMPLETETIME not between", value1, value2, "disposalcompletetime");
            return (Criteria) this;
        }

        public Criteria andDisposallevelIsNull() {
            addCriterion("DISPOSALLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDisposallevelIsNotNull() {
            addCriterion("DISPOSALLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDisposallevelEqualTo(String value) {
            addCriterion("DISPOSALLEVEL =", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelNotEqualTo(String value) {
            addCriterion("DISPOSALLEVEL <>", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelGreaterThan(String value) {
            addCriterion("DISPOSALLEVEL >", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelGreaterThanOrEqualTo(String value) {
            addCriterion("DISPOSALLEVEL >=", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelLessThan(String value) {
            addCriterion("DISPOSALLEVEL <", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelLessThanOrEqualTo(String value) {
            addCriterion("DISPOSALLEVEL <=", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelLike(String value) {
            addCriterion("DISPOSALLEVEL like", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelNotLike(String value) {
            addCriterion("DISPOSALLEVEL not like", value, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelIn(List<String> values) {
            addCriterion("DISPOSALLEVEL in", values, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelNotIn(List<String> values) {
            addCriterion("DISPOSALLEVEL not in", values, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelBetween(String value1, String value2) {
            addCriterion("DISPOSALLEVEL between", value1, value2, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andDisposallevelNotBetween(String value1, String value2) {
            addCriterion("DISPOSALLEVEL not between", value1, value2, "disposallevel");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultIsNull() {
            addCriterion("FAULTDISPOSALRESULT is null");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultIsNotNull() {
            addCriterion("FAULTDISPOSALRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultEqualTo(String value) {
            addCriterion("FAULTDISPOSALRESULT =", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultNotEqualTo(String value) {
            addCriterion("FAULTDISPOSALRESULT <>", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultGreaterThan(String value) {
            addCriterion("FAULTDISPOSALRESULT >", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTDISPOSALRESULT >=", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultLessThan(String value) {
            addCriterion("FAULTDISPOSALRESULT <", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultLessThanOrEqualTo(String value) {
            addCriterion("FAULTDISPOSALRESULT <=", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultLike(String value) {
            addCriterion("FAULTDISPOSALRESULT like", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultNotLike(String value) {
            addCriterion("FAULTDISPOSALRESULT not like", value, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultIn(List<String> values) {
            addCriterion("FAULTDISPOSALRESULT in", values, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultNotIn(List<String> values) {
            addCriterion("FAULTDISPOSALRESULT not in", values, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultBetween(String value1, String value2) {
            addCriterion("FAULTDISPOSALRESULT between", value1, value2, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andFaultdisposalresultNotBetween(String value1, String value2) {
            addCriterion("FAULTDISPOSALRESULT not between", value1, value2, "faultdisposalresult");
            return (Criteria) this;
        }

        public Criteria andReturnflagIsNull() {
            addCriterion("RETURNFLAG is null");
            return (Criteria) this;
        }

        public Criteria andReturnflagIsNotNull() {
            addCriterion("RETURNFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReturnflagEqualTo(BigDecimal value) {
            addCriterion("RETURNFLAG =", value, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagNotEqualTo(BigDecimal value) {
            addCriterion("RETURNFLAG <>", value, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagGreaterThan(BigDecimal value) {
            addCriterion("RETURNFLAG >", value, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNFLAG >=", value, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagLessThan(BigDecimal value) {
            addCriterion("RETURNFLAG <", value, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNFLAG <=", value, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagIn(List<BigDecimal> values) {
            addCriterion("RETURNFLAG in", values, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagNotIn(List<BigDecimal> values) {
            addCriterion("RETURNFLAG not in", values, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNFLAG between", value1, value2, "returnflag");
            return (Criteria) this;
        }

        public Criteria andReturnflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNFLAG not between", value1, value2, "returnflag");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeIsNull() {
            addCriterion("EQUIPMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeIsNotNull() {
            addCriterion("EQUIPMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeEqualTo(String value) {
            addCriterion("EQUIPMENTTYPE =", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeNotEqualTo(String value) {
            addCriterion("EQUIPMENTTYPE <>", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeGreaterThan(String value) {
            addCriterion("EQUIPMENTTYPE >", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTTYPE >=", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeLessThan(String value) {
            addCriterion("EQUIPMENTTYPE <", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENTTYPE <=", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeLike(String value) {
            addCriterion("EQUIPMENTTYPE like", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeNotLike(String value) {
            addCriterion("EQUIPMENTTYPE not like", value, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeIn(List<String> values) {
            addCriterion("EQUIPMENTTYPE in", values, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeNotIn(List<String> values) {
            addCriterion("EQUIPMENTTYPE not in", values, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeBetween(String value1, String value2) {
            addCriterion("EQUIPMENTTYPE between", value1, value2, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andEquipmenttypeNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENTTYPE not between", value1, value2, "equipmenttype");
            return (Criteria) this;
        }

        public Criteria andFaultreasonIsNull() {
            addCriterion("FAULTREASON is null");
            return (Criteria) this;
        }

        public Criteria andFaultreasonIsNotNull() {
            addCriterion("FAULTREASON is not null");
            return (Criteria) this;
        }

        public Criteria andFaultreasonEqualTo(String value) {
            addCriterion("FAULTREASON =", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonNotEqualTo(String value) {
            addCriterion("FAULTREASON <>", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonGreaterThan(String value) {
            addCriterion("FAULTREASON >", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTREASON >=", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonLessThan(String value) {
            addCriterion("FAULTREASON <", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonLessThanOrEqualTo(String value) {
            addCriterion("FAULTREASON <=", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonLike(String value) {
            addCriterion("FAULTREASON like", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonNotLike(String value) {
            addCriterion("FAULTREASON not like", value, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonIn(List<String> values) {
            addCriterion("FAULTREASON in", values, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonNotIn(List<String> values) {
            addCriterion("FAULTREASON not in", values, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonBetween(String value1, String value2) {
            addCriterion("FAULTREASON between", value1, value2, "faultreason");
            return (Criteria) this;
        }

        public Criteria andFaultreasonNotBetween(String value1, String value2) {
            addCriterion("FAULTREASON not between", value1, value2, "faultreason");
            return (Criteria) this;
        }

        public Criteria andCleartimeIsNull() {
            addCriterion("CLEARTIME is null");
            return (Criteria) this;
        }

        public Criteria andCleartimeIsNotNull() {
            addCriterion("CLEARTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCleartimeEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME =", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME <>", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CLEARTIME >", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME >=", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeLessThan(Date value) {
            addCriterionForJDBCDate("CLEARTIME <", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARTIME <=", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARTIME in", values, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARTIME not in", values, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARTIME between", value1, value2, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARTIME not between", value1, value2, "cleartime");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusIsNull() {
            addCriterion("ALARMSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusIsNotNull() {
            addCriterion("ALARMSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusEqualTo(String value) {
            addCriterion("ALARMSTATUS =", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusNotEqualTo(String value) {
            addCriterion("ALARMSTATUS <>", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusGreaterThan(String value) {
            addCriterion("ALARMSTATUS >", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMSTATUS >=", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusLessThan(String value) {
            addCriterion("ALARMSTATUS <", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusLessThanOrEqualTo(String value) {
            addCriterion("ALARMSTATUS <=", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusLike(String value) {
            addCriterion("ALARMSTATUS like", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusNotLike(String value) {
            addCriterion("ALARMSTATUS not like", value, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusIn(List<String> values) {
            addCriterion("ALARMSTATUS in", values, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusNotIn(List<String> values) {
            addCriterion("ALARMSTATUS not in", values, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusBetween(String value1, String value2) {
            addCriterion("ALARMSTATUS between", value1, value2, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andAlarmstatusNotBetween(String value1, String value2) {
            addCriterion("ALARMSTATUS not between", value1, value2, "alarmstatus");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNull() {
            addCriterion("CREATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNotNull() {
            addCriterion("CREATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeEqualTo(String value) {
            addCriterion("CREATETYPE =", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotEqualTo(String value) {
            addCriterion("CREATETYPE <>", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThan(String value) {
            addCriterion("CREATETYPE >", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETYPE >=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThan(String value) {
            addCriterion("CREATETYPE <", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThanOrEqualTo(String value) {
            addCriterion("CREATETYPE <=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLike(String value) {
            addCriterion("CREATETYPE like", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotLike(String value) {
            addCriterion("CREATETYPE not like", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIn(List<String> values) {
            addCriterion("CREATETYPE in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotIn(List<String> values) {
            addCriterion("CREATETYPE not in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeBetween(String value1, String value2) {
            addCriterion("CREATETYPE between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotBetween(String value1, String value2) {
            addCriterion("CREATETYPE not between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeIsNull() {
            addCriterion("ISKNOWLEDGE is null");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeIsNotNull() {
            addCriterion("ISKNOWLEDGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeEqualTo(BigDecimal value) {
            addCriterion("ISKNOWLEDGE =", value, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeNotEqualTo(BigDecimal value) {
            addCriterion("ISKNOWLEDGE <>", value, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeGreaterThan(BigDecimal value) {
            addCriterion("ISKNOWLEDGE >", value, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISKNOWLEDGE >=", value, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeLessThan(BigDecimal value) {
            addCriterion("ISKNOWLEDGE <", value, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISKNOWLEDGE <=", value, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeIn(List<BigDecimal> values) {
            addCriterion("ISKNOWLEDGE in", values, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeNotIn(List<BigDecimal> values) {
            addCriterion("ISKNOWLEDGE not in", values, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISKNOWLEDGE between", value1, value2, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andIsknowledgeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISKNOWLEDGE not between", value1, value2, "isknowledge");
            return (Criteria) this;
        }

        public Criteria andSercallerIsNull() {
            addCriterion("SERCALLER is null");
            return (Criteria) this;
        }

        public Criteria andSercallerIsNotNull() {
            addCriterion("SERCALLER is not null");
            return (Criteria) this;
        }

        public Criteria andSercallerEqualTo(String value) {
            addCriterion("SERCALLER =", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerNotEqualTo(String value) {
            addCriterion("SERCALLER <>", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerGreaterThan(String value) {
            addCriterion("SERCALLER >", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerGreaterThanOrEqualTo(String value) {
            addCriterion("SERCALLER >=", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerLessThan(String value) {
            addCriterion("SERCALLER <", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerLessThanOrEqualTo(String value) {
            addCriterion("SERCALLER <=", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerLike(String value) {
            addCriterion("SERCALLER like", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerNotLike(String value) {
            addCriterion("SERCALLER not like", value, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerIn(List<String> values) {
            addCriterion("SERCALLER in", values, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerNotIn(List<String> values) {
            addCriterion("SERCALLER not in", values, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerBetween(String value1, String value2) {
            addCriterion("SERCALLER between", value1, value2, "sercaller");
            return (Criteria) this;
        }

        public Criteria andSercallerNotBetween(String value1, String value2) {
            addCriterion("SERCALLER not between", value1, value2, "sercaller");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureIsNull() {
            addCriterion("DISPOSALMEASURE is null");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureIsNotNull() {
            addCriterion("DISPOSALMEASURE is not null");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureEqualTo(String value) {
            addCriterion("DISPOSALMEASURE =", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureNotEqualTo(String value) {
            addCriterion("DISPOSALMEASURE <>", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureGreaterThan(String value) {
            addCriterion("DISPOSALMEASURE >", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureGreaterThanOrEqualTo(String value) {
            addCriterion("DISPOSALMEASURE >=", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureLessThan(String value) {
            addCriterion("DISPOSALMEASURE <", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureLessThanOrEqualTo(String value) {
            addCriterion("DISPOSALMEASURE <=", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureLike(String value) {
            addCriterion("DISPOSALMEASURE like", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureNotLike(String value) {
            addCriterion("DISPOSALMEASURE not like", value, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureIn(List<String> values) {
            addCriterion("DISPOSALMEASURE in", values, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureNotIn(List<String> values) {
            addCriterion("DISPOSALMEASURE not in", values, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureBetween(String value1, String value2) {
            addCriterion("DISPOSALMEASURE between", value1, value2, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andDisposalmeasureNotBetween(String value1, String value2) {
            addCriterion("DISPOSALMEASURE not between", value1, value2, "disposalmeasure");
            return (Criteria) this;
        }

        public Criteria andAlarmdesIsNull() {
            addCriterion("ALARMDES is null");
            return (Criteria) this;
        }

        public Criteria andAlarmdesIsNotNull() {
            addCriterion("ALARMDES is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmdesEqualTo(String value) {
            addCriterion("ALARMDES =", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesNotEqualTo(String value) {
            addCriterion("ALARMDES <>", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesGreaterThan(String value) {
            addCriterion("ALARMDES >", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMDES >=", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesLessThan(String value) {
            addCriterion("ALARMDES <", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesLessThanOrEqualTo(String value) {
            addCriterion("ALARMDES <=", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesLike(String value) {
            addCriterion("ALARMDES like", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesNotLike(String value) {
            addCriterion("ALARMDES not like", value, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesIn(List<String> values) {
            addCriterion("ALARMDES in", values, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesNotIn(List<String> values) {
            addCriterion("ALARMDES not in", values, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesBetween(String value1, String value2) {
            addCriterion("ALARMDES between", value1, value2, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andAlarmdesNotBetween(String value1, String value2) {
            addCriterion("ALARMDES not between", value1, value2, "alarmdes");
            return (Criteria) this;
        }

        public Criteria andPostponeflagIsNull() {
            addCriterion("POSTPONEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPostponeflagIsNotNull() {
            addCriterion("POSTPONEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPostponeflagEqualTo(BigDecimal value) {
            addCriterion("POSTPONEFLAG =", value, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagNotEqualTo(BigDecimal value) {
            addCriterion("POSTPONEFLAG <>", value, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagGreaterThan(BigDecimal value) {
            addCriterion("POSTPONEFLAG >", value, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSTPONEFLAG >=", value, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagLessThan(BigDecimal value) {
            addCriterion("POSTPONEFLAG <", value, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSTPONEFLAG <=", value, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagIn(List<BigDecimal> values) {
            addCriterion("POSTPONEFLAG in", values, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagNotIn(List<BigDecimal> values) {
            addCriterion("POSTPONEFLAG not in", values, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSTPONEFLAG between", value1, value2, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPostponeflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSTPONEFLAG not between", value1, value2, "postponeflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagIsNull() {
            addCriterion("PRETREATMENTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagIsNotNull() {
            addCriterion("PRETREATMENTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagEqualTo(BigDecimal value) {
            addCriterion("PRETREATMENTFLAG =", value, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagNotEqualTo(BigDecimal value) {
            addCriterion("PRETREATMENTFLAG <>", value, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagGreaterThan(BigDecimal value) {
            addCriterion("PRETREATMENTFLAG >", value, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRETREATMENTFLAG >=", value, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagLessThan(BigDecimal value) {
            addCriterion("PRETREATMENTFLAG <", value, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRETREATMENTFLAG <=", value, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagIn(List<BigDecimal> values) {
            addCriterion("PRETREATMENTFLAG in", values, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagNotIn(List<BigDecimal> values) {
            addCriterion("PRETREATMENTFLAG not in", values, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRETREATMENTFLAG between", value1, value2, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andPretreatmentflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRETREATMENTFLAG not between", value1, value2, "pretreatmentflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagIsNull() {
            addCriterion("AFFOPERATIONFLAG is null");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagIsNotNull() {
            addCriterion("AFFOPERATIONFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagEqualTo(BigDecimal value) {
            addCriterion("AFFOPERATIONFLAG =", value, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagNotEqualTo(BigDecimal value) {
            addCriterion("AFFOPERATIONFLAG <>", value, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagGreaterThan(BigDecimal value) {
            addCriterion("AFFOPERATIONFLAG >", value, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AFFOPERATIONFLAG >=", value, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagLessThan(BigDecimal value) {
            addCriterion("AFFOPERATIONFLAG <", value, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AFFOPERATIONFLAG <=", value, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagIn(List<BigDecimal> values) {
            addCriterion("AFFOPERATIONFLAG in", values, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagNotIn(List<BigDecimal> values) {
            addCriterion("AFFOPERATIONFLAG not in", values, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFFOPERATIONFLAG between", value1, value2, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAffoperationflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFFOPERATIONFLAG not between", value1, value2, "affoperationflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagIsNull() {
            addCriterion("AUTOTRANSFERFLAG is null");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagIsNotNull() {
            addCriterion("AUTOTRANSFERFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagEqualTo(BigDecimal value) {
            addCriterion("AUTOTRANSFERFLAG =", value, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagNotEqualTo(BigDecimal value) {
            addCriterion("AUTOTRANSFERFLAG <>", value, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagGreaterThan(BigDecimal value) {
            addCriterion("AUTOTRANSFERFLAG >", value, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOTRANSFERFLAG >=", value, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagLessThan(BigDecimal value) {
            addCriterion("AUTOTRANSFERFLAG <", value, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOTRANSFERFLAG <=", value, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagIn(List<BigDecimal> values) {
            addCriterion("AUTOTRANSFERFLAG in", values, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagNotIn(List<BigDecimal> values) {
            addCriterion("AUTOTRANSFERFLAG not in", values, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOTRANSFERFLAG between", value1, value2, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andAutotransferflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOTRANSFERFLAG not between", value1, value2, "autotransferflag");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeIsNull() {
            addCriterion("FAULTFINDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeIsNotNull() {
            addCriterion("FAULTFINDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeEqualTo(String value) {
            addCriterion("FAULTFINDTYPE =", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeNotEqualTo(String value) {
            addCriterion("FAULTFINDTYPE <>", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeGreaterThan(String value) {
            addCriterion("FAULTFINDTYPE >", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTFINDTYPE >=", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeLessThan(String value) {
            addCriterion("FAULTFINDTYPE <", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeLessThanOrEqualTo(String value) {
            addCriterion("FAULTFINDTYPE <=", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeLike(String value) {
            addCriterion("FAULTFINDTYPE like", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeNotLike(String value) {
            addCriterion("FAULTFINDTYPE not like", value, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeIn(List<String> values) {
            addCriterion("FAULTFINDTYPE in", values, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeNotIn(List<String> values) {
            addCriterion("FAULTFINDTYPE not in", values, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeBetween(String value1, String value2) {
            addCriterion("FAULTFINDTYPE between", value1, value2, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andFaultfindtypeNotBetween(String value1, String value2) {
            addCriterion("FAULTFINDTYPE not between", value1, value2, "faultfindtype");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultIsNull() {
            addCriterion("T1RUDIMENTDISPOSERESULT is null");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultIsNotNull() {
            addCriterion("T1RUDIMENTDISPOSERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultEqualTo(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT =", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultNotEqualTo(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT <>", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultGreaterThan(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT >", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultGreaterThanOrEqualTo(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT >=", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultLessThan(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT <", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultLessThanOrEqualTo(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT <=", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultLike(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT like", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultNotLike(String value) {
            addCriterion("T1RUDIMENTDISPOSERESULT not like", value, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultIn(List<String> values) {
            addCriterion("T1RUDIMENTDISPOSERESULT in", values, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultNotIn(List<String> values) {
            addCriterion("T1RUDIMENTDISPOSERESULT not in", values, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultBetween(String value1, String value2) {
            addCriterion("T1RUDIMENTDISPOSERESULT between", value1, value2, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1rudimentdisposeresultNotBetween(String value1, String value2) {
            addCriterion("T1RUDIMENTDISPOSERESULT not between", value1, value2, "t1rudimentdisposeresult");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptIsNull() {
            addCriterion("T1CLAIMDEPT is null");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptIsNotNull() {
            addCriterion("T1CLAIMDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptEqualTo(String value) {
            addCriterion("T1CLAIMDEPT =", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptNotEqualTo(String value) {
            addCriterion("T1CLAIMDEPT <>", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptGreaterThan(String value) {
            addCriterion("T1CLAIMDEPT >", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptGreaterThanOrEqualTo(String value) {
            addCriterion("T1CLAIMDEPT >=", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptLessThan(String value) {
            addCriterion("T1CLAIMDEPT <", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptLessThanOrEqualTo(String value) {
            addCriterion("T1CLAIMDEPT <=", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptLike(String value) {
            addCriterion("T1CLAIMDEPT like", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptNotLike(String value) {
            addCriterion("T1CLAIMDEPT not like", value, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptIn(List<String> values) {
            addCriterion("T1CLAIMDEPT in", values, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptNotIn(List<String> values) {
            addCriterion("T1CLAIMDEPT not in", values, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptBetween(String value1, String value2) {
            addCriterion("T1CLAIMDEPT between", value1, value2, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimdeptNotBetween(String value1, String value2) {
            addCriterion("T1CLAIMDEPT not between", value1, value2, "t1claimdept");
            return (Criteria) this;
        }

        public Criteria andT1claimuserIsNull() {
            addCriterion("T1CLAIMUSER is null");
            return (Criteria) this;
        }

        public Criteria andT1claimuserIsNotNull() {
            addCriterion("T1CLAIMUSER is not null");
            return (Criteria) this;
        }

        public Criteria andT1claimuserEqualTo(String value) {
            addCriterion("T1CLAIMUSER =", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserNotEqualTo(String value) {
            addCriterion("T1CLAIMUSER <>", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserGreaterThan(String value) {
            addCriterion("T1CLAIMUSER >", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserGreaterThanOrEqualTo(String value) {
            addCriterion("T1CLAIMUSER >=", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserLessThan(String value) {
            addCriterion("T1CLAIMUSER <", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserLessThanOrEqualTo(String value) {
            addCriterion("T1CLAIMUSER <=", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserLike(String value) {
            addCriterion("T1CLAIMUSER like", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserNotLike(String value) {
            addCriterion("T1CLAIMUSER not like", value, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserIn(List<String> values) {
            addCriterion("T1CLAIMUSER in", values, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserNotIn(List<String> values) {
            addCriterion("T1CLAIMUSER not in", values, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserBetween(String value1, String value2) {
            addCriterion("T1CLAIMUSER between", value1, value2, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT1claimuserNotBetween(String value1, String value2) {
            addCriterion("T1CLAIMUSER not between", value1, value2, "t1claimuser");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptIsNull() {
            addCriterion("T2CLAIMDEPT is null");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptIsNotNull() {
            addCriterion("T2CLAIMDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptEqualTo(String value) {
            addCriterion("T2CLAIMDEPT =", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptNotEqualTo(String value) {
            addCriterion("T2CLAIMDEPT <>", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptGreaterThan(String value) {
            addCriterion("T2CLAIMDEPT >", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptGreaterThanOrEqualTo(String value) {
            addCriterion("T2CLAIMDEPT >=", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptLessThan(String value) {
            addCriterion("T2CLAIMDEPT <", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptLessThanOrEqualTo(String value) {
            addCriterion("T2CLAIMDEPT <=", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptLike(String value) {
            addCriterion("T2CLAIMDEPT like", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptNotLike(String value) {
            addCriterion("T2CLAIMDEPT not like", value, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptIn(List<String> values) {
            addCriterion("T2CLAIMDEPT in", values, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptNotIn(List<String> values) {
            addCriterion("T2CLAIMDEPT not in", values, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptBetween(String value1, String value2) {
            addCriterion("T2CLAIMDEPT between", value1, value2, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2claimdeptNotBetween(String value1, String value2) {
            addCriterion("T2CLAIMDEPT not between", value1, value2, "t2claimdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptIsNull() {
            addCriterion("T2LASTDEPT is null");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptIsNotNull() {
            addCriterion("T2LASTDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptEqualTo(String value) {
            addCriterion("T2LASTDEPT =", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptNotEqualTo(String value) {
            addCriterion("T2LASTDEPT <>", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptGreaterThan(String value) {
            addCriterion("T2LASTDEPT >", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptGreaterThanOrEqualTo(String value) {
            addCriterion("T2LASTDEPT >=", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptLessThan(String value) {
            addCriterion("T2LASTDEPT <", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptLessThanOrEqualTo(String value) {
            addCriterion("T2LASTDEPT <=", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptLike(String value) {
            addCriterion("T2LASTDEPT like", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptNotLike(String value) {
            addCriterion("T2LASTDEPT not like", value, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptIn(List<String> values) {
            addCriterion("T2LASTDEPT in", values, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptNotIn(List<String> values) {
            addCriterion("T2LASTDEPT not in", values, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptBetween(String value1, String value2) {
            addCriterion("T2LASTDEPT between", value1, value2, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastdeptNotBetween(String value1, String value2) {
            addCriterion("T2LASTDEPT not between", value1, value2, "t2lastdept");
            return (Criteria) this;
        }

        public Criteria andT2lastuserIsNull() {
            addCriterion("T2LASTUSER is null");
            return (Criteria) this;
        }

        public Criteria andT2lastuserIsNotNull() {
            addCriterion("T2LASTUSER is not null");
            return (Criteria) this;
        }

        public Criteria andT2lastuserEqualTo(String value) {
            addCriterion("T2LASTUSER =", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserNotEqualTo(String value) {
            addCriterion("T2LASTUSER <>", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserGreaterThan(String value) {
            addCriterion("T2LASTUSER >", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserGreaterThanOrEqualTo(String value) {
            addCriterion("T2LASTUSER >=", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserLessThan(String value) {
            addCriterion("T2LASTUSER <", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserLessThanOrEqualTo(String value) {
            addCriterion("T2LASTUSER <=", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserLike(String value) {
            addCriterion("T2LASTUSER like", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserNotLike(String value) {
            addCriterion("T2LASTUSER not like", value, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserIn(List<String> values) {
            addCriterion("T2LASTUSER in", values, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserNotIn(List<String> values) {
            addCriterion("T2LASTUSER not in", values, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserBetween(String value1, String value2) {
            addCriterion("T2LASTUSER between", value1, value2, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andT2lastuserNotBetween(String value1, String value2) {
            addCriterion("T2LASTUSER not between", value1, value2, "t2lastuser");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptIsNull() {
            addCriterion("LASTREPLYDEPT is null");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptIsNotNull() {
            addCriterion("LASTREPLYDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptEqualTo(String value) {
            addCriterion("LASTREPLYDEPT =", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptNotEqualTo(String value) {
            addCriterion("LASTREPLYDEPT <>", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptGreaterThan(String value) {
            addCriterion("LASTREPLYDEPT >", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptGreaterThanOrEqualTo(String value) {
            addCriterion("LASTREPLYDEPT >=", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptLessThan(String value) {
            addCriterion("LASTREPLYDEPT <", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptLessThanOrEqualTo(String value) {
            addCriterion("LASTREPLYDEPT <=", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptLike(String value) {
            addCriterion("LASTREPLYDEPT like", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptNotLike(String value) {
            addCriterion("LASTREPLYDEPT not like", value, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptIn(List<String> values) {
            addCriterion("LASTREPLYDEPT in", values, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptNotIn(List<String> values) {
            addCriterion("LASTREPLYDEPT not in", values, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptBetween(String value1, String value2) {
            addCriterion("LASTREPLYDEPT between", value1, value2, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplydeptNotBetween(String value1, String value2) {
            addCriterion("LASTREPLYDEPT not between", value1, value2, "lastreplydept");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserIsNull() {
            addCriterion("LASTREPLYUSER is null");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserIsNotNull() {
            addCriterion("LASTREPLYUSER is not null");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserEqualTo(String value) {
            addCriterion("LASTREPLYUSER =", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserNotEqualTo(String value) {
            addCriterion("LASTREPLYUSER <>", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserGreaterThan(String value) {
            addCriterion("LASTREPLYUSER >", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserGreaterThanOrEqualTo(String value) {
            addCriterion("LASTREPLYUSER >=", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserLessThan(String value) {
            addCriterion("LASTREPLYUSER <", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserLessThanOrEqualTo(String value) {
            addCriterion("LASTREPLYUSER <=", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserLike(String value) {
            addCriterion("LASTREPLYUSER like", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserNotLike(String value) {
            addCriterion("LASTREPLYUSER not like", value, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserIn(List<String> values) {
            addCriterion("LASTREPLYUSER in", values, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserNotIn(List<String> values) {
            addCriterion("LASTREPLYUSER not in", values, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserBetween(String value1, String value2) {
            addCriterion("LASTREPLYUSER between", value1, value2, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andLastreplyuserNotBetween(String value1, String value2) {
            addCriterion("LASTREPLYUSER not between", value1, value2, "lastreplyuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserIsNull() {
            addCriterion("FINISHUSER is null");
            return (Criteria) this;
        }

        public Criteria andFinishuserIsNotNull() {
            addCriterion("FINISHUSER is not null");
            return (Criteria) this;
        }

        public Criteria andFinishuserEqualTo(String value) {
            addCriterion("FINISHUSER =", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserNotEqualTo(String value) {
            addCriterion("FINISHUSER <>", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserGreaterThan(String value) {
            addCriterion("FINISHUSER >", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserGreaterThanOrEqualTo(String value) {
            addCriterion("FINISHUSER >=", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserLessThan(String value) {
            addCriterion("FINISHUSER <", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserLessThanOrEqualTo(String value) {
            addCriterion("FINISHUSER <=", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserLike(String value) {
            addCriterion("FINISHUSER like", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserNotLike(String value) {
            addCriterion("FINISHUSER not like", value, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserIn(List<String> values) {
            addCriterion("FINISHUSER in", values, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserNotIn(List<String> values) {
            addCriterion("FINISHUSER not in", values, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserBetween(String value1, String value2) {
            addCriterion("FINISHUSER between", value1, value2, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFinishuserNotBetween(String value1, String value2) {
            addCriterion("FINISHUSER not between", value1, value2, "finishuser");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeIsNull() {
            addCriterion("FAULTLASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeIsNotNull() {
            addCriterion("FAULTLASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeEqualTo(String value) {
            addCriterion("FAULTLASTTIME =", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeNotEqualTo(String value) {
            addCriterion("FAULTLASTTIME <>", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeGreaterThan(String value) {
            addCriterion("FAULTLASTTIME >", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTLASTTIME >=", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeLessThan(String value) {
            addCriterion("FAULTLASTTIME <", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeLessThanOrEqualTo(String value) {
            addCriterion("FAULTLASTTIME <=", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeLike(String value) {
            addCriterion("FAULTLASTTIME like", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeNotLike(String value) {
            addCriterion("FAULTLASTTIME not like", value, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeIn(List<String> values) {
            addCriterion("FAULTLASTTIME in", values, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeNotIn(List<String> values) {
            addCriterion("FAULTLASTTIME not in", values, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeBetween(String value1, String value2) {
            addCriterion("FAULTLASTTIME between", value1, value2, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultlasttimeNotBetween(String value1, String value2) {
            addCriterion("FAULTLASTTIME not between", value1, value2, "faultlasttime");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelIsNull() {
            addCriterion("FAULTRESPONSELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelIsNotNull() {
            addCriterion("FAULTRESPONSELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelEqualTo(String value) {
            addCriterion("FAULTRESPONSELEVEL =", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelNotEqualTo(String value) {
            addCriterion("FAULTRESPONSELEVEL <>", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelGreaterThan(String value) {
            addCriterion("FAULTRESPONSELEVEL >", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTRESPONSELEVEL >=", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelLessThan(String value) {
            addCriterion("FAULTRESPONSELEVEL <", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelLessThanOrEqualTo(String value) {
            addCriterion("FAULTRESPONSELEVEL <=", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelLike(String value) {
            addCriterion("FAULTRESPONSELEVEL like", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelNotLike(String value) {
            addCriterion("FAULTRESPONSELEVEL not like", value, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelIn(List<String> values) {
            addCriterion("FAULTRESPONSELEVEL in", values, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelNotIn(List<String> values) {
            addCriterion("FAULTRESPONSELEVEL not in", values, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelBetween(String value1, String value2) {
            addCriterion("FAULTRESPONSELEVEL between", value1, value2, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andFaultresponselevelNotBetween(String value1, String value2) {
            addCriterion("FAULTRESPONSELEVEL not between", value1, value2, "faultresponselevel");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceIsNull() {
            addCriterion("ALARMSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceIsNotNull() {
            addCriterion("ALARMSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceEqualTo(String value) {
            addCriterion("ALARMSOURCE =", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceNotEqualTo(String value) {
            addCriterion("ALARMSOURCE <>", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceGreaterThan(String value) {
            addCriterion("ALARMSOURCE >", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMSOURCE >=", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceLessThan(String value) {
            addCriterion("ALARMSOURCE <", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceLessThanOrEqualTo(String value) {
            addCriterion("ALARMSOURCE <=", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceLike(String value) {
            addCriterion("ALARMSOURCE like", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceNotLike(String value) {
            addCriterion("ALARMSOURCE not like", value, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceIn(List<String> values) {
            addCriterion("ALARMSOURCE in", values, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceNotIn(List<String> values) {
            addCriterion("ALARMSOURCE not in", values, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceBetween(String value1, String value2) {
            addCriterion("ALARMSOURCE between", value1, value2, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmsourceNotBetween(String value1, String value2) {
            addCriterion("ALARMSOURCE not between", value1, value2, "alarmsource");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeIsNull() {
            addCriterion("ALARMLOGICTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeIsNotNull() {
            addCriterion("ALARMLOGICTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeEqualTo(String value) {
            addCriterion("ALARMLOGICTYPE =", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeNotEqualTo(String value) {
            addCriterion("ALARMLOGICTYPE <>", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeGreaterThan(String value) {
            addCriterion("ALARMLOGICTYPE >", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMLOGICTYPE >=", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeLessThan(String value) {
            addCriterion("ALARMLOGICTYPE <", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeLessThanOrEqualTo(String value) {
            addCriterion("ALARMLOGICTYPE <=", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeLike(String value) {
            addCriterion("ALARMLOGICTYPE like", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeNotLike(String value) {
            addCriterion("ALARMLOGICTYPE not like", value, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeIn(List<String> values) {
            addCriterion("ALARMLOGICTYPE in", values, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeNotIn(List<String> values) {
            addCriterion("ALARMLOGICTYPE not in", values, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeBetween(String value1, String value2) {
            addCriterion("ALARMLOGICTYPE between", value1, value2, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmlogictypeNotBetween(String value1, String value2) {
            addCriterion("ALARMLOGICTYPE not between", value1, value2, "alarmlogictype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassIsNull() {
            addCriterion("ALARMSUBCLASS is null");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassIsNotNull() {
            addCriterion("ALARMSUBCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassEqualTo(String value) {
            addCriterion("ALARMSUBCLASS =", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassNotEqualTo(String value) {
            addCriterion("ALARMSUBCLASS <>", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassGreaterThan(String value) {
            addCriterion("ALARMSUBCLASS >", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMSUBCLASS >=", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassLessThan(String value) {
            addCriterion("ALARMSUBCLASS <", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassLessThanOrEqualTo(String value) {
            addCriterion("ALARMSUBCLASS <=", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassLike(String value) {
            addCriterion("ALARMSUBCLASS like", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassNotLike(String value) {
            addCriterion("ALARMSUBCLASS not like", value, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassIn(List<String> values) {
            addCriterion("ALARMSUBCLASS in", values, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassNotIn(List<String> values) {
            addCriterion("ALARMSUBCLASS not in", values, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassBetween(String value1, String value2) {
            addCriterion("ALARMSUBCLASS between", value1, value2, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andAlarmsubclassNotBetween(String value1, String value2) {
            addCriterion("ALARMSUBCLASS not between", value1, value2, "alarmsubclass");
            return (Criteria) this;
        }

        public Criteria andCchsheetidIsNull() {
            addCriterion("CCHSHEETID is null");
            return (Criteria) this;
        }

        public Criteria andCchsheetidIsNotNull() {
            addCriterion("CCHSHEETID is not null");
            return (Criteria) this;
        }

        public Criteria andCchsheetidEqualTo(String value) {
            addCriterion("CCHSHEETID =", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidNotEqualTo(String value) {
            addCriterion("CCHSHEETID <>", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidGreaterThan(String value) {
            addCriterion("CCHSHEETID >", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidGreaterThanOrEqualTo(String value) {
            addCriterion("CCHSHEETID >=", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidLessThan(String value) {
            addCriterion("CCHSHEETID <", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidLessThanOrEqualTo(String value) {
            addCriterion("CCHSHEETID <=", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidLike(String value) {
            addCriterion("CCHSHEETID like", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidNotLike(String value) {
            addCriterion("CCHSHEETID not like", value, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidIn(List<String> values) {
            addCriterion("CCHSHEETID in", values, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidNotIn(List<String> values) {
            addCriterion("CCHSHEETID not in", values, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidBetween(String value1, String value2) {
            addCriterion("CCHSHEETID between", value1, value2, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andCchsheetidNotBetween(String value1, String value2) {
            addCriterion("CCHSHEETID not between", value1, value2, "cchsheetid");
            return (Criteria) this;
        }

        public Criteria andEquipmodleIsNull() {
            addCriterion("EQUIPMODLE is null");
            return (Criteria) this;
        }

        public Criteria andEquipmodleIsNotNull() {
            addCriterion("EQUIPMODLE is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmodleEqualTo(String value) {
            addCriterion("EQUIPMODLE =", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleNotEqualTo(String value) {
            addCriterion("EQUIPMODLE <>", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleGreaterThan(String value) {
            addCriterion("EQUIPMODLE >", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMODLE >=", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleLessThan(String value) {
            addCriterion("EQUIPMODLE <", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMODLE <=", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleLike(String value) {
            addCriterion("EQUIPMODLE like", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleNotLike(String value) {
            addCriterion("EQUIPMODLE not like", value, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleIn(List<String> values) {
            addCriterion("EQUIPMODLE in", values, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleNotIn(List<String> values) {
            addCriterion("EQUIPMODLE not in", values, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleBetween(String value1, String value2) {
            addCriterion("EQUIPMODLE between", value1, value2, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andEquipmodleNotBetween(String value1, String value2) {
            addCriterion("EQUIPMODLE not between", value1, value2, "equipmodle");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeIsNull() {
            addCriterion("T1CLAIMEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeIsNotNull() {
            addCriterion("T1CLAIMEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeEqualTo(Date value) {
            addCriterionForJDBCDate("T1CLAIMEDTIME =", value, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T1CLAIMEDTIME <>", value, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T1CLAIMEDTIME >", value, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1CLAIMEDTIME >=", value, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeLessThan(Date value) {
            addCriterionForJDBCDate("T1CLAIMEDTIME <", value, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1CLAIMEDTIME <=", value, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeIn(List<Date> values) {
            addCriterionForJDBCDate("T1CLAIMEDTIME in", values, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T1CLAIMEDTIME not in", values, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1CLAIMEDTIME between", value1, value2, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1claimedtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1CLAIMEDTIME not between", value1, value2, "t1claimedtime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeIsNull() {
            addCriterion("T1OPERATETIME is null");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeIsNotNull() {
            addCriterion("T1OPERATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("T1OPERATETIME =", value, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T1OPERATETIME <>", value, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T1OPERATETIME >", value, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1OPERATETIME >=", value, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeLessThan(Date value) {
            addCriterionForJDBCDate("T1OPERATETIME <", value, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1OPERATETIME <=", value, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("T1OPERATETIME in", values, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T1OPERATETIME not in", values, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1OPERATETIME between", value1, value2, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andT1operatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1OPERATETIME not between", value1, value2, "t1operatetime");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagIsNull() {
            addCriterion("COMMUNICATEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagIsNotNull() {
            addCriterion("COMMUNICATEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagEqualTo(BigDecimal value) {
            addCriterion("COMMUNICATEFLAG =", value, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagNotEqualTo(BigDecimal value) {
            addCriterion("COMMUNICATEFLAG <>", value, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagGreaterThan(BigDecimal value) {
            addCriterion("COMMUNICATEFLAG >", value, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMUNICATEFLAG >=", value, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagLessThan(BigDecimal value) {
            addCriterion("COMMUNICATEFLAG <", value, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMMUNICATEFLAG <=", value, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagIn(List<BigDecimal> values) {
            addCriterion("COMMUNICATEFLAG in", values, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagNotIn(List<BigDecimal> values) {
            addCriterion("COMMUNICATEFLAG not in", values, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMUNICATEFLAG between", value1, value2, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andCommunicateflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMMUNICATEFLAG not between", value1, value2, "communicateflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagIsNull() {
            addCriterion("SAFEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSafeflagIsNotNull() {
            addCriterion("SAFEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSafeflagEqualTo(BigDecimal value) {
            addCriterion("SAFEFLAG =", value, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagNotEqualTo(BigDecimal value) {
            addCriterion("SAFEFLAG <>", value, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagGreaterThan(BigDecimal value) {
            addCriterion("SAFEFLAG >", value, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAFEFLAG >=", value, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagLessThan(BigDecimal value) {
            addCriterion("SAFEFLAG <", value, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAFEFLAG <=", value, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagIn(List<BigDecimal> values) {
            addCriterion("SAFEFLAG in", values, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagNotIn(List<BigDecimal> values) {
            addCriterion("SAFEFLAG not in", values, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAFEFLAG between", value1, value2, "safeflag");
            return (Criteria) this;
        }

        public Criteria andSafeflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAFEFLAG not between", value1, value2, "safeflag");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptIsNull() {
            addCriterion("T1TRANSFERDEPT is null");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptIsNotNull() {
            addCriterion("T1TRANSFERDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptEqualTo(String value) {
            addCriterion("T1TRANSFERDEPT =", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptNotEqualTo(String value) {
            addCriterion("T1TRANSFERDEPT <>", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptGreaterThan(String value) {
            addCriterion("T1TRANSFERDEPT >", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptGreaterThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERDEPT >=", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptLessThan(String value) {
            addCriterion("T1TRANSFERDEPT <", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptLessThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERDEPT <=", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptLike(String value) {
            addCriterion("T1TRANSFERDEPT like", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptNotLike(String value) {
            addCriterion("T1TRANSFERDEPT not like", value, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptIn(List<String> values) {
            addCriterion("T1TRANSFERDEPT in", values, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptNotIn(List<String> values) {
            addCriterion("T1TRANSFERDEPT not in", values, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptBetween(String value1, String value2) {
            addCriterion("T1TRANSFERDEPT between", value1, value2, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT1transferdeptNotBetween(String value1, String value2) {
            addCriterion("T1TRANSFERDEPT not between", value1, value2, "t1transferdept");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeIsNull() {
            addCriterion("T2CLAIMEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeIsNotNull() {
            addCriterion("T2CLAIMEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeEqualTo(Date value) {
            addCriterionForJDBCDate("T2CLAIMEDTIME =", value, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T2CLAIMEDTIME <>", value, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T2CLAIMEDTIME >", value, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2CLAIMEDTIME >=", value, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeLessThan(Date value) {
            addCriterionForJDBCDate("T2CLAIMEDTIME <", value, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2CLAIMEDTIME <=", value, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeIn(List<Date> values) {
            addCriterionForJDBCDate("T2CLAIMEDTIME in", values, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T2CLAIMEDTIME not in", values, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2CLAIMEDTIME between", value1, value2, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2claimedtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2CLAIMEDTIME not between", value1, value2, "t2claimedtime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeIsNull() {
            addCriterion("T2OPERATETIME is null");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeIsNotNull() {
            addCriterion("T2OPERATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("T2OPERATETIME =", value, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T2OPERATETIME <>", value, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T2OPERATETIME >", value, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2OPERATETIME >=", value, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeLessThan(Date value) {
            addCriterionForJDBCDate("T2OPERATETIME <", value, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2OPERATETIME <=", value, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("T2OPERATETIME in", values, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T2OPERATETIME not in", values, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2OPERATETIME between", value1, value2, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andT2operatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2OPERATETIME not between", value1, value2, "t2operatetime");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagIsNull() {
            addCriterion("FINALLYPROJECTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagIsNotNull() {
            addCriterion("FINALLYPROJECTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagEqualTo(BigDecimal value) {
            addCriterion("FINALLYPROJECTFLAG =", value, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagNotEqualTo(BigDecimal value) {
            addCriterion("FINALLYPROJECTFLAG <>", value, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagGreaterThan(BigDecimal value) {
            addCriterion("FINALLYPROJECTFLAG >", value, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINALLYPROJECTFLAG >=", value, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagLessThan(BigDecimal value) {
            addCriterion("FINALLYPROJECTFLAG <", value, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINALLYPROJECTFLAG <=", value, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagIn(List<BigDecimal> values) {
            addCriterion("FINALLYPROJECTFLAG in", values, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagNotIn(List<BigDecimal> values) {
            addCriterion("FINALLYPROJECTFLAG not in", values, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINALLYPROJECTFLAG between", value1, value2, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andFinallyprojectflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINALLYPROJECTFLAG not between", value1, value2, "finallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeIsNull() {
            addCriterion("AFFECTOPERATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeIsNotNull() {
            addCriterion("AFFECTOPERATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeEqualTo(String value) {
            addCriterion("AFFECTOPERATIONTIME =", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeNotEqualTo(String value) {
            addCriterion("AFFECTOPERATIONTIME <>", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeGreaterThan(String value) {
            addCriterion("AFFECTOPERATIONTIME >", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("AFFECTOPERATIONTIME >=", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeLessThan(String value) {
            addCriterion("AFFECTOPERATIONTIME <", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeLessThanOrEqualTo(String value) {
            addCriterion("AFFECTOPERATIONTIME <=", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeLike(String value) {
            addCriterion("AFFECTOPERATIONTIME like", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeNotLike(String value) {
            addCriterion("AFFECTOPERATIONTIME not like", value, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeIn(List<String> values) {
            addCriterion("AFFECTOPERATIONTIME in", values, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeNotIn(List<String> values) {
            addCriterion("AFFECTOPERATIONTIME not in", values, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeBetween(String value1, String value2) {
            addCriterion("AFFECTOPERATIONTIME between", value1, value2, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andAffectoperationtimeNotBetween(String value1, String value2) {
            addCriterion("AFFECTOPERATIONTIME not between", value1, value2, "affectoperationtime");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonIsNull() {
            addCriterion("REJECTEDREASON is null");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonIsNotNull() {
            addCriterion("REJECTEDREASON is not null");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonEqualTo(String value) {
            addCriterion("REJECTEDREASON =", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonNotEqualTo(String value) {
            addCriterion("REJECTEDREASON <>", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonGreaterThan(String value) {
            addCriterion("REJECTEDREASON >", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonGreaterThanOrEqualTo(String value) {
            addCriterion("REJECTEDREASON >=", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonLessThan(String value) {
            addCriterion("REJECTEDREASON <", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonLessThanOrEqualTo(String value) {
            addCriterion("REJECTEDREASON <=", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonLike(String value) {
            addCriterion("REJECTEDREASON like", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonNotLike(String value) {
            addCriterion("REJECTEDREASON not like", value, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonIn(List<String> values) {
            addCriterion("REJECTEDREASON in", values, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonNotIn(List<String> values) {
            addCriterion("REJECTEDREASON not in", values, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonBetween(String value1, String value2) {
            addCriterion("REJECTEDREASON between", value1, value2, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andRejectedreasonNotBetween(String value1, String value2) {
            addCriterion("REJECTEDREASON not between", value1, value2, "rejectedreason");
            return (Criteria) this;
        }

        public Criteria andFillingideaIsNull() {
            addCriterion("FILLINGIDEA is null");
            return (Criteria) this;
        }

        public Criteria andFillingideaIsNotNull() {
            addCriterion("FILLINGIDEA is not null");
            return (Criteria) this;
        }

        public Criteria andFillingideaEqualTo(String value) {
            addCriterion("FILLINGIDEA =", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaNotEqualTo(String value) {
            addCriterion("FILLINGIDEA <>", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaGreaterThan(String value) {
            addCriterion("FILLINGIDEA >", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaGreaterThanOrEqualTo(String value) {
            addCriterion("FILLINGIDEA >=", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaLessThan(String value) {
            addCriterion("FILLINGIDEA <", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaLessThanOrEqualTo(String value) {
            addCriterion("FILLINGIDEA <=", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaLike(String value) {
            addCriterion("FILLINGIDEA like", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaNotLike(String value) {
            addCriterion("FILLINGIDEA not like", value, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaIn(List<String> values) {
            addCriterion("FILLINGIDEA in", values, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaNotIn(List<String> values) {
            addCriterion("FILLINGIDEA not in", values, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaBetween(String value1, String value2) {
            addCriterion("FILLINGIDEA between", value1, value2, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andFillingideaNotBetween(String value1, String value2) {
            addCriterion("FILLINGIDEA not between", value1, value2, "fillingidea");
            return (Criteria) this;
        }

        public Criteria andAlarmidIsNull() {
            addCriterion("ALARMID is null");
            return (Criteria) this;
        }

        public Criteria andAlarmidIsNotNull() {
            addCriterion("ALARMID is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmidEqualTo(String value) {
            addCriterion("ALARMID =", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidNotEqualTo(String value) {
            addCriterion("ALARMID <>", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidGreaterThan(String value) {
            addCriterion("ALARMID >", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMID >=", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidLessThan(String value) {
            addCriterion("ALARMID <", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidLessThanOrEqualTo(String value) {
            addCriterion("ALARMID <=", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidLike(String value) {
            addCriterion("ALARMID like", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidNotLike(String value) {
            addCriterion("ALARMID not like", value, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidIn(List<String> values) {
            addCriterion("ALARMID in", values, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidNotIn(List<String> values) {
            addCriterion("ALARMID not in", values, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidBetween(String value1, String value2) {
            addCriterion("ALARMID between", value1, value2, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmidNotBetween(String value1, String value2) {
            addCriterion("ALARMID not between", value1, value2, "alarmid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidIsNull() {
            addCriterion("ALARMSHEETID is null");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidIsNotNull() {
            addCriterion("ALARMSHEETID is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidEqualTo(String value) {
            addCriterion("ALARMSHEETID =", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidNotEqualTo(String value) {
            addCriterion("ALARMSHEETID <>", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidGreaterThan(String value) {
            addCriterion("ALARMSHEETID >", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMSHEETID >=", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidLessThan(String value) {
            addCriterion("ALARMSHEETID <", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidLessThanOrEqualTo(String value) {
            addCriterion("ALARMSHEETID <=", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidLike(String value) {
            addCriterion("ALARMSHEETID like", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidNotLike(String value) {
            addCriterion("ALARMSHEETID not like", value, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidIn(List<String> values) {
            addCriterion("ALARMSHEETID in", values, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidNotIn(List<String> values) {
            addCriterion("ALARMSHEETID not in", values, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidBetween(String value1, String value2) {
            addCriterion("ALARMSHEETID between", value1, value2, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andAlarmsheetidNotBetween(String value1, String value2) {
            addCriterion("ALARMSHEETID not between", value1, value2, "alarmsheetid");
            return (Criteria) this;
        }

        public Criteria andT1transferroleIsNull() {
            addCriterion("T1TRANSFERROLE is null");
            return (Criteria) this;
        }

        public Criteria andT1transferroleIsNotNull() {
            addCriterion("T1TRANSFERROLE is not null");
            return (Criteria) this;
        }

        public Criteria andT1transferroleEqualTo(String value) {
            addCriterion("T1TRANSFERROLE =", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleNotEqualTo(String value) {
            addCriterion("T1TRANSFERROLE <>", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleGreaterThan(String value) {
            addCriterion("T1TRANSFERROLE >", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleGreaterThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERROLE >=", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleLessThan(String value) {
            addCriterion("T1TRANSFERROLE <", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleLessThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERROLE <=", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleLike(String value) {
            addCriterion("T1TRANSFERROLE like", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleNotLike(String value) {
            addCriterion("T1TRANSFERROLE not like", value, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleIn(List<String> values) {
            addCriterion("T1TRANSFERROLE in", values, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleNotIn(List<String> values) {
            addCriterion("T1TRANSFERROLE not in", values, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleBetween(String value1, String value2) {
            addCriterion("T1TRANSFERROLE between", value1, value2, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT1transferroleNotBetween(String value1, String value2) {
            addCriterion("T1TRANSFERROLE not between", value1, value2, "t1transferrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleIsNull() {
            addCriterion("T2REPLYROLE is null");
            return (Criteria) this;
        }

        public Criteria andT2replyroleIsNotNull() {
            addCriterion("T2REPLYROLE is not null");
            return (Criteria) this;
        }

        public Criteria andT2replyroleEqualTo(String value) {
            addCriterion("T2REPLYROLE =", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleNotEqualTo(String value) {
            addCriterion("T2REPLYROLE <>", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleGreaterThan(String value) {
            addCriterion("T2REPLYROLE >", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleGreaterThanOrEqualTo(String value) {
            addCriterion("T2REPLYROLE >=", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleLessThan(String value) {
            addCriterion("T2REPLYROLE <", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleLessThanOrEqualTo(String value) {
            addCriterion("T2REPLYROLE <=", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleLike(String value) {
            addCriterion("T2REPLYROLE like", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleNotLike(String value) {
            addCriterion("T2REPLYROLE not like", value, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleIn(List<String> values) {
            addCriterion("T2REPLYROLE in", values, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleNotIn(List<String> values) {
            addCriterion("T2REPLYROLE not in", values, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleBetween(String value1, String value2) {
            addCriterion("T2REPLYROLE between", value1, value2, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andT2replyroleNotBetween(String value1, String value2) {
            addCriterion("T2REPLYROLE not between", value1, value2, "t2replyrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleIsNull() {
            addCriterion("FILINGROLE is null");
            return (Criteria) this;
        }

        public Criteria andFilingroleIsNotNull() {
            addCriterion("FILINGROLE is not null");
            return (Criteria) this;
        }

        public Criteria andFilingroleEqualTo(String value) {
            addCriterion("FILINGROLE =", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleNotEqualTo(String value) {
            addCriterion("FILINGROLE <>", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleGreaterThan(String value) {
            addCriterion("FILINGROLE >", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleGreaterThanOrEqualTo(String value) {
            addCriterion("FILINGROLE >=", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleLessThan(String value) {
            addCriterion("FILINGROLE <", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleLessThanOrEqualTo(String value) {
            addCriterion("FILINGROLE <=", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleLike(String value) {
            addCriterion("FILINGROLE like", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleNotLike(String value) {
            addCriterion("FILINGROLE not like", value, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleIn(List<String> values) {
            addCriterion("FILINGROLE in", values, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleNotIn(List<String> values) {
            addCriterion("FILINGROLE not in", values, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleBetween(String value1, String value2) {
            addCriterion("FILINGROLE between", value1, value2, "filingrole");
            return (Criteria) this;
        }

        public Criteria andFilingroleNotBetween(String value1, String value2) {
            addCriterion("FILINGROLE not between", value1, value2, "filingrole");
            return (Criteria) this;
        }

        public Criteria andT1transferuserIsNull() {
            addCriterion("T1TRANSFERUSER is null");
            return (Criteria) this;
        }

        public Criteria andT1transferuserIsNotNull() {
            addCriterion("T1TRANSFERUSER is not null");
            return (Criteria) this;
        }

        public Criteria andT1transferuserEqualTo(String value) {
            addCriterion("T1TRANSFERUSER =", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserNotEqualTo(String value) {
            addCriterion("T1TRANSFERUSER <>", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserGreaterThan(String value) {
            addCriterion("T1TRANSFERUSER >", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserGreaterThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERUSER >=", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserLessThan(String value) {
            addCriterion("T1TRANSFERUSER <", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserLessThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERUSER <=", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserLike(String value) {
            addCriterion("T1TRANSFERUSER like", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserNotLike(String value) {
            addCriterion("T1TRANSFERUSER not like", value, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserIn(List<String> values) {
            addCriterion("T1TRANSFERUSER in", values, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserNotIn(List<String> values) {
            addCriterion("T1TRANSFERUSER not in", values, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserBetween(String value1, String value2) {
            addCriterion("T1TRANSFERUSER between", value1, value2, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andT1transferuserNotBetween(String value1, String value2) {
            addCriterion("T1TRANSFERUSER not between", value1, value2, "t1transferuser");
            return (Criteria) this;
        }

        public Criteria andFilingdeptIsNull() {
            addCriterion("FILINGDEPT is null");
            return (Criteria) this;
        }

        public Criteria andFilingdeptIsNotNull() {
            addCriterion("FILINGDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andFilingdeptEqualTo(String value) {
            addCriterion("FILINGDEPT =", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptNotEqualTo(String value) {
            addCriterion("FILINGDEPT <>", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptGreaterThan(String value) {
            addCriterion("FILINGDEPT >", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptGreaterThanOrEqualTo(String value) {
            addCriterion("FILINGDEPT >=", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptLessThan(String value) {
            addCriterion("FILINGDEPT <", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptLessThanOrEqualTo(String value) {
            addCriterion("FILINGDEPT <=", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptLike(String value) {
            addCriterion("FILINGDEPT like", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptNotLike(String value) {
            addCriterion("FILINGDEPT not like", value, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptIn(List<String> values) {
            addCriterion("FILINGDEPT in", values, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptNotIn(List<String> values) {
            addCriterion("FILINGDEPT not in", values, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptBetween(String value1, String value2) {
            addCriterion("FILINGDEPT between", value1, value2, "filingdept");
            return (Criteria) this;
        }

        public Criteria andFilingdeptNotBetween(String value1, String value2) {
            addCriterion("FILINGDEPT not between", value1, value2, "filingdept");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneIsNull() {
            addCriterion("CREATEUSERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneIsNotNull() {
            addCriterion("CREATEUSERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneEqualTo(String value) {
            addCriterion("CREATEUSERPHONE =", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneNotEqualTo(String value) {
            addCriterion("CREATEUSERPHONE <>", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneGreaterThan(String value) {
            addCriterion("CREATEUSERPHONE >", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERPHONE >=", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneLessThan(String value) {
            addCriterion("CREATEUSERPHONE <", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERPHONE <=", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneLike(String value) {
            addCriterion("CREATEUSERPHONE like", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneNotLike(String value) {
            addCriterion("CREATEUSERPHONE not like", value, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneIn(List<String> values) {
            addCriterion("CREATEUSERPHONE in", values, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneNotIn(List<String> values) {
            addCriterion("CREATEUSERPHONE not in", values, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneBetween(String value1, String value2) {
            addCriterion("CREATEUSERPHONE between", value1, value2, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andCreateuserphoneNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERPHONE not between", value1, value2, "createuserphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneIsNull() {
            addCriterion("T1TRANSFERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneIsNotNull() {
            addCriterion("T1TRANSFERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneEqualTo(String value) {
            addCriterion("T1TRANSFERPHONE =", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneNotEqualTo(String value) {
            addCriterion("T1TRANSFERPHONE <>", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneGreaterThan(String value) {
            addCriterion("T1TRANSFERPHONE >", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneGreaterThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERPHONE >=", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneLessThan(String value) {
            addCriterion("T1TRANSFERPHONE <", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneLessThanOrEqualTo(String value) {
            addCriterion("T1TRANSFERPHONE <=", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneLike(String value) {
            addCriterion("T1TRANSFERPHONE like", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneNotLike(String value) {
            addCriterion("T1TRANSFERPHONE not like", value, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneIn(List<String> values) {
            addCriterion("T1TRANSFERPHONE in", values, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneNotIn(List<String> values) {
            addCriterion("T1TRANSFERPHONE not in", values, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneBetween(String value1, String value2) {
            addCriterion("T1TRANSFERPHONE between", value1, value2, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT1transferphoneNotBetween(String value1, String value2) {
            addCriterion("T1TRANSFERPHONE not between", value1, value2, "t1transferphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneIsNull() {
            addCriterion("T2DISPOSEUSERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneIsNotNull() {
            addCriterion("T2DISPOSEUSERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneEqualTo(String value) {
            addCriterion("T2DISPOSEUSERPHONE =", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneNotEqualTo(String value) {
            addCriterion("T2DISPOSEUSERPHONE <>", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneGreaterThan(String value) {
            addCriterion("T2DISPOSEUSERPHONE >", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("T2DISPOSEUSERPHONE >=", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneLessThan(String value) {
            addCriterion("T2DISPOSEUSERPHONE <", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneLessThanOrEqualTo(String value) {
            addCriterion("T2DISPOSEUSERPHONE <=", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneLike(String value) {
            addCriterion("T2DISPOSEUSERPHONE like", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneNotLike(String value) {
            addCriterion("T2DISPOSEUSERPHONE not like", value, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneIn(List<String> values) {
            addCriterion("T2DISPOSEUSERPHONE in", values, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneNotIn(List<String> values) {
            addCriterion("T2DISPOSEUSERPHONE not in", values, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneBetween(String value1, String value2) {
            addCriterion("T2DISPOSEUSERPHONE between", value1, value2, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andT2disposeuserphoneNotBetween(String value1, String value2) {
            addCriterion("T2DISPOSEUSERPHONE not between", value1, value2, "t2disposeuserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneIsNull() {
            addCriterion("FILINGUSERPHONE is null");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneIsNotNull() {
            addCriterion("FILINGUSERPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneEqualTo(String value) {
            addCriterion("FILINGUSERPHONE =", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneNotEqualTo(String value) {
            addCriterion("FILINGUSERPHONE <>", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneGreaterThan(String value) {
            addCriterion("FILINGUSERPHONE >", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("FILINGUSERPHONE >=", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneLessThan(String value) {
            addCriterion("FILINGUSERPHONE <", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneLessThanOrEqualTo(String value) {
            addCriterion("FILINGUSERPHONE <=", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneLike(String value) {
            addCriterion("FILINGUSERPHONE like", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneNotLike(String value) {
            addCriterion("FILINGUSERPHONE not like", value, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneIn(List<String> values) {
            addCriterion("FILINGUSERPHONE in", values, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneNotIn(List<String> values) {
            addCriterion("FILINGUSERPHONE not in", values, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneBetween(String value1, String value2) {
            addCriterion("FILINGUSERPHONE between", value1, value2, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andFilinguserphoneNotBetween(String value1, String value2) {
            addCriterion("FILINGUSERPHONE not between", value1, value2, "filinguserphone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneIsNull() {
            addCriterion("REMARKSONE is null");
            return (Criteria) this;
        }

        public Criteria andRemarksoneIsNotNull() {
            addCriterion("REMARKSONE is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksoneEqualTo(String value) {
            addCriterion("REMARKSONE =", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneNotEqualTo(String value) {
            addCriterion("REMARKSONE <>", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneGreaterThan(String value) {
            addCriterion("REMARKSONE >", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKSONE >=", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneLessThan(String value) {
            addCriterion("REMARKSONE <", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneLessThanOrEqualTo(String value) {
            addCriterion("REMARKSONE <=", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneLike(String value) {
            addCriterion("REMARKSONE like", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneNotLike(String value) {
            addCriterion("REMARKSONE not like", value, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneIn(List<String> values) {
            addCriterion("REMARKSONE in", values, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneNotIn(List<String> values) {
            addCriterion("REMARKSONE not in", values, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneBetween(String value1, String value2) {
            addCriterion("REMARKSONE between", value1, value2, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarksoneNotBetween(String value1, String value2) {
            addCriterion("REMARKSONE not between", value1, value2, "remarksone");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoIsNull() {
            addCriterion("REMARKSTWO is null");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoIsNotNull() {
            addCriterion("REMARKSTWO is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoEqualTo(String value) {
            addCriterion("REMARKSTWO =", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoNotEqualTo(String value) {
            addCriterion("REMARKSTWO <>", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoGreaterThan(String value) {
            addCriterion("REMARKSTWO >", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKSTWO >=", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoLessThan(String value) {
            addCriterion("REMARKSTWO <", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoLessThanOrEqualTo(String value) {
            addCriterion("REMARKSTWO <=", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoLike(String value) {
            addCriterion("REMARKSTWO like", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoNotLike(String value) {
            addCriterion("REMARKSTWO not like", value, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoIn(List<String> values) {
            addCriterion("REMARKSTWO in", values, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoNotIn(List<String> values) {
            addCriterion("REMARKSTWO not in", values, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoBetween(String value1, String value2) {
            addCriterion("REMARKSTWO between", value1, value2, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarkstwoNotBetween(String value1, String value2) {
            addCriterion("REMARKSTWO not between", value1, value2, "remarkstwo");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeIsNull() {
            addCriterion("REMARKSTHREE is null");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeIsNotNull() {
            addCriterion("REMARKSTHREE is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeEqualTo(String value) {
            addCriterion("REMARKSTHREE =", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeNotEqualTo(String value) {
            addCriterion("REMARKSTHREE <>", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeGreaterThan(String value) {
            addCriterion("REMARKSTHREE >", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKSTHREE >=", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeLessThan(String value) {
            addCriterion("REMARKSTHREE <", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeLessThanOrEqualTo(String value) {
            addCriterion("REMARKSTHREE <=", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeLike(String value) {
            addCriterion("REMARKSTHREE like", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeNotLike(String value) {
            addCriterion("REMARKSTHREE not like", value, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeIn(List<String> values) {
            addCriterion("REMARKSTHREE in", values, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeNotIn(List<String> values) {
            addCriterion("REMARKSTHREE not in", values, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeBetween(String value1, String value2) {
            addCriterion("REMARKSTHREE between", value1, value2, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andRemarksthreeNotBetween(String value1, String value2) {
            addCriterion("REMARKSTHREE not between", value1, value2, "remarksthree");
            return (Criteria) this;
        }

        public Criteria andNeidIsNull() {
            addCriterion("NEID is null");
            return (Criteria) this;
        }

        public Criteria andNeidIsNotNull() {
            addCriterion("NEID is not null");
            return (Criteria) this;
        }

        public Criteria andNeidEqualTo(String value) {
            addCriterion("NEID =", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidNotEqualTo(String value) {
            addCriterion("NEID <>", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidGreaterThan(String value) {
            addCriterion("NEID >", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidGreaterThanOrEqualTo(String value) {
            addCriterion("NEID >=", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidLessThan(String value) {
            addCriterion("NEID <", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidLessThanOrEqualTo(String value) {
            addCriterion("NEID <=", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidLike(String value) {
            addCriterion("NEID like", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidNotLike(String value) {
            addCriterion("NEID not like", value, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidIn(List<String> values) {
            addCriterion("NEID in", values, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidNotIn(List<String> values) {
            addCriterion("NEID not in", values, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidBetween(String value1, String value2) {
            addCriterion("NEID between", value1, value2, "neid");
            return (Criteria) this;
        }

        public Criteria andNeidNotBetween(String value1, String value2) {
            addCriterion("NEID not between", value1, value2, "neid");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagIsNull() {
            addCriterion("AUTOFILLINGFLAG is null");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagIsNotNull() {
            addCriterion("AUTOFILLINGFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagEqualTo(BigDecimal value) {
            addCriterion("AUTOFILLINGFLAG =", value, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagNotEqualTo(BigDecimal value) {
            addCriterion("AUTOFILLINGFLAG <>", value, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagGreaterThan(BigDecimal value) {
            addCriterion("AUTOFILLINGFLAG >", value, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOFILLINGFLAG >=", value, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagLessThan(BigDecimal value) {
            addCriterion("AUTOFILLINGFLAG <", value, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOFILLINGFLAG <=", value, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagIn(List<BigDecimal> values) {
            addCriterion("AUTOFILLINGFLAG in", values, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagNotIn(List<BigDecimal> values) {
            addCriterion("AUTOFILLINGFLAG not in", values, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOFILLINGFLAG between", value1, value2, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andAutofillingflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOFILLINGFLAG not between", value1, value2, "autofillingflag");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureIsNull() {
            addCriterion("ISEXISTCHECKFAILURE is null");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureIsNotNull() {
            addCriterion("ISEXISTCHECKFAILURE is not null");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureEqualTo(BigDecimal value) {
            addCriterion("ISEXISTCHECKFAILURE =", value, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureNotEqualTo(BigDecimal value) {
            addCriterion("ISEXISTCHECKFAILURE <>", value, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureGreaterThan(BigDecimal value) {
            addCriterion("ISEXISTCHECKFAILURE >", value, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISEXISTCHECKFAILURE >=", value, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureLessThan(BigDecimal value) {
            addCriterion("ISEXISTCHECKFAILURE <", value, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISEXISTCHECKFAILURE <=", value, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureIn(List<BigDecimal> values) {
            addCriterion("ISEXISTCHECKFAILURE in", values, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureNotIn(List<BigDecimal> values) {
            addCriterion("ISEXISTCHECKFAILURE not in", values, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISEXISTCHECKFAILURE between", value1, value2, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andIsexistcheckfailureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISEXISTCHECKFAILURE not between", value1, value2, "isexistcheckfailure");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagIsNull() {
            addCriterion("CHECKPASSFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagIsNotNull() {
            addCriterion("CHECKPASSFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagEqualTo(BigDecimal value) {
            addCriterion("CHECKPASSFLAG =", value, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagNotEqualTo(BigDecimal value) {
            addCriterion("CHECKPASSFLAG <>", value, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagGreaterThan(BigDecimal value) {
            addCriterion("CHECKPASSFLAG >", value, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKPASSFLAG >=", value, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagLessThan(BigDecimal value) {
            addCriterion("CHECKPASSFLAG <", value, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKPASSFLAG <=", value, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagIn(List<BigDecimal> values) {
            addCriterion("CHECKPASSFLAG in", values, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagNotIn(List<BigDecimal> values) {
            addCriterion("CHECKPASSFLAG not in", values, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKPASSFLAG between", value1, value2, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andCheckpassflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKPASSFLAG not between", value1, value2, "checkpassflag");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("TASKID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("TASKID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("TASKID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("TASKID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("TASKID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("TASKID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("TASKID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("TASKID like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("TASKID not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("TASKID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("TASKID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("TASKID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("TASKID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitIsNull() {
            addCriterion("TEMPAFFIRMTIMELIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitIsNotNull() {
            addCriterion("TEMPAFFIRMTIMELIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitEqualTo(Date value) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT =", value, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT <>", value, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitGreaterThan(Date value) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT >", value, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT >=", value, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitLessThan(Date value) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT <", value, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT <=", value, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitIn(List<Date> values) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT in", values, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT not in", values, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT between", value1, value2, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andTempaffirmtimelimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEMPAFFIRMTIMELIMIT not between", value1, value2, "tempaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsIsNull() {
            addCriterion("ISSENDTOACMS is null");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsIsNotNull() {
            addCriterion("ISSENDTOACMS is not null");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsEqualTo(BigDecimal value) {
            addCriterion("ISSENDTOACMS =", value, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsNotEqualTo(BigDecimal value) {
            addCriterion("ISSENDTOACMS <>", value, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsGreaterThan(BigDecimal value) {
            addCriterion("ISSENDTOACMS >", value, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSENDTOACMS >=", value, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsLessThan(BigDecimal value) {
            addCriterion("ISSENDTOACMS <", value, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSENDTOACMS <=", value, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsIn(List<BigDecimal> values) {
            addCriterion("ISSENDTOACMS in", values, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsNotIn(List<BigDecimal> values) {
            addCriterion("ISSENDTOACMS not in", values, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSENDTOACMS between", value1, value2, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andIssendtoacmsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSENDTOACMS not between", value1, value2, "issendtoacms");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaIsNull() {
            addCriterion("SENDACMSAREA is null");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaIsNotNull() {
            addCriterion("SENDACMSAREA is not null");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaEqualTo(String value) {
            addCriterion("SENDACMSAREA =", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaNotEqualTo(String value) {
            addCriterion("SENDACMSAREA <>", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaGreaterThan(String value) {
            addCriterion("SENDACMSAREA >", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaGreaterThanOrEqualTo(String value) {
            addCriterion("SENDACMSAREA >=", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaLessThan(String value) {
            addCriterion("SENDACMSAREA <", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaLessThanOrEqualTo(String value) {
            addCriterion("SENDACMSAREA <=", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaLike(String value) {
            addCriterion("SENDACMSAREA like", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaNotLike(String value) {
            addCriterion("SENDACMSAREA not like", value, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaIn(List<String> values) {
            addCriterion("SENDACMSAREA in", values, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaNotIn(List<String> values) {
            addCriterion("SENDACMSAREA not in", values, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaBetween(String value1, String value2) {
            addCriterion("SENDACMSAREA between", value1, value2, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andSendacmsareaNotBetween(String value1, String value2) {
            addCriterion("SENDACMSAREA not between", value1, value2, "sendacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaIsNull() {
            addCriterion("REPLYACMSAREA is null");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaIsNotNull() {
            addCriterion("REPLYACMSAREA is not null");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaEqualTo(String value) {
            addCriterion("REPLYACMSAREA =", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaNotEqualTo(String value) {
            addCriterion("REPLYACMSAREA <>", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaGreaterThan(String value) {
            addCriterion("REPLYACMSAREA >", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYACMSAREA >=", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaLessThan(String value) {
            addCriterion("REPLYACMSAREA <", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaLessThanOrEqualTo(String value) {
            addCriterion("REPLYACMSAREA <=", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaLike(String value) {
            addCriterion("REPLYACMSAREA like", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaNotLike(String value) {
            addCriterion("REPLYACMSAREA not like", value, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaIn(List<String> values) {
            addCriterion("REPLYACMSAREA in", values, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaNotIn(List<String> values) {
            addCriterion("REPLYACMSAREA not in", values, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaBetween(String value1, String value2) {
            addCriterion("REPLYACMSAREA between", value1, value2, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andReplyacmsareaNotBetween(String value1, String value2) {
            addCriterion("REPLYACMSAREA not between", value1, value2, "replyacmsarea");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitIsNull() {
            addCriterion("T2FIRSTAFFIRMTIMELIMIT is null");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitIsNotNull() {
            addCriterion("T2FIRSTAFFIRMTIMELIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitEqualTo(Date value) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT =", value, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT <>", value, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitGreaterThan(Date value) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT >", value, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT >=", value, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitLessThan(Date value) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT <", value, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT <=", value, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitIn(List<Date> values) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT in", values, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT not in", values, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT between", value1, value2, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmtimelimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2FIRSTAFFIRMTIMELIMIT not between", value1, value2, "t2firstaffirmtimelimit");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptIsNull() {
            addCriterion("T1FIRSTAFFIRMDEPT is null");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptIsNotNull() {
            addCriterion("T1FIRSTAFFIRMDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptEqualTo(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT =", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptNotEqualTo(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT <>", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptGreaterThan(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT >", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptGreaterThanOrEqualTo(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT >=", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptLessThan(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT <", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptLessThanOrEqualTo(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT <=", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptLike(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT like", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptNotLike(String value) {
            addCriterion("T1FIRSTAFFIRMDEPT not like", value, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptIn(List<String> values) {
            addCriterion("T1FIRSTAFFIRMDEPT in", values, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptNotIn(List<String> values) {
            addCriterion("T1FIRSTAFFIRMDEPT not in", values, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptBetween(String value1, String value2) {
            addCriterion("T1FIRSTAFFIRMDEPT between", value1, value2, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT1firstaffirmdeptNotBetween(String value1, String value2) {
            addCriterion("T1FIRSTAFFIRMDEPT not between", value1, value2, "t1firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptIsNull() {
            addCriterion("T2FIRSTAFFIRMDEPT is null");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptIsNotNull() {
            addCriterion("T2FIRSTAFFIRMDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptEqualTo(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT =", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptNotEqualTo(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT <>", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptGreaterThan(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT >", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptGreaterThanOrEqualTo(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT >=", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptLessThan(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT <", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptLessThanOrEqualTo(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT <=", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptLike(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT like", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptNotLike(String value) {
            addCriterion("T2FIRSTAFFIRMDEPT not like", value, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptIn(List<String> values) {
            addCriterion("T2FIRSTAFFIRMDEPT in", values, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptNotIn(List<String> values) {
            addCriterion("T2FIRSTAFFIRMDEPT not in", values, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptBetween(String value1, String value2) {
            addCriterion("T2FIRSTAFFIRMDEPT between", value1, value2, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andT2firstaffirmdeptNotBetween(String value1, String value2) {
            addCriterion("T2FIRSTAFFIRMDEPT not between", value1, value2, "t2firstaffirmdept");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberIsNull() {
            addCriterion("ISSENDACMSNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberIsNotNull() {
            addCriterion("ISSENDACMSNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberEqualTo(String value) {
            addCriterion("ISSENDACMSNUMBER =", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberNotEqualTo(String value) {
            addCriterion("ISSENDACMSNUMBER <>", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberGreaterThan(String value) {
            addCriterion("ISSENDACMSNUMBER >", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ISSENDACMSNUMBER >=", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberLessThan(String value) {
            addCriterion("ISSENDACMSNUMBER <", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberLessThanOrEqualTo(String value) {
            addCriterion("ISSENDACMSNUMBER <=", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberLike(String value) {
            addCriterion("ISSENDACMSNUMBER like", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberNotLike(String value) {
            addCriterion("ISSENDACMSNUMBER not like", value, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberIn(List<String> values) {
            addCriterion("ISSENDACMSNUMBER in", values, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberNotIn(List<String> values) {
            addCriterion("ISSENDACMSNUMBER not in", values, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberBetween(String value1, String value2) {
            addCriterion("ISSENDACMSNUMBER between", value1, value2, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andIssendacmsnumberNotBetween(String value1, String value2) {
            addCriterion("ISSENDACMSNUMBER not between", value1, value2, "issendacmsnumber");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameIsNull() {
            addCriterion("REPLYACMSNAME is null");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameIsNotNull() {
            addCriterion("REPLYACMSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameEqualTo(String value) {
            addCriterion("REPLYACMSNAME =", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameNotEqualTo(String value) {
            addCriterion("REPLYACMSNAME <>", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameGreaterThan(String value) {
            addCriterion("REPLYACMSNAME >", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYACMSNAME >=", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameLessThan(String value) {
            addCriterion("REPLYACMSNAME <", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameLessThanOrEqualTo(String value) {
            addCriterion("REPLYACMSNAME <=", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameLike(String value) {
            addCriterion("REPLYACMSNAME like", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameNotLike(String value) {
            addCriterion("REPLYACMSNAME not like", value, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameIn(List<String> values) {
            addCriterion("REPLYACMSNAME in", values, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameNotIn(List<String> values) {
            addCriterion("REPLYACMSNAME not in", values, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameBetween(String value1, String value2) {
            addCriterion("REPLYACMSNAME between", value1, value2, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andReplyacmsnameNotBetween(String value1, String value2) {
            addCriterion("REPLYACMSNAME not between", value1, value2, "replyacmsname");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagIsNull() {
            addCriterion("ACMSDELAYTIMEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagIsNotNull() {
            addCriterion("ACMSDELAYTIMEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagEqualTo(BigDecimal value) {
            addCriterion("ACMSDELAYTIMEFLAG =", value, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagNotEqualTo(BigDecimal value) {
            addCriterion("ACMSDELAYTIMEFLAG <>", value, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagGreaterThan(BigDecimal value) {
            addCriterion("ACMSDELAYTIMEFLAG >", value, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACMSDELAYTIMEFLAG >=", value, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagLessThan(BigDecimal value) {
            addCriterion("ACMSDELAYTIMEFLAG <", value, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACMSDELAYTIMEFLAG <=", value, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagIn(List<BigDecimal> values) {
            addCriterion("ACMSDELAYTIMEFLAG in", values, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagNotIn(List<BigDecimal> values) {
            addCriterion("ACMSDELAYTIMEFLAG not in", values, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACMSDELAYTIMEFLAG between", value1, value2, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andAcmsdelaytimeflagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACMSDELAYTIMEFLAG not between", value1, value2, "acmsdelaytimeflag");
            return (Criteria) this;
        }

        public Criteria andApplydalystateIsNull() {
            addCriterion("APPLYDALYSTATE is null");
            return (Criteria) this;
        }

        public Criteria andApplydalystateIsNotNull() {
            addCriterion("APPLYDALYSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplydalystateEqualTo(String value) {
            addCriterion("APPLYDALYSTATE =", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateNotEqualTo(String value) {
            addCriterion("APPLYDALYSTATE <>", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateGreaterThan(String value) {
            addCriterion("APPLYDALYSTATE >", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDALYSTATE >=", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateLessThan(String value) {
            addCriterion("APPLYDALYSTATE <", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateLessThanOrEqualTo(String value) {
            addCriterion("APPLYDALYSTATE <=", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateLike(String value) {
            addCriterion("APPLYDALYSTATE like", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateNotLike(String value) {
            addCriterion("APPLYDALYSTATE not like", value, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateIn(List<String> values) {
            addCriterion("APPLYDALYSTATE in", values, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateNotIn(List<String> values) {
            addCriterion("APPLYDALYSTATE not in", values, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateBetween(String value1, String value2) {
            addCriterion("APPLYDALYSTATE between", value1, value2, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andApplydalystateNotBetween(String value1, String value2) {
            addCriterion("APPLYDALYSTATE not between", value1, value2, "applydalystate");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsIsNull() {
            addCriterion("ISAUTOSENDACMS is null");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsIsNotNull() {
            addCriterion("ISAUTOSENDACMS is not null");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsEqualTo(String value) {
            addCriterion("ISAUTOSENDACMS =", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsNotEqualTo(String value) {
            addCriterion("ISAUTOSENDACMS <>", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsGreaterThan(String value) {
            addCriterion("ISAUTOSENDACMS >", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsGreaterThanOrEqualTo(String value) {
            addCriterion("ISAUTOSENDACMS >=", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsLessThan(String value) {
            addCriterion("ISAUTOSENDACMS <", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsLessThanOrEqualTo(String value) {
            addCriterion("ISAUTOSENDACMS <=", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsLike(String value) {
            addCriterion("ISAUTOSENDACMS like", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsNotLike(String value) {
            addCriterion("ISAUTOSENDACMS not like", value, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsIn(List<String> values) {
            addCriterion("ISAUTOSENDACMS in", values, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsNotIn(List<String> values) {
            addCriterion("ISAUTOSENDACMS not in", values, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsBetween(String value1, String value2) {
            addCriterion("ISAUTOSENDACMS between", value1, value2, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andIsautosendacmsNotBetween(String value1, String value2) {
            addCriterion("ISAUTOSENDACMS not between", value1, value2, "isautosendacms");
            return (Criteria) this;
        }

        public Criteria andDealdeptIsNull() {
            addCriterion("DEALDEPT is null");
            return (Criteria) this;
        }

        public Criteria andDealdeptIsNotNull() {
            addCriterion("DEALDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDealdeptEqualTo(String value) {
            addCriterion("DEALDEPT =", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptNotEqualTo(String value) {
            addCriterion("DEALDEPT <>", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptGreaterThan(String value) {
            addCriterion("DEALDEPT >", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptGreaterThanOrEqualTo(String value) {
            addCriterion("DEALDEPT >=", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptLessThan(String value) {
            addCriterion("DEALDEPT <", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptLessThanOrEqualTo(String value) {
            addCriterion("DEALDEPT <=", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptLike(String value) {
            addCriterion("DEALDEPT like", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptNotLike(String value) {
            addCriterion("DEALDEPT not like", value, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptIn(List<String> values) {
            addCriterion("DEALDEPT in", values, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptNotIn(List<String> values) {
            addCriterion("DEALDEPT not in", values, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptBetween(String value1, String value2) {
            addCriterion("DEALDEPT between", value1, value2, "dealdept");
            return (Criteria) this;
        }

        public Criteria andDealdeptNotBetween(String value1, String value2) {
            addCriterion("DEALDEPT not between", value1, value2, "dealdept");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeIsNull() {
            addCriterion("WORKSHEETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeIsNotNull() {
            addCriterion("WORKSHEETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeEqualTo(String value) {
            addCriterion("WORKSHEETTYPE =", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeNotEqualTo(String value) {
            addCriterion("WORKSHEETTYPE <>", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeGreaterThan(String value) {
            addCriterion("WORKSHEETTYPE >", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSHEETTYPE >=", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeLessThan(String value) {
            addCriterion("WORKSHEETTYPE <", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeLessThanOrEqualTo(String value) {
            addCriterion("WORKSHEETTYPE <=", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeLike(String value) {
            addCriterion("WORKSHEETTYPE like", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeNotLike(String value) {
            addCriterion("WORKSHEETTYPE not like", value, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeIn(List<String> values) {
            addCriterion("WORKSHEETTYPE in", values, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeNotIn(List<String> values) {
            addCriterion("WORKSHEETTYPE not in", values, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeBetween(String value1, String value2) {
            addCriterion("WORKSHEETTYPE between", value1, value2, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andWorksheettypeNotBetween(String value1, String value2) {
            addCriterion("WORKSHEETTYPE not between", value1, value2, "worksheettype");
            return (Criteria) this;
        }

        public Criteria andServicelevelIsNull() {
            addCriterion("SERVICELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andServicelevelIsNotNull() {
            addCriterion("SERVICELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andServicelevelEqualTo(String value) {
            addCriterion("SERVICELEVEL =", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelNotEqualTo(String value) {
            addCriterion("SERVICELEVEL <>", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelGreaterThan(String value) {
            addCriterion("SERVICELEVEL >", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICELEVEL >=", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelLessThan(String value) {
            addCriterion("SERVICELEVEL <", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelLessThanOrEqualTo(String value) {
            addCriterion("SERVICELEVEL <=", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelLike(String value) {
            addCriterion("SERVICELEVEL like", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelNotLike(String value) {
            addCriterion("SERVICELEVEL not like", value, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelIn(List<String> values) {
            addCriterion("SERVICELEVEL in", values, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelNotIn(List<String> values) {
            addCriterion("SERVICELEVEL not in", values, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelBetween(String value1, String value2) {
            addCriterion("SERVICELEVEL between", value1, value2, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andServicelevelNotBetween(String value1, String value2) {
            addCriterion("SERVICELEVEL not between", value1, value2, "servicelevel");
            return (Criteria) this;
        }

        public Criteria andAlertdealIsNull() {
            addCriterion("ALERTDEAL is null");
            return (Criteria) this;
        }

        public Criteria andAlertdealIsNotNull() {
            addCriterion("ALERTDEAL is not null");
            return (Criteria) this;
        }

        public Criteria andAlertdealEqualTo(String value) {
            addCriterion("ALERTDEAL =", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealNotEqualTo(String value) {
            addCriterion("ALERTDEAL <>", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealGreaterThan(String value) {
            addCriterion("ALERTDEAL >", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealGreaterThanOrEqualTo(String value) {
            addCriterion("ALERTDEAL >=", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealLessThan(String value) {
            addCriterion("ALERTDEAL <", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealLessThanOrEqualTo(String value) {
            addCriterion("ALERTDEAL <=", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealLike(String value) {
            addCriterion("ALERTDEAL like", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealNotLike(String value) {
            addCriterion("ALERTDEAL not like", value, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealIn(List<String> values) {
            addCriterion("ALERTDEAL in", values, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealNotIn(List<String> values) {
            addCriterion("ALERTDEAL not in", values, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealBetween(String value1, String value2) {
            addCriterion("ALERTDEAL between", value1, value2, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlertdealNotBetween(String value1, String value2) {
            addCriterion("ALERTDEAL not between", value1, value2, "alertdeal");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeIsNull() {
            addCriterion("ALARMCODE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeIsNotNull() {
            addCriterion("ALARMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeEqualTo(String value) {
            addCriterion("ALARMCODE =", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeNotEqualTo(String value) {
            addCriterion("ALARMCODE <>", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeGreaterThan(String value) {
            addCriterion("ALARMCODE >", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMCODE >=", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeLessThan(String value) {
            addCriterion("ALARMCODE <", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeLessThanOrEqualTo(String value) {
            addCriterion("ALARMCODE <=", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeLike(String value) {
            addCriterion("ALARMCODE like", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeNotLike(String value) {
            addCriterion("ALARMCODE not like", value, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeIn(List<String> values) {
            addCriterion("ALARMCODE in", values, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeNotIn(List<String> values) {
            addCriterion("ALARMCODE not in", values, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeBetween(String value1, String value2) {
            addCriterion("ALARMCODE between", value1, value2, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andAlarmcodeNotBetween(String value1, String value2) {
            addCriterion("ALARMCODE not between", value1, value2, "alarmcode");
            return (Criteria) this;
        }

        public Criteria andIssendokIsNull() {
            addCriterion("ISSENDOK is null");
            return (Criteria) this;
        }

        public Criteria andIssendokIsNotNull() {
            addCriterion("ISSENDOK is not null");
            return (Criteria) this;
        }

        public Criteria andIssendokEqualTo(BigDecimal value) {
            addCriterion("ISSENDOK =", value, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokNotEqualTo(BigDecimal value) {
            addCriterion("ISSENDOK <>", value, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokGreaterThan(BigDecimal value) {
            addCriterion("ISSENDOK >", value, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSENDOK >=", value, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokLessThan(BigDecimal value) {
            addCriterion("ISSENDOK <", value, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSENDOK <=", value, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokIn(List<BigDecimal> values) {
            addCriterion("ISSENDOK in", values, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokNotIn(List<BigDecimal> values) {
            addCriterion("ISSENDOK not in", values, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSENDOK between", value1, value2, "issendok");
            return (Criteria) this;
        }

        public Criteria andIssendokNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSENDOK not between", value1, value2, "issendok");
            return (Criteria) this;
        }

        public Criteria andSendinvalidIsNull() {
            addCriterion("SENDINVALID is null");
            return (Criteria) this;
        }

        public Criteria andSendinvalidIsNotNull() {
            addCriterion("SENDINVALID is not null");
            return (Criteria) this;
        }

        public Criteria andSendinvalidEqualTo(String value) {
            addCriterion("SENDINVALID =", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidNotEqualTo(String value) {
            addCriterion("SENDINVALID <>", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidGreaterThan(String value) {
            addCriterion("SENDINVALID >", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidGreaterThanOrEqualTo(String value) {
            addCriterion("SENDINVALID >=", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidLessThan(String value) {
            addCriterion("SENDINVALID <", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidLessThanOrEqualTo(String value) {
            addCriterion("SENDINVALID <=", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidLike(String value) {
            addCriterion("SENDINVALID like", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidNotLike(String value) {
            addCriterion("SENDINVALID not like", value, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidIn(List<String> values) {
            addCriterion("SENDINVALID in", values, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidNotIn(List<String> values) {
            addCriterion("SENDINVALID not in", values, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidBetween(String value1, String value2) {
            addCriterion("SENDINVALID between", value1, value2, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andSendinvalidNotBetween(String value1, String value2) {
            addCriterion("SENDINVALID not between", value1, value2, "sendinvalid");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveIsNull() {
            addCriterion("ACMSRECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveIsNotNull() {
            addCriterion("ACMSRECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveEqualTo(String value) {
            addCriterion("ACMSRECEIVE =", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveNotEqualTo(String value) {
            addCriterion("ACMSRECEIVE <>", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveGreaterThan(String value) {
            addCriterion("ACMSRECEIVE >", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveGreaterThanOrEqualTo(String value) {
            addCriterion("ACMSRECEIVE >=", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveLessThan(String value) {
            addCriterion("ACMSRECEIVE <", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveLessThanOrEqualTo(String value) {
            addCriterion("ACMSRECEIVE <=", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveLike(String value) {
            addCriterion("ACMSRECEIVE like", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveNotLike(String value) {
            addCriterion("ACMSRECEIVE not like", value, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveIn(List<String> values) {
            addCriterion("ACMSRECEIVE in", values, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveNotIn(List<String> values) {
            addCriterion("ACMSRECEIVE not in", values, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveBetween(String value1, String value2) {
            addCriterion("ACMSRECEIVE between", value1, value2, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andAcmsreceiveNotBetween(String value1, String value2) {
            addCriterion("ACMSRECEIVE not between", value1, value2, "acmsreceive");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DEPTID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DEPTID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andPredealIsNull() {
            addCriterion("PREDEAL is null");
            return (Criteria) this;
        }

        public Criteria andPredealIsNotNull() {
            addCriterion("PREDEAL is not null");
            return (Criteria) this;
        }

        public Criteria andPredealEqualTo(String value) {
            addCriterion("PREDEAL =", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealNotEqualTo(String value) {
            addCriterion("PREDEAL <>", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealGreaterThan(String value) {
            addCriterion("PREDEAL >", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealGreaterThanOrEqualTo(String value) {
            addCriterion("PREDEAL >=", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealLessThan(String value) {
            addCriterion("PREDEAL <", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealLessThanOrEqualTo(String value) {
            addCriterion("PREDEAL <=", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealLike(String value) {
            addCriterion("PREDEAL like", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealNotLike(String value) {
            addCriterion("PREDEAL not like", value, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealIn(List<String> values) {
            addCriterion("PREDEAL in", values, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealNotIn(List<String> values) {
            addCriterion("PREDEAL not in", values, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealBetween(String value1, String value2) {
            addCriterion("PREDEAL between", value1, value2, "predeal");
            return (Criteria) this;
        }

        public Criteria andPredealNotBetween(String value1, String value2) {
            addCriterion("PREDEAL not between", value1, value2, "predeal");
            return (Criteria) this;
        }

        public Criteria andDisposelevelIsNull() {
            addCriterion("DISPOSELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDisposelevelIsNotNull() {
            addCriterion("DISPOSELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDisposelevelEqualTo(String value) {
            addCriterion("DISPOSELEVEL =", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelNotEqualTo(String value) {
            addCriterion("DISPOSELEVEL <>", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelGreaterThan(String value) {
            addCriterion("DISPOSELEVEL >", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelGreaterThanOrEqualTo(String value) {
            addCriterion("DISPOSELEVEL >=", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelLessThan(String value) {
            addCriterion("DISPOSELEVEL <", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelLessThanOrEqualTo(String value) {
            addCriterion("DISPOSELEVEL <=", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelLike(String value) {
            addCriterion("DISPOSELEVEL like", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelNotLike(String value) {
            addCriterion("DISPOSELEVEL not like", value, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelIn(List<String> values) {
            addCriterion("DISPOSELEVEL in", values, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelNotIn(List<String> values) {
            addCriterion("DISPOSELEVEL not in", values, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelBetween(String value1, String value2) {
            addCriterion("DISPOSELEVEL between", value1, value2, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andDisposelevelNotBetween(String value1, String value2) {
            addCriterion("DISPOSELEVEL not between", value1, value2, "disposelevel");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagIsNull() {
            addCriterion("AUTOREPLYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagIsNotNull() {
            addCriterion("AUTOREPLYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagEqualTo(String value) {
            addCriterion("AUTOREPLYFLAG =", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagNotEqualTo(String value) {
            addCriterion("AUTOREPLYFLAG <>", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagGreaterThan(String value) {
            addCriterion("AUTOREPLYFLAG >", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagGreaterThanOrEqualTo(String value) {
            addCriterion("AUTOREPLYFLAG >=", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagLessThan(String value) {
            addCriterion("AUTOREPLYFLAG <", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagLessThanOrEqualTo(String value) {
            addCriterion("AUTOREPLYFLAG <=", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagLike(String value) {
            addCriterion("AUTOREPLYFLAG like", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagNotLike(String value) {
            addCriterion("AUTOREPLYFLAG not like", value, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagIn(List<String> values) {
            addCriterion("AUTOREPLYFLAG in", values, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagNotIn(List<String> values) {
            addCriterion("AUTOREPLYFLAG not in", values, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagBetween(String value1, String value2) {
            addCriterion("AUTOREPLYFLAG between", value1, value2, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andAutoreplyflagNotBetween(String value1, String value2) {
            addCriterion("AUTOREPLYFLAG not between", value1, value2, "autoreplyflag");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeIsNull() {
            addCriterion("SENDACMSTIME is null");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeIsNotNull() {
            addCriterion("SENDACMSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeEqualTo(Date value) {
            addCriterionForJDBCDate("SENDACMSTIME =", value, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SENDACMSTIME <>", value, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SENDACMSTIME >", value, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SENDACMSTIME >=", value, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeLessThan(Date value) {
            addCriterionForJDBCDate("SENDACMSTIME <", value, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SENDACMSTIME <=", value, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeIn(List<Date> values) {
            addCriterionForJDBCDate("SENDACMSTIME in", values, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SENDACMSTIME not in", values, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SENDACMSTIME between", value1, value2, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andSendacmstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SENDACMSTIME not between", value1, value2, "sendacmstime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeIsNull() {
            addCriterion("ACMSREPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeIsNotNull() {
            addCriterion("ACMSREPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeEqualTo(Date value) {
            addCriterionForJDBCDate("ACMSREPLYTIME =", value, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACMSREPLYTIME <>", value, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ACMSREPLYTIME >", value, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACMSREPLYTIME >=", value, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeLessThan(Date value) {
            addCriterionForJDBCDate("ACMSREPLYTIME <", value, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACMSREPLYTIME <=", value, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeIn(List<Date> values) {
            addCriterionForJDBCDate("ACMSREPLYTIME in", values, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACMSREPLYTIME not in", values, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACMSREPLYTIME between", value1, value2, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplytimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACMSREPLYTIME not between", value1, value2, "acmsreplytime");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserIsNull() {
            addCriterion("ACMSREPLYUSER is null");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserIsNotNull() {
            addCriterion("ACMSREPLYUSER is not null");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserEqualTo(String value) {
            addCriterion("ACMSREPLYUSER =", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserNotEqualTo(String value) {
            addCriterion("ACMSREPLYUSER <>", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserGreaterThan(String value) {
            addCriterion("ACMSREPLYUSER >", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserGreaterThanOrEqualTo(String value) {
            addCriterion("ACMSREPLYUSER >=", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserLessThan(String value) {
            addCriterion("ACMSREPLYUSER <", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserLessThanOrEqualTo(String value) {
            addCriterion("ACMSREPLYUSER <=", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserLike(String value) {
            addCriterion("ACMSREPLYUSER like", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserNotLike(String value) {
            addCriterion("ACMSREPLYUSER not like", value, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserIn(List<String> values) {
            addCriterion("ACMSREPLYUSER in", values, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserNotIn(List<String> values) {
            addCriterion("ACMSREPLYUSER not in", values, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserBetween(String value1, String value2) {
            addCriterion("ACMSREPLYUSER between", value1, value2, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplyuserNotBetween(String value1, String value2) {
            addCriterion("ACMSREPLYUSER not between", value1, value2, "acmsreplyuser");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptIsNull() {
            addCriterion("ACMSREPLYDEPT is null");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptIsNotNull() {
            addCriterion("ACMSREPLYDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptEqualTo(String value) {
            addCriterion("ACMSREPLYDEPT =", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptNotEqualTo(String value) {
            addCriterion("ACMSREPLYDEPT <>", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptGreaterThan(String value) {
            addCriterion("ACMSREPLYDEPT >", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptGreaterThanOrEqualTo(String value) {
            addCriterion("ACMSREPLYDEPT >=", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptLessThan(String value) {
            addCriterion("ACMSREPLYDEPT <", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptLessThanOrEqualTo(String value) {
            addCriterion("ACMSREPLYDEPT <=", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptLike(String value) {
            addCriterion("ACMSREPLYDEPT like", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptNotLike(String value) {
            addCriterion("ACMSREPLYDEPT not like", value, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptIn(List<String> values) {
            addCriterion("ACMSREPLYDEPT in", values, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptNotIn(List<String> values) {
            addCriterion("ACMSREPLYDEPT not in", values, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptBetween(String value1, String value2) {
            addCriterion("ACMSREPLYDEPT between", value1, value2, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andAcmsreplydeptNotBetween(String value1, String value2) {
            addCriterion("ACMSREPLYDEPT not between", value1, value2, "acmsreplydept");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeIsNull() {
            addCriterion("T1TRANSFERTIME is null");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeIsNotNull() {
            addCriterion("T1TRANSFERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeEqualTo(Date value) {
            addCriterionForJDBCDate("T1TRANSFERTIME =", value, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T1TRANSFERTIME <>", value, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T1TRANSFERTIME >", value, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1TRANSFERTIME >=", value, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeLessThan(Date value) {
            addCriterionForJDBCDate("T1TRANSFERTIME <", value, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T1TRANSFERTIME <=", value, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeIn(List<Date> values) {
            addCriterionForJDBCDate("T1TRANSFERTIME in", values, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T1TRANSFERTIME not in", values, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1TRANSFERTIME between", value1, value2, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT1transfertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T1TRANSFERTIME not between", value1, value2, "t1transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transferuserIsNull() {
            addCriterion("T2TRANSFERUSER is null");
            return (Criteria) this;
        }

        public Criteria andT2transferuserIsNotNull() {
            addCriterion("T2TRANSFERUSER is not null");
            return (Criteria) this;
        }

        public Criteria andT2transferuserEqualTo(String value) {
            addCriterion("T2TRANSFERUSER =", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserNotEqualTo(String value) {
            addCriterion("T2TRANSFERUSER <>", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserGreaterThan(String value) {
            addCriterion("T2TRANSFERUSER >", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserGreaterThanOrEqualTo(String value) {
            addCriterion("T2TRANSFERUSER >=", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserLessThan(String value) {
            addCriterion("T2TRANSFERUSER <", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserLessThanOrEqualTo(String value) {
            addCriterion("T2TRANSFERUSER <=", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserLike(String value) {
            addCriterion("T2TRANSFERUSER like", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserNotLike(String value) {
            addCriterion("T2TRANSFERUSER not like", value, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserIn(List<String> values) {
            addCriterion("T2TRANSFERUSER in", values, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserNotIn(List<String> values) {
            addCriterion("T2TRANSFERUSER not in", values, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserBetween(String value1, String value2) {
            addCriterion("T2TRANSFERUSER between", value1, value2, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferuserNotBetween(String value1, String value2) {
            addCriterion("T2TRANSFERUSER not between", value1, value2, "t2transferuser");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptIsNull() {
            addCriterion("T2TRANSFERDEPT is null");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptIsNotNull() {
            addCriterion("T2TRANSFERDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptEqualTo(String value) {
            addCriterion("T2TRANSFERDEPT =", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptNotEqualTo(String value) {
            addCriterion("T2TRANSFERDEPT <>", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptGreaterThan(String value) {
            addCriterion("T2TRANSFERDEPT >", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptGreaterThanOrEqualTo(String value) {
            addCriterion("T2TRANSFERDEPT >=", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptLessThan(String value) {
            addCriterion("T2TRANSFERDEPT <", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptLessThanOrEqualTo(String value) {
            addCriterion("T2TRANSFERDEPT <=", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptLike(String value) {
            addCriterion("T2TRANSFERDEPT like", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptNotLike(String value) {
            addCriterion("T2TRANSFERDEPT not like", value, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptIn(List<String> values) {
            addCriterion("T2TRANSFERDEPT in", values, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptNotIn(List<String> values) {
            addCriterion("T2TRANSFERDEPT not in", values, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptBetween(String value1, String value2) {
            addCriterion("T2TRANSFERDEPT between", value1, value2, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transferdeptNotBetween(String value1, String value2) {
            addCriterion("T2TRANSFERDEPT not between", value1, value2, "t2transferdept");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeIsNull() {
            addCriterion("T2TRANSFERTIME is null");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeIsNotNull() {
            addCriterion("T2TRANSFERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeEqualTo(Date value) {
            addCriterionForJDBCDate("T2TRANSFERTIME =", value, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("T2TRANSFERTIME <>", value, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeGreaterThan(Date value) {
            addCriterionForJDBCDate("T2TRANSFERTIME >", value, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2TRANSFERTIME >=", value, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeLessThan(Date value) {
            addCriterionForJDBCDate("T2TRANSFERTIME <", value, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("T2TRANSFERTIME <=", value, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeIn(List<Date> values) {
            addCriterionForJDBCDate("T2TRANSFERTIME in", values, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("T2TRANSFERTIME not in", values, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2TRANSFERTIME between", value1, value2, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andT2transfertimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("T2TRANSFERTIME not between", value1, value2, "t2transfertime");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryIsNull() {
            addCriterion("POWERFAULTFACTORY is null");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryIsNotNull() {
            addCriterion("POWERFAULTFACTORY is not null");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryEqualTo(String value) {
            addCriterion("POWERFAULTFACTORY =", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryNotEqualTo(String value) {
            addCriterion("POWERFAULTFACTORY <>", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryGreaterThan(String value) {
            addCriterion("POWERFAULTFACTORY >", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryGreaterThanOrEqualTo(String value) {
            addCriterion("POWERFAULTFACTORY >=", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryLessThan(String value) {
            addCriterion("POWERFAULTFACTORY <", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryLessThanOrEqualTo(String value) {
            addCriterion("POWERFAULTFACTORY <=", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryLike(String value) {
            addCriterion("POWERFAULTFACTORY like", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryNotLike(String value) {
            addCriterion("POWERFAULTFACTORY not like", value, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryIn(List<String> values) {
            addCriterion("POWERFAULTFACTORY in", values, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryNotIn(List<String> values) {
            addCriterion("POWERFAULTFACTORY not in", values, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryBetween(String value1, String value2) {
            addCriterion("POWERFAULTFACTORY between", value1, value2, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultfactoryNotBetween(String value1, String value2) {
            addCriterion("POWERFAULTFACTORY not between", value1, value2, "powerfaultfactory");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailIsNull() {
            addCriterion("POWERFAULTDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailIsNotNull() {
            addCriterion("POWERFAULTDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailEqualTo(String value) {
            addCriterion("POWERFAULTDETAIL =", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailNotEqualTo(String value) {
            addCriterion("POWERFAULTDETAIL <>", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailGreaterThan(String value) {
            addCriterion("POWERFAULTDETAIL >", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailGreaterThanOrEqualTo(String value) {
            addCriterion("POWERFAULTDETAIL >=", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailLessThan(String value) {
            addCriterion("POWERFAULTDETAIL <", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailLessThanOrEqualTo(String value) {
            addCriterion("POWERFAULTDETAIL <=", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailLike(String value) {
            addCriterion("POWERFAULTDETAIL like", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailNotLike(String value) {
            addCriterion("POWERFAULTDETAIL not like", value, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailIn(List<String> values) {
            addCriterion("POWERFAULTDETAIL in", values, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailNotIn(List<String> values) {
            addCriterion("POWERFAULTDETAIL not in", values, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailBetween(String value1, String value2) {
            addCriterion("POWERFAULTDETAIL between", value1, value2, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPowerfaultdetailNotBetween(String value1, String value2) {
            addCriterion("POWERFAULTDETAIL not between", value1, value2, "powerfaultdetail");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelIsNull() {
            addCriterion("PERFAULTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelIsNotNull() {
            addCriterion("PERFAULTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelEqualTo(String value) {
            addCriterion("PERFAULTLEVEL =", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelNotEqualTo(String value) {
            addCriterion("PERFAULTLEVEL <>", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelGreaterThan(String value) {
            addCriterion("PERFAULTLEVEL >", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelGreaterThanOrEqualTo(String value) {
            addCriterion("PERFAULTLEVEL >=", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelLessThan(String value) {
            addCriterion("PERFAULTLEVEL <", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelLessThanOrEqualTo(String value) {
            addCriterion("PERFAULTLEVEL <=", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelLike(String value) {
            addCriterion("PERFAULTLEVEL like", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelNotLike(String value) {
            addCriterion("PERFAULTLEVEL not like", value, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelIn(List<String> values) {
            addCriterion("PERFAULTLEVEL in", values, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelNotIn(List<String> values) {
            addCriterion("PERFAULTLEVEL not in", values, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelBetween(String value1, String value2) {
            addCriterion("PERFAULTLEVEL between", value1, value2, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andPerfaultlevelNotBetween(String value1, String value2) {
            addCriterion("PERFAULTLEVEL not between", value1, value2, "perfaultlevel");
            return (Criteria) this;
        }

        public Criteria andFaulttypeIsNull() {
            addCriterion("FAULTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFaulttypeIsNotNull() {
            addCriterion("FAULTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFaulttypeEqualTo(String value) {
            addCriterion("FAULTTYPE =", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotEqualTo(String value) {
            addCriterion("FAULTTYPE <>", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeGreaterThan(String value) {
            addCriterion("FAULTTYPE >", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTTYPE >=", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeLessThan(String value) {
            addCriterion("FAULTTYPE <", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeLessThanOrEqualTo(String value) {
            addCriterion("FAULTTYPE <=", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeLike(String value) {
            addCriterion("FAULTTYPE like", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotLike(String value) {
            addCriterion("FAULTTYPE not like", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeIn(List<String> values) {
            addCriterion("FAULTTYPE in", values, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotIn(List<String> values) {
            addCriterion("FAULTTYPE not in", values, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeBetween(String value1, String value2) {
            addCriterion("FAULTTYPE between", value1, value2, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotBetween(String value1, String value2) {
            addCriterion("FAULTTYPE not between", value1, value2, "faulttype");
            return (Criteria) this;
        }

        public Criteria andScenetypeIsNull() {
            addCriterion("SCENETYPE is null");
            return (Criteria) this;
        }

        public Criteria andScenetypeIsNotNull() {
            addCriterion("SCENETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andScenetypeEqualTo(String value) {
            addCriterion("SCENETYPE =", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotEqualTo(String value) {
            addCriterion("SCENETYPE <>", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeGreaterThan(String value) {
            addCriterion("SCENETYPE >", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SCENETYPE >=", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLessThan(String value) {
            addCriterion("SCENETYPE <", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLessThanOrEqualTo(String value) {
            addCriterion("SCENETYPE <=", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeLike(String value) {
            addCriterion("SCENETYPE like", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotLike(String value) {
            addCriterion("SCENETYPE not like", value, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeIn(List<String> values) {
            addCriterion("SCENETYPE in", values, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotIn(List<String> values) {
            addCriterion("SCENETYPE not in", values, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeBetween(String value1, String value2) {
            addCriterion("SCENETYPE between", value1, value2, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeNotBetween(String value1, String value2) {
            addCriterion("SCENETYPE not between", value1, value2, "scenetype");
            return (Criteria) this;
        }

        public Criteria andScenetypeseIsNull() {
            addCriterion("SCENETYPESE is null");
            return (Criteria) this;
        }

        public Criteria andScenetypeseIsNotNull() {
            addCriterion("SCENETYPESE is not null");
            return (Criteria) this;
        }

        public Criteria andScenetypeseEqualTo(String value) {
            addCriterion("SCENETYPESE =", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseNotEqualTo(String value) {
            addCriterion("SCENETYPESE <>", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseGreaterThan(String value) {
            addCriterion("SCENETYPESE >", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseGreaterThanOrEqualTo(String value) {
            addCriterion("SCENETYPESE >=", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseLessThan(String value) {
            addCriterion("SCENETYPESE <", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseLessThanOrEqualTo(String value) {
            addCriterion("SCENETYPESE <=", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseLike(String value) {
            addCriterion("SCENETYPESE like", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseNotLike(String value) {
            addCriterion("SCENETYPESE not like", value, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseIn(List<String> values) {
            addCriterion("SCENETYPESE in", values, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseNotIn(List<String> values) {
            addCriterion("SCENETYPESE not in", values, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseBetween(String value1, String value2) {
            addCriterion("SCENETYPESE between", value1, value2, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andScenetypeseNotBetween(String value1, String value2) {
            addCriterion("SCENETYPESE not between", value1, value2, "scenetypese");
            return (Criteria) this;
        }

        public Criteria andChecknameIsNull() {
            addCriterion("CHECKNAME is null");
            return (Criteria) this;
        }

        public Criteria andChecknameIsNotNull() {
            addCriterion("CHECKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andChecknameEqualTo(String value) {
            addCriterion("CHECKNAME =", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotEqualTo(String value) {
            addCriterion("CHECKNAME <>", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameGreaterThan(String value) {
            addCriterion("CHECKNAME >", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKNAME >=", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLessThan(String value) {
            addCriterion("CHECKNAME <", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLessThanOrEqualTo(String value) {
            addCriterion("CHECKNAME <=", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameLike(String value) {
            addCriterion("CHECKNAME like", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotLike(String value) {
            addCriterion("CHECKNAME not like", value, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameIn(List<String> values) {
            addCriterion("CHECKNAME in", values, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotIn(List<String> values) {
            addCriterion("CHECKNAME not in", values, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameBetween(String value1, String value2) {
            addCriterion("CHECKNAME between", value1, value2, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecknameNotBetween(String value1, String value2) {
            addCriterion("CHECKNAME not between", value1, value2, "checkname");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("CHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("CHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(String value) {
            addCriterion("CHECKTIME =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(String value) {
            addCriterion("CHECKTIME <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(String value) {
            addCriterion("CHECKTIME >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKTIME >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(String value) {
            addCriterion("CHECKTIME <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(String value) {
            addCriterion("CHECKTIME <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLike(String value) {
            addCriterion("CHECKTIME like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotLike(String value) {
            addCriterion("CHECKTIME not like", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<String> values) {
            addCriterion("CHECKTIME in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<String> values) {
            addCriterion("CHECKTIME not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(String value1, String value2) {
            addCriterion("CHECKTIME between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(String value1, String value2) {
            addCriterion("CHECKTIME not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecksummaryIsNull() {
            addCriterion("CHECKSUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andChecksummaryIsNotNull() {
            addCriterion("CHECKSUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andChecksummaryEqualTo(String value) {
            addCriterion("CHECKSUMMARY =", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryNotEqualTo(String value) {
            addCriterion("CHECKSUMMARY <>", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryGreaterThan(String value) {
            addCriterion("CHECKSUMMARY >", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSUMMARY >=", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryLessThan(String value) {
            addCriterion("CHECKSUMMARY <", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryLessThanOrEqualTo(String value) {
            addCriterion("CHECKSUMMARY <=", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryLike(String value) {
            addCriterion("CHECKSUMMARY like", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryNotLike(String value) {
            addCriterion("CHECKSUMMARY not like", value, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryIn(List<String> values) {
            addCriterion("CHECKSUMMARY in", values, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryNotIn(List<String> values) {
            addCriterion("CHECKSUMMARY not in", values, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryBetween(String value1, String value2) {
            addCriterion("CHECKSUMMARY between", value1, value2, "checksummary");
            return (Criteria) this;
        }

        public Criteria andChecksummaryNotBetween(String value1, String value2) {
            addCriterion("CHECKSUMMARY not between", value1, value2, "checksummary");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouIsNull() {
            addCriterion("ISSENDTOEMOU is null");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouIsNotNull() {
            addCriterion("ISSENDTOEMOU is not null");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouEqualTo(String value) {
            addCriterion("ISSENDTOEMOU =", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouNotEqualTo(String value) {
            addCriterion("ISSENDTOEMOU <>", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouGreaterThan(String value) {
            addCriterion("ISSENDTOEMOU >", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouGreaterThanOrEqualTo(String value) {
            addCriterion("ISSENDTOEMOU >=", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouLessThan(String value) {
            addCriterion("ISSENDTOEMOU <", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouLessThanOrEqualTo(String value) {
            addCriterion("ISSENDTOEMOU <=", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouLike(String value) {
            addCriterion("ISSENDTOEMOU like", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouNotLike(String value) {
            addCriterion("ISSENDTOEMOU not like", value, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouIn(List<String> values) {
            addCriterion("ISSENDTOEMOU in", values, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouNotIn(List<String> values) {
            addCriterion("ISSENDTOEMOU not in", values, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouBetween(String value1, String value2) {
            addCriterion("ISSENDTOEMOU between", value1, value2, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andIssendtoemouNotBetween(String value1, String value2) {
            addCriterion("ISSENDTOEMOU not between", value1, value2, "issendtoemou");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeIsNull() {
            addCriterion("SENDEMOUTIME is null");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeIsNotNull() {
            addCriterion("SENDEMOUTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeEqualTo(Date value) {
            addCriterionForJDBCDate("SENDEMOUTIME =", value, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SENDEMOUTIME <>", value, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SENDEMOUTIME >", value, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SENDEMOUTIME >=", value, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeLessThan(Date value) {
            addCriterionForJDBCDate("SENDEMOUTIME <", value, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SENDEMOUTIME <=", value, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeIn(List<Date> values) {
            addCriterionForJDBCDate("SENDEMOUTIME in", values, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SENDEMOUTIME not in", values, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SENDEMOUTIME between", value1, value2, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andSendemoutimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SENDEMOUTIME not between", value1, value2, "sendemoutime");
            return (Criteria) this;
        }

        public Criteria andEmouidIsNull() {
            addCriterion("EMOUID is null");
            return (Criteria) this;
        }

        public Criteria andEmouidIsNotNull() {
            addCriterion("EMOUID is not null");
            return (Criteria) this;
        }

        public Criteria andEmouidEqualTo(String value) {
            addCriterion("EMOUID =", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidNotEqualTo(String value) {
            addCriterion("EMOUID <>", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidGreaterThan(String value) {
            addCriterion("EMOUID >", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUID >=", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidLessThan(String value) {
            addCriterion("EMOUID <", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidLessThanOrEqualTo(String value) {
            addCriterion("EMOUID <=", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidLike(String value) {
            addCriterion("EMOUID like", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidNotLike(String value) {
            addCriterion("EMOUID not like", value, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidIn(List<String> values) {
            addCriterion("EMOUID in", values, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidNotIn(List<String> values) {
            addCriterion("EMOUID not in", values, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidBetween(String value1, String value2) {
            addCriterion("EMOUID between", value1, value2, "emouid");
            return (Criteria) this;
        }

        public Criteria andEmouidNotBetween(String value1, String value2) {
            addCriterion("EMOUID not between", value1, value2, "emouid");
            return (Criteria) this;
        }

        public Criteria andEcgiIsNull() {
            addCriterion("ECGI is null");
            return (Criteria) this;
        }

        public Criteria andEcgiIsNotNull() {
            addCriterion("ECGI is not null");
            return (Criteria) this;
        }

        public Criteria andEcgiEqualTo(String value) {
            addCriterion("ECGI =", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiNotEqualTo(String value) {
            addCriterion("ECGI <>", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiGreaterThan(String value) {
            addCriterion("ECGI >", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiGreaterThanOrEqualTo(String value) {
            addCriterion("ECGI >=", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiLessThan(String value) {
            addCriterion("ECGI <", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiLessThanOrEqualTo(String value) {
            addCriterion("ECGI <=", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiLike(String value) {
            addCriterion("ECGI like", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiNotLike(String value) {
            addCriterion("ECGI not like", value, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiIn(List<String> values) {
            addCriterion("ECGI in", values, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiNotIn(List<String> values) {
            addCriterion("ECGI not in", values, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiBetween(String value1, String value2) {
            addCriterion("ECGI between", value1, value2, "ecgi");
            return (Criteria) this;
        }

        public Criteria andEcgiNotBetween(String value1, String value2) {
            addCriterion("ECGI not between", value1, value2, "ecgi");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleIsNull() {
            addCriterion("ALARMTITLE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleIsNotNull() {
            addCriterion("ALARMTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleEqualTo(String value) {
            addCriterion("ALARMTITLE =", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleNotEqualTo(String value) {
            addCriterion("ALARMTITLE <>", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleGreaterThan(String value) {
            addCriterion("ALARMTITLE >", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMTITLE >=", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleLessThan(String value) {
            addCriterion("ALARMTITLE <", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleLessThanOrEqualTo(String value) {
            addCriterion("ALARMTITLE <=", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleLike(String value) {
            addCriterion("ALARMTITLE like", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleNotLike(String value) {
            addCriterion("ALARMTITLE not like", value, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleIn(List<String> values) {
            addCriterion("ALARMTITLE in", values, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleNotIn(List<String> values) {
            addCriterion("ALARMTITLE not in", values, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleBetween(String value1, String value2) {
            addCriterion("ALARMTITLE between", value1, value2, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmtitleNotBetween(String value1, String value2) {
            addCriterion("ALARMTITLE not between", value1, value2, "alarmtitle");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeIsNull() {
            addCriterion("ALARMCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeIsNotNull() {
            addCriterion("ALARMCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("ALARMCREATETIME =", value, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ALARMCREATETIME <>", value, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ALARMCREATETIME >", value, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALARMCREATETIME >=", value, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("ALARMCREATETIME <", value, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ALARMCREATETIME <=", value, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("ALARMCREATETIME in", values, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ALARMCREATETIME not in", values, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALARMCREATETIME between", value1, value2, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andAlarmcreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ALARMCREATETIME not between", value1, value2, "alarmcreatetime");
            return (Criteria) this;
        }

        public Criteria andNetypeIsNull() {
            addCriterion("NETYPE is null");
            return (Criteria) this;
        }

        public Criteria andNetypeIsNotNull() {
            addCriterion("NETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNetypeEqualTo(String value) {
            addCriterion("NETYPE =", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeNotEqualTo(String value) {
            addCriterion("NETYPE <>", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeGreaterThan(String value) {
            addCriterion("NETYPE >", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeGreaterThanOrEqualTo(String value) {
            addCriterion("NETYPE >=", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeLessThan(String value) {
            addCriterion("NETYPE <", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeLessThanOrEqualTo(String value) {
            addCriterion("NETYPE <=", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeLike(String value) {
            addCriterion("NETYPE like", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeNotLike(String value) {
            addCriterion("NETYPE not like", value, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeIn(List<String> values) {
            addCriterion("NETYPE in", values, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeNotIn(List<String> values) {
            addCriterion("NETYPE not in", values, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeBetween(String value1, String value2) {
            addCriterion("NETYPE between", value1, value2, "netype");
            return (Criteria) this;
        }

        public Criteria andNetypeNotBetween(String value1, String value2) {
            addCriterion("NETYPE not between", value1, value2, "netype");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorIsNull() {
            addCriterion("ALARMVENDOR is null");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorIsNotNull() {
            addCriterion("ALARMVENDOR is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorEqualTo(String value) {
            addCriterion("ALARMVENDOR =", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorNotEqualTo(String value) {
            addCriterion("ALARMVENDOR <>", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorGreaterThan(String value) {
            addCriterion("ALARMVENDOR >", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMVENDOR >=", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorLessThan(String value) {
            addCriterion("ALARMVENDOR <", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorLessThanOrEqualTo(String value) {
            addCriterion("ALARMVENDOR <=", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorLike(String value) {
            addCriterion("ALARMVENDOR like", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorNotLike(String value) {
            addCriterion("ALARMVENDOR not like", value, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorIn(List<String> values) {
            addCriterion("ALARMVENDOR in", values, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorNotIn(List<String> values) {
            addCriterion("ALARMVENDOR not in", values, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorBetween(String value1, String value2) {
            addCriterion("ALARMVENDOR between", value1, value2, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andAlarmvendorNotBetween(String value1, String value2) {
            addCriterion("ALARMVENDOR not between", value1, value2, "alarmvendor");
            return (Criteria) this;
        }

        public Criteria andEquiptypeIsNull() {
            addCriterion("EQUIPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEquiptypeIsNotNull() {
            addCriterion("EQUIPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEquiptypeEqualTo(String value) {
            addCriterion("EQUIPTYPE =", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeNotEqualTo(String value) {
            addCriterion("EQUIPTYPE <>", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeGreaterThan(String value) {
            addCriterion("EQUIPTYPE >", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPTYPE >=", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeLessThan(String value) {
            addCriterion("EQUIPTYPE <", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeLessThanOrEqualTo(String value) {
            addCriterion("EQUIPTYPE <=", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeLike(String value) {
            addCriterion("EQUIPTYPE like", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeNotLike(String value) {
            addCriterion("EQUIPTYPE not like", value, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeIn(List<String> values) {
            addCriterion("EQUIPTYPE in", values, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeNotIn(List<String> values) {
            addCriterion("EQUIPTYPE not in", values, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeBetween(String value1, String value2) {
            addCriterion("EQUIPTYPE between", value1, value2, "equiptype");
            return (Criteria) this;
        }

        public Criteria andEquiptypeNotBetween(String value1, String value2) {
            addCriterion("EQUIPTYPE not between", value1, value2, "equiptype");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelIsNull() {
            addCriterion("ALARMLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelIsNotNull() {
            addCriterion("ALARMLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelEqualTo(String value) {
            addCriterion("ALARMLEVEL =", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelNotEqualTo(String value) {
            addCriterion("ALARMLEVEL <>", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelGreaterThan(String value) {
            addCriterion("ALARMLEVEL >", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMLEVEL >=", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelLessThan(String value) {
            addCriterion("ALARMLEVEL <", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelLessThanOrEqualTo(String value) {
            addCriterion("ALARMLEVEL <=", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelLike(String value) {
            addCriterion("ALARMLEVEL like", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelNotLike(String value) {
            addCriterion("ALARMLEVEL not like", value, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelIn(List<String> values) {
            addCriterion("ALARMLEVEL in", values, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelNotIn(List<String> values) {
            addCriterion("ALARMLEVEL not in", values, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelBetween(String value1, String value2) {
            addCriterion("ALARMLEVEL between", value1, value2, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmlevelNotBetween(String value1, String value2) {
            addCriterion("ALARMLEVEL not between", value1, value2, "alarmlevel");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeIsNull() {
            addCriterion("ALARMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeIsNotNull() {
            addCriterion("ALARMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeEqualTo(String value) {
            addCriterion("ALARMTYPE =", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotEqualTo(String value) {
            addCriterion("ALARMTYPE <>", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeGreaterThan(String value) {
            addCriterion("ALARMTYPE >", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMTYPE >=", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeLessThan(String value) {
            addCriterion("ALARMTYPE <", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeLessThanOrEqualTo(String value) {
            addCriterion("ALARMTYPE <=", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeLike(String value) {
            addCriterion("ALARMTYPE like", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotLike(String value) {
            addCriterion("ALARMTYPE not like", value, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeIn(List<String> values) {
            addCriterion("ALARMTYPE in", values, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotIn(List<String> values) {
            addCriterion("ALARMTYPE not in", values, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeBetween(String value1, String value2) {
            addCriterion("ALARMTYPE between", value1, value2, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmtypeNotBetween(String value1, String value2) {
            addCriterion("ALARMTYPE not between", value1, value2, "alarmtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeIsNull() {
            addCriterion("ALARMSUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeIsNotNull() {
            addCriterion("ALARMSUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeEqualTo(String value) {
            addCriterion("ALARMSUBTYPE =", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeNotEqualTo(String value) {
            addCriterion("ALARMSUBTYPE <>", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeGreaterThan(String value) {
            addCriterion("ALARMSUBTYPE >", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMSUBTYPE >=", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeLessThan(String value) {
            addCriterion("ALARMSUBTYPE <", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeLessThanOrEqualTo(String value) {
            addCriterion("ALARMSUBTYPE <=", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeLike(String value) {
            addCriterion("ALARMSUBTYPE like", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeNotLike(String value) {
            addCriterion("ALARMSUBTYPE not like", value, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeIn(List<String> values) {
            addCriterion("ALARMSUBTYPE in", values, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeNotIn(List<String> values) {
            addCriterion("ALARMSUBTYPE not in", values, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeBetween(String value1, String value2) {
            addCriterion("ALARMSUBTYPE between", value1, value2, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmsubtypeNotBetween(String value1, String value2) {
            addCriterion("ALARMSUBTYPE not between", value1, value2, "alarmsubtype");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceIsNull() {
            addCriterion("ALARMPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceIsNotNull() {
            addCriterion("ALARMPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceEqualTo(String value) {
            addCriterion("ALARMPROVINCE =", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceNotEqualTo(String value) {
            addCriterion("ALARMPROVINCE <>", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceGreaterThan(String value) {
            addCriterion("ALARMPROVINCE >", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMPROVINCE >=", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceLessThan(String value) {
            addCriterion("ALARMPROVINCE <", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceLessThanOrEqualTo(String value) {
            addCriterion("ALARMPROVINCE <=", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceLike(String value) {
            addCriterion("ALARMPROVINCE like", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceNotLike(String value) {
            addCriterion("ALARMPROVINCE not like", value, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceIn(List<String> values) {
            addCriterion("ALARMPROVINCE in", values, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceNotIn(List<String> values) {
            addCriterion("ALARMPROVINCE not in", values, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceBetween(String value1, String value2) {
            addCriterion("ALARMPROVINCE between", value1, value2, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmprovinceNotBetween(String value1, String value2) {
            addCriterion("ALARMPROVINCE not between", value1, value2, "alarmprovince");
            return (Criteria) this;
        }

        public Criteria andAlarmregionIsNull() {
            addCriterion("ALARMREGION is null");
            return (Criteria) this;
        }

        public Criteria andAlarmregionIsNotNull() {
            addCriterion("ALARMREGION is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmregionEqualTo(String value) {
            addCriterion("ALARMREGION =", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionNotEqualTo(String value) {
            addCriterion("ALARMREGION <>", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionGreaterThan(String value) {
            addCriterion("ALARMREGION >", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMREGION >=", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionLessThan(String value) {
            addCriterion("ALARMREGION <", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionLessThanOrEqualTo(String value) {
            addCriterion("ALARMREGION <=", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionLike(String value) {
            addCriterion("ALARMREGION like", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionNotLike(String value) {
            addCriterion("ALARMREGION not like", value, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionIn(List<String> values) {
            addCriterion("ALARMREGION in", values, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionNotIn(List<String> values) {
            addCriterion("ALARMREGION not in", values, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionBetween(String value1, String value2) {
            addCriterion("ALARMREGION between", value1, value2, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmregionNotBetween(String value1, String value2) {
            addCriterion("ALARMREGION not between", value1, value2, "alarmregion");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationIsNull() {
            addCriterion("ALARMLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationIsNotNull() {
            addCriterion("ALARMLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationEqualTo(String value) {
            addCriterion("ALARMLOCATION =", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationNotEqualTo(String value) {
            addCriterion("ALARMLOCATION <>", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationGreaterThan(String value) {
            addCriterion("ALARMLOCATION >", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMLOCATION >=", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationLessThan(String value) {
            addCriterion("ALARMLOCATION <", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationLessThanOrEqualTo(String value) {
            addCriterion("ALARMLOCATION <=", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationLike(String value) {
            addCriterion("ALARMLOCATION like", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationNotLike(String value) {
            addCriterion("ALARMLOCATION not like", value, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationIn(List<String> values) {
            addCriterion("ALARMLOCATION in", values, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationNotIn(List<String> values) {
            addCriterion("ALARMLOCATION not in", values, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationBetween(String value1, String value2) {
            addCriterion("ALARMLOCATION between", value1, value2, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmlocationNotBetween(String value1, String value2) {
            addCriterion("ALARMLOCATION not between", value1, value2, "alarmlocation");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailIsNull() {
            addCriterion("ALARMDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailIsNotNull() {
            addCriterion("ALARMDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailEqualTo(String value) {
            addCriterion("ALARMDETAIL =", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailNotEqualTo(String value) {
            addCriterion("ALARMDETAIL <>", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailGreaterThan(String value) {
            addCriterion("ALARMDETAIL >", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMDETAIL >=", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailLessThan(String value) {
            addCriterion("ALARMDETAIL <", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailLessThanOrEqualTo(String value) {
            addCriterion("ALARMDETAIL <=", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailLike(String value) {
            addCriterion("ALARMDETAIL like", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailNotLike(String value) {
            addCriterion("ALARMDETAIL not like", value, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailIn(List<String> values) {
            addCriterion("ALARMDETAIL in", values, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailNotIn(List<String> values) {
            addCriterion("ALARMDETAIL not in", values, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailBetween(String value1, String value2) {
            addCriterion("ALARMDETAIL between", value1, value2, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmdetailNotBetween(String value1, String value2) {
            addCriterion("ALARMDETAIL not between", value1, value2, "alarmdetail");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelIsNull() {
            addCriterion("ALARMHANDLELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelIsNotNull() {
            addCriterion("ALARMHANDLELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelEqualTo(String value) {
            addCriterion("ALARMHANDLELEVEL =", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelNotEqualTo(String value) {
            addCriterion("ALARMHANDLELEVEL <>", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelGreaterThan(String value) {
            addCriterion("ALARMHANDLELEVEL >", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMHANDLELEVEL >=", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelLessThan(String value) {
            addCriterion("ALARMHANDLELEVEL <", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelLessThanOrEqualTo(String value) {
            addCriterion("ALARMHANDLELEVEL <=", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelLike(String value) {
            addCriterion("ALARMHANDLELEVEL like", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelNotLike(String value) {
            addCriterion("ALARMHANDLELEVEL not like", value, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelIn(List<String> values) {
            addCriterion("ALARMHANDLELEVEL in", values, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelNotIn(List<String> values) {
            addCriterion("ALARMHANDLELEVEL not in", values, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelBetween(String value1, String value2) {
            addCriterion("ALARMHANDLELEVEL between", value1, value2, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andAlarmhandlelevelNotBetween(String value1, String value2) {
            addCriterion("ALARMHANDLELEVEL not between", value1, value2, "alarmhandlelevel");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserIsNull() {
            addCriterion("EMOUREPLYUSER is null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserIsNotNull() {
            addCriterion("EMOUREPLYUSER is not null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserEqualTo(String value) {
            addCriterion("EMOUREPLYUSER =", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserNotEqualTo(String value) {
            addCriterion("EMOUREPLYUSER <>", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserGreaterThan(String value) {
            addCriterion("EMOUREPLYUSER >", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYUSER >=", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserLessThan(String value) {
            addCriterion("EMOUREPLYUSER <", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserLessThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYUSER <=", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserLike(String value) {
            addCriterion("EMOUREPLYUSER like", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserNotLike(String value) {
            addCriterion("EMOUREPLYUSER not like", value, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserIn(List<String> values) {
            addCriterion("EMOUREPLYUSER in", values, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserNotIn(List<String> values) {
            addCriterion("EMOUREPLYUSER not in", values, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserBetween(String value1, String value2) {
            addCriterion("EMOUREPLYUSER between", value1, value2, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyuserNotBetween(String value1, String value2) {
            addCriterion("EMOUREPLYUSER not between", value1, value2, "emoureplyuser");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneIsNull() {
            addCriterion("EMOUREPLYPHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneIsNotNull() {
            addCriterion("EMOUREPLYPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneEqualTo(String value) {
            addCriterion("EMOUREPLYPHONE =", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneNotEqualTo(String value) {
            addCriterion("EMOUREPLYPHONE <>", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneGreaterThan(String value) {
            addCriterion("EMOUREPLYPHONE >", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYPHONE >=", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneLessThan(String value) {
            addCriterion("EMOUREPLYPHONE <", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneLessThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYPHONE <=", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneLike(String value) {
            addCriterion("EMOUREPLYPHONE like", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneNotLike(String value) {
            addCriterion("EMOUREPLYPHONE not like", value, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneIn(List<String> values) {
            addCriterion("EMOUREPLYPHONE in", values, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneNotIn(List<String> values) {
            addCriterion("EMOUREPLYPHONE not in", values, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneBetween(String value1, String value2) {
            addCriterion("EMOUREPLYPHONE between", value1, value2, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplyphoneNotBetween(String value1, String value2) {
            addCriterion("EMOUREPLYPHONE not between", value1, value2, "emoureplyphone");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptIsNull() {
            addCriterion("EMOUREPLYDEPT is null");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptIsNotNull() {
            addCriterion("EMOUREPLYDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptEqualTo(String value) {
            addCriterion("EMOUREPLYDEPT =", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptNotEqualTo(String value) {
            addCriterion("EMOUREPLYDEPT <>", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptGreaterThan(String value) {
            addCriterion("EMOUREPLYDEPT >", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYDEPT >=", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptLessThan(String value) {
            addCriterion("EMOUREPLYDEPT <", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptLessThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYDEPT <=", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptLike(String value) {
            addCriterion("EMOUREPLYDEPT like", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptNotLike(String value) {
            addCriterion("EMOUREPLYDEPT not like", value, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptIn(List<String> values) {
            addCriterion("EMOUREPLYDEPT in", values, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptNotIn(List<String> values) {
            addCriterion("EMOUREPLYDEPT not in", values, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptBetween(String value1, String value2) {
            addCriterion("EMOUREPLYDEPT between", value1, value2, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andEmoureplydeptNotBetween(String value1, String value2) {
            addCriterion("EMOUREPLYDEPT not between", value1, value2, "emoureplydept");
            return (Criteria) this;
        }

        public Criteria andAlarmcityIsNull() {
            addCriterion("ALARMCITY is null");
            return (Criteria) this;
        }

        public Criteria andAlarmcityIsNotNull() {
            addCriterion("ALARMCITY is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmcityEqualTo(String value) {
            addCriterion("ALARMCITY =", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityNotEqualTo(String value) {
            addCriterion("ALARMCITY <>", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityGreaterThan(String value) {
            addCriterion("ALARMCITY >", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMCITY >=", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityLessThan(String value) {
            addCriterion("ALARMCITY <", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityLessThanOrEqualTo(String value) {
            addCriterion("ALARMCITY <=", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityLike(String value) {
            addCriterion("ALARMCITY like", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityNotLike(String value) {
            addCriterion("ALARMCITY not like", value, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityIn(List<String> values) {
            addCriterion("ALARMCITY in", values, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityNotIn(List<String> values) {
            addCriterion("ALARMCITY not in", values, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityBetween(String value1, String value2) {
            addCriterion("ALARMCITY between", value1, value2, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andAlarmcityNotBetween(String value1, String value2) {
            addCriterion("ALARMCITY not between", value1, value2, "alarmcity");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNull() {
            addCriterion("AREALEVEL is null");
            return (Criteria) this;
        }

        public Criteria andArealevelIsNotNull() {
            addCriterion("AREALEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andArealevelEqualTo(String value) {
            addCriterion("AREALEVEL =", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotEqualTo(String value) {
            addCriterion("AREALEVEL <>", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThan(String value) {
            addCriterion("AREALEVEL >", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelGreaterThanOrEqualTo(String value) {
            addCriterion("AREALEVEL >=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThan(String value) {
            addCriterion("AREALEVEL <", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLessThanOrEqualTo(String value) {
            addCriterion("AREALEVEL <=", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelLike(String value) {
            addCriterion("AREALEVEL like", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotLike(String value) {
            addCriterion("AREALEVEL not like", value, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelIn(List<String> values) {
            addCriterion("AREALEVEL in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotIn(List<String> values) {
            addCriterion("AREALEVEL not in", values, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelBetween(String value1, String value2) {
            addCriterion("AREALEVEL between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andArealevelNotBetween(String value1, String value2) {
            addCriterion("AREALEVEL not between", value1, value2, "arealevel");
            return (Criteria) this;
        }

        public Criteria andEmoureportendIsNull() {
            addCriterion("EMOUREPORTEND is null");
            return (Criteria) this;
        }

        public Criteria andEmoureportendIsNotNull() {
            addCriterion("EMOUREPORTEND is not null");
            return (Criteria) this;
        }

        public Criteria andEmoureportendEqualTo(String value) {
            addCriterion("EMOUREPORTEND =", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendNotEqualTo(String value) {
            addCriterion("EMOUREPORTEND <>", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendGreaterThan(String value) {
            addCriterion("EMOUREPORTEND >", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUREPORTEND >=", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendLessThan(String value) {
            addCriterion("EMOUREPORTEND <", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendLessThanOrEqualTo(String value) {
            addCriterion("EMOUREPORTEND <=", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendLike(String value) {
            addCriterion("EMOUREPORTEND like", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendNotLike(String value) {
            addCriterion("EMOUREPORTEND not like", value, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendIn(List<String> values) {
            addCriterion("EMOUREPORTEND in", values, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendNotIn(List<String> values) {
            addCriterion("EMOUREPORTEND not in", values, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendBetween(String value1, String value2) {
            addCriterion("EMOUREPORTEND between", value1, value2, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andEmoureportendNotBetween(String value1, String value2) {
            addCriterion("EMOUREPORTEND not between", value1, value2, "emoureportend");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeIsNull() {
            addCriterion("SENDEMOUTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeIsNotNull() {
            addCriterion("SENDEMOUTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeEqualTo(String value) {
            addCriterion("SENDEMOUTYPE =", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeNotEqualTo(String value) {
            addCriterion("SENDEMOUTYPE <>", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeGreaterThan(String value) {
            addCriterion("SENDEMOUTYPE >", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeGreaterThanOrEqualTo(String value) {
            addCriterion("SENDEMOUTYPE >=", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeLessThan(String value) {
            addCriterion("SENDEMOUTYPE <", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeLessThanOrEqualTo(String value) {
            addCriterion("SENDEMOUTYPE <=", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeLike(String value) {
            addCriterion("SENDEMOUTYPE like", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeNotLike(String value) {
            addCriterion("SENDEMOUTYPE not like", value, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeIn(List<String> values) {
            addCriterion("SENDEMOUTYPE in", values, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeNotIn(List<String> values) {
            addCriterion("SENDEMOUTYPE not in", values, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeBetween(String value1, String value2) {
            addCriterion("SENDEMOUTYPE between", value1, value2, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andSendemoutypeNotBetween(String value1, String value2) {
            addCriterion("SENDEMOUTYPE not between", value1, value2, "sendemoutype");
            return (Criteria) this;
        }

        public Criteria andEmouconameIsNull() {
            addCriterion("EMOUCONAME is null");
            return (Criteria) this;
        }

        public Criteria andEmouconameIsNotNull() {
            addCriterion("EMOUCONAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmouconameEqualTo(String value) {
            addCriterion("EMOUCONAME =", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameNotEqualTo(String value) {
            addCriterion("EMOUCONAME <>", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameGreaterThan(String value) {
            addCriterion("EMOUCONAME >", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUCONAME >=", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameLessThan(String value) {
            addCriterion("EMOUCONAME <", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameLessThanOrEqualTo(String value) {
            addCriterion("EMOUCONAME <=", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameLike(String value) {
            addCriterion("EMOUCONAME like", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameNotLike(String value) {
            addCriterion("EMOUCONAME not like", value, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameIn(List<String> values) {
            addCriterion("EMOUCONAME in", values, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameNotIn(List<String> values) {
            addCriterion("EMOUCONAME not in", values, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameBetween(String value1, String value2) {
            addCriterion("EMOUCONAME between", value1, value2, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouconameNotBetween(String value1, String value2) {
            addCriterion("EMOUCONAME not between", value1, value2, "emouconame");
            return (Criteria) this;
        }

        public Criteria andEmouphoneIsNull() {
            addCriterion("EMOUPHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmouphoneIsNotNull() {
            addCriterion("EMOUPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmouphoneEqualTo(String value) {
            addCriterion("EMOUPHONE =", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneNotEqualTo(String value) {
            addCriterion("EMOUPHONE <>", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneGreaterThan(String value) {
            addCriterion("EMOUPHONE >", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUPHONE >=", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneLessThan(String value) {
            addCriterion("EMOUPHONE <", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneLessThanOrEqualTo(String value) {
            addCriterion("EMOUPHONE <=", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneLike(String value) {
            addCriterion("EMOUPHONE like", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneNotLike(String value) {
            addCriterion("EMOUPHONE not like", value, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneIn(List<String> values) {
            addCriterion("EMOUPHONE in", values, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneNotIn(List<String> values) {
            addCriterion("EMOUPHONE not in", values, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneBetween(String value1, String value2) {
            addCriterion("EMOUPHONE between", value1, value2, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmouphoneNotBetween(String value1, String value2) {
            addCriterion("EMOUPHONE not between", value1, value2, "emouphone");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeIsNull() {
            addCriterion("EMOUDISPOSETIME is null");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeIsNotNull() {
            addCriterion("EMOUDISPOSETIME is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeEqualTo(Date value) {
            addCriterionForJDBCDate("EMOUDISPOSETIME =", value, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("EMOUDISPOSETIME <>", value, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("EMOUDISPOSETIME >", value, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EMOUDISPOSETIME >=", value, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeLessThan(Date value) {
            addCriterionForJDBCDate("EMOUDISPOSETIME <", value, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EMOUDISPOSETIME <=", value, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeIn(List<Date> values) {
            addCriterionForJDBCDate("EMOUDISPOSETIME in", values, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("EMOUDISPOSETIME not in", values, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EMOUDISPOSETIME between", value1, value2, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoudisposetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EMOUDISPOSETIME not between", value1, value2, "emoudisposetime");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptIsNull() {
            addCriterion("EMOUPRETREATMENTACCEPT is null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptIsNotNull() {
            addCriterion("EMOUPRETREATMENTACCEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT =", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptNotEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT <>", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptGreaterThan(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT >", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT >=", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptLessThan(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT <", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptLessThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT <=", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptLike(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT like", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptNotLike(String value) {
            addCriterion("EMOUPRETREATMENTACCEPT not like", value, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTACCEPT in", values, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptNotIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTACCEPT not in", values, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTACCEPT between", value1, value2, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentacceptNotBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTACCEPT not between", value1, value2, "emoupretreatmentaccept");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateIsNull() {
            addCriterion("EMOUPRETREATMENTOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateIsNotNull() {
            addCriterion("EMOUPRETREATMENTOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE =", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateNotEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE <>", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateGreaterThan(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE >", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE >=", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateLessThan(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE <", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateLessThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE <=", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateLike(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE like", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateNotLike(String value) {
            addCriterion("EMOUPRETREATMENTOPERATE not like", value, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTOPERATE in", values, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateNotIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTOPERATE not in", values, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTOPERATE between", value1, value2, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentoperateNotBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTOPERATE not between", value1, value2, "emoupretreatmentoperate");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyIsNull() {
            addCriterion("EMOUPRETREATMENTCLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyIsNotNull() {
            addCriterion("EMOUPRETREATMENTCLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY =", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyNotEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY <>", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyGreaterThan(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY >", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY >=", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyLessThan(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY <", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyLessThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY <=", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyLike(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY like", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyNotLike(String value) {
            addCriterion("EMOUPRETREATMENTCLASSIFY not like", value, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTCLASSIFY in", values, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyNotIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTCLASSIFY not in", values, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTCLASSIFY between", value1, value2, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentclassifyNotBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTCLASSIFY not between", value1, value2, "emoupretreatmentclassify");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceIsNull() {
            addCriterion("EMOUPRETREATMENTADVICE is null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceIsNotNull() {
            addCriterion("EMOUPRETREATMENTADVICE is not null");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTADVICE =", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceNotEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTADVICE <>", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceGreaterThan(String value) {
            addCriterion("EMOUPRETREATMENTADVICE >", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTADVICE >=", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceLessThan(String value) {
            addCriterion("EMOUPRETREATMENTADVICE <", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceLessThanOrEqualTo(String value) {
            addCriterion("EMOUPRETREATMENTADVICE <=", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceLike(String value) {
            addCriterion("EMOUPRETREATMENTADVICE like", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceNotLike(String value) {
            addCriterion("EMOUPRETREATMENTADVICE not like", value, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTADVICE in", values, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceNotIn(List<String> values) {
            addCriterion("EMOUPRETREATMENTADVICE not in", values, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTADVICE between", value1, value2, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmoupretreatmentadviceNotBetween(String value1, String value2) {
            addCriterion("EMOUPRETREATMENTADVICE not between", value1, value2, "emoupretreatmentadvice");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptIsNull() {
            addCriterion("EMOUANALYSISACCEPT is null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptIsNotNull() {
            addCriterion("EMOUANALYSISACCEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptEqualTo(String value) {
            addCriterion("EMOUANALYSISACCEPT =", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptNotEqualTo(String value) {
            addCriterion("EMOUANALYSISACCEPT <>", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptGreaterThan(String value) {
            addCriterion("EMOUANALYSISACCEPT >", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISACCEPT >=", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptLessThan(String value) {
            addCriterion("EMOUANALYSISACCEPT <", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptLessThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISACCEPT <=", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptLike(String value) {
            addCriterion("EMOUANALYSISACCEPT like", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptNotLike(String value) {
            addCriterion("EMOUANALYSISACCEPT not like", value, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptIn(List<String> values) {
            addCriterion("EMOUANALYSISACCEPT in", values, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptNotIn(List<String> values) {
            addCriterion("EMOUANALYSISACCEPT not in", values, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISACCEPT between", value1, value2, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisacceptNotBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISACCEPT not between", value1, value2, "emouanalysisaccept");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateIsNull() {
            addCriterion("EMOUANALYSISOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateIsNotNull() {
            addCriterion("EMOUANALYSISOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateEqualTo(String value) {
            addCriterion("EMOUANALYSISOPERATE =", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateNotEqualTo(String value) {
            addCriterion("EMOUANALYSISOPERATE <>", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateGreaterThan(String value) {
            addCriterion("EMOUANALYSISOPERATE >", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISOPERATE >=", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateLessThan(String value) {
            addCriterion("EMOUANALYSISOPERATE <", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateLessThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISOPERATE <=", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateLike(String value) {
            addCriterion("EMOUANALYSISOPERATE like", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateNotLike(String value) {
            addCriterion("EMOUANALYSISOPERATE not like", value, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateIn(List<String> values) {
            addCriterion("EMOUANALYSISOPERATE in", values, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateNotIn(List<String> values) {
            addCriterion("EMOUANALYSISOPERATE not in", values, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISOPERATE between", value1, value2, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisoperateNotBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISOPERATE not between", value1, value2, "emouanalysisoperate");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionIsNull() {
            addCriterion("EMOUANALYSISPRODESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionIsNotNull() {
            addCriterion("EMOUANALYSISPRODESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionEqualTo(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION =", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionNotEqualTo(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION <>", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionGreaterThan(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION >", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION >=", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionLessThan(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION <", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionLessThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION <=", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionLike(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION like", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionNotLike(String value) {
            addCriterion("EMOUANALYSISPRODESCRIPTION not like", value, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionIn(List<String> values) {
            addCriterion("EMOUANALYSISPRODESCRIPTION in", values, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionNotIn(List<String> values) {
            addCriterion("EMOUANALYSISPRODESCRIPTION not in", values, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISPRODESCRIPTION between", value1, value2, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisprodescriptionNotBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISPRODESCRIPTION not between", value1, value2, "emouanalysisprodescription");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisIsNull() {
            addCriterion("EMOUANALYSISPROANALYSIS is null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisIsNotNull() {
            addCriterion("EMOUANALYSISPROANALYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisEqualTo(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS =", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisNotEqualTo(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS <>", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisGreaterThan(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS >", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS >=", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisLessThan(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS <", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisLessThanOrEqualTo(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS <=", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisLike(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS like", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisNotLike(String value) {
            addCriterion("EMOUANALYSISPROANALYSIS not like", value, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisIn(List<String> values) {
            addCriterion("EMOUANALYSISPROANALYSIS in", values, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisNotIn(List<String> values) {
            addCriterion("EMOUANALYSISPROANALYSIS not in", values, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISPROANALYSIS between", value1, value2, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouanalysisproanalysisNotBetween(String value1, String value2) {
            addCriterion("EMOUANALYSISPROANALYSIS not between", value1, value2, "emouanalysisproanalysis");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptIsNull() {
            addCriterion("EMOUOPTIMIZATIONACCEPT is null");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptIsNotNull() {
            addCriterion("EMOUOPTIMIZATIONACCEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT =", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptNotEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT <>", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptGreaterThan(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT >", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT >=", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptLessThan(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT <", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptLessThanOrEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT <=", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptLike(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT like", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptNotLike(String value) {
            addCriterion("EMOUOPTIMIZATIONACCEPT not like", value, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptIn(List<String> values) {
            addCriterion("EMOUOPTIMIZATIONACCEPT in", values, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptNotIn(List<String> values) {
            addCriterion("EMOUOPTIMIZATIONACCEPT not in", values, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptBetween(String value1, String value2) {
            addCriterion("EMOUOPTIMIZATIONACCEPT between", value1, value2, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationacceptNotBetween(String value1, String value2) {
            addCriterion("EMOUOPTIMIZATIONACCEPT not between", value1, value2, "emouoptimizationaccept");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateIsNull() {
            addCriterion("EMOUOPTIMIZATIONOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateIsNotNull() {
            addCriterion("EMOUOPTIMIZATIONOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE =", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateNotEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE <>", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateGreaterThan(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE >", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE >=", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateLessThan(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE <", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateLessThanOrEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE <=", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateLike(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE like", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateNotLike(String value) {
            addCriterion("EMOUOPTIMIZATIONOPERATE not like", value, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateIn(List<String> values) {
            addCriterion("EMOUOPTIMIZATIONOPERATE in", values, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateNotIn(List<String> values) {
            addCriterion("EMOUOPTIMIZATIONOPERATE not in", values, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateBetween(String value1, String value2) {
            addCriterion("EMOUOPTIMIZATIONOPERATE between", value1, value2, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationoperateNotBetween(String value1, String value2) {
            addCriterion("EMOUOPTIMIZATIONOPERATE not between", value1, value2, "emouoptimizationoperate");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationIsNull() {
            addCriterion("AREACLASSIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationIsNotNull() {
            addCriterion("AREACLASSIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationEqualTo(String value) {
            addCriterion("AREACLASSIFICATION =", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationNotEqualTo(String value) {
            addCriterion("AREACLASSIFICATION <>", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationGreaterThan(String value) {
            addCriterion("AREACLASSIFICATION >", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationGreaterThanOrEqualTo(String value) {
            addCriterion("AREACLASSIFICATION >=", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationLessThan(String value) {
            addCriterion("AREACLASSIFICATION <", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationLessThanOrEqualTo(String value) {
            addCriterion("AREACLASSIFICATION <=", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationLike(String value) {
            addCriterion("AREACLASSIFICATION like", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationNotLike(String value) {
            addCriterion("AREACLASSIFICATION not like", value, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationIn(List<String> values) {
            addCriterion("AREACLASSIFICATION in", values, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationNotIn(List<String> values) {
            addCriterion("AREACLASSIFICATION not in", values, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationBetween(String value1, String value2) {
            addCriterion("AREACLASSIFICATION between", value1, value2, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andAreaclassificationNotBetween(String value1, String value2) {
            addCriterion("AREACLASSIFICATION not between", value1, value2, "areaclassification");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaIsNull() {
            addCriterion("CLASSIFIEDTWOREA is null");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaIsNotNull() {
            addCriterion("CLASSIFIEDTWOREA is not null");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaEqualTo(String value) {
            addCriterion("CLASSIFIEDTWOREA =", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaNotEqualTo(String value) {
            addCriterion("CLASSIFIEDTWOREA <>", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaGreaterThan(String value) {
            addCriterion("CLASSIFIEDTWOREA >", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSIFIEDTWOREA >=", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaLessThan(String value) {
            addCriterion("CLASSIFIEDTWOREA <", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaLessThanOrEqualTo(String value) {
            addCriterion("CLASSIFIEDTWOREA <=", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaLike(String value) {
            addCriterion("CLASSIFIEDTWOREA like", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaNotLike(String value) {
            addCriterion("CLASSIFIEDTWOREA not like", value, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaIn(List<String> values) {
            addCriterion("CLASSIFIEDTWOREA in", values, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaNotIn(List<String> values) {
            addCriterion("CLASSIFIEDTWOREA not in", values, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaBetween(String value1, String value2) {
            addCriterion("CLASSIFIEDTWOREA between", value1, value2, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andClassifiedtworeaNotBetween(String value1, String value2) {
            addCriterion("CLASSIFIEDTWOREA not between", value1, value2, "classifiedtworea");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonIsNull() {
            addCriterion("EMOUOPTIMIZATIONREASON is null");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonIsNotNull() {
            addCriterion("EMOUOPTIMIZATIONREASON is not null");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON =", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonNotEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON <>", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonGreaterThan(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON >", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON >=", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonLessThan(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON <", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonLessThanOrEqualTo(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON <=", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonLike(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON like", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonNotLike(String value) {
            addCriterion("EMOUOPTIMIZATIONREASON not like", value, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonIn(List<String> values) {
            addCriterion("EMOUOPTIMIZATIONREASON in", values, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonNotIn(List<String> values) {
            addCriterion("EMOUOPTIMIZATIONREASON not in", values, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonBetween(String value1, String value2) {
            addCriterion("EMOUOPTIMIZATIONREASON between", value1, value2, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andEmouoptimizationreasonNotBetween(String value1, String value2) {
            addCriterion("EMOUOPTIMIZATIONREASON not between", value1, value2, "emouoptimizationreason");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionIsNull() {
            addCriterion("PROCESSDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionIsNotNull() {
            addCriterion("PROCESSDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionEqualTo(String value) {
            addCriterion("PROCESSDESCRIPTION =", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionNotEqualTo(String value) {
            addCriterion("PROCESSDESCRIPTION <>", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionGreaterThan(String value) {
            addCriterion("PROCESSDESCRIPTION >", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSDESCRIPTION >=", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionLessThan(String value) {
            addCriterion("PROCESSDESCRIPTION <", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionLessThanOrEqualTo(String value) {
            addCriterion("PROCESSDESCRIPTION <=", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionLike(String value) {
            addCriterion("PROCESSDESCRIPTION like", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionNotLike(String value) {
            addCriterion("PROCESSDESCRIPTION not like", value, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionIn(List<String> values) {
            addCriterion("PROCESSDESCRIPTION in", values, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionNotIn(List<String> values) {
            addCriterion("PROCESSDESCRIPTION not in", values, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionBetween(String value1, String value2) {
            addCriterion("PROCESSDESCRIPTION between", value1, value2, "processdescription");
            return (Criteria) this;
        }

        public Criteria andProcessdescriptionNotBetween(String value1, String value2) {
            addCriterion("PROCESSDESCRIPTION not between", value1, value2, "processdescription");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptIsNull() {
            addCriterion("EMOUREPLYACCEPT is null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptIsNotNull() {
            addCriterion("EMOUREPLYACCEPT is not null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptEqualTo(String value) {
            addCriterion("EMOUREPLYACCEPT =", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptNotEqualTo(String value) {
            addCriterion("EMOUREPLYACCEPT <>", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptGreaterThan(String value) {
            addCriterion("EMOUREPLYACCEPT >", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYACCEPT >=", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptLessThan(String value) {
            addCriterion("EMOUREPLYACCEPT <", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptLessThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYACCEPT <=", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptLike(String value) {
            addCriterion("EMOUREPLYACCEPT like", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptNotLike(String value) {
            addCriterion("EMOUREPLYACCEPT not like", value, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptIn(List<String> values) {
            addCriterion("EMOUREPLYACCEPT in", values, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptNotIn(List<String> values) {
            addCriterion("EMOUREPLYACCEPT not in", values, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptBetween(String value1, String value2) {
            addCriterion("EMOUREPLYACCEPT between", value1, value2, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andEmoureplyacceptNotBetween(String value1, String value2) {
            addCriterion("EMOUREPLYACCEPT not between", value1, value2, "emoureplyaccept");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagIsNull() {
            addCriterion("REPLYNETMODIFYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagIsNotNull() {
            addCriterion("REPLYNETMODIFYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagEqualTo(String value) {
            addCriterion("REPLYNETMODIFYFLAG =", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagNotEqualTo(String value) {
            addCriterion("REPLYNETMODIFYFLAG <>", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagGreaterThan(String value) {
            addCriterion("REPLYNETMODIFYFLAG >", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYNETMODIFYFLAG >=", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagLessThan(String value) {
            addCriterion("REPLYNETMODIFYFLAG <", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagLessThanOrEqualTo(String value) {
            addCriterion("REPLYNETMODIFYFLAG <=", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagLike(String value) {
            addCriterion("REPLYNETMODIFYFLAG like", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagNotLike(String value) {
            addCriterion("REPLYNETMODIFYFLAG not like", value, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagIn(List<String> values) {
            addCriterion("REPLYNETMODIFYFLAG in", values, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagNotIn(List<String> values) {
            addCriterion("REPLYNETMODIFYFLAG not in", values, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagBetween(String value1, String value2) {
            addCriterion("REPLYNETMODIFYFLAG between", value1, value2, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplynetmodifyflagNotBetween(String value1, String value2) {
            addCriterion("REPLYNETMODIFYFLAG not between", value1, value2, "replynetmodifyflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagIsNull() {
            addCriterion("REPLYFINALLYPROJECTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagIsNotNull() {
            addCriterion("REPLYFINALLYPROJECTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagEqualTo(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG =", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagNotEqualTo(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG <>", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagGreaterThan(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG >", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG >=", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagLessThan(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG <", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagLessThanOrEqualTo(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG <=", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagLike(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG like", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagNotLike(String value) {
            addCriterion("REPLYFINALLYPROJECTFLAG not like", value, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagIn(List<String> values) {
            addCriterion("REPLYFINALLYPROJECTFLAG in", values, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagNotIn(List<String> values) {
            addCriterion("REPLYFINALLYPROJECTFLAG not in", values, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagBetween(String value1, String value2) {
            addCriterion("REPLYFINALLYPROJECTFLAG between", value1, value2, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyfinallyprojectflagNotBetween(String value1, String value2) {
            addCriterion("REPLYFINALLYPROJECTFLAG not between", value1, value2, "replyfinallyprojectflag");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeIsNull() {
            addCriterion("REPLYISKNOWLEDGE is null");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeIsNotNull() {
            addCriterion("REPLYISKNOWLEDGE is not null");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeEqualTo(String value) {
            addCriterion("REPLYISKNOWLEDGE =", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeNotEqualTo(String value) {
            addCriterion("REPLYISKNOWLEDGE <>", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeGreaterThan(String value) {
            addCriterion("REPLYISKNOWLEDGE >", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYISKNOWLEDGE >=", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeLessThan(String value) {
            addCriterion("REPLYISKNOWLEDGE <", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeLessThanOrEqualTo(String value) {
            addCriterion("REPLYISKNOWLEDGE <=", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeLike(String value) {
            addCriterion("REPLYISKNOWLEDGE like", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeNotLike(String value) {
            addCriterion("REPLYISKNOWLEDGE not like", value, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeIn(List<String> values) {
            addCriterion("REPLYISKNOWLEDGE in", values, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeNotIn(List<String> values) {
            addCriterion("REPLYISKNOWLEDGE not in", values, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeBetween(String value1, String value2) {
            addCriterion("REPLYISKNOWLEDGE between", value1, value2, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplyisknowledgeNotBetween(String value1, String value2) {
            addCriterion("REPLYISKNOWLEDGE not between", value1, value2, "replyisknowledge");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagIsNull() {
            addCriterion("REPLYBIGFAULTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagIsNotNull() {
            addCriterion("REPLYBIGFAULTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagEqualTo(String value) {
            addCriterion("REPLYBIGFAULTFLAG =", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagNotEqualTo(String value) {
            addCriterion("REPLYBIGFAULTFLAG <>", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagGreaterThan(String value) {
            addCriterion("REPLYBIGFAULTFLAG >", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYBIGFAULTFLAG >=", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagLessThan(String value) {
            addCriterion("REPLYBIGFAULTFLAG <", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagLessThanOrEqualTo(String value) {
            addCriterion("REPLYBIGFAULTFLAG <=", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagLike(String value) {
            addCriterion("REPLYBIGFAULTFLAG like", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagNotLike(String value) {
            addCriterion("REPLYBIGFAULTFLAG not like", value, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagIn(List<String> values) {
            addCriterion("REPLYBIGFAULTFLAG in", values, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagNotIn(List<String> values) {
            addCriterion("REPLYBIGFAULTFLAG not in", values, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagBetween(String value1, String value2) {
            addCriterion("REPLYBIGFAULTFLAG between", value1, value2, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplybigfaultflagNotBetween(String value1, String value2) {
            addCriterion("REPLYBIGFAULTFLAG not between", value1, value2, "replybigfaultflag");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyIsNull() {
            addCriterion("REPLYFAULTREASONCLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyIsNotNull() {
            addCriterion("REPLYFAULTREASONCLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyEqualTo(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY =", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyNotEqualTo(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY <>", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyGreaterThan(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY >", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY >=", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyLessThan(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY <", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyLessThanOrEqualTo(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY <=", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyLike(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY like", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyNotLike(String value) {
            addCriterion("REPLYFAULTREASONCLASSIFY not like", value, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyIn(List<String> values) {
            addCriterion("REPLYFAULTREASONCLASSIFY in", values, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyNotIn(List<String> values) {
            addCriterion("REPLYFAULTREASONCLASSIFY not in", values, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyBetween(String value1, String value2) {
            addCriterion("REPLYFAULTREASONCLASSIFY between", value1, value2, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonclassifyNotBetween(String value1, String value2) {
            addCriterion("REPLYFAULTREASONCLASSIFY not between", value1, value2, "replyfaultreasonclassify");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionIsNull() {
            addCriterion("REPLYFAULTREASONSUBDIVISION is null");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionIsNotNull() {
            addCriterion("REPLYFAULTREASONSUBDIVISION is not null");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionEqualTo(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION =", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionNotEqualTo(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION <>", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionGreaterThan(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION >", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION >=", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionLessThan(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION <", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionLessThanOrEqualTo(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION <=", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionLike(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION like", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionNotLike(String value) {
            addCriterion("REPLYFAULTREASONSUBDIVISION not like", value, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionIn(List<String> values) {
            addCriterion("REPLYFAULTREASONSUBDIVISION in", values, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionNotIn(List<String> values) {
            addCriterion("REPLYFAULTREASONSUBDIVISION not in", values, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionBetween(String value1, String value2) {
            addCriterion("REPLYFAULTREASONSUBDIVISION between", value1, value2, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyfaultreasonsubdivisionNotBetween(String value1, String value2) {
            addCriterion("REPLYFAULTREASONSUBDIVISION not between", value1, value2, "replyfaultreasonsubdivision");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonIsNull() {
            addCriterion("REPLYOTHERREASON is null");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonIsNotNull() {
            addCriterion("REPLYOTHERREASON is not null");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonEqualTo(String value) {
            addCriterion("REPLYOTHERREASON =", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonNotEqualTo(String value) {
            addCriterion("REPLYOTHERREASON <>", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonGreaterThan(String value) {
            addCriterion("REPLYOTHERREASON >", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYOTHERREASON >=", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonLessThan(String value) {
            addCriterion("REPLYOTHERREASON <", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonLessThanOrEqualTo(String value) {
            addCriterion("REPLYOTHERREASON <=", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonLike(String value) {
            addCriterion("REPLYOTHERREASON like", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonNotLike(String value) {
            addCriterion("REPLYOTHERREASON not like", value, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonIn(List<String> values) {
            addCriterion("REPLYOTHERREASON in", values, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonNotIn(List<String> values) {
            addCriterion("REPLYOTHERREASON not in", values, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonBetween(String value1, String value2) {
            addCriterion("REPLYOTHERREASON between", value1, value2, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyotherreasonNotBetween(String value1, String value2) {
            addCriterion("REPLYOTHERREASON not between", value1, value2, "replyotherreason");
            return (Criteria) this;
        }

        public Criteria andReplyusernameIsNull() {
            addCriterion("REPLYUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReplyusernameIsNotNull() {
            addCriterion("REPLYUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyusernameEqualTo(String value) {
            addCriterion("REPLYUSERNAME =", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameNotEqualTo(String value) {
            addCriterion("REPLYUSERNAME <>", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameGreaterThan(String value) {
            addCriterion("REPLYUSERNAME >", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYUSERNAME >=", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameLessThan(String value) {
            addCriterion("REPLYUSERNAME <", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameLessThanOrEqualTo(String value) {
            addCriterion("REPLYUSERNAME <=", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameLike(String value) {
            addCriterion("REPLYUSERNAME like", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameNotLike(String value) {
            addCriterion("REPLYUSERNAME not like", value, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameIn(List<String> values) {
            addCriterion("REPLYUSERNAME in", values, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameNotIn(List<String> values) {
            addCriterion("REPLYUSERNAME not in", values, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameBetween(String value1, String value2) {
            addCriterion("REPLYUSERNAME between", value1, value2, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyusernameNotBetween(String value1, String value2) {
            addCriterion("REPLYUSERNAME not between", value1, value2, "replyusername");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameIsNull() {
            addCriterion("REPLYORGANNAME is null");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameIsNotNull() {
            addCriterion("REPLYORGANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameEqualTo(String value) {
            addCriterion("REPLYORGANNAME =", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameNotEqualTo(String value) {
            addCriterion("REPLYORGANNAME <>", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameGreaterThan(String value) {
            addCriterion("REPLYORGANNAME >", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameGreaterThanOrEqualTo(String value) {
            addCriterion("REPLYORGANNAME >=", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameLessThan(String value) {
            addCriterion("REPLYORGANNAME <", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameLessThanOrEqualTo(String value) {
            addCriterion("REPLYORGANNAME <=", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameLike(String value) {
            addCriterion("REPLYORGANNAME like", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameNotLike(String value) {
            addCriterion("REPLYORGANNAME not like", value, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameIn(List<String> values) {
            addCriterion("REPLYORGANNAME in", values, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameNotIn(List<String> values) {
            addCriterion("REPLYORGANNAME not in", values, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameBetween(String value1, String value2) {
            addCriterion("REPLYORGANNAME between", value1, value2, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andReplyorgannameNotBetween(String value1, String value2) {
            addCriterion("REPLYORGANNAME not between", value1, value2, "replyorganname");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateIsNull() {
            addCriterion("EMOUREPLYOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateIsNotNull() {
            addCriterion("EMOUREPLYOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateEqualTo(String value) {
            addCriterion("EMOUREPLYOPERATE =", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateNotEqualTo(String value) {
            addCriterion("EMOUREPLYOPERATE <>", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateGreaterThan(String value) {
            addCriterion("EMOUREPLYOPERATE >", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYOPERATE >=", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateLessThan(String value) {
            addCriterion("EMOUREPLYOPERATE <", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateLessThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYOPERATE <=", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateLike(String value) {
            addCriterion("EMOUREPLYOPERATE like", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateNotLike(String value) {
            addCriterion("EMOUREPLYOPERATE not like", value, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateIn(List<String> values) {
            addCriterion("EMOUREPLYOPERATE in", values, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateNotIn(List<String> values) {
            addCriterion("EMOUREPLYOPERATE not in", values, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateBetween(String value1, String value2) {
            addCriterion("EMOUREPLYOPERATE between", value1, value2, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andEmoureplyoperateNotBetween(String value1, String value2) {
            addCriterion("EMOUREPLYOPERATE not between", value1, value2, "emoureplyoperate");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeIsNull() {
            addCriterion("NEWLIMITTIME is null");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeIsNotNull() {
            addCriterion("NEWLIMITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeEqualTo(Date value) {
            addCriterionForJDBCDate("NEWLIMITTIME =", value, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("NEWLIMITTIME <>", value, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeGreaterThan(Date value) {
            addCriterionForJDBCDate("NEWLIMITTIME >", value, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEWLIMITTIME >=", value, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeLessThan(Date value) {
            addCriterionForJDBCDate("NEWLIMITTIME <", value, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NEWLIMITTIME <=", value, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeIn(List<Date> values) {
            addCriterionForJDBCDate("NEWLIMITTIME in", values, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("NEWLIMITTIME not in", values, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEWLIMITTIME between", value1, value2, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andNewlimittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NEWLIMITTIME not between", value1, value2, "newlimittime");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayIsNull() {
            addCriterion("ISEMOUDELAY is null");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayIsNotNull() {
            addCriterion("ISEMOUDELAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayEqualTo(String value) {
            addCriterion("ISEMOUDELAY =", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayNotEqualTo(String value) {
            addCriterion("ISEMOUDELAY <>", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayGreaterThan(String value) {
            addCriterion("ISEMOUDELAY >", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayGreaterThanOrEqualTo(String value) {
            addCriterion("ISEMOUDELAY >=", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayLessThan(String value) {
            addCriterion("ISEMOUDELAY <", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayLessThanOrEqualTo(String value) {
            addCriterion("ISEMOUDELAY <=", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayLike(String value) {
            addCriterion("ISEMOUDELAY like", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayNotLike(String value) {
            addCriterion("ISEMOUDELAY not like", value, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayIn(List<String> values) {
            addCriterion("ISEMOUDELAY in", values, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayNotIn(List<String> values) {
            addCriterion("ISEMOUDELAY not in", values, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayBetween(String value1, String value2) {
            addCriterion("ISEMOUDELAY between", value1, value2, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andIsemoudelayNotBetween(String value1, String value2) {
            addCriterion("ISEMOUDELAY not between", value1, value2, "isemoudelay");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateIsNull() {
            addCriterion("EMOUDELAYOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateIsNotNull() {
            addCriterion("EMOUDELAYOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateEqualTo(String value) {
            addCriterion("EMOUDELAYOPERATE =", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateNotEqualTo(String value) {
            addCriterion("EMOUDELAYOPERATE <>", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateGreaterThan(String value) {
            addCriterion("EMOUDELAYOPERATE >", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYOPERATE >=", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateLessThan(String value) {
            addCriterion("EMOUDELAYOPERATE <", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYOPERATE <=", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateLike(String value) {
            addCriterion("EMOUDELAYOPERATE like", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateNotLike(String value) {
            addCriterion("EMOUDELAYOPERATE not like", value, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateIn(List<String> values) {
            addCriterion("EMOUDELAYOPERATE in", values, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateNotIn(List<String> values) {
            addCriterion("EMOUDELAYOPERATE not in", values, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateBetween(String value1, String value2) {
            addCriterion("EMOUDELAYOPERATE between", value1, value2, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayoperateNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYOPERATE not between", value1, value2, "emoudelayoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeIsNull() {
            addCriterion("EMOUDELAYREPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeIsNotNull() {
            addCriterion("EMOUDELAYREPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeEqualTo(String value) {
            addCriterion("EMOUDELAYREPLYTIME =", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeNotEqualTo(String value) {
            addCriterion("EMOUDELAYREPLYTIME <>", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeGreaterThan(String value) {
            addCriterion("EMOUDELAYREPLYTIME >", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYREPLYTIME >=", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeLessThan(String value) {
            addCriterion("EMOUDELAYREPLYTIME <", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYREPLYTIME <=", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeLike(String value) {
            addCriterion("EMOUDELAYREPLYTIME like", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeNotLike(String value) {
            addCriterion("EMOUDELAYREPLYTIME not like", value, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeIn(List<String> values) {
            addCriterion("EMOUDELAYREPLYTIME in", values, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeNotIn(List<String> values) {
            addCriterion("EMOUDELAYREPLYTIME not in", values, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeBetween(String value1, String value2) {
            addCriterion("EMOUDELAYREPLYTIME between", value1, value2, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelayreplytimeNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYREPLYTIME not between", value1, value2, "emoudelayreplytime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultIsNull() {
            addCriterion("EMOUDELAYDEALRESULT is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultIsNotNull() {
            addCriterion("EMOUDELAYDEALRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultEqualTo(String value) {
            addCriterion("EMOUDELAYDEALRESULT =", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultNotEqualTo(String value) {
            addCriterion("EMOUDELAYDEALRESULT <>", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultGreaterThan(String value) {
            addCriterion("EMOUDELAYDEALRESULT >", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYDEALRESULT >=", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultLessThan(String value) {
            addCriterion("EMOUDELAYDEALRESULT <", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYDEALRESULT <=", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultLike(String value) {
            addCriterion("EMOUDELAYDEALRESULT like", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultNotLike(String value) {
            addCriterion("EMOUDELAYDEALRESULT not like", value, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultIn(List<String> values) {
            addCriterion("EMOUDELAYDEALRESULT in", values, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultNotIn(List<String> values) {
            addCriterion("EMOUDELAYDEALRESULT not in", values, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultBetween(String value1, String value2) {
            addCriterion("EMOUDELAYDEALRESULT between", value1, value2, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaydealresultNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYDEALRESULT not between", value1, value2, "emoudelaydealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateIsNull() {
            addCriterion("EMOUDELAYPASSOPERATE is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateIsNotNull() {
            addCriterion("EMOUDELAYPASSOPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateEqualTo(String value) {
            addCriterion("EMOUDELAYPASSOPERATE =", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateNotEqualTo(String value) {
            addCriterion("EMOUDELAYPASSOPERATE <>", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateGreaterThan(String value) {
            addCriterion("EMOUDELAYPASSOPERATE >", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSOPERATE >=", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateLessThan(String value) {
            addCriterion("EMOUDELAYPASSOPERATE <", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSOPERATE <=", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateLike(String value) {
            addCriterion("EMOUDELAYPASSOPERATE like", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateNotLike(String value) {
            addCriterion("EMOUDELAYPASSOPERATE not like", value, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateIn(List<String> values) {
            addCriterion("EMOUDELAYPASSOPERATE in", values, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateNotIn(List<String> values) {
            addCriterion("EMOUDELAYPASSOPERATE not in", values, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSOPERATE between", value1, value2, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassoperateNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSOPERATE not between", value1, value2, "emoudelaypassoperate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeIsNull() {
            addCriterion("EMOUDELAYPASSTIME is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeIsNotNull() {
            addCriterion("EMOUDELAYPASSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeEqualTo(String value) {
            addCriterion("EMOUDELAYPASSTIME =", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeNotEqualTo(String value) {
            addCriterion("EMOUDELAYPASSTIME <>", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeGreaterThan(String value) {
            addCriterion("EMOUDELAYPASSTIME >", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSTIME >=", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeLessThan(String value) {
            addCriterion("EMOUDELAYPASSTIME <", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSTIME <=", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeLike(String value) {
            addCriterion("EMOUDELAYPASSTIME like", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeNotLike(String value) {
            addCriterion("EMOUDELAYPASSTIME not like", value, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeIn(List<String> values) {
            addCriterion("EMOUDELAYPASSTIME in", values, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeNotIn(List<String> values) {
            addCriterion("EMOUDELAYPASSTIME not in", values, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSTIME between", value1, value2, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypasstimeNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSTIME not between", value1, value2, "emoudelaypasstime");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultIsNull() {
            addCriterion("EMOUDELAYPASSDEALRESULT is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultIsNotNull() {
            addCriterion("EMOUDELAYPASSDEALRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT =", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultNotEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT <>", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultGreaterThan(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT >", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT >=", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultLessThan(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT <", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT <=", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultLike(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT like", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultNotLike(String value) {
            addCriterion("EMOUDELAYPASSDEALRESULT not like", value, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultIn(List<String> values) {
            addCriterion("EMOUDELAYPASSDEALRESULT in", values, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultNotIn(List<String> values) {
            addCriterion("EMOUDELAYPASSDEALRESULT not in", values, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSDEALRESULT between", value1, value2, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealresultNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSDEALRESULT not between", value1, value2, "emoudelaypassdealresult");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesIsNull() {
            addCriterion("EMOUDELAYPASSDEALDES is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesIsNotNull() {
            addCriterion("EMOUDELAYPASSDEALDES is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALDES =", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesNotEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALDES <>", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesGreaterThan(String value) {
            addCriterion("EMOUDELAYPASSDEALDES >", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALDES >=", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesLessThan(String value) {
            addCriterion("EMOUDELAYPASSDEALDES <", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSDEALDES <=", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesLike(String value) {
            addCriterion("EMOUDELAYPASSDEALDES like", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesNotLike(String value) {
            addCriterion("EMOUDELAYPASSDEALDES not like", value, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesIn(List<String> values) {
            addCriterion("EMOUDELAYPASSDEALDES in", values, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesNotIn(List<String> values) {
            addCriterion("EMOUDELAYPASSDEALDES not in", values, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSDEALDES between", value1, value2, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassdealdesNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSDEALDES not between", value1, value2, "emoudelaypassdealdes");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateIsNull() {
            addCriterion("EMOUDELAYPASSSTATE is null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateIsNotNull() {
            addCriterion("EMOUDELAYPASSSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateEqualTo(String value) {
            addCriterion("EMOUDELAYPASSSTATE =", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateNotEqualTo(String value) {
            addCriterion("EMOUDELAYPASSSTATE <>", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateGreaterThan(String value) {
            addCriterion("EMOUDELAYPASSSTATE >", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSSTATE >=", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateLessThan(String value) {
            addCriterion("EMOUDELAYPASSSTATE <", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateLessThanOrEqualTo(String value) {
            addCriterion("EMOUDELAYPASSSTATE <=", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateLike(String value) {
            addCriterion("EMOUDELAYPASSSTATE like", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateNotLike(String value) {
            addCriterion("EMOUDELAYPASSSTATE not like", value, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateIn(List<String> values) {
            addCriterion("EMOUDELAYPASSSTATE in", values, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateNotIn(List<String> values) {
            addCriterion("EMOUDELAYPASSSTATE not in", values, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSSTATE between", value1, value2, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andEmoudelaypassstateNotBetween(String value1, String value2) {
            addCriterion("EMOUDELAYPASSSTATE not between", value1, value2, "emoudelaypassstate");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeIsNull() {
            addCriterion("FAULTDISCOVTIME is null");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeIsNotNull() {
            addCriterion("FAULTDISCOVTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTDISCOVTIME =", value, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTDISCOVTIME <>", value, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("FAULTDISCOVTIME >", value, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTDISCOVTIME >=", value, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeLessThan(Date value) {
            addCriterionForJDBCDate("FAULTDISCOVTIME <", value, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FAULTDISCOVTIME <=", value, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeIn(List<Date> values) {
            addCriterionForJDBCDate("FAULTDISCOVTIME in", values, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("FAULTDISCOVTIME not in", values, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FAULTDISCOVTIME between", value1, value2, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andFaultdiscovtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FAULTDISCOVTIME not between", value1, value2, "faultdiscovtime");
            return (Criteria) this;
        }

        public Criteria andPredealtypeIsNull() {
            addCriterion("PREDEALTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPredealtypeIsNotNull() {
            addCriterion("PREDEALTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPredealtypeEqualTo(String value) {
            addCriterion("PREDEALTYPE =", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeNotEqualTo(String value) {
            addCriterion("PREDEALTYPE <>", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeGreaterThan(String value) {
            addCriterion("PREDEALTYPE >", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PREDEALTYPE >=", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeLessThan(String value) {
            addCriterion("PREDEALTYPE <", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeLessThanOrEqualTo(String value) {
            addCriterion("PREDEALTYPE <=", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeLike(String value) {
            addCriterion("PREDEALTYPE like", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeNotLike(String value) {
            addCriterion("PREDEALTYPE not like", value, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeIn(List<String> values) {
            addCriterion("PREDEALTYPE in", values, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeNotIn(List<String> values) {
            addCriterion("PREDEALTYPE not in", values, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeBetween(String value1, String value2) {
            addCriterion("PREDEALTYPE between", value1, value2, "predealtype");
            return (Criteria) this;
        }

        public Criteria andPredealtypeNotBetween(String value1, String value2) {
            addCriterion("PREDEALTYPE not between", value1, value2, "predealtype");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedIsNull() {
            addCriterion("ALARMSTAIDOWNED is null");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedIsNotNull() {
            addCriterion("ALARMSTAIDOWNED is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedEqualTo(String value) {
            addCriterion("ALARMSTAIDOWNED =", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedNotEqualTo(String value) {
            addCriterion("ALARMSTAIDOWNED <>", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedGreaterThan(String value) {
            addCriterion("ALARMSTAIDOWNED >", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedGreaterThanOrEqualTo(String value) {
            addCriterion("ALARMSTAIDOWNED >=", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedLessThan(String value) {
            addCriterion("ALARMSTAIDOWNED <", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedLessThanOrEqualTo(String value) {
            addCriterion("ALARMSTAIDOWNED <=", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedLike(String value) {
            addCriterion("ALARMSTAIDOWNED like", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedNotLike(String value) {
            addCriterion("ALARMSTAIDOWNED not like", value, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedIn(List<String> values) {
            addCriterion("ALARMSTAIDOWNED in", values, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedNotIn(List<String> values) {
            addCriterion("ALARMSTAIDOWNED not in", values, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedBetween(String value1, String value2) {
            addCriterion("ALARMSTAIDOWNED between", value1, value2, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andAlarmstaidownedNotBetween(String value1, String value2) {
            addCriterion("ALARMSTAIDOWNED not between", value1, value2, "alarmstaidowned");
            return (Criteria) this;
        }

        public Criteria andKeyareanameIsNull() {
            addCriterion("KEYAREANAME is null");
            return (Criteria) this;
        }

        public Criteria andKeyareanameIsNotNull() {
            addCriterion("KEYAREANAME is not null");
            return (Criteria) this;
        }

        public Criteria andKeyareanameEqualTo(String value) {
            addCriterion("KEYAREANAME =", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameNotEqualTo(String value) {
            addCriterion("KEYAREANAME <>", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameGreaterThan(String value) {
            addCriterion("KEYAREANAME >", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameGreaterThanOrEqualTo(String value) {
            addCriterion("KEYAREANAME >=", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameLessThan(String value) {
            addCriterion("KEYAREANAME <", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameLessThanOrEqualTo(String value) {
            addCriterion("KEYAREANAME <=", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameLike(String value) {
            addCriterion("KEYAREANAME like", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameNotLike(String value) {
            addCriterion("KEYAREANAME not like", value, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameIn(List<String> values) {
            addCriterion("KEYAREANAME in", values, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameNotIn(List<String> values) {
            addCriterion("KEYAREANAME not in", values, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameBetween(String value1, String value2) {
            addCriterion("KEYAREANAME between", value1, value2, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andKeyareanameNotBetween(String value1, String value2) {
            addCriterion("KEYAREANAME not between", value1, value2, "keyareaname");
            return (Criteria) this;
        }

        public Criteria andCqcstimeIsNull() {
            addCriterion("CQCSTIME is null");
            return (Criteria) this;
        }

        public Criteria andCqcstimeIsNotNull() {
            addCriterion("CQCSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCqcstimeEqualTo(Date value) {
            addCriterionForJDBCDate("CQCSTIME =", value, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CQCSTIME <>", value, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CQCSTIME >", value, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CQCSTIME >=", value, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeLessThan(Date value) {
            addCriterionForJDBCDate("CQCSTIME <", value, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CQCSTIME <=", value, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeIn(List<Date> values) {
            addCriterionForJDBCDate("CQCSTIME in", values, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CQCSTIME not in", values, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CQCSTIME between", value1, value2, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCqcstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CQCSTIME not between", value1, value2, "cqcstime");
            return (Criteria) this;
        }

        public Criteria andCheckmodesIsNull() {
            addCriterion("CHECKMODES is null");
            return (Criteria) this;
        }

        public Criteria andCheckmodesIsNotNull() {
            addCriterion("CHECKMODES is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmodesEqualTo(String value) {
            addCriterion("CHECKMODES =", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesNotEqualTo(String value) {
            addCriterion("CHECKMODES <>", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesGreaterThan(String value) {
            addCriterion("CHECKMODES >", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKMODES >=", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesLessThan(String value) {
            addCriterion("CHECKMODES <", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesLessThanOrEqualTo(String value) {
            addCriterion("CHECKMODES <=", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesLike(String value) {
            addCriterion("CHECKMODES like", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesNotLike(String value) {
            addCriterion("CHECKMODES not like", value, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesIn(List<String> values) {
            addCriterion("CHECKMODES in", values, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesNotIn(List<String> values) {
            addCriterion("CHECKMODES not in", values, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesBetween(String value1, String value2) {
            addCriterion("CHECKMODES between", value1, value2, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andCheckmodesNotBetween(String value1, String value2) {
            addCriterion("CHECKMODES not between", value1, value2, "checkmodes");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagIsNull() {
            addCriterion("EMOUREPLYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagIsNotNull() {
            addCriterion("EMOUREPLYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagEqualTo(String value) {
            addCriterion("EMOUREPLYFLAG =", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagNotEqualTo(String value) {
            addCriterion("EMOUREPLYFLAG <>", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagGreaterThan(String value) {
            addCriterion("EMOUREPLYFLAG >", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagGreaterThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYFLAG >=", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagLessThan(String value) {
            addCriterion("EMOUREPLYFLAG <", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagLessThanOrEqualTo(String value) {
            addCriterion("EMOUREPLYFLAG <=", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagLike(String value) {
            addCriterion("EMOUREPLYFLAG like", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagNotLike(String value) {
            addCriterion("EMOUREPLYFLAG not like", value, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagIn(List<String> values) {
            addCriterion("EMOUREPLYFLAG in", values, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagNotIn(List<String> values) {
            addCriterion("EMOUREPLYFLAG not in", values, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagBetween(String value1, String value2) {
            addCriterion("EMOUREPLYFLAG between", value1, value2, "emoureplyflag");
            return (Criteria) this;
        }

        public Criteria andEmoureplyflagNotBetween(String value1, String value2) {
            addCriterion("EMOUREPLYFLAG not between", value1, value2, "emoureplyflag");
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