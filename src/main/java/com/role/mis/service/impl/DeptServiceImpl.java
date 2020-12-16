package com.role.mis.service.impl;

import com.github.pagehelper.PageHelper;
import com.role.mis.mapper.DeptMapper;
import com.role.mis.pojo.Dept;
import com.role.mis.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.selectByExample(null);
    }

    @Override
    public List<Dept> page(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return deptMapper.selectByExample(null);
    }

    @Override
    public boolean save(Dept dept) {
        return deptMapper.insertSelective(dept)>0;
    }

    @Override
    public boolean update(Dept dept) {
        return deptMapper.updateByPrimaryKeySelective(dept)>0;
    }

    @Override
    public Dept findById(int id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean delete(String ids) {
        List<Integer> deptnoList = Arrays.stream(ids.split("-")).map(id -> Integer.valueOf(id)).collect(Collectors.toList());
        for (Integer id : deptnoList) {
            deptMapper.deleteByPrimaryKey(id);
        }
        return true;
    }
}
