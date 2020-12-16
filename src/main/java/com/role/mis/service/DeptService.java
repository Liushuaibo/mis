package com.role.mis.service;

import com.role.mis.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();

    List<Dept> page(int pageNum, int pageSize);

    boolean save(Dept dept);

    boolean update(Dept dept);

    Dept findById(int id);

    boolean delete(String ids);
}
