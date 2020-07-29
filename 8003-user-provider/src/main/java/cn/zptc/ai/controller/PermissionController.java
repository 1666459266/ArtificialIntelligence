package cn.zptc.ai.controller;

import cn.zptc.ai.entity.Permission;
import cn.zptc.ai.service.PermissionService;
import cn.zptc.ai.util.Constant;
import cn.zptc.ai.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @PostMapping("/permission")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil insertUser(Permission permission){
        try {
            if (permission.getName() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            if (permission.getIdentification() == null){
                permission.setIdentification("/");
            }
            permission.setStates(1);
            int i = permissionService.insertPermission(permission);
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

    @PutMapping("/permission")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil updateUser(Permission permission){
        try {
            if (permission.getId() == null || permission.getName() == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Permission permission1 = permissionService.selectPermissionById(permission.getId());
            if (permission1 == null){
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
            int i = permissionService.updatePermission(permission);
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

    @DeleteMapping("/permission/{id}")
    @PreAuthorize("hasAuthority('p1')")
    public ResponseUtil deleteUser(@PathVariable("id") Integer id){
        if (id == null){
            return new ResponseUtil(Constant.FAIL,"数据缺失");
        }
        Permission permission = permissionService.selectPermissionById(id);
        if (permission == null){
            return new ResponseUtil(Constant.FAIL,"没有数据");
        }
        permission.setStates(2);
        int i = permissionService.updatePermissionStates(permission);
        if (i > 0){
            return new ResponseUtil(Constant.SUCCESS,"删除成功");
        } else {
            return new ResponseUtil(Constant.FAIL,"删除失败");
        }
    }

    @GetMapping("/permission/{id}")
    public ResponseUtil selectUser(@PathVariable("id") Integer id){
        try {
            if (id == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            Permission permission = permissionService.selectPermissionById(id);
            if (permission != null){
                return new ResponseUtil(Constant.SUCCESS,permission,"查询成功");
            } else {
                return new ResponseUtil(Constant.FAIL,"没有数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseUtil(Constant.FAIL,e.getMessage());
        }
    }

    @GetMapping("/permissionList")
    public ResponseUtil selectUserList(Integer page,Integer limit){
        try {
            if (page == null || limit == null){
                return new ResponseUtil(Constant.FAIL,"数据缺失");
            }
            if (page <= 0 || limit <= 0){
                return new ResponseUtil(Constant.FAIL,"page或limit不能小于等于0");
            }
            List<Permission> users = permissionService.selectPermissionList(page-1, page*limit);
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
