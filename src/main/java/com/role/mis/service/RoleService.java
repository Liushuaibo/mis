package com.role.mis.service;

import com.role.mis.pojo.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    List<Role> page(int pageNum,int pageSize);

    boolean save(Role role, String ids);

    Role findById(int id);

    boolean update(Role role, String ids);

    boolean delete(String ids);
}
