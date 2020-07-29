package cn.zptc.ai.service;

import cn.zptc.ai.entity.Permission;

import java.util.List;

public interface PermissionService {
    int insertPermission(Permission permission);

    int updatePermission(Permission permission);

    int deletePermissionById(Integer id);

    Permission selectPermissionById(Integer id);

    List<Permission> selectPermissionList(Integer page,Integer limit);

    int updatePermissionStates(Permission permission);
}
