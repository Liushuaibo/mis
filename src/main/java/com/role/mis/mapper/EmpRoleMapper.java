package com.role.mis.mapper;

import com.role.mis.pojo.EmpRole;
import com.role.mis.pojo.EmpRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    long countByExample(EmpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int deleteByExample(EmpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int deleteByPrimaryKey(Integer erid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int insert(EmpRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int insertSelective(EmpRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    List<EmpRole> selectByExample(EmpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    EmpRole selectByPrimaryKey(Integer erid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int updateByExampleSelective(@Param("record") EmpRole record, @Param("example") EmpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int updateByExample(@Param("record") EmpRole record, @Param("example") EmpRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int updateByPrimaryKeySelective(EmpRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp_role
     *
     * @mbg.generated Mon Sep 21 19:09:27 CST 2020
     */
    int updateByPrimaryKey(EmpRole record);
}