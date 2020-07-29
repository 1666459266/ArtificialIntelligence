package cn.zptc.ai.service;

import cn.zptc.ai.entity.Role;

import java.util.List;

public interface RoleService {
    int insertRole(Role role);

    int updateRole(Role role);

    int deleteRoleById(Integer id);

    Role selectRoleById(Integer id);

    List<Role> selectRoleList(Integer page,Integer limit);

    int updateRoleStates(Role role);
}
