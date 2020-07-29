package cn.zptc.ai.controller;

import cn.zptc.ai.entity.Permission;
import cn.zptc.ai.entity.Role;
import cn.zptc.ai.entity.RolePermission;
import cn.zptc.ai.service.PermissionService;
import cn.zptc.ai.service.RolePermissionService;
import cn.zptc.ai.service.RoleService;
import cn.zptc.ai.util.Constant;
import cn.zptc.ai.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RolePermissionController {
    @Autowired
    private RolePermissionService rolePermissionService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    @PostMapping("/rolePermission")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil insertUser(RolePermission rolePermission){
        try {
            if (rolePermission.getRoleId() == null || rolePermission.getPermissionId() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Role role = roleService.selectRoleById(rolePermission.getRoleId());
            Permission permission = permissionService.selectPermissionById(rolePermission.getPermissionId());
            rolePermission.setRoleName(role.getName());
            rolePermission.setPermissionName(permission.getDescription());
            int i = rolePermissionService.insertRolePermission(rolePermission);
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

    @PutMapping("/rolePermission")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil updateUser(RolePermission rolePermission){
        try {
            if (rolePermission.getId() == null || rolePermission.getRoleId() == null || rolePermission.getPermissionId() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            RolePermission rolePermission1 = rolePermissionService.selectRolePermissionById(rolePermission.getId());
            if (rolePermission1 == null){
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
            int i = rolePermissionService.updateRolePermission(rolePermission);
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

    @DeleteMapping("/rolePermission/{id}")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil deleteUser(@PathVariable("id") Integer id){
        if (id == null){
            return new ResponseUtil(Constant.FAIL,"数据缺失");
        }
        RolePermission rolePermission = rolePermissionService.selectRolePermissionById(id);
        if (rolePermission == null){
            return new ResponseUtil(Constant.FAIL,"没有数据");
        }
        int i = rolePermissionService.deleteRolePermissionById(id);
        if (i > 0){
            return new ResponseUtil(Constant.SUCCESS,"删除成功");
        } else {
            return new ResponseUtil(Constant.FAIL,"删除失败");
        }
    }

    @GetMapping("/rolePermission/{id}")
    public ResponseUtil selectUser(@PathVariable("id") Integer id){
        try {
            if (id == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            RolePermission rolePermission = rolePermissionService.selectRolePermissionById(id);
            if (rolePermission != null){
                return new ResponseUtil(Constant.SUCCESS,rolePermission,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @GetMapping("/rolePermissionList")
    public ResponseUtil selectUserList(Integer page,Integer limit){
        try {
            if (page == null || limit == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            if (page <= 0 || limit <= 0){
                return new ResponseUtil(Constant.FAIL,"page或limit不能小于等于0");
            }
            List<RolePermission> rolePermissions = rolePermissionService.selectRolePermissionList(page-1, page*limit);
            if (rolePermissions != null){
                return new ResponseUtil(Constant.SUCCESS,rolePermissions,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }
}
