package com.role.mis.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmpRoleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public EmpRoleExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
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

        public Criteria andEridIsNull() {
            addCriterion("erid is null");
            return (Criteria) this;
        }

        public Criteria andEridIsNotNull() {
            addCriterion("erid is not null");
            return (Criteria) this;
        }

        public Criteria andEridEqualTo(Integer value) {
            addCriterion("erid =", value, "erid");
            return (Criteria) this;
        }

        public Criteria andEridNotEqualTo(Integer value) {
            addCriterion("erid <>", value, "erid");
            return (Criteria) this;
        }

        public Criteria andEridGreaterThan(Integer value) {
            addCriterion("erid >", value, "erid");
            return (Criteria) this;
        }

        public Criteria andEridGreaterThanOrEqualTo(Integer value) {
            addCriterion("erid >=", value, "erid");
            return (Criteria) this;
        }

        public Criteria andEridLessThan(Integer value) {
            addCriterion("erid <", value, "erid");
            return (Criteria) this;
        }

        public Criteria andEridLessThanOrEqualTo(Integer value) {
            addCriterion("erid <=", value, "erid");
            return (Criteria) this;
        }

        public Criteria andEridIn(List<Integer> values) {
            addCriterion("erid in", values, "erid");
            return (Criteria) this;
        }

        public Criteria andEridNotIn(List<Integer> values) {
            addCriterion("erid not in", values, "erid");
            return (Criteria) this;
        }

        public Criteria andEridBetween(Integer value1, Integer value2) {
            addCriterion("erid between", value1, value2, "erid");
            return (Criteria) this;
        }

        public Criteria andEridNotBetween(Integer value1, Integer value2) {
            addCriterion("erid not between", value1, value2, "erid");
            return (Criteria) this;
        }

        public Criteria andRoleFkIsNull() {
            addCriterion("role_fk is null");
            return (Criteria) this;
        }

        public Criteria andRoleFkIsNotNull() {
            addCriterion("role_fk is not null");
            return (Criteria) this;
        }

        public Criteria andRoleFkEqualTo(Integer value) {
            addCriterion("role_fk =", value, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkNotEqualTo(Integer value) {
            addCriterion("role_fk <>", value, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkGreaterThan(Integer value) {
            addCriterion("role_fk >", value, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_fk >=", value, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkLessThan(Integer value) {
            addCriterion("role_fk <", value, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkLessThanOrEqualTo(Integer value) {
            addCriterion("role_fk <=", value, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkIn(List<Integer> values) {
            addCriterion("role_fk in", values, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkNotIn(List<Integer> values) {
            addCriterion("role_fk not in", values, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkBetween(Integer value1, Integer value2) {
            addCriterion("role_fk between", value1, value2, "roleFk");
            return (Criteria) this;
        }

        public Criteria andRoleFkNotBetween(Integer value1, Integer value2) {
            addCriterion("role_fk not between", value1, value2, "roleFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkIsNull() {
            addCriterion("emp_fk is null");
            return (Criteria) this;
        }

        public Criteria andEmpFkIsNotNull() {
            addCriterion("emp_fk is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFkEqualTo(Integer value) {
            addCriterion("emp_fk =", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkNotEqualTo(Integer value) {
            addCriterion("emp_fk <>", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkGreaterThan(Integer value) {
            addCriterion("emp_fk >", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_fk >=", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkLessThan(Integer value) {
            addCriterion("emp_fk <", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkLessThanOrEqualTo(Integer value) {
            addCriterion("emp_fk <=", value, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkIn(List<Integer> values) {
            addCriterion("emp_fk in", values, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkNotIn(List<Integer> values) {
            addCriterion("emp_fk not in", values, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkBetween(Integer value1, Integer value2) {
            addCriterion("emp_fk between", value1, value2, "empFk");
            return (Criteria) this;
        }

        public Criteria andEmpFkNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_fk not between", value1, value2, "empFk");
            return (Criteria) this;
        }

        public Criteria andErdisIsNull() {
            addCriterion("erdis is null");
            return (Criteria) this;
        }

        public Criteria andErdisIsNotNull() {
            addCriterion("erdis is not null");
            return (Criteria) this;
        }

        public Criteria andErdisEqualTo(String value) {
            addCriterion("erdis =", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisNotEqualTo(String value) {
            addCriterion("erdis <>", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisGreaterThan(String value) {
            addCriterion("erdis >", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisGreaterThanOrEqualTo(String value) {
            addCriterion("erdis >=", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisLessThan(String value) {
            addCriterion("erdis <", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisLessThanOrEqualTo(String value) {
            addCriterion("erdis <=", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisLike(String value) {
            addCriterion("erdis like", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisNotLike(String value) {
            addCriterion("erdis not like", value, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisIn(List<String> values) {
            addCriterion("erdis in", values, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisNotIn(List<String> values) {
            addCriterion("erdis not in", values, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisBetween(String value1, String value2) {
            addCriterion("erdis between", value1, value2, "erdis");
            return (Criteria) this;
        }

        public Criteria andErdisNotBetween(String value1, String value2) {
            addCriterion("erdis not between", value1, value2, "erdis");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table emp_role
     *
     * @mbg.generated do_not_delete_during_merge Mon Sep 21 19:09:27 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
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