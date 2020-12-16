package com.role.mis.service;

import com.role.mis.pojo.Employee;
import com.role.mis.qo.EmployeeQuery;

import java.util.List;

public interface EmployeeService {


    List<Employee> findByPageQuery(int pageNum, int pageSize, EmployeeQuery employeeQuery);

    boolean save(Employee employee, int roleid);

    Employee findById(int eid);

    boolean update(Employee employee, int roleid);

    boolean delete(String ids);

    List<Employee> findAll();

    Employee login(String username, String password);
}
