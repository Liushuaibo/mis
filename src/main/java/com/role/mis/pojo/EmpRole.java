package com.role.mis.pojo;

public class EmpRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp_role.erid
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    private Integer erid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp_role.role_fk
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    private Integer roleFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp_role.emp_fk
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    private Integer empFk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emp_role.erdis
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    private String erdis;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp_role.erid
     *
     * @return the value of emp_role.erid
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public Integer getErid() {
        return erid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp_role.erid
     *
     * @param erid the value for emp_role.erid
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void setErid(Integer erid) {
        this.erid = erid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp_role.role_fk
     *
     * @return the value of emp_role.role_fk
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public Integer getRoleFk() {
        return roleFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp_role.role_fk
     *
     * @param roleFk the value for emp_role.role_fk
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void setRoleFk(Integer roleFk) {
        this.roleFk = roleFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp_role.emp_fk
     *
     * @return the value of emp_role.emp_fk
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public Integer getEmpFk() {
        return empFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp_role.emp_fk
     *
     * @param empFk the value for emp_role.emp_fk
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void setEmpFk(Integer empFk) {
        this.empFk = empFk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emp_role.erdis
     *
     * @return the value of emp_role.erdis
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public String getErdis() {
        return erdis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emp_role.erdis
     *
     * @param erdis the value for emp_role.erdis
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    public void setErdis(String erdis) {
        this.erdis = erdis == null ? null : erdis.trim();
    }
}