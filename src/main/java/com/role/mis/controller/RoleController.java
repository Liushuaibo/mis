package com.role.mis.controller;

import com.github.pagehelper.PageInfo;
import com.role.mis.pojo.Role;
import com.role.mis.service.RoleService;
import com.role.mis.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("all")
    public R findAll(){
        List<Role> list = roleService.findAll();
        return CollectionUtils.isEmpty(list)? R.error().msg("查询失败"):R.ok().data("items",list);
    }

    @GetMapping("{pageNum}/{pageSize}")
    public R page(@PathVariable int pageNum, @PathVariable int pageSize){
        List<Role> list = roleService.page(pageNum,pageSize);
        return CollectionUtils.isEmpty(list)? R.error().msg("查询失败"):R.ok().data("items",new PageInfo<>(list));
    }

    @PostMapping("save/{ids}")
    public R save(@RequestBody Role role,@PathVariable String ids){
        boolean ret = roleService.save(role,ids);
        return ret?R.ok(): R.error().msg("添加失败");
    }

    @GetMapping("{id}")
    public R findById(@PathVariable int id){
        Role role = roleService.findById(id);
        return ObjectUtils.isEmpty(role)? R.error().msg("查询失败"):R.ok().data("item",role);
    }

    @PostMapping("update/{ids}")
    public R update(@RequestBody Role role,@PathVariable String ids){
        boolean ret = roleService.update(role,ids);
        return ret?R.ok(): R.error().msg("修改失败");
    }

    @PostMapping("{ids}")
    public R delete(@PathVariable String ids){
        boolean ret = roleService.delete(ids);
        return ret?R.ok(): R.error().msg("删除失败");
    }
}
