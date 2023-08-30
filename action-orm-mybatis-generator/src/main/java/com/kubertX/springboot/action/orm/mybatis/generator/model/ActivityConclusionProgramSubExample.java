package com.kubertX.springboot.action.orm.mybatis.generator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivityConclusionProgramSubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityConclusionProgramSubExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdIsNull() {
            addCriterion("ACTIVITY_CONCLUSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdIsNotNull() {
            addCriterion("ACTIVITY_CONCLUSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdEqualTo(Integer value) {
            addCriterion("ACTIVITY_CONCLUSION_ID =", value, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdNotEqualTo(Integer value) {
            addCriterion("ACTIVITY_CONCLUSION_ID <>", value, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdGreaterThan(Integer value) {
            addCriterion("ACTIVITY_CONCLUSION_ID >", value, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_CONCLUSION_ID >=", value, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdLessThan(Integer value) {
            addCriterion("ACTIVITY_CONCLUSION_ID <", value, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_CONCLUSION_ID <=", value, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdIn(List<Integer> values) {
            addCriterion("ACTIVITY_CONCLUSION_ID in", values, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdNotIn(List<Integer> values) {
            addCriterion("ACTIVITY_CONCLUSION_ID not in", values, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_CONCLUSION_ID between", value1, value2, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityConclusionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_CONCLUSION_ID not between", value1, value2, "activityConclusionId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdIsNull() {
            addCriterion("ACTIVITY_PROGRAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdIsNotNull() {
            addCriterion("ACTIVITY_PROGRAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_ID =", value, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdNotEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_ID <>", value, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdGreaterThan(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_ID >", value, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_ID >=", value, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdLessThan(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_ID <", value, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_ID <=", value, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdIn(List<Integer> values) {
            addCriterion("ACTIVITY_PROGRAM_ID in", values, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdNotIn(List<Integer> values) {
            addCriterion("ACTIVITY_PROGRAM_ID not in", values, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_PROGRAM_ID between", value1, value2, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_PROGRAM_ID not between", value1, value2, "activityProgramId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdIsNull() {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdIsNotNull() {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID =", value, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdNotEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID <>", value, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdGreaterThan(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID >", value, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID >=", value, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdLessThan(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID <", value, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID <=", value, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdIn(List<Integer> values) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID in", values, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdNotIn(List<Integer> values) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID not in", values, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID between", value1, value2, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActivityProgramSubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVITY_PROGRAM_SUB_ID not between", value1, value2, "activityProgramSubId");
            return (Criteria) this;
        }

        public Criteria andActualCostIsNull() {
            addCriterion("ACTUAL_COST is null");
            return (Criteria) this;
        }

        public Criteria andActualCostIsNotNull() {
            addCriterion("ACTUAL_COST is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST =", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST <>", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST >", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST >=", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST <", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST <=", value, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST in", values, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST not in", values, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST between", value1, value2, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST not between", value1, value2, "actualCost");
            return (Criteria) this;
        }

        public Criteria andActualCostMallIsNull() {
            addCriterion("ACTUAL_COST_MALL is null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallIsNotNull() {
            addCriterion("ACTUAL_COST_MALL is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL =", value, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL <>", value, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL >", value, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL >=", value, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL <", value, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL <=", value, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL in", values, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL not in", values, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL between", value1, value2, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostMallNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL not between", value1, value2, "actualCostMall");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantIsNull() {
            addCriterion("ACTUAL_COST_TENANT is null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantIsNotNull() {
            addCriterion("ACTUAL_COST_TENANT is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT =", value, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT <>", value, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT >", value, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT >=", value, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT <", value, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT <=", value, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT in", values, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT not in", values, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT between", value1, value2, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT not between", value1, value2, "actualCostTenant");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdIsNull() {
            addCriterion("ACTUAL_COST_THIRD is null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdIsNotNull() {
            addCriterion("ACTUAL_COST_THIRD is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD =", value, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD <>", value, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD >", value, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD >=", value, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD <", value, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD <=", value, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD in", values, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD not in", values, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD between", value1, value2, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD not between", value1, value2, "actualCostThird");
            return (Criteria) this;
        }

        public Criteria andActualCostPrIsNull() {
            addCriterion("ACTUAL_COST_PR is null");
            return (Criteria) this;
        }

        public Criteria andActualCostPrIsNotNull() {
            addCriterion("ACTUAL_COST_PR is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostPrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_PR =", value, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_PR <>", value, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_PR >", value, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_PR >=", value, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_PR <", value, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_PR <=", value, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_PR in", values, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_PR not in", values, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_PR between", value1, value2, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostPrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_PR not between", value1, value2, "actualCostPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrIsNull() {
            addCriterion("ACTUAL_COST_MALL_PR is null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrIsNotNull() {
            addCriterion("ACTUAL_COST_MALL_PR is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_PR =", value, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_PR <>", value, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_PR >", value, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_PR >=", value, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_PR <", value, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_PR <=", value, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_PR in", values, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_PR not in", values, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_PR between", value1, value2, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostMallPrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_PR not between", value1, value2, "actualCostMallPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrIsNull() {
            addCriterion("ACTUAL_COST_TENANT_PR is null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrIsNotNull() {
            addCriterion("ACTUAL_COST_TENANT_PR is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_PR =", value, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_PR <>", value, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_PR >", value, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_PR >=", value, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_PR <", value, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_PR <=", value, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_PR in", values, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_PR not in", values, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_PR between", value1, value2, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantPrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_PR not between", value1, value2, "actualCostTenantPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrIsNull() {
            addCriterion("ACTUAL_COST_THIRD_PR is null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrIsNotNull() {
            addCriterion("ACTUAL_COST_THIRD_PR is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_PR =", value, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_PR <>", value, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_PR >", value, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_PR >=", value, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_PR <", value, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_PR <=", value, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_PR in", values, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_PR not in", values, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_PR between", value1, value2, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdPrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_PR not between", value1, value2, "actualCostThirdPr");
            return (Criteria) this;
        }

        public Criteria andActualCostSpIsNull() {
            addCriterion("ACTUAL_COST_SP is null");
            return (Criteria) this;
        }

        public Criteria andActualCostSpIsNotNull() {
            addCriterion("ACTUAL_COST_SP is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostSpEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_SP =", value, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_SP <>", value, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_SP >", value, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_SP >=", value, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_SP <", value, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_SP <=", value, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_SP in", values, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_SP not in", values, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_SP between", value1, value2, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostSpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_SP not between", value1, value2, "actualCostSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpIsNull() {
            addCriterion("ACTUAL_COST_MALL_SP is null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpIsNotNull() {
            addCriterion("ACTUAL_COST_MALL_SP is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_SP =", value, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_SP <>", value, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_SP >", value, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_SP >=", value, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_SP <", value, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_SP <=", value, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_SP in", values, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_SP not in", values, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_SP between", value1, value2, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostMallSpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_SP not between", value1, value2, "actualCostMallSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpIsNull() {
            addCriterion("ACTUAL_COST_TENANT_SP is null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpIsNotNull() {
            addCriterion("ACTUAL_COST_TENANT_SP is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_SP =", value, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_SP <>", value, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_SP >", value, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_SP >=", value, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_SP <", value, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_SP <=", value, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_SP in", values, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_SP not in", values, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_SP between", value1, value2, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantSpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_SP not between", value1, value2, "actualCostTenantSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpIsNull() {
            addCriterion("ACTUAL_COST_THIRD_SP is null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpIsNotNull() {
            addCriterion("ACTUAL_COST_THIRD_SP is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_SP =", value, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_SP <>", value, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_SP >", value, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_SP >=", value, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_SP <", value, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_SP <=", value, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_SP in", values, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_SP not in", values, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_SP between", value1, value2, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdSpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_SP not between", value1, value2, "actualCostThirdSp");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmIsNull() {
            addCriterion("ACTUAL_COST_CRM is null");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmIsNotNull() {
            addCriterion("ACTUAL_COST_CRM is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_CRM =", value, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_CRM <>", value, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_CRM >", value, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_CRM >=", value, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_CRM <", value, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_CRM <=", value, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_CRM in", values, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_CRM not in", values, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_CRM between", value1, value2, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostCrmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_CRM not between", value1, value2, "actualCostCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmIsNull() {
            addCriterion("ACTUAL_COST_MALL_CRM is null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmIsNotNull() {
            addCriterion("ACTUAL_COST_MALL_CRM is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_CRM =", value, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_CRM <>", value, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_CRM >", value, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_CRM >=", value, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_CRM <", value, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_CRM <=", value, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_CRM in", values, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_CRM not in", values, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_CRM between", value1, value2, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostMallCrmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_CRM not between", value1, value2, "actualCostMallCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmIsNull() {
            addCriterion("ACTUAL_COST_TENANT_CRM is null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmIsNotNull() {
            addCriterion("ACTUAL_COST_TENANT_CRM is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_CRM =", value, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_CRM <>", value, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_CRM >", value, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_CRM >=", value, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_CRM <", value, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_CRM <=", value, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_CRM in", values, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_CRM not in", values, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_CRM between", value1, value2, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantCrmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_CRM not between", value1, value2, "actualCostTenantCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmIsNull() {
            addCriterion("ACTUAL_COST_THIRD_CRM is null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmIsNotNull() {
            addCriterion("ACTUAL_COST_THIRD_CRM is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_CRM =", value, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_CRM <>", value, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_CRM >", value, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_CRM >=", value, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_CRM <", value, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_CRM <=", value, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_CRM in", values, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_CRM not in", values, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_CRM between", value1, value2, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdCrmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_CRM not between", value1, value2, "actualCostThirdCrm");
            return (Criteria) this;
        }

        public Criteria andActualCostEcIsNull() {
            addCriterion("ACTUAL_COST_EC is null");
            return (Criteria) this;
        }

        public Criteria andActualCostEcIsNotNull() {
            addCriterion("ACTUAL_COST_EC is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostEcEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_EC =", value, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_EC <>", value, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_EC >", value, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_EC >=", value, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_EC <", value, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_EC <=", value, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_EC in", values, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_EC not in", values, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_EC between", value1, value2, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostEcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_EC not between", value1, value2, "actualCostEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcIsNull() {
            addCriterion("ACTUAL_COST_MALL_EC is null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcIsNotNull() {
            addCriterion("ACTUAL_COST_MALL_EC is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_EC =", value, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_EC <>", value, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_EC >", value, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_EC >=", value, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_EC <", value, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_MALL_EC <=", value, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_EC in", values, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_MALL_EC not in", values, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_EC between", value1, value2, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostMallEcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_MALL_EC not between", value1, value2, "actualCostMallEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcIsNull() {
            addCriterion("ACTUAL_COST_TENANT_EC is null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcIsNotNull() {
            addCriterion("ACTUAL_COST_TENANT_EC is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_EC =", value, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_EC <>", value, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_EC >", value, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_EC >=", value, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_EC <", value, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_TENANT_EC <=", value, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_EC in", values, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_TENANT_EC not in", values, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_EC between", value1, value2, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostTenantEcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_TENANT_EC not between", value1, value2, "actualCostTenantEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcIsNull() {
            addCriterion("ACTUAL_COST_THIRD_EC is null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcIsNotNull() {
            addCriterion("ACTUAL_COST_THIRD_EC is not null");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_EC =", value, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_EC <>", value, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_EC >", value, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_EC >=", value, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcLessThan(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_EC <", value, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_COST_THIRD_EC <=", value, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_EC in", values, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_COST_THIRD_EC not in", values, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_EC between", value1, value2, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andActualCostThirdEcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_COST_THIRD_EC not between", value1, value2, "actualCostThirdEc");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("IS_DELETED like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("IS_DELETED not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNull() {
            addCriterion("CREATE_BY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNotNull() {
            addCriterion("CREATE_BY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameEqualTo(String value) {
            addCriterion("CREATE_BY_NAME =", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotEqualTo(String value) {
            addCriterion("CREATE_BY_NAME <>", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThan(String value) {
            addCriterion("CREATE_BY_NAME >", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY_NAME >=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThan(String value) {
            addCriterion("CREATE_BY_NAME <", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY_NAME <=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLike(String value) {
            addCriterion("CREATE_BY_NAME like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotLike(String value) {
            addCriterion("CREATE_BY_NAME not like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIn(List<String> values) {
            addCriterion("CREATE_BY_NAME in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotIn(List<String> values) {
            addCriterion("CREATE_BY_NAME not in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameBetween(String value1, String value2) {
            addCriterion("CREATE_BY_NAME between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY_NAME not between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNull() {
            addCriterion("LAST_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIsNotNull() {
            addCriterion("LAST_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY =", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <>", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY >", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY >=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThan(String value) {
            addCriterion("LAST_UPDATE_BY <", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY <=", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByLike(String value) {
            addCriterion("LAST_UPDATE_BY like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotLike(String value) {
            addCriterion("LAST_UPDATE_BY not like", value, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY not in", values, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY not between", value1, value2, "lastUpdateBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameIsNull() {
            addCriterion("LAST_UPDATE_BY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameIsNotNull() {
            addCriterion("LAST_UPDATE_BY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY_NAME =", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY_NAME <>", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameGreaterThan(String value) {
            addCriterion("LAST_UPDATE_BY_NAME >", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY_NAME >=", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameLessThan(String value) {
            addCriterion("LAST_UPDATE_BY_NAME <", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPDATE_BY_NAME <=", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameLike(String value) {
            addCriterion("LAST_UPDATE_BY_NAME like", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotLike(String value) {
            addCriterion("LAST_UPDATE_BY_NAME not like", value, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY_NAME in", values, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotIn(List<String> values) {
            addCriterion("LAST_UPDATE_BY_NAME not in", values, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY_NAME between", value1, value2, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateByNameNotBetween(String value1, String value2) {
            addCriterion("LAST_UPDATE_BY_NAME not between", value1, value2, "lastUpdateByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
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