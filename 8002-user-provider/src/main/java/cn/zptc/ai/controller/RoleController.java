package cn.zptc.ai.controller;

import cn.zptc.ai.entity.Role;
import cn.zptc.ai.service.RoleService;
import cn.zptc.ai.util.Constant;
import cn.zptc.ai.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("/role")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil insertUser(Role role){
        try {
            if (role.getName() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            role.setSort(3);
            role.setStates(1);
            int i = roleService.insertRole(role);
            if (i > 0){
                return new ResponseUtil(Constant.SUCCESS,"添加成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @PutMapping("/role")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil updateUser(Role role){
        try {
            if (role.getId() == null || role.getName() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Role role1 = roleService.selectRoleById(role.getId());
            if (role1 == null){
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
            int i = roleService.updateRole(role);
            if (i > 0){
                return new ResponseUtil(Constant.SUCCESS,"修改成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @DeleteMapping("/role/{id}")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil deleteUser(@PathVariable("id") Integer id){
        if (id == null){
            return new ResponseUtil(Constant.FAIL,"数据缺失");
        }
        Role role = roleService.selectRoleById(id);
        if (role == null){
            return new ResponseUtil(Constant.FAIL,"没有数据");
        }
        role.setStates(2);
        int i = roleService.updateRoleStates(role);
        if (i > 0){
            return new ResponseUtil(Constant.SUCCESS,"删除成功");
        } else {
            return new ResponseUtil(Constant.FAIL,"删除失败");
        }
    }

    @GetMapping("/role/{id}")
    public ResponseUtil selectUser(@PathVariable("id") Integer id){
        try {
            if (id == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Role role = roleService.selectRoleById(id);
            if (role != null){
                return new ResponseUtil(Constant.SUCCESS,role,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @GetMapping("/roleList")
    public ResponseUtil selectUserList(Integer page,Integer limit){
        try {
            if (page == null || limit == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            if (page <= 0 || limit <= 0){
                return new ResponseUtil(Constant.FAIL,"page或limit不能小于等于0");
            }
            List<Role> users = roleService.selectRoleList(page-1, page*limit);
            if (users != null){
                return new ResponseUtil(Constant.SUCCESS,users,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }
}
