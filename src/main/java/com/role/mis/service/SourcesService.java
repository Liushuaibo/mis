package com.role.mis.service;

import com.role.mis.pojo.Sources;

import java.util.List;

public interface SourcesService {
    Sources findRoot();

    boolean save(Sources sources);

    List<Sources> findAll();

    Sources findById(int id);

    boolean update(Sources sources);

    boolean delete(int id);

    List<Sources> findByPid();

    List<Sources> findByEid(int eid);
}
