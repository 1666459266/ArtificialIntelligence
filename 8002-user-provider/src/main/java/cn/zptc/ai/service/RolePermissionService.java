package cn.zptc.ai.service;

import cn.zptc.ai.entity.RolePermission;

import java.util.List;

public interface RolePermissionService {
    int insertRolePermission(RolePermission rolePermission);

    int updateRolePermission(RolePermission rolePermission);

    int deleteRolePermissionById(Integer id);

    RolePermission selectRolePermissionById(Integer id);

    List<RolePermission> selectRolePermissionList(Integer page, Integer limit);
}
