package com.schoolrun.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTrecomIsNull() {
            addCriterion("trecom is null");
            return (Criteria) this;
        }

        public Criteria andTrecomIsNotNull() {
            addCriterion("trecom is not null");
            return (Criteria) this;
        }

        public Criteria andTrecomEqualTo(String value) {
            addCriterion("trecom =", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomNotEqualTo(String value) {
            addCriterion("trecom <>", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomGreaterThan(String value) {
            addCriterion("trecom >", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomGreaterThanOrEqualTo(String value) {
            addCriterion("trecom >=", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomLessThan(String value) {
            addCriterion("trecom <", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomLessThanOrEqualTo(String value) {
            addCriterion("trecom <=", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomLike(String value) {
            addCriterion("trecom like", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomNotLike(String value) {
            addCriterion("trecom not like", value, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomIn(List<String> values) {
            addCriterion("trecom in", values, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomNotIn(List<String> values) {
            addCriterion("trecom not in", values, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomBetween(String value1, String value2) {
            addCriterion("trecom between", value1, value2, "trecom");
            return (Criteria) this;
        }

        public Criteria andTrecomNotBetween(String value1, String value2) {
            addCriterion("trecom not between", value1, value2, "trecom");
            return (Criteria) this;
        }

        public Criteria andTadressIsNull() {
            addCriterion("tadress is null");
            return (Criteria) this;
        }

        public Criteria andTadressIsNotNull() {
            addCriterion("tadress is not null");
            return (Criteria) this;
        }

        public Criteria andTadressEqualTo(String value) {
            addCriterion("tadress =", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressNotEqualTo(String value) {
            addCriterion("tadress <>", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressGreaterThan(String value) {
            addCriterion("tadress >", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressGreaterThanOrEqualTo(String value) {
            addCriterion("tadress >=", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressLessThan(String value) {
            addCriterion("tadress <", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressLessThanOrEqualTo(String value) {
            addCriterion("tadress <=", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressLike(String value) {
            addCriterion("tadress like", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressNotLike(String value) {
            addCriterion("tadress not like", value, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressIn(List<String> values) {
            addCriterion("tadress in", values, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressNotIn(List<String> values) {
            addCriterion("tadress not in", values, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressBetween(String value1, String value2) {
            addCriterion("tadress between", value1, value2, "tadress");
            return (Criteria) this;
        }

        public Criteria andTadressNotBetween(String value1, String value2) {
            addCriterion("tadress not between", value1, value2, "tadress");
            return (Criteria) this;
        }

        public Criteria andTmainIsNull() {
            addCriterion("tmain is null");
            return (Criteria) this;
        }

        public Criteria andTmainIsNotNull() {
            addCriterion("tmain is not null");
            return (Criteria) this;
        }

        public Criteria andTmainEqualTo(String value) {
            addCriterion("tmain =", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainNotEqualTo(String value) {
            addCriterion("tmain <>", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainGreaterThan(String value) {
            addCriterion("tmain >", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainGreaterThanOrEqualTo(String value) {
            addCriterion("tmain >=", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainLessThan(String value) {
            addCriterion("tmain <", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainLessThanOrEqualTo(String value) {
            addCriterion("tmain <=", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainLike(String value) {
            addCriterion("tmain like", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainNotLike(String value) {
            addCriterion("tmain not like", value, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainIn(List<String> values) {
            addCriterion("tmain in", values, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainNotIn(List<String> values) {
            addCriterion("tmain not in", values, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainBetween(String value1, String value2) {
            addCriterion("tmain between", value1, value2, "tmain");
            return (Criteria) this;
        }

        public Criteria andTmainNotBetween(String value1, String value2) {
            addCriterion("tmain not between", value1, value2, "tmain");
            return (Criteria) this;
        }

        public Criteria andTdemandIsNull() {
            addCriterion("tdemand is null");
            return (Criteria) this;
        }

        public Criteria andTdemandIsNotNull() {
            addCriterion("tdemand is not null");
            return (Criteria) this;
        }

        public Criteria andTdemandEqualTo(String value) {
            addCriterion("tdemand =", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandNotEqualTo(String value) {
            addCriterion("tdemand <>", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandGreaterThan(String value) {
            addCriterion("tdemand >", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandGreaterThanOrEqualTo(String value) {
            addCriterion("tdemand >=", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandLessThan(String value) {
            addCriterion("tdemand <", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandLessThanOrEqualTo(String value) {
            addCriterion("tdemand <=", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandLike(String value) {
            addCriterion("tdemand like", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandNotLike(String value) {
            addCriterion("tdemand not like", value, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandIn(List<String> values) {
            addCriterion("tdemand in", values, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandNotIn(List<String> values) {
            addCriterion("tdemand not in", values, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandBetween(String value1, String value2) {
            addCriterion("tdemand between", value1, value2, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTdemandNotBetween(String value1, String value2) {
            addCriterion("tdemand not between", value1, value2, "tdemand");
            return (Criteria) this;
        }

        public Criteria andTgiftIsNull() {
            addCriterion("tgift is null");
            return (Criteria) this;
        }

        public Criteria andTgiftIsNotNull() {
            addCriterion("tgift is not null");
            return (Criteria) this;
        }

        public Criteria andTgiftEqualTo(String value) {
            addCriterion("tgift =", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftNotEqualTo(String value) {
            addCriterion("tgift <>", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftGreaterThan(String value) {
            addCriterion("tgift >", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftGreaterThanOrEqualTo(String value) {
            addCriterion("tgift >=", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftLessThan(String value) {
            addCriterion("tgift <", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftLessThanOrEqualTo(String value) {
            addCriterion("tgift <=", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftLike(String value) {
            addCriterion("tgift like", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftNotLike(String value) {
            addCriterion("tgift not like", value, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftIn(List<String> values) {
            addCriterion("tgift in", values, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftNotIn(List<String> values) {
            addCriterion("tgift not in", values, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftBetween(String value1, String value2) {
            addCriterion("tgift between", value1, value2, "tgift");
            return (Criteria) this;
        }

        public Criteria andTgiftNotBetween(String value1, String value2) {
            addCriterion("tgift not between", value1, value2, "tgift");
            return (Criteria) this;
        }

        public Criteria andTevaIsNull() {
            addCriterion("teva is null");
            return (Criteria) this;
        }

        public Criteria andTevaIsNotNull() {
            addCriterion("teva is not null");
            return (Criteria) this;
        }

        public Criteria andTevaEqualTo(Integer value) {
            addCriterion("teva =", value, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaNotEqualTo(Integer value) {
            addCriterion("teva <>", value, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaGreaterThan(Integer value) {
            addCriterion("teva >", value, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaGreaterThanOrEqualTo(Integer value) {
            addCriterion("teva >=", value, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaLessThan(Integer value) {
            addCriterion("teva <", value, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaLessThanOrEqualTo(Integer value) {
            addCriterion("teva <=", value, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaIn(List<Integer> values) {
            addCriterion("teva in", values, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaNotIn(List<Integer> values) {
            addCriterion("teva not in", values, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaBetween(Integer value1, Integer value2) {
            addCriterion("teva between", value1, value2, "teva");
            return (Criteria) this;
        }

        public Criteria andTevaNotBetween(Integer value1, Integer value2) {
            addCriterion("teva not between", value1, value2, "teva");
            return (Criteria) this;
        }

        public Criteria andTstartIsNull() {
            addCriterion("tstart is null");
            return (Criteria) this;
        }

        public Criteria andTstartIsNotNull() {
            addCriterion("tstart is not null");
            return (Criteria) this;
        }

        public Criteria andTstartEqualTo(Date value) {
            addCriterion("tstart =", value, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartNotEqualTo(Date value) {
            addCriterion("tstart <>", value, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartGreaterThan(Date value) {
            addCriterion("tstart >", value, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartGreaterThanOrEqualTo(Date value) {
            addCriterion("tstart >=", value, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartLessThan(Date value) {
            addCriterion("tstart <", value, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartLessThanOrEqualTo(Date value) {
            addCriterion("tstart <=", value, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartIn(List<Date> values) {
            addCriterion("tstart in", values, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartNotIn(List<Date> values) {
            addCriterion("tstart not in", values, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartBetween(Date value1, Date value2) {
            addCriterion("tstart between", value1, value2, "tstart");
            return (Criteria) this;
        }

        public Criteria andTstartNotBetween(Date value1, Date value2) {
            addCriterion("tstart not between", value1, value2, "tstart");
            return (Criteria) this;
        }

        public Criteria andTendIsNull() {
            addCriterion("tend is null");
            return (Criteria) this;
        }

        public Criteria andTendIsNotNull() {
            addCriterion("tend is not null");
            return (Criteria) this;
        }

        public Criteria andTendEqualTo(Date value) {
            addCriterion("tend =", value, "tend");
            return (Criteria) this;
        }

        public Criteria andTendNotEqualTo(Date value) {
            addCriterion("tend <>", value, "tend");
            return (Criteria) this;
        }

        public Criteria andTendGreaterThan(Date value) {
            addCriterion("tend >", value, "tend");
            return (Criteria) this;
        }

        public Criteria andTendGreaterThanOrEqualTo(Date value) {
            addCriterion("tend >=", value, "tend");
            return (Criteria) this;
        }

        public Criteria andTendLessThan(Date value) {
            addCriterion("tend <", value, "tend");
            return (Criteria) this;
        }

        public Criteria andTendLessThanOrEqualTo(Date value) {
            addCriterion("tend <=", value, "tend");
            return (Criteria) this;
        }

        public Criteria andTendIn(List<Date> values) {
            addCriterion("tend in", values, "tend");
            return (Criteria) this;
        }

        public Criteria andTendNotIn(List<Date> values) {
            addCriterion("tend not in", values, "tend");
            return (Criteria) this;
        }

        public Criteria andTendBetween(Date value1, Date value2) {
            addCriterion("tend between", value1, value2, "tend");
            return (Criteria) this;
        }

        public Criteria andTendNotBetween(Date value1, Date value2) {
            addCriterion("tend not between", value1, value2, "tend");
            return (Criteria) this;
        }

        public Criteria andTcompalinIsNull() {
            addCriterion("tcompalin is null");
            return (Criteria) this;
        }

        public Criteria andTcompalinIsNotNull() {
            addCriterion("tcompalin is not null");
            return (Criteria) this;
        }

        public Criteria andTcompalinEqualTo(Integer value) {
            addCriterion("tcompalin =", value, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinNotEqualTo(Integer value) {
            addCriterion("tcompalin <>", value, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinGreaterThan(Integer value) {
            addCriterion("tcompalin >", value, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinGreaterThanOrEqualTo(Integer value) {
            addCriterion("tcompalin >=", value, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinLessThan(Integer value) {
            addCriterion("tcompalin <", value, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinLessThanOrEqualTo(Integer value) {
            addCriterion("tcompalin <=", value, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinIn(List<Integer> values) {
            addCriterion("tcompalin in", values, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinNotIn(List<Integer> values) {
            addCriterion("tcompalin not in", values, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinBetween(Integer value1, Integer value2) {
            addCriterion("tcompalin between", value1, value2, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTcompalinNotBetween(Integer value1, Integer value2) {
            addCriterion("tcompalin not between", value1, value2, "tcompalin");
            return (Criteria) this;
        }

        public Criteria andTstateIsNull() {
            addCriterion("tstate is null");
            return (Criteria) this;
        }

        public Criteria andTstateIsNotNull() {
            addCriterion("tstate is not null");
            return (Criteria) this;
        }

        public Criteria andTstateEqualTo(Integer value) {
            addCriterion("tstate =", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateNotEqualTo(Integer value) {
            addCriterion("tstate <>", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateGreaterThan(Integer value) {
            addCriterion("tstate >", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("tstate >=", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateLessThan(Integer value) {
            addCriterion("tstate <", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateLessThanOrEqualTo(Integer value) {
            addCriterion("tstate <=", value, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateIn(List<Integer> values) {
            addCriterion("tstate in", values, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateNotIn(List<Integer> values) {
            addCriterion("tstate not in", values, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateBetween(Integer value1, Integer value2) {
            addCriterion("tstate between", value1, value2, "tstate");
            return (Criteria) this;
        }

        public Criteria andTstateNotBetween(Integer value1, Integer value2) {
            addCriterion("tstate not between", value1, value2, "tstate");
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