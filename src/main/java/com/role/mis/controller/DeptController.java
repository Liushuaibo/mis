package com.role.mis.controller;

import com.github.pagehelper.PageInfo;
import com.role.mis.pojo.Dept;
import com.role.mis.service.DeptService;
import com.role.mis.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("all")
    public R findAll(){
        List<Dept> list = deptService.findAll();
        return CollectionUtils.isEmpty(list)?R.error().msg("查询失败"):R.ok().data("items",list);
    }

    @GetMapping("{pageNum}/{pageSize}")
    public R page(@PathVariable int pageNum, @PathVariable int pageSize){
        List<Dept> list = deptService.page(pageNum,pageSize);
        return CollectionUtils.isEmpty(list)?R.error().msg("查询失败!"):R.ok().data("items", new PageInfo<>(list));
    }

    @PostMapping("save")
    public R save(@RequestBody Dept dept){
        boolean ret = deptService.save(dept);
        return ret?R.ok(): R.error().msg("添加失败!");
    }

    @GetMapping("{id}")
    public R findById(@PathVariable int id){
        Dept dept = deptService.findById(id);
        return ObjectUtils.isEmpty(dept)? R.error().msg("查询失败"):R.ok().data("item",dept);
    }

    @PostMapping("update")
    public R update(@RequestBody Dept dept){
        boolean ret = deptService.update(dept);
        return ret?R.ok(): R.error().msg("修改失败!");
    }

    @PostMapping("{ids}")
    public R delete(@PathVariable String ids){
       boolean ret = deptService.delete(ids);
       return ret?R.ok(): R.error().msg("删除失败!");
    }

}
